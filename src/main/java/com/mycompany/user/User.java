package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "shoes")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "shoes_name")
    private String ShoesName;

    @Column(nullable = false, name = "shoes_prices")
    private Integer ShoesPrices;

    @Column(length = 45, nullable = false, name = "shoes_descriptions")
    private String ShoesDescriptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShoesName() {
        return ShoesName;
    }

    public void setShoesName(String shoesName) {
        ShoesName = shoesName;
    }

    public Integer getShoesPrices() {
        return ShoesPrices;
    }

    public void setShoesPrices(Integer shoesPrices) {
        ShoesPrices = shoesPrices;
    }

    public String getShoesDescriptions() {
        return ShoesDescriptions;
    }

    public void setShoesDescriptions(String shoesDescriptions) {
        ShoesDescriptions = shoesDescriptions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ShoesName='" + ShoesName + '\'' +
                ", ShoesPrices=" + ShoesPrices +
                ", ShoesDescriptions='" + ShoesDescriptions + '\'' +
                '}';
    }
}
