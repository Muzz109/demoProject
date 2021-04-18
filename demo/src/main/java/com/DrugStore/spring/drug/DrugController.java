package com.DrugStore.spring.drug;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/drug")
public class DrugController {

     private final DrugService drugService;

    public DrugController(DrugService drugService) {
        this.drugService = drugService;
    }


    @GetMapping
    public List<Drug> getDrugs(){
        return drugService.getDrugs();
    }
}
