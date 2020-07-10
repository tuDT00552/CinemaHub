package vn.cinemahub.cinemahub.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ORDERS")
@EntityListeners(AuditingEntityListener.class)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ORD_SEQ")
    @SequenceGenerator(sequenceName = "ORDER_SEQ", allocationSize = 1, name = "ORD_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "ORDERID")
    private int orderid;

    @Column(name = "TENRAP")
    private String tenrap;

    @Column(name = "PHONGCHIEU")
    private int phongchieu;

    @Column(name = "TIME")
    private Date time;

    @Column(name = "TENPHIM")
    private String tenphim;

    @Column(name = "SOVE")
    private int sove;

    @Column(name = "TONGTIEN")
    private int tongtien;

    @Column(name = "STATUS")
    private int status;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "update_at")
    private Date updateAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getTenrap() {
        return tenrap;
    }

    public void setTenrap(String tenrap) {
        this.tenrap = tenrap;
    }

    public int getPhongchieu() {
        return phongchieu;
    }

    public void setPhongchieu(int phongchieu) {
        this.phongchieu = phongchieu;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public int getSove() {
        return sove;
    }

    public void setSove(int sove) {
        this.sove = sove;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
