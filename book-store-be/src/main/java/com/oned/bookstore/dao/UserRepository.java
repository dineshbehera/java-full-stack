package com.oned.bookstore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oned.bookstore.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
