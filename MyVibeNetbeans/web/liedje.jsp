<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="../../assets/ico/favicon.ico">

        <title>Muziek -MyVibe</title>

        <!-- Bootstrap core CSS -->
        <link href="CSS/bootstrap/bootstrap.min.css" rel="stylesheet">


        <link href="CSS/liedje.css" rel="stylesheet">
    </head>
    <!-- NAVBAR
    ================================================== -->
    <body>
         <div class="carousel-inner">
             
        <div class="navbar-wrapper">
            <div class="container">

                <div class="navbar navbar-inverse navbar-static-top" role="navigation">
                    <div class="container">
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
                                <li ><a href="home.jsp">Home</a></li>
                                <li ><a href="muziek.jsp">zoek muziek</a></li>
                                <li><a href="account.jsp">Mijn account</a></li>
                                
                            </ul>
                        </div>
                    </div>
                </div>

            </div>
        </div>
         </div>
         


        <!-- Marketing messaging and featurettes
        ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">

            <!-- Start van de getoonde muziek -->
            <div class="row"> 
                <div class="outer">
                    <div class="inner">
                        <h2>Daft Punt - Get Lucky</h2>
                    </div>
                </div>                
            </div>
            
            <div class="row"> 
                <div class="outer">
                    <div class="inner">                                       
                   <img class="img-circle" data-src="js/holder.js/140x140" alt="Generic placeholder image">                 
                </div>
                    </div>
            </div>
            
            <div class="row"> 
                <div class="outer-img">
                    <div class="inner">                        
                        <img src="afbeeldingen/leeg_hart.png" width="30px"height="30px" />
                        <img src="afbeeldingen/witte_ster.jpg" width="30px"height="30px" />
                        <img src="afbeeldingen/winkelkar.png" width="30px"height="30px" />
                    </div>
                </div>
            </div>
            
            
            <div class="row"> 
                <div class="outer-play">
                    <div class="inner"> 
                        <audio controls>  
                        <source src="muziek/Puppy.mp3" type="audio/mpeg">
                        Your browser does not support the audio element.
                        </audio>
                    </div>
                </div>
            </div>
            
           <div class="review"> 
               <hr>
           <div class="row"> 
                <div class="outer">
                    <div class="inner"> 
                        <h2> Reviews </h2>
                        <table>
                        <p> Gebruiker: </p>
                        <text> Hier komt de review te staan</text>
                        </table>
                    </div>
                </div>
           </div>
            </div>
            
        </div>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script src="js/bootstrap/bootstrap.min.js"></script>
        <script src="js/bootstrap/docs.min.js"></script>
    </body>
</html>
