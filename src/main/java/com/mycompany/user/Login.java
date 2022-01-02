package com.mycompany.user;

import javax.persistence.*;


@Entity
@Table(name = "staff")

public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     @Column(name = "account",unique = true)
    private String username;
     @Column(name = "password")
    private String password;

    public Login(Integer id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Login() {

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
