package katalearn.pp311.service;

import katalearn.pp311.model.User;
import katalearn.pp311.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService  {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        this.userRepository.save(user);
    }

    public void updateUser(User user) {
        this.addUser(user);
    }

    public void deleteUser(User user) {
        this.userRepository.delete(user);
    }

    public User getUser(int id) {
        return this.userRepository.findUserById(id);
    }

    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}