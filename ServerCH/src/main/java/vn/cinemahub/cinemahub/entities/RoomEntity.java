package vn.cinemahub.cinemahub.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Room")
@EntityListeners(AuditingEntityListener.class)
public class RoomEntity extends BaseEntity implements Serializable {
    @NaturalId
    @Column(name = "maphong")
    private int maphong;

    @Column(name= "soghe")
    private int soghe;

    @Column(name = "status")
    private int status;

    public RoomEntity() {
    }

    public RoomEntity(int maphong, Cinema rap) {
        this.maphong = maphong;
        this.rap = rap;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "marap", referencedColumnName = "MARAP")
    private Cinema rap;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "roomEntity",cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SELECT)
    private List<GheEntity> gheEntities = new ArrayList<>();

    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public Cinema getRap() {
        return rap;
    }

    public void setRap(Cinema rap) {
        this.rap = rap;
    }

    public List<GheEntity> getGheEntities() {
        return gheEntities;
    }

    public void setGheEntities(List<GheEntity> gheEntities) {
        this.gheEntities = gheEntities;
    }
}
