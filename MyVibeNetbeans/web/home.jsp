<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="../../assets/ico/favicon.ico">
        <title>Home -MyVibe</title>
        <link href="CSS/bootstrap/bootstrap.min.css" rel="stylesheet">    
        <link href="CSS/carousel.css" rel="stylesheet">
    </head>
    <!-- NAVBAR
    ================================================== -->
    <body>
        <div class="navbar-wrapper">
            <div class="container">
                <div class="navbar navbar-inverse navbar-static-top" role="navigation">
                    <div class="container" >             
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>              

                        </div>
                        <div class="navbar-collapse collapse">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="#">Home</a></li>
                                <li><a href="muziek.jsp">Zoek muziek</a></li>
                                <li><a href="account.jsp">Mijn account</a></li>                
                                
                                <c:if test="${empty(sessionScope.loggedIn)}">
                                <li class="lognav">
                                    <form class="navbar-search pull-right" action="LoginServlet" method="POST">
                                        <input name="gebruikersnaam" type="text" class="span2" placeholder="Login">
                                        <input name="wachtwoord" type="password" class="span2" placeholder="Password">
                                        <input type="submit" value="Login" class="btn2"/>
                                        <button class="btn2"> Registreer </button>
                                    </form>
                                </li>
                                </c:if>
                                <c:if test="${not empty(sessionScope.loggedIn)}">
                                <li class="welkom">
                                    Welkom, ${user.gebruikersnaam}
                                </li>
                                <li>
                                    <form class="navbar-search pull-right" action="LogoutServlet">
                                        <input type="submit" value="Afmelden" class="btn2"/>
                                    </form>
                                </li>
                                </c:if>



                            </ul>

                        </div>

                    </div>

                </div>

            </div>
        </div>


        <!-- Carousel
        ================================================== -->
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="item active">         
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Welkom op MyVibe!</h1>
                            <img src="afbeeldingen/myvibe-logo.png" height="250px"/>
                        </div>
                    </div>
                </div>
                <div class="item">         
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Ontdek exclusieve muziek.</h1>
                            <p> Luister als eerste naar de nieuwe hits van uw favoriete artiest! </p>
                            <img src="afbeeldingen/exclusive.png" height="150px"/>
                            <p><a class="btn btn-lg btn-primary" href="muziek.jsp" role="button">Ontdek nu!</a></p>
                        </div>
                    </div>
                </div>
                <div class="item">         
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Dé nummer 1 voor het allernieuwste!</h1>
                            <p> Onze uitgebreide collectie aan nieuwe en exclusieve muziek maakt van MyVibe dé muziekspecialist.</p>
                            <img src="afbeeldingen/website-van-het-jaar.png" height="150px"/>            
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
        </div><!-- /.carousel -->



        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">
            <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="col-lg-4">
                    <img class="img-circle" src="afbeeldingen/daft-punk.png" height="140px" alt="Generic placeholder image">
                    <h2>Daft punk</h2>
                    <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
                    <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="img-circle" data-src="js/holder.js/140x140" alt="Generic placeholder image">
                    <h2>Heading</h2>
                    <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
                    <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="img-circle" data-src="js/holder.js/140x140" alt="Generic placeholder image">
                    <h2>Heading</h2>
                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->


            <!-- START THE FEATURETTES -->

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">First featurette heading. <span class="text-muted">It'll blow your mind.</span></h2>
                    <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
                </div>
                <div class="col-md-5">
                    <img class="featurette-image img-responsive" src="afbeeldingen/nirvana.jpg" height="500px" width="500px" alt="Generic placeholder image">
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-5">
                    <img class="featurette-image img-responsive" data-src="js/holder.js/500x500/auto" alt="Generic placeholder image">
                </div>
                <div class="col-md-7">
                    <h2 class="featurette-heading">Oh yeah, it's that good. <span class="text-muted">See for yourself.</span></h2>
                    <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">And lastly, this one. <span class="text-muted">Checkmate.</span></h2>
                    <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
                </div>
                <div class="col-md-5">
                    <img class="featurette-image img-responsive" data-src="js/holder.js/500x500/auto" alt="Generic placeholder image">
                </div>
            </div>

            <hr class="featurette-divider">

            <!-- /END THE FEATURETTES -->


            <!-- FOOTER -->
            <footer>
                <p class="pull-right"><a href="#">Back to top</a></p>
                <p>&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
            </footer>

        </div><!-- /.container -->


        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/bootstrap/docs.min.js"></script>
    </body>
</html>
