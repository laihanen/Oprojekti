<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Kyselyn luonti</title>
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
    <link href="<c:url value="/resources/css/hamburgers.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">


    <%@ page language="java" contentType="text/html; charset=US-ASCII"
             pageEncoding="US-ASCII"%>

        <title>Kysymys</title>
        <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
        <script>

            //dokumentin latautuessa aktivoidaan tapahtumankuuntelijat
            $(document).ready(function(){

                //tyhjennysnappia painettaessa
                $("#tyhjennysnappi").click(function() {
                    $("#lista").empty();
                });

                //latausnappia painettaessa
                $("#latausnappi").click(function() {

                    //ladataan JSON-dataa palvelimelta
                    $.getJSON( "kysymykset.json", function( data ) {
                        $.each( data, function( key, val ) {
                            //listaan uusi kysymys
                            var kys = $("<section class='Olio'/>").appendTo("#lista");
                            // kysymys
                            $("<h2/>").text(val.kysymysteksti + " " +val.otsikko).appendTo(kys);
                        });
                    }).error(function() { //palvelinyhteys aiheutti virheen
                        $("<p class='Error'>Virhe: Palvelin ei palauta JSON-dataa. Tarkista tietokantayhteys.</p>").appendTo("#lista");
                    });

                });

            });
        </script>
    </head>
<body>
<h1>Kysymys</h1>
<p><button id="latausnappi">Lataa</button> <button id="tyhjennysnappi">Tyhjenn&auml;</button>
<div id="lista" ></div>
</body>





</html>
