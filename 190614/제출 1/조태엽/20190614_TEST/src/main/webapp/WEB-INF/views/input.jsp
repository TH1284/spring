<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input</title>
</head>
<body>
<h1> input 페이지입니다 </h1>
<form action="input_data" method="get">
		<input type="hidden" name="idx" value="{idx}" />
		<label>이름</label> <input type="text" placeholder="이름입력" name="name" value="{name}" />
		<label>ID</label> <input type="text" name="id" value="{id}" />
		<label>PASSWORD</label> <input type="password" name="password" value="{password}" />
		<label>주소</label> <input type="text" placeholder="주소" name="address" value="{address}" />
		<label>생일</label> <input type="text" placeholder="생일" name="birthday" value="{birthday}" />
		<label>좋아하는 색상</label> <input type="text" placeholder="좋아하는 색상"
			name="favoriteColor" value="{favoriteColor}" />
		<input type="submit" value="입력 완료" />
</body>
</html>