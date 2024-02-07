package com.linkidtech.healthie.controller;

import com.linkidtech.healthie.domain.Symptom;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SymptomController {

    @RequestMapping(value = "/symptoms", method = RequestMethod.GET)
    public ResponseEntity<List<Symptom>> getSymptoms(){
        List<Symptom> symptoms = Arrays.asList(new Symptom("Cough", 3), new Symptom("Fever", 4));
        return new ResponseEntity<>(symptoms, HttpStatus.OK);
    }

}
