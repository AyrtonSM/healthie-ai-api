package com.linkidtech.healthie.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    private String name;
    private Integer age;
    private Integer gender;
}
