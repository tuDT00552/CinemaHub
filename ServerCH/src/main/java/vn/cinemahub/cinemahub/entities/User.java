package vn.cinemahub.cinemahub.entities;

import org.hibernate.annotations.NaturalId;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity implements Serializable {

    private String userName;
    private String tenUser;
    private String password;
    private String gioitinh;
    private String diachi;
    private String sdt;
    private String gmail;
    private long roles;

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "TEN_USER")
    public String getTenUser() {
        return tenUser;
    }

    public void setTenUser(String tenUser) {
        this.tenUser = tenUser;
    }

    @Basic
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "GIOITINH")
    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Basic
    @Column(name = "DIACHI")
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "SDT")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "GMAIL")
    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Basic
    @Column(name = "ROLES")
    public long getRoles() {
        return roles;
    }

    public void setRoles(long roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return
                roles == user.roles &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(tenUser, user.tenUser) &&
                Objects.equals(password, user.password) &&
                Objects.equals(gioitinh, user.gioitinh) &&
                Objects.equals(diachi, user.diachi) &&
                Objects.equals(sdt, user.sdt) &&
                Objects.equals(gmail, user.gmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash( userName, tenUser, password, gioitinh, diachi, sdt, gmail, roles);
    }
}
