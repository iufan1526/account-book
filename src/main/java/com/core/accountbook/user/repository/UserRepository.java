package com.core.accountbook.user.repository;

import com.core.accountbook.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
