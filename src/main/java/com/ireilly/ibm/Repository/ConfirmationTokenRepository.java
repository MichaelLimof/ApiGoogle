package com.ireilly.ibm.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ireilly.ibm.Model.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {  
    ConfirmationToken findByConfirmationToken(String confirmationToken);
}