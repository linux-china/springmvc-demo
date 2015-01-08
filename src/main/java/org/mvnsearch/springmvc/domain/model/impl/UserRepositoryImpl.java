package org.mvnsearch.springmvc.domain.model.impl;

import org.mvnsearch.springmvc.domain.model.User;
import org.mvnsearch.springmvc.domain.model.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * user repository
 *
 * @author linux_china
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        user.setNick("nick-" + id);
        return user;
    }
}
