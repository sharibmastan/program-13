package com.example.program_13.Repository;

import com.example.program_13.Entity.Usermaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Usermaster, Integer> {
}
