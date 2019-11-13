package model;

public class ThongTinNhiemVu {
	private int idNhiemVu;
	private int idDeTai;
	private String ten;
	private String noidung;
	private String trangthai;
	
	public ThongTinNhiemVu(int idNhiemVu, int idDeTai, String ten, String noidung, String trangthai) {
		super();
		this.idNhiemVu = idNhiemVu;
		this.idDeTai = idDeTai;
		this.ten = ten;
		this.noidung = noidung;
		this.trangthai = trangthai;
	}
	public int getIdNhiemVu() {
		return idNhiemVu;
	}
	public void setIdNhiemVu(int idNhiemVu) {
		this.idNhiemVu = idNhiemVu;
	}
	public int getIdDeTai() {
		return idDeTai;
	}
	public void setIdDeTai(int idDeTai) {
		this.idDeTai = idDeTai;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	
	
	
}
