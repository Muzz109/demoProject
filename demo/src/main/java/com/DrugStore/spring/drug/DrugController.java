package com.DrugStore.spring.drug;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/drug")
public class DrugController {

    @GetMapping
    public List<Drug> getDrugs(){

        return List.of(
                new Drug(
                        1L,
                        "Crocin",
                        LocalDate.of(2020, Month.AUGUST,2 ),
                        "Paracetomal",
                        "pfixer@gmail.com",
                        5000

                )

        );
    }
}
