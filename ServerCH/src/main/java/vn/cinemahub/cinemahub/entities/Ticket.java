package vn.cinemahub.cinemahub.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import vn.cinemahub.cinemahub.dto.ThKeDto;

import javax.persistence.*;
import java.util.Date;

@SqlResultSetMapping(
        name = "ThongkeDto",
        classes = {
                @ConstructorResult(targetClass = ThKeDto.class,
                        columns = {
                                @ColumnResult(name = "tenphim", type = String.class),
                                @ColumnResult(name = "doanhthu",type = Long.class),
                                @ColumnResult(name = "sove",type = Long.class)
                        }
                ),

        }
)
@Entity
@Table(name = "TICKET")
@EntityListeners(AuditingEntityListener.class)
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TK_SEQ")
    @SequenceGenerator(sequenceName = "TICKET_SEQ", allocationSize = 1, name = "TK_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "TENPHIM")
    private String tenphim;


    @Column(name = "IDGHE")
    private long idGhe;

    @Column(name = "MARAP")
    private long marap;

    @Column(name = "LICHCHIEU")
    private long lichchieu;

    @Column(name = "GIAVE")
    private long giave;

    @Column(name = "STATUS")
    private int status;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm",timezone = "Asia/Ho_Chi_Minh")
    @Column(name = "TIMESTART")
    private Date timeStart;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm",timezone = "Asia/Ho_Chi_Minh")
    @Column(name = "TIMEEND")
    private Date timeEnd;

    public long getTienphat() {
        return tienphat;
    }

    public void setTienphat(long tienphat) {
        this.tienphat = tienphat;
    }

    @Column(name = "TIENPHAT")
    private long tienphat;

    @CreatedDate
    @Column(name = "created_at", nullable = true, updatable = true)
    private Date createdAt;

    @LastModifiedDate
    @Column(name = "update_at")
    private Date updateAt;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public long getLichchieu() {
        return lichchieu;
    }

    public void setLichchieu(long lichchieu) {
        this.lichchieu = lichchieu;
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

    public long getIdGhe() {
        return idGhe;
    }

    public void setIdGhe(long idGhe) {
        this.idGhe = idGhe;
    }

    public long getMarap() {
        return marap;
    }

    public void setMarap(long marap) {
        this.marap = marap;
    }

    public long getGiave() {
        return giave;
    }

    public void setGiave(long giave) {
        this.giave = giave;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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