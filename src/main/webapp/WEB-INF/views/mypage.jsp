<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>my page</title>
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
	<div id="bodyWrap">	
			<h1>마이페이지</h1>
			<div class="joinbox">
				<form action="/cookbook/mypageUpdate" method="post">
					<div class="formbox">
						<%-- <label for="">프로필 사진</label>
						<input type="file" id="memThumb" name="memThumb" value="${member.memThumb }"/> --%>
						<label for="">비밀번호</label>
						<input type="password" id="memPwd" name="memPwd" /><br/>
						<label for="">닉네임</label>
						<input type="text" id="memNickName" name="memNickName" /><br/>
						<label for="">자기소개</label>
						<input type="text" id="memIntroduce" name="memIntroduce" /><br/>
						<label for="">이메일</label>
						<input type="email" id="memEmail" name="memEmail" /><br/>
						<input class="btn" type="submit" value="회원정보수정"></button><br/>
						
					<!-- 메인으로 버튼 -->
				</form>
				<a href="deleteMemberView">탈퇴하기</a>
			</div>
		</div> <!-- 바디끝 -->
</body>
</html>