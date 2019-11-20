package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "SinhVien")
@Data // lombok
@Builder // lombok
public class SinhVien {

	private static final long serialVersionUID = -2054386655979281969L;

	@Id // Đánh dấu trường này là primary key
	@GeneratedValue // Tự động tăng giá trị id
	private Long id;

	private DeTai detai;
	private int mssv;
	private String ten;
	private Date namSinh;
	private String soDienThoai;

	@OneToOne // Đánh dấu có mỗi quan hệ 1-1
	@JoinColumn(name = "idTaiKhoan", referencedColumnName = "id") // name = "foreign key of owner entity" link to //
																	// primary key "id"
	private TaiKhoan taiKhoan; // entity duoc link to

	@OneToOne
	@JoinColumn(name = "idDeTai", referencedColumnName = "id")
	private DeTai deTai;

	@OneToOne
	@JoinColumn(name = "idGiangVien", referencedColumnName = "id")
	private GiangVien giangVien;

}