<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th>번호</th>
							<th>이름</th>
							<th>제목</th>
							<th>날짜</th>
							<th>히트</th>
						</tr>
					</thead>
					<c:forEach items="${list}" var="dto">
						<tr>
							<td>${dto.bid}</td>
							<td>${dto.bname}</td>
							<td><c:forEach begin="1" end="${dto.bindent}">-</c:forEach>
								<a href="content_view?bId=${dto.bid}">${dto.btitle}</a></td>
							<td>${dto.bdate}</td>
							<td>${dto.bhit}</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="5"><a href="write_view">글작성</a></td>

					</tr>
				</table>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>
</body>
</html>