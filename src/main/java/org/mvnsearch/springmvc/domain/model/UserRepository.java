package org.mvnsearch.springmvc.domain.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author linux_china
 */
public interface UserRepository {

    public User findById(Long id);
}
