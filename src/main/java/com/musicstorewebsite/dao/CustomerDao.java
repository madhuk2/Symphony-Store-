package com.musicstorewebsite.dao;

import com.musicstorewebsite.model.Authorities;
import com.musicstorewebsite.model.Customer;
import com.musicstorewebsite.model.Users;

import java.util.List;

/**
 * Created by Le on 1/23/2016.
 */
public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    Customer getCustomerByUsername (String username);

    List<Customer> getAllCustomers();
}
