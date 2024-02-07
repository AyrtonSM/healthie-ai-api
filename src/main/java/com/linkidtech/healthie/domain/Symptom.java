package com.linkidtech.healthie.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Symptom {
    private String name;
    private int level;
}
