<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/sm.min.css">
<link rel="stylesheet" href="/css/sm-extend.min.css">
<link rel="stylesheet" href="/css/demos.css">

<script type='text/javascript' src='/js/zepto.min.js' charset='utf-8'></script>
<script type='text/javascript' src='/js/config.js' charset='utf-8'></script>
<script type='text/javascript' src='/js/vue.js' charset='utf-8'></script>
<style type="text/css">
	body>div.content>div.content-block{
		position: relative;
		border: 1px red solid;
		top: 0px;
		bottom: 0px;
		margin-top: 0px;
		margin-bottom: 0px;
		/* height: 100%; */
	}
	div.content-block div.content-block {
		position: relative;
		border: 1px red solid;
		width: 100%;
		height: 100%;
		padding: 0px;
	}
	iframe {
		position: absolute;
		bottom: 0px;
		
		width: 100%;
		height: 100%;
	}
</style>
</head>
<body>
	<header class="bar bar-nav">
  <h1 class='title'>订单查看</h1>
</header>
<div class="content">
  <div class="buttons-tab">
    <a href="#tab1" class="tab-link active button">全部</a>
    <a href="#tab2" class="tab-link button">未处理</a>
    <a href="#tab3" class="tab-link button">已处理</a>
  </div>
  <div class="content-block">
    <div class="tabs">
      <div id="tab1" class="tab active">
        <div class="content-block">
          <iframe scrolling="no" src="/server/allorder"></iframe>
        </div>
      </div>
      <div id="tab2" class="tab">
        <div class="content-block">
          <iframe scrolling="no" src="/server/neworder"></iframe>
        </div>
      </div>
      <div id="tab3" class="tab">
        <div class="content-block">
          <iframe scrolling="no" scr="/server/handledorder"></iframe>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
<script type='text/javascript' src='/js/sm.min.js' charset='utf-8'></script>
<script type='text/javascript' src='/js/sm-extend.min.js'
	charset='utf-8'></script>
<script type='text/javascript' src='/js/sm-city-picker.min.js'
	charset='utf-8'></script>
<script type='text/javascript' src='/js/demos.js' charset='utf-8'></script>
</html>