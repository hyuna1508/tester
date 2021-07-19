jQuery(document).ready(function($){ 
    var $button= $('.benefit_btn>li'); 
    var $visual= $('.benefit>li');
    var current= 0;

    $button.click(function(){
        var tg= $(this);
        var i= tg.index(); 
        $button.removeClass("on"); 
        tg.addClass("on");
        imageMove(i)
    });
    function imageMove(i){
        $visual.eq(current).css("left", 0).stop().animate({left: '-100%'}); 
        $visual.eq(i).css("left", "100%").stop().animate({left:'0'}); 
        current= i;
    }

    setInterval(function(){
        var n= current +1;
        if(n == $button.length) n = 0;
        $button.eq(n).trigger('click');
    }, 5*1000);

    
});