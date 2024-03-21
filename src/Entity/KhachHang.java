package Entity;

public class KhachHang {
	private String maKhachHang;
	private String Sdt;
	private String HoTen;
	private String DiaChi;
	private String Email;

	public KhachHang(String maKhachHang, String sdt, String hoTen, String diaChi, String email) {
		this.maKhachHang = maKhachHang;
		this.Sdt = sdt;
		this.HoTen = hoTen;
		this.DiaChi = diaChi;
		this.Email = email;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getSdt() {
		return Sdt;
	}

	public void setSdt(String sdt) {
		Sdt = sdt;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public KhachHang() {

	}

}
