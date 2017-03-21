<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<#include "/WEB-INF/views/ftl/suihead.ftl" />
<title>新增服务项目</title>
</head>
<body>
	<div class="page-group">
		<div id="page-layout" class="page">
			<header class="bar bar-nav">
				<a class="button button-link button-nav pull-left back"
					href="/demos/form"> <span class="icon icon-left"></span> 返回
				</a>
				<h1 class="title">新增服务</h1>
			</header>
			<div class="content">
				<div class="list-block">
					<ul id="itemform">
						<!-- Text inputs -->
						<li>
							<div class="item-content">
								<div class="item-media">
									<i class="icon icon-form-name"></i>
								</div>
								<div class="item-inner">
									<div class="item-title label">服务名</div>
									<div class="item-input">
										<input type="text" name="name" placeholder="Service name">
									</div>
								</div>
							</div>
						</li>
						
						<li>
							<div class="item-content">
								<div class="item-media">
									<i class="icon icon-form-gender"></i>
								</div>
								<div class="item-inner">
									<div class="item-title label">服务分类</div>
									<div class="item-input">
										<select name="srvctgyid">
											<optgroup v-for="cate in categories" :label="cate.treeNode.name">
												<option v-for="child in cate.childNode" value="child.id">{{child.name}}</option>
											</optgroup>
										</select>
									</div>
								</div>
							</div>
						</li>
						
						<li>
							<div class="item-content">
								<div class="item-media">
									<i class="icon icon-form-name"></i>
								</div>
								<div class="item-inner">
									<div class="item-title label">服务价格</div>
									<div class="item-input">
										<input type="number" name="price" placeholder="Service price">
									</div>
								</div>
							</div>
						</li>
						
						<!-- Switch (Checkbox) -->
						<li>
							<div class="item-content">
								<div class="item-media">
									<i class="icon icon-form-toggle"></i>
								</div>
								<div class="item-inner">
									<div class="item-title label">启用服务</div>
									<div class="item-input">
										<label class="label-switch"> <input name="status" type="checkbox">
											<div class="checkbox"></div>
										</label>
									</div>
								</div>
							</div>
						</li>
						<li class="align-top">
							<div class="item-content">
								<div class="item-media">
									<i class="icon icon-form-comment"></i>
								</div>
								<div class="item-inner">
									<div class="item-title label">服务描述</div>
									<div class="item-input">
										<textarea name="description"></textarea>
									</div>
								</div>
							</div>
						</li>
					</ul>
				</div>
				<div class="content-block">
					<div class="row">
						<div class="col-50">
							<a href="#" class="button button-big button-fill button-danger">取消</a>
						</div>
						<div class="col-50">
							<a href="#" class="button button-big button-fill button-success">提交</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	
		var validate = false;
		$('#itemform li input').blur(function() {
			
			var msg = doValidate(this);
			if(!validate) $.alert(msg);
		});
		function doValidate(item) {
			var flag = false;
			var $item = $(item);
			var reg = /^d+$/;
			var message;
			switch($item.attr('name')) {
			case 'name':
				if($item.val().trim() == '') {
					flag = false;
					message = '服务名不能为空';
				}
				else
					flag = true;
				break;
			case 'price':
				if(!reg.test($item.val())) {
					flag = false;
					message = '价格只能是数字';
				} else {
					flag = true;
				}
				break;
			case 'srvctgyid':
				if($item.val() == null) {
					flag = false;
					message = '请选择服务分类';
				}
				else
					flag = true;
				break;
			}
			validate = flag;
			return message;
		}
		var formData = new Vue({
			el: '#itemform',
			data: {
				categories: []
			}
		});
		$.ajax({
			url: '${request.contextPath}/server/servcategory',
			type: 'GET',
			dataType: 'json',
			success: function(data) {
				formData.categories = data.data;
			}
			
		});
	</script>
</body>
</html>