package com.hajuna.ecommerceshop.service.interfaces;

import com.hajuna.ecommerceshop.dto.ProductDto;
import com.hajuna.ecommerceshop.dto.UserDto;
import com.hajuna.ecommerceshop.model.Product;
import com.hajuna.ecommerceshop.model.User;
import com.hajuna.ecommerceshop.dto.request.CreateUserRequest;
import com.hajuna.ecommerceshop.dto.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    UserDto convertToDto(User user);
}
