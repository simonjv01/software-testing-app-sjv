package com.vargas.softwaretestingappsjv.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository underTest;

    @Test
    void itShouldSelectCustomerByPhoneNumber() {
        // Given
        // When
        // Then
    }

    @Test
    void itShouldSaveCustomer() {
        // Given
        UUID id = UUID.randomUUID();
       Customer customer = new Customer(UUID.randomUUID(), "Abel", "0000");
        // When
        underTest.save(customer);
        // Then
        assertNotNull(customer);
        Optional<Customer> optionalCustomer = underTest.findById(id);
    }



}