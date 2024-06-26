package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    Iterable<Order> findAllByUserId(long customUserId);
}
