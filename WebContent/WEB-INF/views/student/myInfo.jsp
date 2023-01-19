<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 마이페이지</title>
</head>
<body>
    <h1>학생 상세 정보</h1>
    <div>
        <form>
            <fieldset>
                <legend>학생 정보</legend>
                <ul>
                    <li>
                        <label>아이디</label>
                        <input type="text" placeholder="ID를 입력해주세요" name="student-id" id="">
                    </li>
                </ul>
            </fieldset>
            <div>
                <input type="submit" value="수정하기">
                <input type="reset" value="초기화">
            </div>
        </form>
    </div>
</body>
</html>