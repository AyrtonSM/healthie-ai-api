package com.linkidtech.healthie.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Patient extends Person{
    private Long id;
    private Integer priority;
}
