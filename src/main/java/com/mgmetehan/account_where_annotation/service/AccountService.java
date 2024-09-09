package com.mgmetehan.account_where_annotation.service;

import com.mgmetehan.account_where_annotation.model.Account;
import com.mgmetehan.account_where_annotation.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
