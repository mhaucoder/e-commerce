package com.hajuna.ecommerceshop.service;

import com.hajuna.ecommerceshop.constant.ErrorMessages;
import com.hajuna.ecommerceshop.dto.UserDto;
import com.hajuna.ecommerceshop.exception.AlreadyExistsException;
import com.hajuna.ecommerceshop.exception.NotFoundException;
import com.hajuna.ecommerceshop.model.User;
import com.hajuna.ecommerceshop.repository.UserRepository;
import com.hajuna.ecommerceshop.dto.request.CreateUserRequest;
import com.hajuna.ecommerceshop.dto.request.UserUpdateRequest;
import com.hajuna.ecommerceshop.service.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new NotFoundException(ErrorMessages.USER_NOT_FOUND));
    }

    @Override
    public User createUser(CreateUserRequest request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new AlreadyExistsException(ErrorMessages.EMAIL_ALREADY_EXISTS);
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());

        return userRepository.save(user);
    }

    @Override
    public User updateUser(UserUpdateRequest request, Long userId) {
        return  userRepository.findById(userId).map(existingUser -> {
            existingUser.setFirstName(request.getFirstName());
            existingUser.setLastName(request.getLastName());
            return userRepository.save(existingUser);
        }).orElseThrow(() -> new NotFoundException(ErrorMessages.USER_NOT_FOUND));
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.findById(userId).ifPresentOrElse(userRepository :: delete, () -> {
            throw new NotFoundException(ErrorMessages.USER_NOT_FOUND);
        });
    }
    @Override
    public UserDto convertToDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
