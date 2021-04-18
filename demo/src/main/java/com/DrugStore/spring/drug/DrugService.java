package com.DrugStore.spring.drug;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class DrugService {

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
