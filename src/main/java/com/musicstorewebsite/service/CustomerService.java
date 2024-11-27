package com.musicstorewebsite.service;

import com.musicstorewebsite.model.Authorities;
import com.musicstorewebsite.model.Customer;
import org.springframework.security.core.userdetails.User;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */
public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    Customer getCustomerByUsername (String username);

    List<Customer> getAllCustomers();
}
