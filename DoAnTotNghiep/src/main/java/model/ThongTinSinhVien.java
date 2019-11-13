package model;

public class ThongTinSinhVien {
	private int idSinhVien;
	private int mssv;
	private String ten;
	private String namsinh;
	private String sodienthoai;
	private String email;
	
	public ThongTinSinhVien(int idSinhVien, int mssv, String ten, String namsinh, String sodienthoai, String email) {
		super();
		this.idSinhVien = idSinhVien;
		this.mssv = mssv;
		this.ten = ten;
		this.namsinh = namsinh;
		this.sodienthoai = sodienthoai;
		this.email = email;
	}
	public int getIdSinhVien() {
		return idSinhVien;
	}
	public void setIdSinhVien(int idSinhVien) {
		this.idSinhVien = idSinhVien;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
