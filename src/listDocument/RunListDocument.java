package listDocument;

import java.util.Vector;

import downloadDocument.*;

public class RunListDocument {

	public static void main(String[] args) {
		TrainingDocument doc1 = new TrainingDocument("QTP_presentation01","localhost/Qtp_ppt/ppt01.ppt");
		TrainingDocument doc2 = new TrainingDocument("QTP_presentation02","localhost/Qtp_ppt/ppt02.ppt");
		CourseTraining courseTraining1 = new CourseTraining("QTP",5);
		CourseTraining courseTraining2 = new CourseTraining("Selenium",4);
		SearchCourseTraining searchCourseTraining = new SearchCourseTraining();		
		courseTraining1.addDocument(doc1);
		courseTraining1.addDocument(doc2);		
		searchCourseTraining.addCourseTraining(courseTraining1);
		searchCourseTraining.addCourseTraining(courseTraining2);
		//2 - ระบบค้นหาข้อมูลหลักสูตรการอบรม
		//3 - ระบบคืนค่าการค้นหา
		//4 - ระบบแสดงข้อมูลจากการค้นหา
		System.out.println(searchCourseTraining.getCourseTrainingVector().elementAt(0).getCourseName().toString());
		//5 - ผู้ใช้เลือกหลักสูตรการอบรม
		String selectCourse = "QTP";
		//6 - ระบบค้นหาข้อมูลเอกสารตามที่ผู้ใช้เลือก
		//7 - ระบบคืนค่าข้อมูลที่ค้นหา
		Vector<TrainingDocument> trainingDocumen = searchCourseTraining.getCourseTrainingVector().get(0).listAllDocument(selectCourse);
		//8 - ระบบแสดงรายละเอียดของข้อมูลที่ค้นหา
		for(int i=0 ; i<trainingDocumen.size() ; i++){
			System.out.println((i+1) + " - " + trainingDocumen.get(i).toString());
		}

	}

}
