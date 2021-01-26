package com.example.commutronics.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transcation")
public class Transcation {
    @Id
    @Column(name = "invoiceid")
    private String invoiceid;
    @Column(name = "invoicedate")
    private Date invoicedate;
    @Column(name = "enddate")
    private Date enddate;
    @Column(name = "price")
    private int price;
    @Column(name = "note")
    private String note;
    @Column(name = "name")
    String name;

    public String getInvoiceid() {
        return invoiceid;
    }

    public Date getInvoicedate() {
        return invoicedate;
    }

    public void setInvoicedate(Date invoicedate) {
        this.invoicedate = invoicedate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }
}
