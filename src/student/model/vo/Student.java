package student.model.vo;

import java.sql.Date;

public class Student {
	private String studentId;
	private String studentPw;
	private String studentName;
	private String studentEmail;
	private String studentPhone;
	private String studentAddr;
	private String gender;
	private Date studentDate;
	
	public Student() {}

	public Student(String studentId, String studentPw) {
		this.studentId = studentId;
		this.studentPw = studentPw;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentPw() {
		return studentPw;
	}

	public void setStudentPw(String studentPw) {
		this.studentPw = studentPw;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAddr() {
		return studentAddr;
	}

	public void setStudentAddr(String studentAddr) {
		this.studentAddr = studentAddr;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getStudentDate() {
		return studentDate;
	}

	public void setStudentDate(Date studentDate) {
		this.studentDate = studentDate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentPw=" + studentPw + ", studentName=" + studentName
				+ ", studentEmail=" + studentEmail + ", studentPhone=" + studentPhone + ", studentAddr=" + studentAddr
				+ ", gender=" + gender + ", studentDate=" + studentDate + "]";
	}
	
}
