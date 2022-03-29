package com.h2.moviek.domain.entity;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Account {
    @Id
    private Long id;

    private String name;

    private BigDecimal balance;
}