package com.eriton.curso.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eriton.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
