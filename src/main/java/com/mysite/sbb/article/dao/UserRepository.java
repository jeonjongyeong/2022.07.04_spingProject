package com.mysite.sbb.article.dao;

import com.mysite.sbb.article.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
