package org.mvnsearch.springmvc.domain.model.impl;

import org.mvnsearch.springmvc.ProjectBaseTest;
import org.mvnsearch.springmvc.domain.model.UserRepository;
import org.unitils.spring.annotation.SpringBean;
import org.unitils.spring.annotation.SpringBeanByType;

/**
 * user repository test
 *
 * @author linux_china
 */
public class UserRepositoryImplTest extends ProjectBaseTest {
    @SpringBeanByType
    private UserRepository userRepository;

    public void testFindById() {
        System.out.println(userRepository.findById(1L).getNick());
    }
}
