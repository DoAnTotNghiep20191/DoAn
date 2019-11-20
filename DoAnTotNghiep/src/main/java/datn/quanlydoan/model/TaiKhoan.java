package datn.quanlydoan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TaiKhoan")
public class TaiKhoan {

	private static final long serialVersionUID = -2054386655979281969L;

	public static final String ROLE_GIANGVIEN = "GIANGVIEN";
	public static final String ROLE_SINHVIEN = "SINHVIEN";
	public static final String ROLE_GIAOVU = "GIAOVU";

	// Khoa chinh cua Entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Lien ket bang 1-1 voi cac bang khac thong qua thuc the taiKhoan
	@OneToOne(mappedBy = "taiKhoan")
	private SinhVien sinhVien;
	
	@OneToOne(mappedBy = "taiKhoan")
	private GiangVien giangVien;
	
	@OneToOne(mappedBy = "taiKhoan")
	private BaiDang baiDang;
	@OneToOne(mappedBy = "taiKhoan")
	private Comment comment;
	
// Tu mapping theo cac bien vao cac Colum trong table cua Database
	private String email;
	private String encrytedPassword;
	private boolean active;
	private String role;

}