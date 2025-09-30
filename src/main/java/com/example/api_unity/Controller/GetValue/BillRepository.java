package com.example.api_unity.Controller.GetValue;

import com.example.api_unity.Models.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillEntity, Long> {

}
