package com.rayra.BankSystem.model;

import com.rayra.BankSystem.model.enums.AccountType;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString (exclude = "transactions")

@Getter

@Entity
@Table (name = "accounts")

public class Account {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (unique = true, nullable = false)
    private String accountNumber;
    @Column (precision = 15, scale = 2)
    private BigDecimal balance = BigDecimal.ZERO;
    @Column (updatable = false)
    private LocalDateTime openingDate;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "idUserFk")
    private User user;
    @OneToMany (mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Transaction> transactions = new ArrayList<>();

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @PrePersist
    public void prePersist() {
        openingDate = LocalDateTime.now();
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
