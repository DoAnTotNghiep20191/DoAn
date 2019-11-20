package datn.quanlydoan.model;

import java.io.Serializable;
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
@Table(name = "DanhGia")
@Data
public class DanhGia {

	private static final long serialVersionUID = -1000119078147252957L;

	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	@JoinColumn(name = "idNhiemVu", referencedColumnName = "id")
	private NhiemVu nhiemVu;
	//
	private String noiDung;
	private String tieuChi1;
	private String tieuChi2;
	private String tieuChi3;
	private String tieuChi4;
	private String trungBinh;
	private String file;

}
