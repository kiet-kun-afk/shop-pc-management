package Entity;

public class SanPham {
	String MaSP;
	String TenSP;
	int DonGia;
	int SoLuong;
	String MoTa;
	String HinhSP;
	String MaLoai;
	String MaTH;
	String TenTH;
	String TenLoaiSP;

	public String getTenTH() {
		return TenTH;
	}

	public void setTenTH(String tenTH) {
		TenTH = tenTH;
	}

	public String getTenLoaiSP() {
		return TenLoaiSP;
	}

	public void setTenLoaiSP(String tenLoaiSP) {
		TenLoaiSP = tenLoaiSP;
	}

	public SanPham() {

	}

	public SanPham(String MaSP, String TenSP, int DonGia, int SoLuong, String MaLoai, String MaTH, String Mota,
			String HinhSP) {
		super();
		this.MaSP = MaSP;
		this.TenSP = TenSP;
		this.DonGia = DonGia;
		this.SoLuong = SoLuong;
		this.MaLoai = MaLoai;
		this.MaTH = MaTH;
		this.MoTa = Mota;
		this.HinhSP = HinhSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public String getMaLoai() {
		return MaLoai;
	}

	public void setMaLoai(String maLoai) {
		MaLoai = maLoai;
	}

	public String getMaTH() {
		return MaTH;
	}

	public void setMaTH(String maTH) {
		MaTH = maTH;
	}

	public String getMoTa() {
		return MoTa;
	}

	public void setMoTa(String moTa) {
		MoTa = moTa;
	}

	public String getHinhSP() {
		return HinhSP;
	}

	public void setHinhSP(String hinhSP) {
		HinhSP = hinhSP;
	}

	public String getMaSP() {
		return MaSP;
	}

	public void setMaSP(String maSP) {
		MaSP = maSP;
	}

}