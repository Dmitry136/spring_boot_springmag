package com.erygindmitry.springmag.spring_boot_springmag.repositories;

import com.erygindmitry.springmag.spring_boot_springmag.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
