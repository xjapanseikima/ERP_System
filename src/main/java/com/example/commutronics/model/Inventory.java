package com.example.commutronics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/*
inventory_id		    庫存編號				SMALLINT (Unsigned, 255)
product_id		        商品編號(FK to 商品的商品編號)		VARCHAR (100)
inventory_quanity	    現有數量				SMALLINT (Unsigned, 255)
depot_id			    倉庫編號(FK 連接到倉庫)			BIT(64)
Inventory_count_date	清點日期				Date
Inventory_count_employee_id清點人員(FK 連接到員工的ID)		SMALLINT (Unsigned, 255)
 */
@Entity
@Table(name ="inventory")
public class Inventory {
    @Id
    @Column( name= "inventory_id")
    private short inventory_id;
    @Column( name= "product_id")
    private String product_id;
    @Column( name= "inventory_quantity")
    private short inventory_quantity;
    @Column( name ="depot_id")
    private byte depot_id;
    @Column( name ="Inventory_count_date")
    private Date Inventory_count_date;
    @Column( name ="Inventory_count_employee_id")
    private byte Inventory_count_employee_id;

    public short getInventory_id() {
        return inventory_id;
    }

    public void setInventory_id(short inventory_id) {
        this.inventory_id = inventory_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public short getInventory_quantity() {
        return inventory_quantity;
    }

    public void setInventory_quantity(short inventory_quantity) {
        this.inventory_quantity = inventory_quantity;
    }

    public byte getDepot_id() {
        return depot_id;
    }

    public void setDepot_id(byte depot_id) {
        this.depot_id = depot_id;
    }

    public Date getInventory_count_date() {
        return Inventory_count_date;
    }

    public void setInventory_count_date(Date inventory_count_date) {
        Inventory_count_date = inventory_count_date;
    }

    public byte getInventory_count_employee_id() {
        return Inventory_count_employee_id;
    }

    public void setInventory_count_employee_id(byte inventory_count_employee_id) {
        Inventory_count_employee_id = inventory_count_employee_id;
    }
}
