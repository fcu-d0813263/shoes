package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "name")
    private String Name;

    @Column(nullable = false, name = "email")
    private Integer Email;

    @Column(length = 45, nullable = false, name = "phone")
    private String Phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getEmail() {
        return Email;
    }

    public void setEmail(Integer email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email=" + Email +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
