package dev.ayush.authenticationservice.Dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogoutRequestDto {

    private String token;
    private Long userId;
}
