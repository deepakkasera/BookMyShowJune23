package controllers;

import dtos.ResponseStatus;
import dtos.SignUpRequestDto;
import dtos.SignUpResponseDto;
import models.User;
import services.UserService;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public SignUpResponseDto signUp(SignUpRequestDto signUpRequestDto) {
        SignUpResponseDto signUpResponseDto = new SignUpResponseDto();

        try {
            User user = userService.login(signUpRequestDto.getEmail(),
                    signUpRequestDto.getPassword());
            signUpResponseDto.setResponseStatus(ResponseStatus.SUCCESS);
            signUpResponseDto.setUserId(user.getId());
        } catch (Exception exception) {
            signUpResponseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return signUpResponseDto;
    }
}
