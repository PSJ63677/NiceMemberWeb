package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/member/enrollView.kh")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/member/enroll.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글로 입력한 내용 깨지지 않게 해줌
		request.setCharacterEncoding("UTF-8");
		
		String memberId = request.getParameter("member-id");
		String memberPw = request.getParameter("member-pw");
		String memberName = request.getParameter("member-name");
		// Type mismatch: cannot convert from String to int
		int memberAge = Integer.parseInt(request.getParameter("member-age"));
		String memberGender = request.getParameter("member-gender");
		String memberEmail = request.getParameter("member-email");
		String memberPhone = request.getParameter("member-phone");
		String memberAddress = request.getParameter("member-address");
		String memberHobby = request.getParameter("member-hobby");
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		// The method setMemberAge(int) in the type Member is not applicable for the arguments (String)
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		MemberService mService = new MemberService();
		int result = mService.registerMember(member);
		if(result > 0) {
			// 가입 성공 했으면 index.jsp로 이동
//			방법 1. 테이터 보내면서 이동
//			request.setAttribute("result", result);
//			request.getRequestDispatcher("/index.jsp").forward(request, response);
			// 방법 2. 단순 이동 - 전달값으로 페이지 경로, URL 가능
			response.sendRedirect("/index.jsp");
		} else {
			// 가입 실패
			request.setAttribute("title", "회원 가입 실패");
			request.setAttribute("msg", "해당하는 데이터가 존재하지 않습니다.");
			request.getRequestDispatcher("WEB-INF/views/common/error.jsp").forward(request, response);
		}
	}

}
