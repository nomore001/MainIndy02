package uploadDocument;

import java.util.Vector;

import downloadDocument.CourseTraining;
import downloadDocument.SearchCourseTraining;
import downloadDocument.TrainingDocument;



public class RunuploadDocument {

	public static void main(String[] args) {
		
		TrainingDocument trainingDocument = new TrainingDocument();
		CourseTraining courseTraining = new CourseTraining("QTP",5);
		SearchCourseTraining searchCourseTraining = new SearchCourseTraining();
		
		
		
		
		searchCourseTraining.addCourseTraining(courseTraining);
		
		
				//2 - ระบบแสดงแบบฟอร์มการเพิ่มเอกสาร
				//3 - ผู้ใช้กรอกข้อมูลตามที่แบบฟอร์มระบุ
				String documentName = "QTP_presentation01";
				String documentPath = "localhost/Qtp_ppt/ppt01.ppt";
				trainingDocument = new TrainingDocument(documentName,documentPath);
				//5 - ระบบรับค่าที่ผู้ใช้กรอก
				//6 - ระบบบันทึกข้อมูลเอกสารที่ผู้ใช้ระบุลงฐานข้อมูล
				int courseId = searchCourseTraining.searchCourseId(courseTraining.getCourseName(),courseTraining.getCourseDuration());
				Vector<TrainingDocument> document = searchCourseTraining.getCourseTrainingVector().elementAt(courseId).addDocument(trainingDocument);

				//7 - ระบบคืนค่าสถานะ การตรวจสอบจากฐานข้อมูล				
				//8 - ระบบตรวจสอบสถานะ การคืนค่า
				if(document!=null){
					System.out.println("Pass");
					System.out.println(searchCourseTraining.getCourseTrainingVector().elementAt(courseId).getTrainingDocumentVector());
				}else{
					System.out.println("Fail");
				}

	}

}
