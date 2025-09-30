package com.example.api_unity.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "statistical")

public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bill")
    private Long idBill;

    @Column(name = "date_bill")
    private Date dateBill;

    @Column(name = "total_bill")
    private Integer totalBill;

    public Long getIdBill() {
        return idBill;
    }

    public Date getDateBill() {
        return dateBill;
    }

    public Integer setTotalBill() {
        return totalBill;
    }
    public void getTotalBill(Integer totalBill) {
        this.totalBill = totalBill;
    }
}
