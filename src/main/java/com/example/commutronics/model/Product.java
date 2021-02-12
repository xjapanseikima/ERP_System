package com.example.commutronics.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "product_id")
    private int product_id;
    @Column(name = "product_name")
    private String product_name;

    @OneToMany(mappedBy = "product",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Item_record> itemRecordList;

    public List<Item_record> getItemRecordList() {
        return itemRecordList;
    }

    public void setItemRecordList(List<Item_record> itemRecordList) {
        this.itemRecordList = itemRecordList;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
