<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!--  index CSS -->
<link rel="stylesheet" href="./resources/css/index.css" >
<meta charset="UTF-8">
<title>COOKBOOK</title>
<style>
.slides li {
    overflow: hidden;

}


.slides li strong {
    position: absolute;
    display: block;
    z-index: 1;
    width: 300px;
    height: 420px;
    background: rgba(0, 0, 0, 0.7);
    text-align: left;
    font-size: 16px;
    color: white;
    margin-top: -400px;
    opacity: 0;
}


</style>
</head>

<body>
    <div id="headerWrap">
        <header>
            <div id="logobox">
                <img src="./resources/img/logo.png" alt="로고이미지">
            </div>
            <div id="serach">
                <form action="">
                    <input type="text" value="" placeholder="serach">
                    <input type="image" src="./resources/img/serach.png" alt="검색">
                </form>
            </div>
            <div id="link">
                <a href="cookbook/login"><img src="./resources/img/mypage.png" alt="로그인"></a>
                <a href=""><img src="./resources/img/pngegg.png" alt="글쓰기"></a>
                <a href=""><img src="./resources/img/Heart.png" alt="즐겨찾기"></a>
                <a href=""><img src="./resources/img/menu.png" alt="메뉴"></a>
            </div>
        </header>
    </div>


    <div class="body">
        <div id="one">
            <h2>내가 운영자인데 !</h2>
            <h2>#그런 내가 추천한 레시피!!</h2>
            <div class="line1">
                <ul class="slides">
                    <li><a href=""><img src="./resources/img/cc.jpg" alt="추천1">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/1.jpg" alt="추천2">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li><a href=""><img src="./resources/img/2.jpg" alt="추천3">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/3.jpg" alt="추천4">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/4.png" alt="추천5">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/5.jpg" alt="추천6">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/6.jpg" alt="추천7">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/7.jpg" alt="추천8">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/8.jpg" alt="추천9">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/9.jpg" alt="추천10">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/10.jpg" alt="추천11">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/11.jpg" alt="추천12">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/12.png" alt="추천13">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/13.jpg" alt="추천14">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/14.png" alt="추천15">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                    <li> <a href=""><img src="./resources/img/15.jpg" alt="추천16">
                            <strong>This is the description for this T-Time</strong>
                            <span></span></a>
                    </li>
                </ul>
            </div>
            <div class="indicator">
                <!-- <a href="">1</a>
                    <a href="">2</a>
                    <a href="">3</a>
                    <a href="">4</a> -->
            </div>
        </div>
        <!-- <div class="nav">
            <a href="" class="prev">prev</a>
            <a href="" class="next">next</a>
        </div> -->
        <div class="controls">
            <button class="prev">prev</button>
            <button class="next">next</button>
        </div>




        <div id="two">
            <h2>이건 보지마세요. 이대로 했더니 살쪘습니다.</h2>
            <h2>#들어오지마 #이건 마약이야 #사실 나만볼거야 ㅋ</h2>
            <div class="line2">
                <div class="popular">
                    <a href=""><img src="./resources/img/photo1.jpg" alt="추천1"></a>
                    <a href=""><img src="./resources/img/photo1.jpg" alt="추천2"></a>
                    <a href=""><img src="./resources/img/photo1.jpg" alt="추천3"></a>
                    <a href=""><img src="./resources/img/photo1.jpg" alt="추천4"></a>
                </div>
                <div class="popular">
                    <a href=""><img src="./resources/img/photo2.jpg" alt="추천1"></a>
                    <a href=""><img src="./resources/img/photo2.jpg" alt="추천2"></a>
                    <a href=""><img src="./resources/img/photo2.jpg" alt="추천3"></a>
                    <a href=""><img src="./resources/img/photo2.jpg" alt="추천4"></a>
                </div>
                <div class="popular">
                    <a href=""><img src="./resources/img/photo3.jpg" alt="추천1"></a>
                    <a href=""><img src="./resources/img/photo3.jpg" alt="추천2"></a>
                    <a href=""><img src="./resources/img/photo3.jpg" alt="추천3"></a>
                    <a href=""><img src="./resources/img/photo3.jpg" alt="추천4"></a>
                </div>
                <div class="popular">
                    <a href=""><img src="./resources/img/photo4.jpg" alt="추천1"></a>
                    <a href=""><img src="./resources/img/photo4.jpg" alt="추천2"></a>
                    <a href=""><img src="./resources/img/photo4.jpg" alt="추천3"></a>
                    <a href=""><img src="./resources/img/photo4.jpg" alt="추천4"></a>
                </div>
            </div>
        </div>
        <div class="controls1">
            <button class="prev1">prev</button>
            <button class="next1">next</button>
        </div>

        <div id="three">
            <h1>생생리뷰</h1>
            <div class="line3">
                <div class="review">
                    <div id="contents">
                        <h3>비프 스테이크</h3> <br />
                        <p>맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸</p>
                    </div>
                    <div class="cover">
                        <a href=""><img class="cover-photo" src="./resources/img/dog1.jpg" alt="리뷰1"></a>
                    </div>
                </div>
                <div class="review">
                    <div id="contents">
                        <h3>라면라면라면</h3> <br />
                        <p>호로록짭짭 맛좋은라면</p>
                    </div>
                    <div class="cover">
                        <a href=""><img class="cover-photo" src="./resources/img/dog2.jpg" alt="리뷰2"></a>
                    </div>
                </div>
                <div class="review">
                    <div id="contents">
                        <h3>비프 스테이크</h3> <br />
                        <p>맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸맛나는 스테이꾸</p>
                    </div>
                    <div class="cover">
                        <a href=""><img class="cover-photo" src="./resources/img/dog3.jpg" alt="리뷰3"></a>
                    </div>
                </div>
                <div class="review">
                    <div id="contents">
                        <h3>라면라면라면</h3> <br />
                        <p>호로록짭짭 맛좋은라면</p>
                    </div>
                    <div class="cover">
                        <a href=""><img class="cover-photo" src="./resources/img/dog4.jpg" alt="리뷰4"></a>
                    </div>
                </div>
            </div>
            <button class="btn5" style="display: inline-block;">왼쪽</button>
            <button class="btn6" style="display: inline-block;">오른쪽</button>
        </div>

        <div id="four">
            <h3>최근 본 레시피</h3>
            <div class="lately">
                <a href=""><img src="./resources/img/00.jpg" alt="최근1"></a>
                <a href=""><img src="./resources/img/00.jpg" alt="최근2"></a>
                <a href=""><img src="./resources/img/00.jpg" alt="최근3"></a>
                <a href=""><img src="./resources/img/00.jpg" alt="최근4"></a>
                <a href=""><img src="./resources/img/00.jpg" alt="최근4"></a>
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
    </div>
