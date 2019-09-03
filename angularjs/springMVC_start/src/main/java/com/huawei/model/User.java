package com.huawei.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User   implements Serializable {
    private Integer id;
    private String name;
    private Date birthday;
    private String sex;
    private String address;


}
