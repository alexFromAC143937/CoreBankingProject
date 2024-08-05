package com.bank.coresystem.coresystem.repository;

import com.bank.coresystem.coresystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
}