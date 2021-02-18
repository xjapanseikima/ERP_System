package com.example.commutronics.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "depot")
public class Depot {
    @Id
    @Column(name = "depot_id")
    private int employee_id;
    @Column(name = "depot_name")
    private String depot_name;
    @Column
    private String depot_loc;
    @OneToMany(mappedBy = "depot")
    private java.util.List<Inventory> inventoryList;

//    public List<Inventory> getInventoryList() {
//        return inventoryList;
//    }
//
//    public void setInventoryList(List<Inventory> inventoryList) {
//        this.inventoryList = inventoryList;
//    }

    @OneToMany(mappedBy="depot",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private java.util.List<Export> ExportList;

    //public List<Export> getExportList() {return ExportList;}

    public void setExportList(List<Export> exportList) { this.ExportList = exportList;}

    public int getEmployee_id() {return employee_id;}

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepot_name() {
        return depot_name;
    }

    public void setDepot_name(String depot_name) {
        this.depot_name = depot_name;
    }

    public String getDepot_loc() {
        return depot_loc;
    }

    public void setDepot_loc(String depot_loc) {
        this.depot_loc = depot_loc;
    }
}
