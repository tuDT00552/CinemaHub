package vn.cinemahub.cinemahub.entities;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "REFUNDTICKET")
@EntityListeners(AuditingEntityListener.class)
public class RefundTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "RT_SEQ")
    @SequenceGenerator(sequenceName = "REFUND_SEQ", allocationSize = 1, name = "RT_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "TENPHIM")
    private String tenphim;

    @Column(name = "MAPHONG")
    private long maphong;

    @Column(name = "LOAIGHE")
    private int loaighe;

    @Column(name = "GIAVE")
    private long giave;

    @Column(name = "NGAYCHIEU")
    private Date ngaychieu;

    @Column(name = "KHUNGGIO")
    private String khunggio;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "update_at")
    private Date updateAt;

    public RefundTicket(){}

    public RefundTicket(String tenphim, long maphong,int loaighe,long giave, Date ngaychieu, String khunggio){
        this.tenphim = tenphim;
        this.maphong = maphong;
        this.loaighe = loaighe;
        this.giave = giave;
        this.ngaychieu = ngaychieu;
        this.khunggio = khunggio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public long getMaphong() {
        return maphong;
    }

    public void setMaphong(long maphong) {
        this.maphong = maphong;
    }

    public int getLoaighe() {
        return loaighe;
    }

    public void setLoaighe(int loaighe) {
        this.loaighe = loaighe;
    }

    public long getGiave() {
        return giave;
    }

    public void setGiave(long giave) {
        this.giave = giave;
    }

    public Date getNgaychieu() {
        return ngaychieu;
    }

    public void setNgaychieu(Date ngaychieu) {
        this.ngaychieu = ngaychieu;
    }

    public String getKhunggio() {
        return khunggio;
    }

    public void setKhunggio(String khunggio) {
        this.khunggio = khunggio;
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
