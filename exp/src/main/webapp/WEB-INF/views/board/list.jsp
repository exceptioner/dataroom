<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page session="false" %> --%>
<html>
	<head>
		<title>게시판 관리</title>
		<link href="/resources/css/main.css" rel="stylesheet" />
		<link href="/resources/css/common.css" rel="stylesheet" />
		<style type="text/css">
				li {list-style: none; float: left; padding: 6px;}
			</style>
	</head>
	<body class="layer">
		<h1 align="center">게시판 관리</h1>

		<table style="width: 100%;">
			<colgroup>
				<col width="70px"/>
				<col width="100px"/>
				<col width="200px"/>
				<col width="60px"/>
				<col width="60px"/>
				<col width="*"/>
			</colgroup>
			<thead>
				<tr class="underline">
					<th class="pb10 tc">번호</th>
					<th class="pb10 tc">ID</th>
					<th class="pb10 tc">날짜</th>
					<th class="pb10 tc">조회</th>
					<th class="pb10 tc">추천</th>
					<th class="pb10 tc">제목</th>
				</tr>
			</thead>
			<tbody style="padding-top: 10px">
				<c:forEach var="data" items="${list }" varStatus="i">
					<tr>
						<td class="pt10 tc">${data.boardNo }</td>
						<td class="pt10 text">${data.regr }</td>
						<td class="pt10 tc">${data.regDate }</td>
						<td class="pt10 number">18</td>
						<td class="pt10 number">0</td>
						<td class="pt10 text"><a href="">${data.boardNm }</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<jsp:include page="../common/pagination.jsp">
		    <jsp:param name="owner" value="board"/>
		</jsp:include>

		<div class="mt10 fr">
			<a href="">[글작성]</a>
		</div>
	</body>
</html>