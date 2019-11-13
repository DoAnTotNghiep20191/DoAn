package model;

public class ThongTinBaiDang {
	int idBaiDang;
	int idNguoiDang;
	String tenBaiDang;
	String noiDung;
	
	public ThongTinBaiDang(int idBaiDang, int idNguoiDang, String tenBaiDang, String noiDung) {
		super();
		this.idBaiDang = idBaiDang;
		this.idNguoiDang = idNguoiDang;
		this.tenBaiDang = tenBaiDang;
		this.noiDung = noiDung;
	}
	
	public int getIdBaiDang() {
		return idBaiDang;
	}
	public void setIdBaiDang(int idBaiDang) {
		this.idBaiDang = idBaiDang;
	}
	public int getIdNguoiDang() {
		return idNguoiDang;
	}
	public void setIdNguoiDang(int idNguoiDang) {
		this.idNguoiDang = idNguoiDang;
	}
	public String getTenBaiDang() {
		return tenBaiDang;
	}
	public void setTenBaiDang(String tenBaiDang) {
		this.tenBaiDang = tenBaiDang;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	
}
