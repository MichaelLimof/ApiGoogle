package com.ireilly.ibm.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ireilly.ibm.Model.Users;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<Users, String> {  
    Users findByEmailIdIgnoreCase(String emailId);
}