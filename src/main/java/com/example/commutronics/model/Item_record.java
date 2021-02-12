package com.example.commutronics.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "item_record")
public class Item_record {
    @Id
    @Column(name = "item_record_id")
    private int item_record_id;
    @Column(name = "import_id")
    private String import_id;
    @Column(name = "export_id")
    private String export_id;
    //@Column(name = "product_id")
    //private String product_id;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH},optional = false)
    @JoinColumn(name = "product_id")
    private Product product;
    public int getProduct_id() {
        return product.getProduct_id();
    }

    //public Product getProduct() {
    //    return product;
   // }

    public void setProduct(Product product) {
       this.product = product;
    }

    public int getItem_record_id() {
        return item_record_id;
    }

    public void setItem_record_id(int item_record_id) {
        this.item_record_id = item_record_id;
    }

    public String getImport_id() {
        return import_id;
    }

    public void setImport_id(String import_id) {
        this.import_id = import_id;
    }

    public String getExport_id() {
        return export_id;
    }

    public void setExport_id(String export_id) {
        this.export_id = export_id;
    }

   /*public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }*/
}
