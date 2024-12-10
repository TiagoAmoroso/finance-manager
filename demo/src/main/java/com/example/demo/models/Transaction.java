package com.example.demo.models;

import jakarta.persistence.*;
import java.time.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double amount;
    private String category;
    private LocalDate date;
}