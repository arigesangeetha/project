<!DOCTYPE html>
<html lang="en">
<head>
  <title>home</title>
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;height:70%;
  }
  </style>
</head>
<body bgcolor="#c0c0c0">
<nav class="navbar navbar" style=background-color:#666666>
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">WEB</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="http://localhost:8181/webproject/home.html">Home</a></li>
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Clothing <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Ethnic wear</a></li>
						<li><a href="#">Western wear</a></li>
				
					</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#">Accessories <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Jewellery</a></li>
						<li><a href="#">HandBags</a></li>
						<li><a href="#">Footwear</a></li>
				
					</ul></li>
			
				<li><a href="#">Giftcards</a></li>
			</ul>
		
	

	<div class="collapse navbar-collapse" >
				<ul class="nav navbar-nav navbar-right">
					<li><a href="log.html" ><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
					<li><a href="http://localhost:8181/webproject/reg.html"> <span
							class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				</ul>
			</div>
			</div>
			</nav>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="pics\cute4.jpg" alt="Chania" width="460" height="350">
      </div>

      <div class="item">
        <img src="pic\1.jpg" alt="Chania" width="460" height="350">
      </div>
    
      <div class="item">
        <img src="pic\a.jpg" alt="Flower" width="460" height="350">
      </div>
       <div class="item">
        <img src="pic\f.jpg" alt="Flower" width="460" height="350">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

</body>
</html>

