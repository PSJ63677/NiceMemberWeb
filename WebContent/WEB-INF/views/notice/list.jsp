<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>공지사항 목록</title>
		<link rel="stylesheet" href="/resources/css/notice.css">
	</head>
	<body>
		<h1>공지사항목록</h1>		
		<table>
			<colgroup>
				<col width="10%">
				<col width="55%">
				<col width="10%">
				<col width="15%">
				<col width="10%">
			</colgroup>
			<thead>
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>글쓴이</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
<%-- 				<c:forEach begin="1" end="6" step="1" varStatus="status"> 주석안에 달러 적지 마세요~~ --%>
				<c:forEach items="${nList }" var="notice">
					<tr>
						<td style="text-align:center;">${notice.noticeNo }</td>
						<td><a href="/notice/detail?notice-no=${notice.noticeNo }">${notice.noticeSubject }</a></td>
						<td>${notice.noticeWriter }</td>
						<td>${notice.noticeDate }</td>
						<td style="text-align:center;">${notice.viewCount }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>




