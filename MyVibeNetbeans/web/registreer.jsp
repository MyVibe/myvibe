<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">
    <title>Signin Template for Bootstrap</title> 
    <link href="CSS/bootstrap/bootstrap.min.css" rel="stylesheet">    
    <link href="CSS/signin.css" rel="stylesheet">
   
  </head>
  <body>
    <div class="container">
        
      <form class="form-signin" action="home.jsp" role="form">          
        <h2 class="form-signin-heading">Gelieve je gegevens in te vullen</h2>
        <input type="text" class="form-control" placeholder="Gebruikersnaam" required autofocus>
        <input type="email" class="form-control" placeholder="Email address" required >
        <input type="password" class="form-control" placeholder="Wachtwoord" required>
        <input type="text" class="form-control" placeholder="Voornaam" required>
        <input type="text" class="form-control" placeholder="Naam" required>
        <input type="date" class="form-control" placeholder="Geboortedatum" required> <p>(Formaat: dag/maand/jaar)</p>
        <input type="text" class="form-control" placeholder="Straat" required>
        <input type="text" class="form-control" placeholder="Huisnummer" required>
        <input type="text" class="form-control" placeholder="Postcode" required>
        <input type="text" class="form-control" placeholder="Gemeente" required>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Verzend</button>
      </form>
        
    </div> <!-- /container -->


    
  </body>
</html>
