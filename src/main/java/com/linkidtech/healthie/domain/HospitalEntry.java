package com.linkidtech.healthie.domain;

import lombok.*;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HospitalEntry {
    private Long id;
    private Patient patient;
    private ArrayList<Symptom> symptoms;
}
