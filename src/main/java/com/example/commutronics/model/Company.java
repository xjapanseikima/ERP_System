package com.example.commutronics.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "company_id")
    private int company_id;
    @Column(name = "company_invoice_num")
    private String company_invoice_num;
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "company_addr")
    private String company_addr;
    @Column(name = "company_tel_1")
    private String company_tel_1;
    @Column(name = "company_tel_2")
    private String company_tel_2;
    @Column(name = "company_email")
    private String company_email;
    @Column(name = "company_website")
    private String company_website;

    @OneToMany(mappedBy="company",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private java.util.List<Export> ExportList;

    @OneToMany(mappedBy="company",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private java.util.List<Import> ImportList;

    //public List<Import> getImportList() {return ImportList;}

    public void setImportList(List<Import> importList) {this.ImportList = importList;}

    //public List<Export> getExportList() {return ExportList;}

    public void setExportList(List<Export> exportList) {this.ExportList = exportList;}

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_invoice_num() {
        return company_invoice_num;
    }

    public void setCompany_invoice_num(String company_invoice_num) {
        this.company_invoice_num = company_invoice_num;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_addr() {
        return company_addr;
    }

    public void setCompany_addr(String company_addr) {
        this.company_addr = company_addr;
    }

    public String getCompany_tel_1() {
        return company_tel_1;
    }

    public void setCompany_tel_1(String company_tel_1) {
        this.company_tel_1 = company_tel_1;
    }

    public String getCompany_tel_2() {
        return company_tel_2;
    }

    public void setCompany_tel_2(String company_tel_2) {
        this.company_tel_2 = company_tel_2;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getCompany_website() {
        return company_website;
    }

    public void setCompany_website(String company_website) {
        this.company_website = company_website;
    }
}
