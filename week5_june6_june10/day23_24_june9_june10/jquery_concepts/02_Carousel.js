jQuery(function($) {
    var slider = $("#jquery-slideshow"), 
        item_width = slider.parent().outerWidth(), 
        timer = null;

    $(window).on("resize", adjust);
    adjust();

    if(slider.children("li").length > 1) {
        slider.parent().append("<a href=\"#\" id=\"btn-prev\"><i class=\"fa fa-angle-left\"></i><span>previous</span></a><a href=\"#\" id=\"btn-next\"><i class=\"fa fa-angle-right\"></i><span>next</span></a>");

        slider.parent().on("click", "a#btn-prev", function(e) {
            e.preventDefault();
            slider.children("li:last").prependTo(slider);
            slider.css("left", -item_width);
            slider.animate({
                left: 0
            }, 300, "swing");
        });

        slider.parent().on("click", "a#btn-next", function(e) {
            e.preventDefault();
            slider.animate({
                left: -item_width
            }, 300, "swing", function() {
                slider.children("li:first").appendTo(slider);
                slider.css("left", 0);
            });
        });    

    }

    document.addEventListener("visibilitychange", function() {
        if("undefined" !== typeof document.hidden && document.hidden) {
            clearInterval(timer);
            timer = null;
        } else {
            autoplay();
        }
    }, false);

    slider.hover(function() {
        if(timer) {
            clearInterval(timer);
            timer = null;
        }
    }, function() {
        autoplay();
    });

    function autoplay() {
        if($("a#btn-next").length) {
            timer = setInterval(function() {
                $("a#btn-next").trigger("click");
            }, 1000);
        }
    }

    function adjust() {
        item_width = slider.parent().outerWidth();
        slider.children("li").width(item_width).parent().width(item_width * slider.children("li").length);
    }
});