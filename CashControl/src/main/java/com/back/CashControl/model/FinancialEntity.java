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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_financiaEntity")
public class FinancialEntity {
    @Id
    @Column(name = "id_entity")
    private String idEntity;

    @Column(name = "entityName")
    private String entityName;

    @Column(name = "balance_entity")
    private BigDecimal balanceByEntity;

}
