package com.example.dockercompose.repo;

import com.example.dockercompose.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kurstan
 * @created at 09.06.2023 17:21
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
