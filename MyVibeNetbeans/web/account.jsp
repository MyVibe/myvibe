<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">

    <title>Carousel Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="CSS/bootstrap/bootstrap.min.css" rel="stylesheet">

    
    <link href="CSS/CarouselZonder.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
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
                <li><a href="muziek.jsp">zoek muziek</a></li>
                <li class="active"><a href="account.jsp">Mijn account</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                  </ul>
                </li>
              </ul>
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
        <div class="col-sm-4">
          <div class="list-group">
            <a href="#" class="list-group-item active">
              Cras justo odio
            </a>
            <a href="#" class="list-group-item">Dapibus ac facilisis in</a>
            <a href="#" class="list-group-item">Morbi leo risus</a>
            <a href="#" class="list-group-item">Porta ac consectetur ac</a>
            <a href="#" class="list-group-item">Vestibulum at eros</a>
          </div>
        </div><!-- /.col-sm-4 -->
        <div class="col-lg-4">          
          <h2>Mijn gegevens</h2>
          <table class="gegevens">
              <tr><td> Gebruikersnaam: </td> </tr>
              <tr><td> Wachtwoord: </td> </tr>
              <tr><td> Voornaam: </td> </tr>
              <tr><td> Naam: </td> </tr>
              <tr><td> Email: </td> </tr>
              <tr><td> Straat: </td></tr>
              <tr><td> Huisnummer: </td> </tr>
              <tr><td> Postcode: </td> </tr>
              <tr><td> Gemeente: </td></tr>
          </table>
          
        </div><!-- /.col-lg-4 -->
        

      

    </div><!-- /.container -->



    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <script src="js/bootstrap/docs.min.js"></script>
  </body>
</html>
