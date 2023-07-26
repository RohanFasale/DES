
public class Pan_detail {

	public static void main(String[] args) {
		
		PanCard pc1 = new PanCard();
		pc1.setpanNumber("1231 2312 3123");
		pc1.setAddress("C 709, West Avenue, Mumbai 16");
		pc1.setNameOnAdhaar("Peter Dsouza");
		pc1.setFatherName("Patrick Dsouza");
		pc1.setMobileNumber("9870445533");

	}

}
class PanCard{
	private String panCardName;
	private String panCardNo;
	@Override
	public String toString() {
		return "PanCard [panCardName=" + panCardName + ", panCardNo=" + panCardNo + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", fatherName=" + fatherName + "]";
	}

	private String address;
	private String mobileNumber;
	private String fatherName;
	
	public String getPanNo() {
		return panCardNo;
	}
	public void setpanNumber(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getNamePan() {
		return panCardName;
	}
	public void setNameOnAdhaar(String panCardName) {
		this.panCardName = panCardName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	void printPanCard() {
		System.out.println("-----PAN CARD INFO -----");
		System.out.println("Pan Number  : "+panCardName);
		System.out.println("Pan Name    : "+panCardNo);
		System.out.println("Pan Address : "+address);
		System.out.println("Father Name    : "+fatherName);
		System.out.println("Mobile Number  : "+mobileNumber);
		
	}
	
}