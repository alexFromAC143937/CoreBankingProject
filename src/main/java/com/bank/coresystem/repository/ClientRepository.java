package com.bank.coresystem.repository;

import com.bank.coresystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    @Query( " select cl " +
            " from Client cl " +
            " left join cl.accounts ac "+
            " left join ac.agreements ag" +
            " where ag.sum  >= :sumAgreement"
             )
    List<Client> getAllWhereAgreementAmountMoreThen(@Param("sumAgreement") int sumAgreement);
}