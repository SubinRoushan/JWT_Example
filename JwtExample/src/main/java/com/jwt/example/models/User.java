package com.jwt.example.models;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String email;
}
