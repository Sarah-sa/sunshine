<html>
<head>
<title>投诉提示页面</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 <link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
    <div style='text-align:center;'>
    <form class="sui-form form-horizontal">
        <table class="sui-table table-sideheader" style='margin:0px auto;'>
      <tbody>
      
       
        <tr>
            <td colspan="2"><textarea id="content" style="width: 400px; height: 200px;" readonly>尊敬的用户，您已投诉过该订单，不能重复投诉。</textarea></td>
        </tr>        
        <tr >            
          <td></td>
          <td>
          <input type="button" id="cancelBtn" class="sui-btn btn-large btn-info" value="取消"/>          
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
</script>
</html>