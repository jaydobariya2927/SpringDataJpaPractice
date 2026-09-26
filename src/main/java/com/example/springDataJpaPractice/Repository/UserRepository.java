package com.example.springDataJpaPractice.Repository;

import com.example.springDataJpaPractice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
