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
@Table(name = "BaiDang")
@Data
public class BaiDang {

	private static final long serialVersionUID = -1000119078147252957L;

	@Id
	@GeneratedValue
	private long id;

	@OneToOne
	@JoinColumn(name = "idTaiKhoan", referencedColumnName = "id")
	private TaiKhoan taiKhoan;

	@OneToOne(mappedBy = "taiKhoan")
	private Comment commment;

	private String tenBaiDang;
	private String noiDung;
	private Date ngayTao;
	private String file;

}
