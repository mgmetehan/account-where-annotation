package com.mgmetehan.account_where_annotation.repository;

import com.mgmetehan.account_where_annotation.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
