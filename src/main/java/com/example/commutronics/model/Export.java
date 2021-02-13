package com.example.commutronics.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "export")
public class Export {

    @Id
    @Column(name = "export_id")
    private int export_id;
    @Column(name = "export_order_number")
    private String export_order_number;
    @Column(name = "product_id")
    private String product_id;
    @Column(name = "set_id")
    private String set_id;
    @Column(name = "export_quantity")
    private int export_quantuty;
    @Column(name = "export_date")
    private Date export_date;
    @Column(name = "company_id")
    private int company_id;
    @Column(name = "export_price")
    private float export_price;
    @Column(name = "depot_id")
    private int depot_id;
    @Column(name = "employee_id")
    private int employee_id;
    @Column(name = "export_sn")
    private String export_sn;

    public int getExport_id() {
        return export_id;
    }

    public void setExport_id(int export_id) {
        this.export_id = export_id;
    }

    public String getExport_order_number() {
        return export_order_number;
    }

    public void setExport_order_number(String export_order_number) {
        this.export_order_number = export_order_number;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getSet_id() {
        return set_id;
    }

    public void setSet_id(String set_id) {
        this.set_id = set_id;
    }

    public int getExport_quantuty() {
        return export_quantuty;
    }

    public void setExport_quantuty(int export_quantuty) {
        this.export_quantuty = export_quantuty;
    }

    public Date getExport_date() {
        return export_date;
    }

    public void setExport_date(Date export_date) {
        this.export_date = export_date;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public float getExport_price() {
        return export_price;
    }

    public void setExport_price(float export_price) {
        this.export_price = export_price;
    }

    public int getDepot_id() {
        return depot_id;
    }

    public void setDepot_id(int depot_id) {
        this.depot_id = depot_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getExport_sn() {
        return export_sn;
    }

    public void setExport_sn(String export_sn) {
        this.export_sn = export_sn;
    }
}

