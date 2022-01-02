package com.mycompany.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.user.Login;
import com.mycompany.user.LoginRepository;

@Service

public class LoginService {
    @Autowired
    private LoginRepository repo;

    public Login login(String username, String password) {
        Login admin = repo.findByUsernameAndPassword(username, password);
        return admin;
    }
}
