<html>
<head>
<title></title><#include "/WEB-INF/views/ftl/head.ftl">
<script></script>
<link rel="stylesheet" type="text/css" href="./sui/sm.css">
<link rel="stylesheet" type="text/css" href="./sui/demos.css">
<link rel="stylesheet" type="text/css" href="./sui/sm-extend.css">
<script type="text/javascript" src="./sui/zepto.js"></script>
<script type="text/javascript" src="./sui/config.js"></script>



</head>
<body>
<#include "/oldhead.html">
<div class="side_cen">
<form class="sui-form form-horizontal" 
    action="/elderuser/saveeu" method="get" >
    
    <header class="bar bar-nav">
        <h1 class='title'>新增老人用户信息</h1>
    </header>
 <input type="text" data-toggle='date' />
 <div class="content">
       <div class="list-block">
    <ul>
      <!-- Text inputs -->
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">老人姓名</div>
          </div>
        </div>
      </li>
       
       <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-gender"></i></div>
          <div class="item-inner">
            <div class="item-title label">性别</div>
            <div class="item-input">
              <select>
                <option>Male</option>
                <option>Female</option>
              </select>
            </div>
          </div>
        </div>
      </li>
      
      <li class="align-top">
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-comment"></i></div>
          <div class="item-inner">
            <div class="item-title label">出生日期</div>
            <div class="item-input">
              <input type="text" id='datetime-picker'/>
            </div>
          </div>
        </div>
      </li>
      
      <li class="align-top">
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-comment"></i></div>
          <div class="item-inner">
            <div class="item-title label">关系</div>
            <div class="item-input">
              <input type="text" id='picker'/>
            </div>
          </div>
        </div>
      </li>
      
      
       </ul>
    <div class="content-block">
          <div class="row">
        <div class="col-50"><a href="#" class="button button-big button-fill button-danger">取消</a></div>
        <div class="col-50"><a href="#" class="button button-big button-fill button-success">提交</a></div>
          </div>
     </div>
  </div>
        
<script type="text/javascript" src="./sui/sm.js"></script>
<script type="text/javascript" src="./sui/sm-city-picker.js"></script>
<script type="text/javascript" src="./sui/sm-extend.js"></script>
<script type="text/javascript" src="./sui/demos.js"></script>
<script>
    
     $("#datetime-picker").datetimePicker({
    value: ['1985', '12', '04', '9', '34']
  });
    
    $("#picker").picker({
  toolbarTemplate: '<header class="bar bar-nav">\
  <button class="button button-link pull-left">按钮</button>\
  <button class="button button-link pull-right close-picker">确定</button>\
  <h1 class="title">标题</h1>\
  </header>',
  cols: [
    {
      textAlign: 'right',
      values: ['母子', '父子', '母女', '父女', '叔侄', '祖孙']
    }
  ]
});

</script>

  </div>
    
 </div>
  <#include "/oldfoot.html">
</body>
</html>