package com.rayra.BankSystem.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString (exclude = "accounts")

@Getter

@Entity
@Table (name = "users")

public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (nullable = false)
    private String name;
    @Column (nullable = false, unique = true)
    private String cpf;
    @Column (nullable = false)
    private String passwordHash;
    private LocalDate birthDate;
    @Column(updatable = false)
    private LocalDateTime registrationDate;

    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accounts = new ArrayList<>();

    @PrePersist
    public void prePersist() {
        this.registrationDate = LocalDateTime.now();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        account.setUser(this);
    }
}
