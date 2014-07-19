package fillRegisterProfile;

import java.util.Vector;

import evaluation.Evaluation;

public class Trainee {
	
	private String title;
	private String name;
	private String education;
	private String telNo;
	private String other;
	private String email;
	private String traineeStatus;
	private String registerDate;
	private String trainePayment;
	
	private Login login;
	private Address address;
	private Vector<Occupation> occVector = new Vector<Occupation>();
	private Evaluation evaluation;
	
	public Trainee(){
		
	}
	
	public Trainee(String title, String name, String education,  String telNo,  String email, 
			String traineeStatus, String registerDate, String trainePayment){
		this.title = title;
		this.name = name;
		this.education = education;
		this.telNo = telNo;
		this.email = email;
		this.traineeStatus = traineeStatus;
		this.registerDate = registerDate;
		this.trainePayment = trainePayment;
	}
	
	public Login getLogin() {
		return login;
	}

	public Address getAddress() {
		return address;
	}
	
	public Evaluation getEvaluation() {
		return evaluation;
	}
	
	public Trainee editTrainee(String title, String name, String education,
			boolean[] occupation, String other, String telNo, String email, 
			String workplace, String addressNo, String street, String subDistrict, String district, 
			String province, String zipcode) {
		for(int i=0 ; i<4 ; i++){
			if(this.isSelected(occupation[i])){
				this.occVector.get(i).editOccupation(occupation[i]);
			}
		}
		if(this.isOccExist(occupation[4])){
			this.occVector.get(4).editOther(other);
		}
		this.getAddress().editAddress(workplace, addressNo, street, subDistrict, district, province, zipcode);
		this.title = title;
		this.name = name;
		this.education = education;
		this.telNo = telNo;
		this.email = email;
		return this;
	}
	
	public void addAddress(Address address){
		this.address = address;
	}
	
	public void addLogin(Login login){
		this.login = login;
	}
	
	public void addEvaluation(Evaluation evaluation){
		this.evaluation = evaluation;
	}
	
	public String toString() {
		String text = "ส่วนที่ 1 ข้อมูลส่วนตัว\n";
		text = text + "\tชื่อ-นามสกุล : " + this.title + " " + this.name
				+ "\n" + "\tวุฒิการศึกษา : " + this.education + "\n"
				+ "\tตำแหน่งงาน : ";
		for (int i = 0 ; i < occVector.size()-1 ; i++) {
			if(occVector.get(i).getSelected()){
				if (i == 0) {
					text = text + occVector.get(i).getOccupationName();
				} else {
					text = text + ", " + occVector.get(i).getOccupationName();
				}
			}
		}
		if(occVector.get(4).getSelected()){
			text = text + ", " + this.other;
		}
		text = text + "\n\tเบอร์โทรศัพท์ : " + this.telNo + "\n"
				+ "\tอีเมล์ : " + this.email + "\n";
		return text;
	}
	
	public void editPaymentStatus(String traineeStatus) {
		this.traineeStatus = traineeStatus;
	}
	
	public void addOccupation(Occupation occ){
		this.occVector.addElement(occ);
	}
	
	public void addOther(Occupation occ, String other){
		if(occ.getSelected()){
			this.other = other;
		}
	}
	
	public boolean isSelected(boolean check){
		if(check){
			return true;
		}
		return false;
	}
	
	public boolean isOccExist(boolean other){
		if(other){
			return true;
		}
		return false;
	}

	public String getName() {
		return this.name;
	}

	public String getTraineeStatus() {
		return this.traineeStatus;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}

	public void setTraineeStatus(String traineeStatus) {
		this.traineeStatus = traineeStatus;
	}

	public String getTitle() {
		return this.title;
	}

	
}
