package notice.model.service;

import java.sql.Connection;
import java.util.List;

import common.JDBCTemplate;
import notice.model.dao.NoticeDAO;
import notice.model.vo.Notice;

public class NoticeService {
	private NoticeDAO nDao;
	
	public NoticeService() {
		nDao = new NoticeDAO();
	}
	/**
	 * 공자사항 등록 Service
	 * @param notice
	 * @return result
	 */
	public int registerNotice(Notice notice) {
		Connection conn = JDBCTemplate.getConnection();
		int result = nDao.insertNotice(conn, notice);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}
	/**
	 * 공자사항 목록 조회 Service
	 * @return nList
	 */
	public List<Notice> selectAllNotice() {
		Connection conn = JDBCTemplate.getConnection();
		List<Notice> nList = nDao.selectAllNotice(conn);
		return nList;
	}
	/**
	 * 공지사항 상세 조회 Service
	 * @param noticeNo
	 * @return notice
	 */
	public Notice selectOneByNo(int noticeNo) {
		Connection conn = JDBCTemplate.getConnection();
		Notice notice = nDao.selectOneByNo(conn, noticeNo);
		return notice;
	}
	/**
	 * 공지사항 삭제 Service
	 * @param noticeNo
	 * @return result
	 */
	public int deleteNotice(int noticeNo) {
		Connection conn = JDBCTemplate.getConnection();
		int result = nDao.deleteNotice(conn, noticeNo);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}

}
