package com.rewrite.test.rewritetest.repository;

import com.rewrite.test.rewritetest.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Integer> {
}
