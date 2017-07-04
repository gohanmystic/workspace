package MyFram2;

public class SinhVien {
	public String ht, tenlop, masv;
	public Double dtb;
	
	public SinhVien (String masv, String ht, String tenlop, Double dtb) {
		this.masv = masv;
		this.tenlop = tenlop;
		this.ht = ht;
		this.dtb = dtb;
	}
	public void DoiTen (String ht) {
		this.ht = ht;
	}
	public void DoiDtb (Double dtb) {
		this.dtb = dtb;
	}
	public void DoiLop (String tenlop) {
		this.tenlop = tenlop;
	}
}
