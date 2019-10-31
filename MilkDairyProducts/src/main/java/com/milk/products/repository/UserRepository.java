package com.milk.products.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.milk.products.pojo.User;

public interface UserRepository extends JpaRepository<User, String>{


}
