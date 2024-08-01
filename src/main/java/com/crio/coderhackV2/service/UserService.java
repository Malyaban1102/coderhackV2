package com.crio.coderhackV2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crio.coderhackV2.entity.User;
import com.crio.coderhackV2.repository.UserRepository;

import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User registerUser(User user) {
        user.setScore(0);
        user.setBadges(new ArrayList<>());
        return userRepository.save(user);
    }

    public User updateUserScore(String userId, int score) {
        User user = getUserById(userId);
        if (user != null) {
            user.setScore(score);
            updateBadges(user);
            userRepository.save(user);
        }
        return user;
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    private void updateBadges(User user) {
        List<String> badges = new ArrayList<>();
        if (user.getScore() >= 1 && user.getScore() < 30) {
            badges.add("Code Ninja");
        }
        if (user.getScore() >= 30 && user.getScore() < 60) {
            badges.add("Code Champ");
        }
        if (user.getScore() >= 60 && user.getScore() <= 100) {
            badges.add("Code Master");
        }
        user.setBadges(badges);
    }
}
