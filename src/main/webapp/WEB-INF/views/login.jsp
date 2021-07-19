<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>COOKBOOK</title>
<!--  index CSS -->
<link rel="stylesheet" href="../resources/css/index.css" >
<!-- loginjoinform CSS -->
<link rel="stylesheet" href="../resources/css/loginjoinform.css">
<style type="text/css">
	.joinbtn{
		background-color: #4CAFAA; /*색변경*/
		border: none;
		color: white;
		padding: 15px 32px;
		text-align: center;
		text-decoration: none;
		display: inline-block;
		font-size: 16px;
		margin: 4px 2px;
		cursor: pointer;
	}
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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('.btn').click(function(){
		if($.trim($('#memId').val())==''){
			alert("아이디를 입력해주세요");
			$('#memId').focus();
			return false;
		}else if($.trim($('#memPwd').val())==''){
			alert("비밀번호를 입력해주세요");
			$('#memPwd').focus();
			return false;
		}
	})
	$(".joinbtn").on("click", function(){
	location.href = "step1";
	});
});

</script>
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
    <div class="bodyWrap">
		<h1>로그인</h1>
		 <div class="joinbox">
		 <c:choose>
		 	<c:when test="${empty sessionScope.memId}">
				<form action="loginCk" id="loginform" method="post">
					<div class="formbox">
						<div class="labelbox">
							<input type="text" name="memId" id="memId" placeholder="아이디" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/>
							<input type="password" name="memPwd" id="memPwd" placeholder="비밀번호" style="text-align:center; font-size:15px; width:200px; height:35px;"/><br/><br/>
							<c:if test="${msg=='fail'}"><span style="font-size:9px; text-align:center;">존재하지 않는 아이디 또는 비밀번호가 틀립니다.</span></c:if>
						</div>
						<div class="btnbox">
							<input type="submit" class="btn" value="로그인" />&nbsp;&nbsp;
							<button class="joinbtn" type="button">회원가입</button>
						</div>
					</div>
				</form>
			</c:when>
		</c:choose>
		</div>
	</div>
        <footer>
           <div class="footArea">
               <div class="foottext">
                   <ul>
                       <li>회사소개</li>
                       <li>인재채용</li>
                       <li>사회공헌</li>
                       <li>제휴/광고/부대사업문의</li>
                       <li>이용약관</li>
                       <li>개인정보처리방침</li>
                       <li>윤리경영</li>
                   </ul>
                   <p><img src="" alt="logo"></p>
                   <address>서울특별시 성동구 왕십리로 50, 6층(성수동 1가, 메가박스스퀘어) ARS 1544-0070<br />
                       <span>대표자명 김진선 · 개인정보보호책임자 조상연 · 사업자등록번호 211-86-59478 · 통신판매업신고번호 제 833호</span><br />
                       <p class="">Copyright &copy; </p>
                   </address>
               </div>
           </div>
       </footer>
</body>
</html>