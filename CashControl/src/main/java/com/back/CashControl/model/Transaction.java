package com.back.CashControl.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_transaction")
public class Transaction {
    @Id
    @Column(name = "id_transaction")
    private String idTransaction;

    @Column(name = "amount_to_transfer",nullable = false)
    private BigDecimal amountToTransfer;

    @Column(name = "date_transaction",nullable = false)
    private LocalDate dateTransaction;

    @Column(name = "time_transaction",nullable = false)
    private LocalTime timeTransaction;

    @Column(nullable = false)
    private String description;

}
