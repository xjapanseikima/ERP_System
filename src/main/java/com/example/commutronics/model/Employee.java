package com.example.commutronics.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int employee_id;
    @Column(name = "employee_name")
    private String employee_name;
    @OneToMany(mappedBy = "Inventory_count_employee_id",fetch=FetchType.LAZY)
    private java.util.List<Inventory> inventoryList;

//    public List<Inventory> getInventoryList() {
//        return inventoryList;
//    }
//
//    public void setInventoryList(List<Inventory> inventoryList) {
//        this.inventoryList = inventoryList;
//    }

    @OneToMany(mappedBy="employee",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private java.util.List<Export> ExportList;

    //public List<Export> getExportList() {return ExportList;}

    public void setExportList(List<Export> exportList) {this.ExportList = exportList;}

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
}
