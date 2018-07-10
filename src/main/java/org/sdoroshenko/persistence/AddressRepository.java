package org.sdoroshenko.persistence;

import org.apache.ibatis.annotations.Param;
import org.sdoroshenko.model.Address;

public interface AddressRepository {

    Address getAddressById(@Param("addressId") Long addressId);
}
