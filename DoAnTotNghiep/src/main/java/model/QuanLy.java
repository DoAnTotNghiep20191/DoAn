package model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class QuanLy {
	private static final long serialVersionUID = -2054386655979281969L;
	@Id // Đánh dấu trường này là primary key
	@GeneratedValue // Tự động tăng giá trị id
	private Long id;
	private String ten;
	private String soDienThoai;
	private Date namSinh;
	// Lien ket 1-1 voi entity TaiKhoan nhung chu so huu
	@OneToOne
	@JoinColumn(name = "idTaiKhoan", referencedColumnName = "id")
	private TaiKhoan taiKhoan;
}
