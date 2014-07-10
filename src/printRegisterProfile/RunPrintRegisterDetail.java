package printRegisterProfile;

import fillRegisterProfile.*;

public class RunPrintRegisterDetail {

	public static void main(String[] args) {
		Register register = new Register("Qtp001", "1/7/2557", 5, "10/7/2557", 5, "20/7/2557", 2500);
		Trainee trainee = new Trainee("นางสาว", "อัญชลี มณีนก", "ต่ำกว่าปริญญาตรี", "0836234763", 
				"unchalee.fern@gmail.com", "ยังไม่ได้ชำระเงิน", "3/7/2557", "2500.1");
		Occupation occ1 = new Occupation(true, "Tester");
		Occupation occ2 = new Occupation(true, "Administrator");
		Occupation occ3 = new Occupation(false, "Programmer");
		Occupation occ4 = new Occupation(false, "System analyst");
		Occupation occ5 = new Occupation(true, "Teacher");
		Address address = new Address("", "111", "", "หนองหาร", "สันทราย", "เชียงใหม่", "50290");
		Login login = new Login("unchalee", "10012536");
		trainee.addOccupation(occ1);
		trainee.addOccupation(occ2);
		trainee.addOccupation(occ3);
		trainee.addOccupation(occ4);
		trainee.addOccupation(occ5);
		trainee.addAddress(address);
		trainee.addLogin(login);
		register.addTrainee(trainee);

		//ได้มาจากการลอกอิน
		String username = "unchalee";
		
		//2 – ระบบค้นหาข้อมูลของผู้เข้าร่วมอบรมจากฐานข้อมูล
		//3 – ระบบคืนค่าข้อมูลของผู้เข้าร่วมอบรม
		Trainee theTrainee = register.searchTraineeByUsername(username);
		//4 – ระบบแสดงข้อมูลของผู้เข้าร่วมอบรมโดยใช้งานร่วมกับ iReport
		System.out.println("วันที่สมัคร : " + theTrainee.getRegisterDate() + "\n");
		System.out.println(theTrainee.toString());
		System.out.println(theTrainee.getAddress().toString());
		System.out.println("\nส่วนที่ 3 ข้อมูลการชำระเงิน" + "\n\tสถานะการชำระเงิน : " + theTrainee.getTraineeStatus());
	}

}
