package com.back.CashControl.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_totalAmount")
public class TotalAmount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAmount;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;
}
