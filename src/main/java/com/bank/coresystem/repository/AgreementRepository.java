package com.bank.coresystem.repository;

import com.bank.coresystem.entity.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgreementRepository extends JpaRepository<Agreement, UUID> {
}