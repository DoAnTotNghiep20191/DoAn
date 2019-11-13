package model;

public class ThongTinDanhGia {
	int idDanhGia;
	int idNhiemVu;
	String noiDung;
	int tieuchi1;
	int tieuchi2;
	int tieuchi3;
	int tieuchi4;
	int trungbinh;
	
	public ThongTinDanhGia(int idDanhGia, int idNhiemVu, String noiDung, int tieuchi1, int tieuchi2, int tieuchi3,
			int tieuchi4, int trungbinh) {
		super();
		this.idDanhGia = idDanhGia;
		this.idNhiemVu = idNhiemVu;
		this.noiDung = noiDung;
		this.tieuchi1 = tieuchi1;
		this.tieuchi2 = tieuchi2;
		this.tieuchi3 = tieuchi3;
		this.tieuchi4 = tieuchi4;
		this.trungbinh = trungbinh;
	}
	public int getIdDanhGia() {
		return idDanhGia;
	}
	public void setIdDanhGia(int idDanhGia) {
		this.idDanhGia = idDanhGia;
	}
	public int getIdNhiemVu() {
		return idNhiemVu;
	}
	public void setIdNhiemVu(int idNhiemVu) {
		this.idNhiemVu = idNhiemVu;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public int getTieuchi1() {
		return tieuchi1;
	}
	public void setTieuchi1(int tieuchi1) {
		this.tieuchi1 = tieuchi1;
	}
	public int getTieuchi2() {
		return tieuchi2;
	}
	public void setTieuchi2(int tieuchi2) {
		this.tieuchi2 = tieuchi2;
	}
	public int getTieuchi3() {
		return tieuchi3;
	}
	public void setTieuchi3(int tieuchi3) {
		this.tieuchi3 = tieuchi3;
	}
	public int getTieuchi4() {
		return tieuchi4;
	}
	public void setTieuchi4(int tieuchi4) {
		this.tieuchi4 = tieuchi4;
	}
	public int getTrungbinh() {
		return trungbinh;
	}
	public void setTrungbinh(int trungbinh) {
		this.trungbinh = trungbinh;
	}
}
