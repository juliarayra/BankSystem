package com.rayra.BankSystem.model;

import com.rayra.BankSystem.model.enums.TransactionType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString

@Getter

@Entity
@Table (name = "transactions")

public class Transaction {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (precision = 15, scale = 2)
    private BigDecimal transactionAmount;
    @Column (updatable = false)
    private LocalDateTime transactionDate;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "idAccountFk")
    private Account account;

    @PrePersist
    public void prePersist() {
        this.transactionDate = LocalDateTime.now();
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
