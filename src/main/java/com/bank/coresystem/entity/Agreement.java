package com.bank.coresystem.entity;

import com.bank.coresystem.entity.enums.AgreementStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="agreement")
public class Agreement {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private AgreementStatus status;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "sum")
    private BigDecimal sum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id",
            referencedColumnName = "id")
    private Account account;

    @ManyToOne()
    @JoinColumn(name = "product_id",
            referencedColumnName = "id")
    private Product product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Agreement agreement = (Agreement) o;

        return id==agreement.id && createdAt.equals(agreement.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt);
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "id=" + id +
                ", status=" + status +
                ", interestRate=" + interestRate +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", account=" + account +
                ", product=" + product +
                '}';
    }
}