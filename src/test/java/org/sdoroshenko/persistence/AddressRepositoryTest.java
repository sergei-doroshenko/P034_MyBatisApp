package org.sdoroshenko.persistence;

import org.sdoroshenko.AbstractRepositoryTest;
import org.sdoroshenko.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class AddressRepositoryTest extends AbstractRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void getAddressById() {
        Address address = addressRepository.getAddressById(1L);
        System.out.println(address);
    }
}