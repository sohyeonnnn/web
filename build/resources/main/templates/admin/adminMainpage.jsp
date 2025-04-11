<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"
	integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
	crossorigin="anonymous"></script>
<style>
html {
	width: 1900px;
}

@font-face {
	font-family: 'Arita-dotum-Medium';
	src:
		url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_one@1.0/Arita-dotum-Medium.woff')
		format('woff');
	font-weight: normal;
	font-style: normal;
}

* {
	font-family: 'Arita-dotum-Medium';
}

.header {
	margin: 0 auto;
	width: 1800px;
	height: 100px;
}

.header>img {
	width: 200px;
	float: left;
}
.header>img:hover{
	cursor: pointer;
}

.name {
	float: right;
	margin-right: 50px;
}

.sideNavi {
	height: 100vh;
	width: 200px;
	background-color: #314C83;
	border-top-left-radius: 15px;
	padding-top: 20px;
	float: left
}

.sideNavi>ul {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

.sideNavi li {
	margin: 0;
}

.sideNavi>ul>li>a {
	margin-left: 40px;
	padding: 10px;
	display: block;
	height: 30px;
	line-height: 30px;
	text-decoration: none;
	color: white;
}

.navi-link:hover {
	background-color: #304582;
}

.serviceNavi ul {
	list-style-type: none;
	overflow: hidden;
	padding: 0px;
	margin: 0px;
}

/* -----------------------------(소현) ------------------------------------*/
.tab {
	float: left;
	width: 150px;
	height: 60px;
	text-align: center;
	line-height: 60px;
	color: white;
	background-color: #314C83;
	font-weight: bold;
	box-sizing: border-box;
	border-top-left-radius: 10px;
	border-top-right-radius: 10px;
	border: 2px solid #314C83;
	border-bottom: none;
}

.adminContent div {
	margin: 30px;
	text-align: left;
	/* display: none; */
}

.select {
	color: #314C83;
	background-color: white;
	font-weight: bold;
	border-top-left-radius: 10px;
	border-top-right-radius: 10px;
}

.adminContent {
	float: left;
	padding-left: 40px;
	padding-top: 0;
	width: 80%;
	height: 100%;
	margin: 0 auto;
	text-align: center;
}

.memberTable a, .serviceTable a {
	color: #282828;
}

.memberTable th, .serviceTable th {
	background-color: #e2e2e2;
	text-align: center;
	padding: 10px;
}

.memberTable td, .serviceTable td {
	text-align: center;
	padding: 5px;
	height: 30px;
	font-size:15px;
}

.msgtd{
width:500px;}

.memberTable tr:nth-child(odd), .serviceTable tr:nth-child(odd) {
	background-color: #FFF6E5;
}

.keyword {
	outline: none;
	width: 150px;
	height: 25px;
}

.btn {
	height: 30px;
	width: 50px;
	border: none;
	border-radius: 5px;
}

.btn:focus {
	outline: none;
}

.acceptBtn, .deleteBtn {
	background-color: #FF8F3F;
	color: white;
	cursor: pointer;
}

.rejectBtn {
	background-color: white;
	border: 2px solid #FF8F3F;
}

.rejectBtn a {
	text-decoration: none;
	color: #FF8F3F;
}

.search {
	background-color: #314C83;
	color: white;
	cursor: pointer;
}

.pageNavi {
	list-style: none;
	margin: 0 auto;
	padding: 0;
	text-align: 30px;
}

.pageNavi li {
	display: inline-block;
	width: 30px;
	height: 30px;
	margin-top: 15px;
}

.page-link {
	display: block;
	width: 30px;
	height: 30px;
	width: 30px;
	border-radius: 10px;
	line-height: 30px;
}

.pageNavi>li>a {
	text-decoration: none;
	color: black;
}

.target {
	background-color: #FF8F3F;
	color: white;
}
/* -----------------------------(소현) ------------------------------------*/






</style>


</head>
<body>
	<div class="header">
		<img src="/img/logo/logo_white.png" onclick="location='/'">
		<div class="name">관리자</div>
	</div>
	<div class="sideNavi">
		<ul>
			<li class="navi-link"><a
				href="/manageMember.do?reqPage=1&grade=all&keyword=&order=new">MEMBER</a></li>
			<li class="navi-link"><a
				href="/manageService.do?reqPage=1&status=waiting&keyword1=&keyword2=&order=old">SERVICE</a></li>
			<li class="navi-link"><a href="/adminNoticeList.do?reqPage=1&keyword=">NOTICE</a></li>
			<li class="navi-link"><a href="/manageQnA.do?list_num=10">FAQ</a></li>
		</ul>
	</div>


</body>
</html>