package com.mgmetehan.account_where_annotation;

import com.mgmetehan.account_where_annotation.model.Account;
import com.mgmetehan.account_where_annotation.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountWhereAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountWhereAnnotationApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(AccountRepository accountRepository) {
        return args -> {
            accountRepository.save(new Account(null, "Account 1", false));
            accountRepository.save(new Account(null, "Account 2", true));
            accountRepository.save(new Account(null, "Account 3", false));
        };
    }
}
