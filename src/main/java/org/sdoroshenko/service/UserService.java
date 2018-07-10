package org.sdoroshenko.service;

import org.sdoroshenko.model.Address;
import org.sdoroshenko.model.User;
import org.sdoroshenko.persistence.AddressRepository;
import org.sdoroshenko.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Transactional // may be need to avoid open transaction (connection) on each statement
    public User getUserWithAddress(Long userId) {
        User user = userRepository.getUserById(userId);
        Address address = addressRepository.getAddressById(user.getAddress().getId());
        user.setAddress(address);
        return user;
    }
}
