package com.uviqo.LoginTokenTask1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uviqo.LoginTokenTask1.Model.UserDTO;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, Long> {

	   UserDTO findByUsername(String username);

	   }
