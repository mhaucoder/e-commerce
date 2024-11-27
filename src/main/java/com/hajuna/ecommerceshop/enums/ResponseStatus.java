package com.hajuna.ecommerceshop.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {
    // 1xx: Informational
    CONTINUE(100, "Continue", "The server has received the request headers, and the client should proceed to send the request body"),
    SWITCHING_PROTOCOLS(101, "Switching Protocols", "The server is switching protocols as requested by the client"),

    // 2xx: Success
    SUCCESS(200, "Success", "Operation successful"),
    CREATED(201, "Created", "The request has been fulfilled and a new resource has been created"),
    ACCEPTED(202, "Accepted", "The request has been accepted for processing, but the processing has not been completed"),
    NON_AUTHORITATIVE_INFORMATION(203, "Non-Authoritative Information", "The server successfully processed the request, but is returning information from a local or third-party copy"),
    NO_CONTENT(204, "No Content", "The server has successfully processed the request, but is not returning any content"),
    RESET_CONTENT(205, "Reset Content", "The server has successfully processed the request, but the client should reset the document view"),
    PARTIAL_CONTENT(206, "Partial Content", "The server is delivering only part of the resource due to a range header sent by the client"),

    // 3xx: Redirection
    MULTIPLE_CHOICES(300, "Multiple Choices", "There are multiple options for the resource that the client may follow"),
    MOVED_PERMANENTLY(301, "Moved Permanently", "The resource has been permanently moved to a new location"),
    FOUND(302, "Found", "The resource has been temporarily moved to a different location"),
    SEE_OTHER(303, "See Other", "The response to the request can be found under a different URI"),
    NOT_MODIFIED(304, "Not Modified", "The resource has not been modified since the last request"),
    USE_PROXY(305, "Use Proxy", "The requested resource must be accessed through the proxy specified in the response"),
    TEMPORARY_REDIRECT(307, "Temporary Redirect", "The resource resides temporarily under a different URI"),
    PERMANENT_REDIRECT(308, "Permanent Redirect", "The resource has been permanently moved to a new URI"),

    // 4xx: Client Errors
    BAD_REQUEST(400, "Bad Request", "The request could not be understood or was missing required parameters"),
    UNAUTHORIZED(401, "Unauthorized", "The client must authenticate itself to get the requested response"),
    PAYMENT_REQUIRED(402, "Payment Required", "The requested resource requires payment"),
    FORBIDDEN(403, "Forbidden", "The client does not have access rights to the content"),
    NOT_FOUND(404, "Not Found", "The server cannot find the requested resource"),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", "The method specified in the request is not allowed for the resource"),
    NOT_ACCEPTABLE(406, "Not Acceptable", "The server can only generate a response that is not acceptable according to the Accept headers sent in the request"),
    PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required", "The client must authenticate itself with the proxy"),
    REQUEST_TIMEOUT(408, "Request Timeout", "The server timed out waiting for the request"),
    CONFLICT(409, "Conflict", "The request could not be completed due to a conflict with the current state of the resource"),
    GONE(410, "Gone", "The resource is no longer available and will not be available again"),
    LENGTH_REQUIRED(411, "Length Required", "The server refuses to accept the request without a defined Content-Length header"),
    PRECONDITION_FAILED(412, "Precondition Failed", "One or more conditions given in the request header fields evaluated to false"),
    PAYLOAD_TOO_LARGE(413, "Payload Too Large", "The request is larger than the server is willing or able to process"),
    URI_TOO_LONG(414, "URI Too Long", "The URI provided was too long for the server to process"),
    UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type", "The media type of the request is not supported by the server"),
    RANGE_NOT_SATISFIABLE(416, "Range Not Satisfiable", "The client has asked for a portion of the file that the server cannot supply"),
    EXPECTATION_FAILED(417, "Expectation Failed", "The server cannot meet the requirements of the Expect request-header field"),

    // 5xx: Server Errors
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "The server encountered an internal error or misconfiguration"),
    NOT_IMPLEMENTED(501, "Not Implemented", "The server does not support the functionality required to fulfill the request"),
    BAD_GATEWAY(502, "Bad Gateway", "The server received an invalid response from the upstream server"),
    SERVICE_UNAVAILABLE(503, "Service Unavailable", "The server is currently unavailable (overloaded or down)"),
    GATEWAY_TIMEOUT(504, "Gateway Timeout", "The server, while acting as a gateway, did not receive a timely response from the upstream server"),
    VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported", "The server does not support the HTTP protocol version that was used in the request"),
    VARIANT_ALSO_NEGOTIATES(506, "Variant Also Negotiates", "The server has an internal configuration error: transparent content negotiation for the request results in a circular reference"),
    INSUFFICIENT_STORAGE(507, "Insufficient Storage", "The server is unable to store the representation needed to complete the request"),
    LOOP_DETECTED(508, "Loop Detected", "The server detected an infinite loop while processing a request"),
    NOT_EXTENDED(510, "Not Extended", "Further extensions to the request are required for the server to fulfill it"),
    NETWORK_AUTHENTICATION_REQUIRED(511, "Network Authentication Required", "The client needs to authenticate to gain network access");

    private final int code;
    private final String status;
    private final String description;

}
