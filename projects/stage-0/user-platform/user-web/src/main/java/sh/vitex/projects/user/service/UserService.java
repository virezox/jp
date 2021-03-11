package sh.vitex.projects.user.service;


import sh.vitex.projects.user.domain.User;

/**
 * User Services
 */
public interface UserService {

    /**
     * user registration
     *
     * @param user User Object
     * @return Success <code>true</code>
     */
    boolean register(User user);

    /**
     * deregister
     *
     * @param user User Object
     * @return Success <code>true</code>
     */
    boolean deregister(User user);

    /**
     * update userinfo
     *
     * @param user User Object
     * @return
     */
    boolean update(User user);

    User queryUserById(Long id);

    User queryUserByNameAndPassword(String name, String password);
}
