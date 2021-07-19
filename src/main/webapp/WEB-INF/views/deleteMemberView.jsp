<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('.btn').click(function(){
		if($("#memPwd").val()==""){
			alert("비밀번호를 입력해주세요");
			$("#memPwd").focus();
			return false;
		}
		$.ajax({
			url:"/cookbook/pwdCk",
			type: "POST",
			dataType:"json",
			data:$("#deleteForm").serializeArray(),
		success: function(data){
			if(data==0){
				alert("비밀번호가 틀렸습니다");
				return;
			}else{
				$("#deleteForm").submit();
			}
		}
		})
	});
})
</script>
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
	<div class="formbox">
	<form action="/cookbook/deleteMember" id="deleteForm" method="post">
	<h1>탈퇴하기</h1>
		<label for="">아이디</label>
		<input type="text" id="memId" name="memId" /><br/>
		<label for="">비밀번호</label>
		<input type="password" id="memPwd" name="memPwd" /><br/>
		<input class="btn" type="submit" value="탈퇴" />
	</form>
	</div>
</body>
</html>