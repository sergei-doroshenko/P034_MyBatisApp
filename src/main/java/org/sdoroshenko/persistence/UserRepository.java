package org.sdoroshenko.persistence;

import org.apache.ibatis.annotations.Param;
import org.sdoroshenko.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    User getUserById(@Param("userId") Long userId);
}
