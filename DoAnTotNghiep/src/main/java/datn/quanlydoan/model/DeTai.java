package datn.quanlydoan.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DeTai")
@Data
public class DeTai {

	private static final long serialVersionUID = -1000119078147252957L;

	@Id
	@GeneratedValue
	private long id;

	private String tenDeTai;
	private String moTa;
	private Date ngayTao;
	private String file;
	private String trangThai;

	@OneToOne(mappedBy = "deTai")
	private NhiemVu nhiemVu;
	@OneToOne
	@JoinColumn(name = "idSinhVien", referencedColumnName = "id")
	private SinhVien sinhVien;

}
