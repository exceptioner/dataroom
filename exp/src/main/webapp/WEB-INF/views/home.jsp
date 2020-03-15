<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page session="false" %> --%>
<html>
<head>
	<title>Home</title>
	<link href="/resources/css/main.css" rel="stylesheet" />
	<link href="/resources/css/common.css" rel="stylesheet" />
	<style type="text/css">
			li {list-style: none; float: left; padding: 6px;}
		</style>
</head>
<body>
<h1>
	Hello world2!
</h1>

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
		<tr>
			<td class="pt10 tc">10652</td>
			<td class="pt10 text">바다소년</td>
			<td class="pt10 tc">2020-03-14 22:10:00</td>
			<td class="pt10 number">18</td>
			<td class="pt10 number">0</td>
			<td class="pt10 text">pc통신이 신문에 났네요</td>
		</tr>
		<tr>
			<td class="tc">10653</td>
			<td class="text">바다소년</td>
			<td class="tc">2020-03-14 22:10:00</td>
			<td class="number">18</td>
			<td class="number">0</td>
			<td class="text">pc통신이 신문에 났네요2</td>
		</tr>
	</tbody>
</table>
<div>
	<ul class="pagination">
	  <c:if test="${pagination.prev }">
	  <li>
	      <a href='<c:url value="/board/boardList${pagination.makeQueryPage(pagination.startPage-1) }"/>'><i class="fa fa-chevron-left"><</i></a>
	  </li>
	  </c:if>
	  <c:forEach begin="${pagination.startPage }" end="${pagination.endPage }" var="pageNum">
	  <li>
	      <a href='<c:url value="/board/boardList${pagination.makeQueryPage(pageNum) }"/>'>${pageNum }</a>
	  </li>
	  </c:forEach>
	  <c:if test="${pagination.next && pagination.endPage >0 }">
	  <li>
	      <a href='<c:url value="/board/boardList${pagination.makeQueryPage(pagination.endPage+1) }"/>'><i class="fa fa-chevron-right">></i></a>
	  </li>
	  </c:if>
	</ul>
</div>

</body>
</html>
