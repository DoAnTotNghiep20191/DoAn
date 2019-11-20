package datn.quanlydoan.model;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GiangVien")
public class GiangVien {

	private static final long serialVersionUID = -2054386655979281969L;
	@Id // Đánh dấu trường này là primary key
	@GeneratedValue // Tự động tăng giá trị id
	private Long id;
	private String tenDeTai;
	private String soDienThoai;
	private Date namSinh;
	// Lien ket 1-1 vs bang Sinh vien nhung ben phia khong so huu
	@OneToOne(mappedBy = "giangVien")
	//Lien ket 1-1 entity TaiKhoan nhung thuoc ben so huu khoa ngoai
	private SinhVien sinhVien;
	@OneToOne
	@JoinColumn(name = "idTaiKhoan", referencedColumnName = "id")
	private TaiKhoan taiKhoan;

}