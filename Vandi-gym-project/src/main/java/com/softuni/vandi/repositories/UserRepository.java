package com.softuni.vandi.repositories;


import com.softuni.vandi.model.entity.User;
import com.softuni.vandi.services.AppUserDetailsService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsernameAndPassword(String username, String password);

    Optional<User> findUserByEmail(String username);

    Optional<User> findUserByUsername(String username);
}
