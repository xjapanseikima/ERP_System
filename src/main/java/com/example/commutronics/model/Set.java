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

    @OneToMany(mappedBy="set",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private java.util.List<Export> ExportList;

    //public List<Export> getExportList() {return ExportList;}

    public void setExportList(List<Export> exportList) {this.ExportList = exportList;}

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
