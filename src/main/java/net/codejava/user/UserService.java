package net.codejava.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired UserRepository repo;

    public void save(User user) {
        repo.save(user);
    }

    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }

    public User get(Long id_user) {
        return repo.findById(id_user).get();
    }

    public void delete(Long id_user) {
        repo.deleteById(id_user);
    }

}
