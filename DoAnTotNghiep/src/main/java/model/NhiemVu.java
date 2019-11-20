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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "NhiemVu")
@Data
public class NhiemVu {

	private static final long serialVersionUID = -1000119078147252957L;
	@Id // Đánh dấu trường này là primary key
	@GeneratedValue // Tự động tăng giá trị id
	private Long id;

	@OneToOne
	@JoinColumn(name = "idDeTei", referencedColumnName = "id")
	private DeTai deTai;
	
	@OneToOne(mappedBy = "daTai")
	private DanhGia danhGia;
	
	private String tenNhiemVu;
	private String noiDung;
	private String trangThai;
	private Date ngayTao;
	private String file;

}
