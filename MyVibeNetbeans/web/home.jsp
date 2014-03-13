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
<a class="navbar-brand" href="#">MyVibe</a>
                        </div>
                        <div class="navbar-collapse collapse">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="#">Home</a></li>
                                <li><a href="muziek.jsp">Zoek muziek</a></li>
                                <li><a href="account.jsp">Mijn account</a></li>                
                                
                            </ul>                             
                                    <form class="navbar-form form-inline pull-right" >
                                        <input type="text" class="span2" placeholder="Login">
                                        <input type="text" class="span2" placeholder="Password">
                                        <input type="submit" value="Login" class="btn2"/>
                                        <button class="btn2"> Registreer </button>
                                          
                                    </form>                                                      
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
                    <p> Nieuw bij MyVibe: Daft Punk. Het franse duo maakte onlangs zijn comeback, waar u hier ten volle van kan genieten!</p>
                    <p><a class="btn btn-default" href="#" role="button">Ontdek Daft Punk &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="img-circle" src="afbeeldingen/rihanna.jpg" height="140px" alt="Generic placeholder image">
                    <h2>Rihanna</h2>
                    <p>Deze zwoele zangeres van Barbados is al jaren niet weg te slaan uit de hitlijsten. MyVibe maakte speciaal een selectie uit haar klassiekers</p>
                    <p><a class="btn btn-default" href="#" role="button">Ontdek Rihanna &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
                <div class="col-lg-4">
                    <img class="img-circle" src="afbeeldingen/justin.jpg" height="140px"  alt="Generic placeholder image">
                    <h2>Justin Bieber</h2>
                    <p>Deze Canadese badboy heeft Amerika al lang veroverd. Zijn opmars in België begint bij MyVibe!</p></br>
                    <p><a class="btn btn-default" href="#" role="button">Ontdek Justin Bieber &raquo;</a></p>
                </div><!-- /.col-lg-4 -->
            </div><!-- /.row -->


            <!-- START THE FEATURETTES -->

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">In de spotlights: Shakira. <span class="text-muted">Colombiaanse furie.</span></h2>
                    <p class="lead">Wie Colombia zegt, zegt Shakira.Deze passionele zangeres rijgt al jaren de nummer 1 hits aan elkaar. Bij MyVibe ziet u meteen waarom. </p>
                </div>
                <div class="col-md-5">
                    <img class="featurette-image img-responsive" src="afbeeldingen/shakira.jpg" height="500px" width="500px" alt="Generic placeholder image">
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-5">
                    <img class="featurette-image img-responsive" src="afbeeldingen/legend.jpg" height="500px" width="500px" alt="Generic placeholder image">
                </div>
                <div class="col-md-7">
                    <h2 class="featurette-heading">De ontdekking van 2013! <span class="text-muted">Exclusief op MyVibe!</span></h2>
                    <p class="lead">Met zijn hit 'All of me' scoorde hij dé soulhit van 2013. Deze polyvalente, getalenteerde artiest kan echter meer dan dat. Zijn allernieuwste nummers staan nu op MyVibe!</p>
                </div>
            </div>

            <hr class="featurette-divider">

            <div class="row featurette">
                <div class="col-md-7">
                    <h2 class="featurette-heading">Eigen kweek. <span class="text-muted">Formidable!</span></h2>
                    <p class="lead">Deze week in eigen kweek: Stromae! Deze sympathieke Brusselaar heeft Vlaanderen al lang veroverd. De populairste en nieuwste hits van de nieuwe Jacques Brel vindt u hier.</p>
                </div>
                <div class="col-md-5">
                    <img class="featurette-image img-responsive" src="afbeeldingen/stromae.png" height="500px" width="500px"  alt="Generic placeholder image">
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
