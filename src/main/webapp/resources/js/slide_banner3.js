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