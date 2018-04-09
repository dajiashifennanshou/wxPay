<html>
<head>
<title>校职工绑定</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css">
<script src="//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
</head>
<body>
	<div class="container" style="margin-top: 40px">
		<h3>用户绑定，随处管理，自由生活！</h3>
		<div class="row">
			<div class="col-md-10">
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-home"></span>
						</div>
						<div class="btn-group">
							<input id="autocomplete" class="form-control" maxlength="20"
								placeholder="请输入学校名称" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-film"></span>
						</div>
						<input class="form-control" type="text" placeholder="请输入账号"
							id="accountid" maxlength="11" required>
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<input class="form-control" type="text" placeholder="请输入您的姓名"
							id="name" maxlength="6" required>
					</div>
				</div>
				<div class="form-group">
					<div class="input-group ">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-earphone"></span>
						</div>
						<input class="form-control" style="height: 40px" type="text"
							placeholder="请输入手机号码" id="phone" maxlength="11">
						<div class="input-group-addon">
							<input id="btnSendCode" type="button" value="发送验证码"
								onclick="sendMessage()" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-envelope"></span>
						</div>
						<input class="form-control" type="text" placeholder="请输入验证码"
							id="code" maxlength="6" required>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-8">
				<center>
					<button class="btn btn-success" id="saveButton"
						onclick="ensureMessage()" data-loading-text="绑定中..."
						autocomplete="off" style="width: 220px; margin-top: 20px">绑定用户</button>
				</center>
			</div>
		</div>
	</div>
</body>
</html>