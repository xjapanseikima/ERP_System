package com.example.commutronics.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private String product_id;
    @Column(name = "product_name")
    private String product_name;
    @OneToMany(mappedBy="product",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private java.util.List<Item_record> itemList;

    public List<Item_record> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item_record> itemList) {
        this.itemList = itemList;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
