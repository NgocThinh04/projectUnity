package com.example.api_unity.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "statistical")

public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bill")
    private Long idBill;

    @Column(name = "date_bill")
    private LocalDate dateBill = LocalDate.now();

    @Column(name = "total_bill")
    private Integer itemPrice;

    public Long getIdBill() {
        return idBill;
    }

    public Integer getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Integer totalBill) {
        this.itemPrice = totalBill;
    }
}
