package model;

public class ThongTinGiangVien {
	private int idGiangVien;
	private String tenGiangVien;
	private String email;
	private String sodienthoai;
	private String namsinh;
	private String password;
	
	public ThongTinGiangVien(int idGiangVien, String tenGiangVien, String email, String sodienthoai, String namsinh,
			String password) {
		super();
		this.idGiangVien = idGiangVien;
		this.tenGiangVien = tenGiangVien;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.namsinh = namsinh;
		this.password = password;
	}
	public int getIdGiangVien() {
		return idGiangVien;
	}
	public void setIdGiangVien(int idGiangVien) {
		this.idGiangVien = idGiangVien;
	}
	public String getTenGiangVien() {
		return tenGiangVien;
	}
	public void setTenGiangVien(String tenGiangVien) {
		this.tenGiangVien = tenGiangVien;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
