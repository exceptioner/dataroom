<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String owner = request.getParameter("owner");
%>
<div class="pagingbar" align="center">
	<table class="mt10 mb10">
		<tr>
		    <c:if test="${pageMaker.prev}">
			    <td class="pr10">
			        <a href='/<%=owner %>/list?page=${pageMaker.startPage-1}'>&laquo;</a>
			    </td>
		    </c:if>
		    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
			    <td <c:if test="${idx != pageMaker.endPage or idx == pageMaker.displayPageNum }"> class="pr10" </c:if>>
			    	<c:if test="${idx == search.page }">
			    		<span class="bolder" style="cursor: default; border: 1px solid white; padding: 2 4 2 4">${idx}</span>
			    	</c:if>
			    	<c:if test="${idx != search.page }">
			    		<a href='/<%=owner %>/list?page=${idx}'>${idx}</a>
			    	</c:if>
			    </td>
		    </c:forEach>
		    <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
			    <td>
			        <a href='/<%=owner %>/list?page=${pageMaker.endPage+1}'>&raquo;</a>
			    </td>
		    </c:if>
		</tr>
	</table>
</div>