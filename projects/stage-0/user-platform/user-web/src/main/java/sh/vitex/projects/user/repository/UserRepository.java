package sh.vitex.projects.user.repository;

import sh.vitex.projects.user.domain.User;

import java.util.Collection;

/**
 * User repository
 *
 * @since 1.0
 */
public interface UserRepository {

    boolean save(User user);

    boolean deleteById(Long userId);

    boolean update(User user);

    User getById(Long userId);

    User getByNameAndPassword(String userName, String password);

    Collection<User> getAll();
}
