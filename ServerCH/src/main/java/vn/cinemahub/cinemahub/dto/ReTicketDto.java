package vn.cinemahub.cinemahub.dto;

import vn.cinemahub.cinemahub.entities.Order;
import vn.cinemahub.cinemahub.entities.RefundTicket;

import java.util.Date;

public class ReTicketDto {
    private Long id;
    private long mave;
    private long marap;
    private String tenphim;
    private long idGhe;
    private long maphong;
    private long giave;
    private Date timeStart;
    private Date timeEnd;
    private String khunggio;
    private long lichchieu;
    private Date giotra;
    private long orderid;
    private int status;
    private long tienphat;
    private Order order;

    public long getLichchieu() {
        return lichchieu;
    }

    public void setLichchieu(long lichchieu) {
        this.lichchieu = lichchieu;
    }


    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getGiotra() {
        return giotra;
    }

    public void setGiotra(Date giotra) {
        this.giotra = giotra;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getMave() {
        return mave;
    }

    public Long getId() {
        return id;
    }

    public void setMave(long mave) {
        this.mave = mave;
    }

    public long getMarap() {
        return marap;
    }

    public void setMarap(long marap) {
        this.marap = marap;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public long getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(long idGhe) {
        this.idGhe = idGhe;
    }

    public long getMaphong() {
        return maphong;
    }

    public void setMaphong(long maphong) {
        this.maphong = maphong;
    }

    public long getGiave() {
        return giave;
    }

    public void setGiave(long giave) {
        this.giave = giave;
    }

    public String getKhunggio() {
        return khunggio;
    }

    public void setKhunggio(String khunggio) {
        this.khunggio = khunggio;
    }



    public long getTienphat() {
        return tienphat;
    }

    public void setTienphat(long tienphat) {
        this.tienphat = tienphat;
    }
}
