package com.app.accounts.service;

import com.app.accounts.dto.CustomerDto;

public interface IAccountsService {
  /**
   * @param customerDto
   */
  void createAccount(CustomerDto customerDto);
}