</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>

<script>
var slides = document.querySelector('.slides'),
slide = document.querySelectorAll('.slides li'),
currentIdx = 0,
slideCount = slide.length,
prevBtn = document.querySelector('.prev'),
slideWidth = 300,
slideMargin = 30,
nextBtn = document.querySelector('.next');

slides.style.width = (slideWidth + slideMargin) * slideCount - slideMargin + 'px';

function moveSlide(num) {
slides.style.left = -num * 330 + 'px';
currentIdx = num;

}
nextBtn.addEventListener('click', function () {
if (currentIdx < slideCount - 4) {
    moveSlide(currentIdx + 1);
    console.log(currentIdx);
} else {
    moveSlide(0);
}
});

prevBtn.addEventListener('click', function () {
if (currentIdx > 0) {
    moveSlide(currentIdx - 1);
} else {
    moveSlide(slideCount - 4);
}

});


$(function(){
var $images= $('.slides>li');
$images.on('mouseover', function(){
    $(this).find('strong').stop().animate({opacity:1}, 1000*0.5);
})
.on('mouseout', function(){
    $(this).find('strong').stop().animate({opacity:0}, 1000*0.5); 
});

}); 









var popular =  $('.popular');


$(".prev1").click(function () {
    popular.first().animate({
        marginLeft : "+=506px"
    },500)
    console.log("왜안나와1")
    return false;

    
});

$(".next1").click(function () {
    popular.first().animate({
        marginLeft : "-=506px"
    },500)
    console.log("왜안나와2")
    return false;

    
});






$(document).ready(function () {
    $(".btn5").click(function () {
        $('.review').last().after($('.review').first());
        return false;
    });
    $(".btn6").click(function () {
        $('.review').first().before($('.review').last());
        return false;
    });
});

</script>
</html>