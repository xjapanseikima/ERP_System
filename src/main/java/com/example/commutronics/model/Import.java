package com.example.commutronics.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="import")
public class Import {
    @Id
    @Column(name ="import_id")
    private int import_id;
    @Column(name ="import_order_number")
    private String import_order_number;
    @Column(name ="product_id")
    private String product_id;
    @Column (name ="set_id")
    private Short set_id;
    @Column (name ="import_quantity")
    private Short import_quantiy;
    @Column (name ="import_date")
    private Date import_date;
    @Column (name ="company_id")
    private Short company_id;
    @Column (name ="import_cost")
    private int import_cost;
    @Column (name ="depot_id")
    private byte depot_id;
    @Column (name ="employee_id")
    private Short employee_id;
    @Column (name ="Import_sn")
    private String Import_sn;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}, optional = false)
    @JoinColumn(name="product_id", insertable=false, updatable=false)
    private Product product;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}, optional = false)
    @JoinColumn(name="set_id", insertable=false, updatable=false)
    private Set set;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}, optional = false)
    @JoinColumn(name="company_id", insertable=false, updatable=false)
    private Company company;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}, optional = false)
    @JoinColumn(name="depot_id", insertable=false, updatable=false)
    private Depot depot;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}, optional = false)
    @JoinColumn(name="employee_id", insertable=false, updatable=false)
    private Employee employee;

    //public Product getProduct() {return product;}

    public void setProduct(Product product) {this.product = product;}

    //public Set getSet() {return set;}

    public void setSet(Set set) {this.set = set;}

    //public Company getCompany() {return company;}

    public void setCompany(Company company) {this.company = company;}

    //public Depot getDepot() {return depot;}

    public void setDepot(Depot depot) {this.depot = depot;}

    //public Employee getEmployee() {return employee;}

    public void setEmployee(Employee employee) {this.employee = employee;}

    public int getImport_id() {
        return import_id;
    }

    public void setImport_id(int import_id) {
        this.import_id = import_id;
    }

    public String getImport_order_number() {
        return import_order_number;
    }

    public void setImport_order_number(String import_order_number) {
        this.import_order_number = import_order_number;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Short getSet_id() {
        return set_id;
    }

    public void setSet_id(Short set_id) {
        this.set_id = set_id;
    }

    public Short getImport_quantiy() {
        return import_quantiy;
    }

    public void setImport_quantiy(Short import_quantiy) {
        this.import_quantiy = import_quantiy;
    }

    public Date getImport_date() {
        return import_date;
    }

    public void setImport_date(Date import_date) {
        this.import_date = import_date;
    }

    public Short getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Short company_id) {
        this.company_id = company_id;
    }

    public int getImport_cost() {
        return import_cost;
    }

    public void setImport_cost(int import_cost) {
        this.import_cost = import_cost;
    }

    public byte getDepot_id() {
        return depot_id;
    }

    public void setDepot_id(byte depot_id) {
        this.depot_id = depot_id;
    }

    public Short getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Short employee_id) {
        this.employee_id = employee_id;
    }

    public String getImport_sn() {
        return Import_sn;
    }

    public void setImport_sn(String import_sn) {
        Import_sn = import_sn;
    }
}
