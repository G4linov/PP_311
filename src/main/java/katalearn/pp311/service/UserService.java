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

    @Transactional
    public void addUser(User user) {
        this.userRepository.save(user);
    }

    @Transactional
    public void updateUser(User user) {
        this.addUser(user);
    }

    @Transactional
    public void deleteUser(User user) {
        this.userRepository.delete(user);
    }

    @Transactional(readOnly = true)
    public User getUser(int id) {
        return this.userRepository.findUserById(id);
    }

    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }
}