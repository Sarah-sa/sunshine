<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>SUI Mobile Demo</title>
    <meta name="description" content="MSUI: Build mobile apps with simple HTML, CSS, and JS components.">
    <meta name="author" content="阿里巴巴国际UED前端">
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">

    <!-- Google Web Fonts -->

    <link rel="stylesheet" href="./sui/sm.css">
    <link rel="stylesheet" href="./sui/sm-extend.css">
    <link rel="stylesheet" href="./sui/demos.css">

    <link rel="apple-touch-icon-precomposed" href="/assets/img/apple-touch-icon-114x114.png">
    <script src="./sui/zepto.js"></script>
    <script src="./sui/config.js"></script>

    <head>
    <body>
    <header class="bar bar-nav">
  <h1 class="title">关联老人主页面</h1>
</header>
<div class="content">
  
  <div class="content-block-title">老人信息</div>
  <div class="list-block">
    <ul>
      <li class="item-content item-link">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">老人姓名</div>
          <div class="item-after">杜蕾斯</div>
        </div>
      </li>
      <li class="item-content item-link">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">性别</div>
          <div class="item-after">极致超薄型</div>
        </div>
      </li>
      <li class="item-content item-link">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">出生日期</div>
          <div class="item-after">极致超薄型</div>
        </div>
      </li>
      <li class="item-content item-link">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">关系</div>
          <div class="item-after">极致超薄型</div>
        </div>
      </li>
      <li class="item-content item-link">
        <div class="item-media"><i class="icon icon-f7"></i></div>
        <div class="item-inner">
          <div class="item-title">操作</div>
          <div class="item-after">极致超薄型</div>
        </div>
      </li>
    </ul>
  </div>
</div>
<script src="./sui/sm.js"></script>
    <script src="./sui/sm-extend.js"></script>
    <script src="./sui/sm-city-picker.js"></script>
    <script src="./sui/demos.js"></script>
<script type="text/javascript">
    
    	$(document).on('click','.item-inner', function () {
      var buttons1 = [
        {
          text: '请选择',
          label: true
        },
        {
          text: '查询老人信息',
          bold: true,
          color: 'danger',
          onClick: function() {
            $.alert("你选择了“卖出“");
          }
        },
        {
          text: '添加老人信息',
          onClick: function() {
            $.alert("你选择了“买入“");
          }
        }
      ];
      var buttons2 = [
        {
          text: '取消',
          bg: 'danger'
        }
      ];
      var groups = [buttons1, buttons2];
      $.actions(groups);
  });
</script>
    
    
    
    
    </body>
    </head>
    