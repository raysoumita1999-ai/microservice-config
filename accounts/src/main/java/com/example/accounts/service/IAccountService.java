package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestParam;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
