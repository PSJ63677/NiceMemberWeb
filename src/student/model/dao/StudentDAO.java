package student.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import student.model.vo.Student;

public class StudentDAO {

	public Student selectCheckLogin(Connection conn, Student student) {
		String query = "SELECT * FROM STUDENT_TBL WHERE STUDENT_ID = ? AND STUDENT_PW = ?";
		Student sOne = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, student.getStudentId());
			pstmt.setString(2, student.getStudentPw());
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				sOne = new Student();
				sOne.setStudentId(rset.getString("STUDENT_ID"));
				sOne.setStudentPw(rset.getString("STUDENT_PW"));
				sOne.setStudentName(rset.getString("STUDENT_NAME"));
				sOne.setStudentEmail(rset.getString("STUDENT_EMAIL"));
				sOne.setStudentPhone(rset.getString("STUDENT_PHONE"));
				sOne.setStudentAddr(rset.getString("STUDENT_ADDR"));
				sOne.setGender(rset.getString("GENDET"));
				sOne.setStudentDate(rset.getDate("STUDENT_DATE"));
			}
			rset.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sOne;
	}

}
