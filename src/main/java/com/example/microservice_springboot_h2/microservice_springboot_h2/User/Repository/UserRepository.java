package com.example.microservice_springboot_h2.microservice_springboot_h2.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice_springboot_h2.microservice_springboot_h2.User.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
