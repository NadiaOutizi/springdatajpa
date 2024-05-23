package com.competence.springdata.competence.Services;

import com.competence.springdata.competence.Entities.UserInfo;
import com.competence.springdata.competence.Repositories.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

        @Autowired
        private UserInfoRepository userInfoRepository;

        // Method to get all users
        public List<UserInfo> getAllUsers() {
            return userInfoRepository.findAll();
        }

        // Method to get a user by ID
        public UserInfo getUserById(Long id) {
            return userInfoRepository.findById(id).orElse(null);
        }

        // Method to save or update a user
        public UserInfo saveOrUpdateUser(UserInfo userInfo) {
            return userInfoRepository.save(userInfo);
        }

        // Method to delete a user by ID
        public void deleteUser(Long id) {
            userInfoRepository.deleteById(id);
        }
}
