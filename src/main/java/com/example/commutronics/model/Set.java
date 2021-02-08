package com.example.commutronics.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "`set`")
public class Set{
    @Id
    @Column(name = "set_id")
    private int set_id;

    @Column(name = "set_name")
    private String set_name;

    @ManyToMany
    @JoinTable(name = "product_set", joinColumns = @JoinColumn(name = "set_id")
                                   , inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getSet_id() {
        return set_id;
    }

    public void setSet_id(int set_id) {
        this.set_id = set_id;
    }

    public String getSet_name() {
        return set_name;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }


}
