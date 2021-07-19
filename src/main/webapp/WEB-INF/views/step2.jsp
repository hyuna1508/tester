<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>COOKBOOK</title>
<!--  index CSS -->
<link rel="stylesheet" href="../resources/css/index.css" >
<!-- loginjoinform CSS -->
<link rel="stylesheet" href="../resources/css/loginjoinform.css" />
<style type="text/css">
	h1{
		text-align: center;
		padding-bottom: 5px;
	}
	.formbox{
		margin: 0 auto;
	}
	.labelbox{
	text-align: center;
	padding: 5px 0px;
	}
	.btnbox{
	text-align: center;
	padding: 5px 0px;
	}
</style>
<!-- js -->
<script src="../resources/js/join.js?ver=1"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$('.btn').on('click', function(){
		if($('#memId').val()==""){
			alert("아이디는 반드시 입력해야합니다.");
			$('#memId').focus();
			return false;
		}
		if($('#memPwd').val()==""){
			alert("비밀번호는 반드시 입력해야합니다.");
			$('#memPwd').focus();
			return false;
		}
		if($('#memName').val()==""){
			alert("이름은 반드시 입력해야합니다.");
			$('#memName').focus();
			return false;
		}
	});
});

function f_idck(){
	$.ajax({
		url:"/cookbook/idck",
		type:"post",
		dateType:"json",
		data:{"memId":$("#memId").val()},
		success:function(data){
			if(data==1){
				alert("존재하는 아이디입니다.");
			}else if(data==0){
				$("#idck").attr("value","Y");
				alert("사용가능한 아이디입니다.");
			}
		}
	})
}
</script>

</head>
<body>
<div><!-- 전체 -->
	
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
	
	<!-- 바디 부분 시작 -->
	<div id="bodyWrap">	
		<h1>회원가입</h1>
		<div class="joinbox">
			<form action="/cookbook/step3" method="post">
				<div class="formbox">
					<div class="labelbox">
						<label>아이디</label><br/>
						<input type="text" name="memId" id="memId" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/> <!-- style수정하셔도 됩니다 -->
						<button class="idck" type="button" id="idck" onclick="f_idck()" value="N">중복확인</button>
						<span id="lenId" style="font-size:9px; color:red; text-align:center;"></span><br/>
						<label>비밀번호</label><br/>
						<input type="password" name="memPwd" id="memPwd" onchange="check_join()" placeholder="비밀번호(8-30자이내)"  style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
						<span id="lenpw" style="font-size:9px; color:red; text-align:center;"></span><br/> <!-- 비밀번호 자리수 체크 -->
						<label>비밀번호확인</label><br/>
						<input type="password" id="ckmemPwd" onchange="check_join()" placeholder="비밀번호 확인" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
						<span id="ckpw" style="font-size:9px; text-align:center;"></span><br/> <!-- 비밀번호일치체크 -->
						<label>이름</label><br/>
						<input type="text" name="memName" id="memName"  placeholder="이름" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/><br/>
						<label>닉네임</label><br/>
						<input type="text" name="memNickName" placeholder="닉네임" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/><br/>
						<label>이메일</label><br/>
						<input type="email" name="memEmail" placeholder="이메일" required="required" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/><br/>
						<label>성별</label><br/>
						<!-- <input type="text" name="memGender" placeholder="성별" required="required" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/><br/> -->
						<input type="checkbox" name="memGender" value="남자" />남자&nbsp;&nbsp;
						<input type="checkbox" name="memGender" value="여자" />여자&nbsp;&nbsp;
						<input type="checkbox" name="memGender" value="선택안함" />선택안함 <br/> 
					
					</div>
					<div class="btnbox">
						<input class="btn" type="submit" value="회원가입"></button>
					</div>
				</div><br/><br/>
				<!-- 메인으로 버튼 -->
			</form>
		</div>
	</div> <!-- 바디끝 -->
</div> <!-- 전체 끝 -->
</body>
</html>