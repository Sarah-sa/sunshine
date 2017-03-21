<html>
<head>
<title>新增走访计划</title> <#include "/WEB-INF/views/ftl/head.ftl">
<link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>

	<div class="grid-demo" align="center" id="app">
		<form id="demo1" class="sui-form" action="/visitrecond/add"
			method="get">
			<table class="sui-table table-sideheader date">
				<tbody>
					<tr>
						<th width="105px">走访对象：</th>
						<td><select id="elderId" name="elderId" onclick="lookfor()">
								<option v-for="item in result" v-bind:value="item.id">{{item.name}}</option>
						</select></td>
					</tr>
					<tr>
						<th width="105px">发起人：</th>
						<td><i>获取session中当前登陆的坐席人员对象</i></td>
					</tr>
					<tr>
						<th width="125px">计划走访时间：</th>
						<td><input type="text" id="planTime"></td>
					</tr>
					<tr>
						<td><input type="button" value="取消" onclick="cancelBtn()"></td>
						<td><input type="button" value="增加" onclick="saveBtn()"></td>
					</tr>
					<tr>
						<td>
							<!-- <div id="demo4" class="control-group input-daterange">
								<label class="control-label">时间选择：</label>
								<div class="controls">
									<input class="input-medium input-date" type="text" ><span>-</span>
									<input class="input-medium input-date" type="text">
								</div>
							</div> -->
						</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
<script>
	var app = new Vue({
		el : '#app',
		data : {
			result : []
		}
	});
	//老人姓名的下拉菜单
	function lookfor() {
		$.ajax({
			type : "get",
			url : "/visitrecord/forname",
			dataType : "json",
			success : function(msg) {
				app.result = msg;
			}
		})
	};
	//计划时间的选择器
	$('#planTime').datepicker({
		size : "small"
	});
    //取消按钮
	function cancelBtn() {
		var index = parent.layer.getFrameIndex(window.name);
		parent.findrec();
		parent.layer.close(index);
	};
	 //增加按钮
	function saveBtn(){
		/* if(!check().form()){
			return;
		}; */		
		$.ajax({
			type:"get",
			url:"/visitrecord/add",
			data:{
				elderId:$("#elderId option:selected").val(),
				planTime:$("#planTime").val()
			},
			success:function(msg){
				if(msg != 0){
					cancelBtn();
				}else{
					alert("插入失败"+msg);
				};				
			},
			error:function(){
				alert("添加--错误");
			}
		});
	}; 
	
	/* //表单验证
	function check(){
		 //返回一个validate对象，这个对象有一个form方法，返回的是是否通过验证
		return $("#demo1").validate({
			rules:{ 
				elderId:{ 
                    required:true
                },
                planTime:{ 
                    required:true                                   
                }
            }, 
            messages:{ 
            	elderId:{ 
                    required:"老人姓名不能为空"
                },
                planTime:{ 
                    required:"走访的计划时间不能为空！"                                
                }
            }     
		});
	} */
	/*//时间选择器
     $('#demo4.input-daterange').datepicker({
        beforeShowDay: function (date){
          if (date.getMonth() == (new Date()).getMonth())
            switch (date.getDate()){
              case 4:
                return {
                  tooltip: 'Example tooltip',
                  classes: 'active'
                };
              case 8:
                return false;
              case 12:
                return "green";
            }
        }
    }); */
	
</script>
</html>