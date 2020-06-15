package vn.cinemahub.cinemahub.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Admin {
    private long idAdmin;
    private String adminName;
    private String tenAdmin;
    private String password;
    private String gioitinh;
    private String diachi;
    private String sdt;
    private String gmail;

    @Id
    @Column(name = "ID_ADMIN", nullable = false, precision = 0)
    public long getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(long idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Basic
    @Column(name = "ADMIN_NAME", nullable = false, length = 50)
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "TEN_ADMIN", nullable = false, length = 50)
    public String getTenAdmin() {
        return tenAdmin;
    }

    public void setTenAdmin(String tenAdmin) {
        this.tenAdmin = tenAdmin;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "GIOITINH", nullable = false, length = 3)
    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Basic
    @Column(name = "DIACHI", nullable = false, length = 200)
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "SDT", nullable = false, length = 30)
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Basic
    @Column(name = "GMAIL", nullable = false, length = 50)
    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return idAdmin == admin.idAdmin &&
                Objects.equals(adminName, admin.adminName) &&
                Objects.equals(tenAdmin, admin.tenAdmin) &&
                Objects.equals(password, admin.password) &&
                Objects.equals(gioitinh, admin.gioitinh) &&
                Objects.equals(diachi, admin.diachi) &&
                Objects.equals(sdt, admin.sdt) &&
                Objects.equals(gmail, admin.gmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAdmin, adminName, tenAdmin, password, gioitinh, diachi, sdt, gmail);
    }
}
