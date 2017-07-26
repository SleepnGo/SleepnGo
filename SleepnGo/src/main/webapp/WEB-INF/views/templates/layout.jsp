<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html class="no-js">
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="favicon.ico">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300'
	rel='stylesheet' type='text/css'>
<!-- Animate.css -->
<link rel="stylesheet" href="resources/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="resources/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="resources/css/bootstrap.css">
<!-- Superfish -->
<link rel="stylesheet" href="resources/css/superfish.css">
<!-- Magnific Popup -->
<link rel="stylesheet" href="resources/css/magnific-popup.css">
<!-- Date Picker -->
<link rel="stylesheet" href="resources/css/bootstrap-datepicker.min.css">
<!-- CS Select -->
<link rel="stylesheet" href="resources/css/cs-select.css">
<link rel="stylesheet" href="resources/css/cs-skin-border.css">
<link rel="stylesheet" href="resources/css/style.css">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
<meta name="keywords"
	content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
<meta name="author" content="FREEHTML5.CO" />
<!-- Modernizr JS -->
<script src="resources/js/modernizr-2.6.2.min.js"></script>
<!--  Tiles -->
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>

<body>
	<nav>
		<tiles:insertAttribute name="header" />
	</nav>
	<div>
		<div id="content">
			<div class="col-md-12">
				<div class="col-md-12" style="padding: 20px;">
					<tiles:insertAttribute name="content" />
				</div>
				<div class="col-md-12 padding-0">
					<tiles:insertAttribute name="footer" />
				</div>
			</div>
		</div>
	</div>
	
	
	<!-- jQuery -->
	<script src="resources/js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="resources/js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="resources/js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="resources/js/jquery.waypoints.min.js"></script>
	<script src="resources/js/sticky.js"></script>
	<!-- Stellar -->
	<script src="resources/js/jquery.stellar.min.js"></script>
	<!-- Superfish -->
	<script src="resources/js/hoverIntent.js"></script>
	<script src="resources/js/superfish.js"></script>
	<!-- Magnific Popup -->
	<script src="resources/js/jquery.magnific-popup.min.js"></script>
	<script src="resources/js/magnific-popup-options.js"></script>
	<!-- Date Picker -->
	<script src="resources/js/bootstrap-datepicker.min.js"></script>
	<!-- CS Select -->
	<script src="resources/js/classie.js"></script>
	<script src="resources/js/selectFx.js"></script>
	<!-- Main JS -->
	<script src="resources/js/main.js"></script>
</body>
</html>