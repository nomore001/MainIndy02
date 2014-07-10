package listCourseTraining;

import java.util.Vector;
import downloadDocument.*;

public class RunListCourseTraining {

	public static void main(String[] args) {
		CourseTraining courseTraining1 = new CourseTraining("QTP", 5);
		CourseTraining courseTraining2 = new CourseTraining("Selenium", 4);
		SearchCourseTraining searchCourseTraining = new SearchCourseTraining();
		
		searchCourseTraining.addCourseTraining(courseTraining1);
		searchCourseTraining.addCourseTraining(courseTraining2);
		
//		1 - ยูสเคสเริ่มต้นเมื่อผู้ใช้เลือกฟังก์ชันแสดงรายการหลักสูตรอบรม
//		2 - ระบบค้นหาหลักสูตรการอบรมจากฐานข้อมูล
//		3 - ระบบคืนค่าหลักสูตรการอบรมจากการค้นหา
		Vector<CourseTraining> courseVector = searchCourseTraining.listCourseTraining();
		
//		4 - ระบบแสดงหลักสูตรการอบรมทั้งหมดบนหน้าจอ
		for(int i = 0;i<courseVector.size();i++){
			System.out.println(courseVector.get(i).getCourseName());
		}
//		5 - ยูสเคสสิ้นสุดการทำงาน

	}

}
