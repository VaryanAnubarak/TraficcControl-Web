<%-- 
    Document   : lista
    Created on : Nov 27, 2017, 12:22:57 PM
    Author     : daniel.riveraa
--%>


<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Traffic Control</title>


        <!-- 
              //////////////////////////////////////////////////////
      
              FREE HTML5 TEMPLATE 
              DESIGNED & DEVELOPED by FREEHTML5.CO
                      
              Website: 		http://freehtml5.co/
              Email: 			info@freehtml5.co
              Twitter: 		http://twitter.com/fh5co
              Facebook: 		https://www.facebook.com/fh5co
      
              //////////////////////////////////////////////////////
        -->

        <!-- Facebook and Twitter integration -->
        <meta property="og:title" content=""/>
        <meta property="og:image" content=""/>
        <meta property="og:url" content=""/>
        <meta property="og:site_name" content=""/>
        <meta property="og:description" content=""/>
        <meta name="twitter:title" content="" />
        <meta name="twitter:image" content="" />
        <meta name="twitter:url" content="" />
        <meta name="twitter:card" content="" />

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="shortcut icon" href="favicon.ico">

        <link href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700,900' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:300,400,700" rel="stylesheet">

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Superfish -->
        <link rel="stylesheet" href="css/superfish.css">
        <!-- Flexslider -->
        <link rel="stylesheet" href="css/flexslider.css">

        <link rel="stylesheet" href="css/style.css">


        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>
        <!-- FOR IE9 below -->
        <!--[if lt IE 9]>
        <script src="js/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
        <div id="fh5co-wrapper">
            <div id="fh5co-page">
                <div id="fh5co-header">
                    <header id="fh5co-header-section">
                        <div class="container">
                            <div class="nav-header">
                                <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
                                <h1 id="fh5co-logo"><a href="index.html"><i class="icon-home2"></i>Beam</a></h1>
                                <!-- START #fh5co-menu-wrap -->
                                <nav id="fh5co-menu-wrap" role="navigation">
                                    <ul class="sf-menu" id="fh5co-primary-menu">
                                        <li>
                                            <a href="index.html">Home</a>
                                        </li>
                                        <li><a href="registroVehiculos.html">Projects</a></li>

                                        <li><a class="active" href="lista.jsp">Mostrar Listado de Vehiculos</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </header>		
                </div>
                <!-- end:fh5co-header -->
                <aside id="fh5co-hero" class="js-fullheight">
                    <div class="flexslider js-fullheight">
                        <ul class="slides">
                            <li style="background-image: url(images/slide_2.jpg);">
                                <div class="overlay-gradient"></div>
                                <div class="container">
                                    <div class="col-md-10 col-md-offset-1 text-center js-fullheight slider-text">
                                        <div class="slider-text-inner desc">
                                            <h2 class="heading-section">Lista de Vehiculos</h2>
                                           
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </aside>
                <div id="fh5co-team-section">
                        <table>
    <center>
        <h2 class="section-heading text-uppercase">Lista</h2>
    <tr>
        <th scope="col">Nombre</th>
        <th scope="col">Identificacion</th>
        <th scope="col">Tipo de pago</th>
        <th scope="col">Pago Peaje</th>
        <th scope="col">Matricula</th>
        <th scope="col">Tipo de Vehiculo</th>
        <th scope="col">Fecha Ingreso Peaje</th>
        <th scope="col">Hora Ingreso Peaje</th>
        
    </tr>
    <c:forEach items="${clientes}" var="cliente">
        <tr>
            <td>${cliente.nombre}</td>
            <td>${cliente.identificacion}</td>
            <td>${cliente.tipoPago}</td>
            <td>${cliente.pagoPeaje}</td>
            <td>${cliente.matricula}</td>
            <td>${cliente.tipoVehiculo}</td>
            <td>${cliente.fechaEntradaPeaje}</td>
            <td>${cliente.horaEntradaPeaje}</td>    
        </tr>
    </c:forEach>
    </center>
</table>
                </div>
                

            </div>
            <!-- END fh5co-page -->

        </div>
        <!-- END fh5co-wrapper -->

        <!-- jQuery -->


        <script src="js/jquery.min.js"></script>
        <!-- jQuery Easing -->
        <script src="js/jquery.easing.1.3.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js"></script>
        <!-- Superfish -->
        <script src="js/hoverIntent.js"></script>
        <script src="js/superfish.js"></script>
        <!-- Flexslider -->
        <script src="js/jquery.flexslider-min.js"></script>

        <!-- Main JS (Do not remove) -->
        <script src="js/main.js"></script>

    </body>
</html>

