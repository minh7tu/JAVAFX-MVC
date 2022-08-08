package ntmModel;

public class Transport {
	private String tenNVC , thoiGian ;
	
	public Transport() {
		// TODO Auto-generated constructor stub
	}
	
	public Transport(String tenNVC, String thoiGian) {
		this.tenNVC=tenNVC;
		this.thoiGian=thoiGian;
	}
	
	public void setTenNVC(String tenNVC) {
		this.tenNVC=tenNVC;
	}
	
	public void setThoiGian(String thoiGian) {
		this.thoiGian=thoiGian;
	}
	
	public String getTenNVC() {
		return tenNVC;
	}
	
	public String getThoiGian() {
		return thoiGian;
	}

}
