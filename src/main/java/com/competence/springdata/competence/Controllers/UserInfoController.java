package com.competence.springdata.competence.Controllers;
import com.competence.springdata.competence.Entities.UserInfo;
import com.competence.springdata.competence.Services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/all")
    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserInfo getUserById(@PathVariable Long id) {
        return userInfoService.getUserById(id);
    }

    @PostMapping("/create")
    public UserInfo createUser(@RequestBody UserInfo userInfo) {
        return userInfoService.saveOrUpdateUser(userInfo);
    }

    @PutMapping("/{id}")
    public UserInfo updateUser(@PathVariable Long id, @RequestBody UserInfo userInfo) {
        userInfo.setId(id);
        return userInfoService.saveOrUpdateUser(userInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userInfoService.deleteUser(id);
    }
}
