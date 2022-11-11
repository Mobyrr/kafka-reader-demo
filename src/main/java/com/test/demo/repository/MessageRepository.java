package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
