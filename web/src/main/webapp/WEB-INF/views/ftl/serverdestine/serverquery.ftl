<html>
<head>
<title>服务查询页面</title>
 <#include "/WEB-INF/views/ftl/head.ftl">
 <script type="text/javascript" src="/uicomponent/laypage/laypage.js"></script>
 <link rel="stylesheet" type="text/css" href="/css/sui-append.min.css">
</head>
<body>
    <div style='text-align:center;'>
    <form class="sui-form form-horizontal" action="/serverdestine/query" method="get" id="criteria">
        <table class="sui-table table-sideheader" style='margin:0px auto;'>
      <tbody>
      
        <tr>
          <th>选择服务：</th> 
          <td><div id="app0" style="background-color:#ff0000;display:inline;">
            <select name="parent" id="parent"
                 onclick="lookforPt()"> <#if pname ??>
                 <option value="${pname.pid}" selected>${pname.name}</option></#if>                 
                 <option v-for="item in result" v-bind:value="item.pid">{{item.name}}</option>
                 </select></div> --
                <div id="app1" style="background-color:#ffff00;display:inline;">
                 <select name="childOne" id="childOne"
                 onclick="lookforCd1()"> <#if cname ??>
                 <option value="${cname.id}" selected>${cname.name}</option></#if>                 
                 <option v-for="item in result" v-bind:value="item.id">{{item.name}}</option>
                 </select></div>
               </td> 
          <td>
          <input type="hidden" id="pageNum" name="pageNum" /> 
          <input type="hidden" id="pageSize" name="pageSize" />
          <a href="javascript:void(0);" class="sui-btn btn-large btn-primary" onclick="queryBtn()">查询</a></td>              
        </tr>
      </tbody>
    </table>
  </form>
    <table class="sui-table table-bordered">
  <thead>
    <tr>
      <th>服务商</th>
      <th>价格</th>
      <th>操作 </th>      
    </tr>
  </thead>
  <tbody>
    <#if serverPage??>
        <#list serverPage.list as item>
    <tr>
      <td>${item["name"]}</td>
      <td>${item["price"]}</td>      
      <td><a href="javascript:void(0);" class="sui-btn btn-bordered btn-large btn-primary" onclick=show('${item["id"]}')>详情</a>
           <a href="javascript:void(0);" class="sui-btn btn-bordered btn-large btn-success"onclick="destine()">预定</a>
      </td>
    </tr>
        </#list>
    </#if>
  </tbody>
</table>
    <div id="pagination">
            <input type="hidden" id="totalPages" value="${serverPage.pages }">
     </div>
  </div>
</body>
<script>
    //两个vue变量
    var app0 = new Vue({
    el : '#app0',
    data : {
        result : []
    }
}); 
    var app1 = new Vue({
    el : '#app1',
    data : {
        result : []
    }
});
    //获取下拉框中父分类的集合
function lookforPt() {
    $.ajax({
        type : "get",
        url : "/serverdestine/cglist",
        dataType:"json",
        success : function(msg) {            
            app0.result = msg ;
            lookforCd1();//成功后触发子分类的获取           
        },
        error:function(){
            console.log("出错了");
        }
    
    })
};
    lookforPt();
    //获取下拉框中子分类的集合
    function lookforCd1(){
     var thePid = $("#parent option:selected").val();
        $.ajax({
            type:"get",
            url:"/serverdestine/cglist?pid="+thePid,
            success:function(msg){
                app1.result = msg;
            },
            error:function(ms){ 
                alert("子分类的错误"+ms);
            }
        });
    };
      
    //查询按钮
    function queryBtn(curr){
        $("#criteria").submit();
    };
    
    //显示详情函数
    function show(id){
        layer.open({
            type:2,
            title:"服务商详情",
            fix:false,
            maxmin:true,
            area:['750px','580px'],
            shadeClose:false,//点击遮罩关闭
            content:"/serverdestine/show?id="+id,
            end:function(){}
        });
    }
    //分页
    var pageall = $("#totalPages").val() == '' ? 1 : $("#totalPages").val();
        laypage({
            cont : 'pagination', //容器。值支持id名、原生dom对象，jquery对象,
            pages : pageall, //总页数
            first : true,
            last : true,
            skip:true,
            curr :  function(){ //通过url获取当前页，也可以同上（pages）方式获取
                var page = location.search.match(/pageNum=(\d+)/);
                return page ? page[1] : 1;
              }(), //当前页
            jump : function(obj, first) { //触发分页后的回调
                if (!first) { //点击跳页触发函数自身，并传递当前页：obj.curr
                    $("#pageNum").val(obj.curr);
                    $("#pageSize").val(1);
                    queryBtn(obj.curr);
                }
            }
        });

</script>
</html>