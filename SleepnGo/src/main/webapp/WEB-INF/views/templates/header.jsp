<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- login modal -->
<style>
.button{
    border: none;
    color: white;
    padding: 10px 30px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

.buttonLogin{
background-color: #ff7e82; /*basic #008489*/
border-radius: 8px;
width: 100%;
}
</style>	
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">	

<div id="fh5co-header-section" class="sticky-banner">
	<div>
		<div class="col-md-2">
			<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
			<h1 id="fh5co-logo">
				<a href="index.html"><i class="icon-home"></i>Sleep&amp;Go</a>
			</h1>
		</div>
		<div class="col-md-6" style="padding-top: 30px;">
			<div class="input-field">
				<input type="text" class="form-control" id="from-place"
					placeholder="Los Angeles, USA" style="" />
			</div>
		</div>
		<div class="col-md-4">
			<nav id="fh5co-menu-wrap" role="navigation">
				<ul class="sf-menu" id="fh5co-primary-menu">
					<li><a href="index.html">Hosting</a></li>
					<li><a href="index.html">Message</a></li>
					<li><a onclick="document.getElementById('id01').style.display='block'">Login</a></li>
					<li><a href="index.html">Join</a></li>
				</ul>
			</nav>
		</div>
		
		<!-- login modal start -->
		<div id="id01" class="w3-modal">
			<div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width: 600px">
			
					<br> <span
						onclick="document.getElementById('id01').style.display='none'"
						class="w3-button w3-xlarge w3-hover-red w3-display-topright"
						title="Close Modal">&times;</span> 

					<div class="col-md-12" style="float:center;">
						<a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle dark"><i></i></a>
						<h1 id="fh5co-logo" align="center">
							<i class="icon-home"></i>for your time
						</h1>
					</div>

				<form class="w3-container" action="${pageContext.request.contextPath}/login.do" method="POST">
					<div class="w3-section">
						<label><b>ID</b></label> 
						<input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter ID" name="usrname" required> 
						<label><b>Password</b></label>
						<input class="w3-input w3-border" type="password" placeholder="Enter Password" name="psw" required> 
						<br>
						<button class="button buttonLogin" type="submit">Login</button>
						<span class="w3-right w3-padding w3-hide-small"> <a href="#">Forgot password?</a></span>
					</div>
				</form>
			</div>
		</div>
		<!-- login modal end -->

	</div>
</div>