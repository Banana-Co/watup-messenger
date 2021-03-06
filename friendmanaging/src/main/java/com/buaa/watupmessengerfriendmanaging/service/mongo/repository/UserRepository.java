package com.buaa.watupmessengerfriendmanaging.service.mongo.repository;

import com.buaa.watupmessengerfriendmanaging.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Cast
 * 仅用来测试
 */
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> getById(String id);

    Optional<User> getByUsername(String username);

    List<User> getByIdLike(String id);
}
