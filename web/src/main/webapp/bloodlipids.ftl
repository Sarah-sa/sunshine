<html>
<head>
<meta charset="UTF-8">
<title>血脂查询</title> 
<#include "/WEB-INF/views/ftl/head.ftl">
<script src="/eui/echarts.min.js"></script>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="/eui/layui/css/layui.css" media="all">

</head>
<body>
	<#include "/oldhead.html">
	<div class="side_cen"  style="width: 800px; height: 800px" >		
		<div align="left" style="margin-left: 35rem; margin-top: 1rem">
		<div class="layui-inline">
		<form action="/getUricAcaid" method="get">
			开始时间： <input class="layui-input" name="sdate" placeholder="自定义日期格式" onclick="layui.laydate({elem: this, istime: true, format: 'YYYY-MM-DD hh:mm:ss'})">
			结束时间：<input class="layui-input" name="edate" placeholder="自定义日期格式"
				onclick="layui.laydate({elem: this, istime: true, format: 'YYYY-MM-DD hh:mm:ss'})">
			<button style="width: 60px; height: 30px">查询</button>

		</form>
				<script src="/eui/layui/layui.js" charset="utf-8"></script>
			<script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  var start = {
    min: laydate.now()
    ,max: '2050-06-16 23:59:59'
    ,istoday: false
    ,choose: function(datas){
      end.min = datas; //开始日选好后，重置结束日的最小日期
      end.start = datas //将结束日的初始值设定为开始日
    }
  };
  
  var end = {
    min: laydate.now()
    ,max: '2050-06-16 23:59:59'
    ,istoday: false
    ,choose: function(datas){
      start.max = datas; //结束日选好后，重置开始日的最大日期
    }
  };
  
  document.getElementById('LAY_demorange_s').onclick = function(){
    start.elem = this;
    laydate(start);
  }
  document.getElementById('LAY_demorange_e').onclick = function(){
    end.elem = this
    laydate(end);
  }
  
});
</script>

</div>




<br> <br> <br>
		<div align="center" style="margin-left: -14rem; margin-top: -1rem; width: 650px; height: 350px" id="container">
			<div id="main" style="width: 650px; height: 350px;" align="center"></div>

			<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        var option = {
        	    title: {
        	        text: '血脂变化图'
        	    },
        	    tooltip: {
        	        trigger: 'axis'
        	    },
        	    legend: {
        	        data:['血脂']
        	    },
        	    grid: {
        	        left: '3%',
        	        right: '4%',
        	        bottom: '3%',
        	        containLabel: true
        	    },
        	    toolbox: {
        	        feature: {
        	            saveAsImage: {}
        	        }
        	    },
        	    xAxis: {
        	        type: 'category',
        	        boundaryGap: false,
        	        data: ['0','1','2','3','4','5','6','7','8','9','10','11','12','13','14','15']
        	    },
        	    yAxis: {
        	        type: 'value'
        	    },
        	    series: [
        	        {
        	            name:'血脂',
        	            type:'line',
        	            stack: '总量',
        	            data:[<#list BloodLipids as item>${item.serumlipid!},</#list>]
        	        },
        	            
        	                  
        	      
        	        
        	        
        	        
        	    ]
        	};
        myChart.setOption(option);
    </script>
		</div>



		<br> <br> <br>

		<div align="center">
			<table border="1">

				<tr>
					<td style="width: 200px; height: 30px">测量时间：</td>
					<td>血脂(mmoI/L)：</td>
					
					<td>状态：</td>
				</tr>

				<#list BloodLipids as item>
				<tr>
					<td style="width: 200px; height: 30px">${item.exam_time?string('yyyy-MM-dd HH:mm:ss')}</td>

					<td>${item.serumlipid}</td>
					<td>${item.status}</td>
				</tr>
				</#list>
			</table>
		</div>

	</div>








	<#include "/oldfoot.html">
</body>

</html>