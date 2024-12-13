package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.*;
import com.example.demo.repositories.*;



@RestController
@RequestMapping("/api/transactions")
public class TransactionController 
{
    @Autowired
    private TransactionRepository TransactionRepository;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        List<Transaction> transactions = TransactionRepository.findAll();
        System.out.println("Retrieved transactions: " + transactions);
        return transactions;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        System.out.println("Incoming Transaction JSON: " + transaction);
        Transaction savedTransaction = TransactionRepository.save(transaction);
        System.out.println("Saved transaction: " + savedTransaction);
        return savedTransaction;
}

    

}

