package com.example.api_unity.Controller.GetValue;

import com.example.api_unity.Models.BillEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private BillRepository billRepository;

    @PostMapping("/save")
    public ResponseEntity<?> saveCart(@RequestBody BillEntity billEntity) {
        BillEntity saveAll = billRepository.save(billEntity);
        System.out.println(billEntity);
        return ResponseEntity.ok("Done");
    }
}
