package com.DrugStore.spring.drug;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Drug {
    @Id
    @SequenceGenerator(
            name = "drug_sequence",
            sequenceName = "drug_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "drug_sequence"
    )

    private long drugId;
    private String drugName;
    private LocalDate manufacturedate;
    private String genericName;
    private String companyEmail;
    private Integer quantity;

    public Drug() {
    }

    public Drug(long drugId,
                String drugName,
                LocalDate manufacturedate,
                String genericName,
                String companyEmail,
                Integer quantity) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.manufacturedate = manufacturedate;
        this.genericName = genericName;
        this.companyEmail = companyEmail;
        this.quantity = quantity;
    }

    public Drug(String drugName,
                LocalDate manufacturedate,
                String genericName,
                String companyEmail,
                Integer quantity) {
        this.drugName = drugName;
        this.manufacturedate = manufacturedate;
        this.genericName = genericName;
        this.companyEmail = companyEmail;
        this.quantity = quantity;
    }

    public long getDrugId() {
        return drugId;
    }

    public void setDrugId(long drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public LocalDate getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(LocalDate manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", manufacturedate=" + manufacturedate +
                ", genericName='" + genericName + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
