<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  index CSS -->
<link rel="stylesheet" href="../resources/css/index.css" >
</head>
<body>
		<div id="headerWrap">
	      <header>
	          <div id="logobox">
	              <a href="/"><img src="../resources/img/logo.png" alt="로고이미지"></a>
	          </div>
	          <div id="serach">
	              <form action="">
	                  <input type="text" value="" placeholder="serach">
	                  <input type="image" src="../resources/img/serach.png" alt="검색">
	              </form>
	          </div>
	          <div id="link">
	              <a href="login"><img src="../resources/img/mypage.png" alt="로그인"></a>
	              <a href=""><img src="../resources/img/pngegg.png" alt="글쓰기"></a>
	              <a href=""><img src="../resources/img/Heart.png" alt="즐겨찾기"></a>
	              <a href=""><img src="../resources/img/menu.png" alt="메뉴"></a>
	          </div>
	      </header>
	</div>
	<p>${memberVO.memId}님 환영합니다.</p>
	<div>
		<a href="mypage">mypage</a>
		<a href="logout">로그아웃</a>
	</div>
	
			

</body>
</html>