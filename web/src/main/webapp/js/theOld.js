var h,w;
$(window).ready(function(){
	h=$(window).height();
 	w=$(window).width();
	$(".head").css({height:h});
	$(".side_cen").css({width:0.7*w,height:0.65*h});
	// $(".side_ul").css({width:0.1*w,height:0.65*h,marginLeft:50});
	$(".sm").css({height:0.1*h});
	$(window).resize(function(){
		h=$(window).height();
		w=$(window).width();
		$(".head").css({height:h});
		$(".side_cen").css({width:0.7*w,height:0.65*h});
		// $(".side_ul").css({width:0.1*w,height:0.65*h});
		$(".sm").css({height:0.1*h});

	})
	$(".side_ul li").click(function(){
		var inde=$(this).index();
		$(".side_pre").css({display:"block"});
		$(".side_pre").children().css({display:"none"});
		$(".side_pre").children().eq(inde).css({display:"block"});
	})
	$(".side_bar").mouseleave(function(){
		$(".side_pre").css({display:"none"});
	})

})
