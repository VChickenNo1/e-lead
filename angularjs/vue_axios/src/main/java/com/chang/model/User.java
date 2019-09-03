package com.chang.model;


import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable {
    private Integer id;
    private Integer age;
    private String username;
    private String password;
    private String email;
    private String sex;

}
