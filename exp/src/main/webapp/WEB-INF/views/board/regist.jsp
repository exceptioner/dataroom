<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page session="false" %> --%>
<html>
	<head>
		<title>게시판 등록</title>
		<link href="/resources/css/main.css" rel="stylesheet" />
		<link href="/resources/css/common.css" rel="stylesheet" />
	</head>
	<body class="layer">
		<h1 align="center">게시판 등록</h1>

		<table style="width: 100%;">
			<colgroup>
				<col width="150px"/>
				<col width="*"/>
			</colgroup>
			<tbody>
				<tr class="underline">
					<th>게시판명</th>
					<td><input type="text" style="width: 100%"></td>
				</tr>
				<tr class="underline">
					<th>게시판설명</th>
					<td><textarea rows="5" cols="" class="w100" style="width: 100%"></textarea></td>
				</tr>
				<tr class="underline">
					<th>게시판타입</th>
					<td>
						<input type="radio">
						<input type="radio">
						<input type="radio">
					</td>
				</tr>
			</tbody>
		</table>

		<div class="mt10 fr">
			<a href="/board/insert">[저장]</a>
		</div>
	</body>
</html>