package com.rewrite.test.rewritetest.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AppUser {
    @Id
    private int id;
    private String name;
    private String email;
    private String password;
}
