<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  index CSS -->
<link rel="stylesheet" href="../resources/css/index.css" >
<!-- loginjoinform CSS -->
<link rel="stylesheet" href="../resources/css/loginjoinform.css" />

<title>COOKBOOK</title>
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
축하합니다!
<!-- 로그인폼 -->
 <div class="joinbox">
	<form action="/loginCk" method="post">
		<div class="formbox">
<!-- 			<div class=button>
			<input type="text" name="memId" id="memId" placeholder="아이디" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
			<input type="password" name="memPwd" id="memPwd" placeholder="비밀번호" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
			<input type="submit" class="btn" value="로그인"/>
				<hr/>
			</div> -->
			<div class="click">
				<a href="login">로그인</a>
				<a href="index.jsp">아이디 찾기</a>
				<a href="index.jsp">비밀번호 찾기</a>
			</div>
		</div>
		<!-- 메인으로 버튼 -->
	</form>
</div>
</body>
</html>