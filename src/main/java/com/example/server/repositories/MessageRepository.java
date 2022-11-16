package com.example.server.repositories;

import com.example.server.models.SaveMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

public interface MessageRepository extends MongoRepository<SaveMessage, String> {
}
