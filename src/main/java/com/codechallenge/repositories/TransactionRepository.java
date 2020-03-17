package com.codechallenge.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codechallenge.domains.Transaction;

import org.springframework.data.domain.Sort;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	List<Transaction> findByIban(String iban, Sort sort);
	Transaction findByReference(String reference);
}