<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>服务详情页</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">

    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm.min.css">
    <link rel="stylesheet" href="//g.alicdn.com/msui/sm/0.6.2/css/sm-extend.min.css">

  </head>
  <body>
    <!-- <div class="page-group">
        <div class="page page-current">
            <header class="bar bar-nav">
  
</header> -->
<div class="content">
  <div class="list-block">
    <ul>
      <!-- Text inputs -->
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">商家名称：</div>
            <div class="item-input">                
              <input type="text" placeholder="Your name" value="${info.shopName}">
            </div>
          </div>
        </div>
      </li>
      <li>
         <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">地址：</div>
            <div class="item-input">
              <input type="text" placeholder="Your name" value="${info.address}">
            </div>
          </div>
        </div>
      </li>
      <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">服务电话：</div>
            <div class="item-input">
              <input type="text" placeholder="Your name" value="${info.tel}">
            </div>
          </div>
        </div>
      </li>
       <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">服务项目：</div>
            <div class="item-input">
              <input type="text" placeholder="Your name" value="${ctgPt.name}-${ctgCd.name}">
            </div>
          </div>
        </div>
      </li>
       <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">收费：</div>
            <div class="item-input">
              <input type="text" placeholder="Your name" value="${item.price} 元">
            </div>
          </div>
        </div>
      </li>
       <li>
        <div class="item-content">
          <div class="item-media"><i class="icon icon-form-name"></i></div>
          <div class="item-inner">
            <div class="item-title label">收费说明：</div>
            <div class="item-input">
              <input type="text" placeholder="Your name" value="${item.description}">
            </div>
          </div>
        </div>
      </li>
    </ul>
  </div>
  <div class="content-block">
    <div class="row">
      <div class="col-50"><a href="#" class="button button-big button-fill button-danger">预定</a></div>
      <div class="col-50"><a href="#" class="button button-big button-fill button-success" id="goBack">返回</a></div>
    </div>
  </div>
</div>
        </div>
    </div>

    <script type='text/javascript' src='//g.alicdn.com/sj/lib/zepto/zepto.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm.min.js' charset='utf-8'></script>
    <script type='text/javascript' src='//g.alicdn.com/msui/sm/0.6.2/js/sm-extend.min.js' charset='utf-8'></script>

  </body>
    <script>
        $("#goBack").on('click',function(){
           var index = parent.layer.getFrameIndex(window.name);
           parent.layer.close(index); 
        });
        
    </script>
</html>


