
var popular =  $('.popular');
$(popular).css({backgroundColor : "black"});

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