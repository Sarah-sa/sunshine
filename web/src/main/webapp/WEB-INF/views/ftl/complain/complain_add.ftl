<html>
<head>
<title>投诉页面</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 <link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
    <div style='text-align:center;'>
    <form class="sui-form form-horizontal">
        <table class="sui-table table-sideheader" style='margin:0px auto;'>
      <tbody>
      
        <tr>
          <th colspan="2">投诉内容：
            <input type="hidden" id="orderId" value="${orderId}">
          </th>                
        </tr>
        <tr>
            <td colspan="2"><textarea id="content" style="width: 400px; height: 200px;"></textarea></td>
        </tr>        
        <tr >            
          <td></td>
          <td><input type="button" id="cancelBtn" class="sui-btn btn-large btn-info" value="取消"/>
          <button type="button" id="saveBtn" class="sui-btn btn-large btn-primary">提交</button>
          </td>
        </tr>
       
      </tbody>
    </table>
  </form>
  </div>
</body>
<script>


        //取消按钮
        $("#cancelBtn").on('click',function(){
            var index = parent.layer.getFrameIndex(window.name);
            //parent.findrec();
            parent.layer.close(index);
            });
    //保存更改按钮
    $("#saveBtn").on('click',function(){        
        $.ajax({
            type:"get",
            url:"/complain/add",
            data:{
                "orderId":$("#orderId").val(),
                "content":$("#content").val()                             
            },
            success:function(msg){                
                if(msg != 0){
                $("#cancelBtn").click();
                }else{
                  alert("投诉失败"+msg);
                }
            },
            error:function(){
                alert("投诉失败");
            }
        })
    })

</script>
</html>