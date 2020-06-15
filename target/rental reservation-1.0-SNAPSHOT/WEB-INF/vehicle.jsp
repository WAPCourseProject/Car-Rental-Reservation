<%--
  Created by IntelliJ IDEA.
  User: Grace
  Date: 6/14/2020
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content/>
    <meta name="author" content/>
    <title>Car Rental Reservation System</title>
    <link href="https://bernietes.github.io/res/front/css/styles.css" rel="stylesheet"/>
    <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="https://bernietes.github.io/res/front/assets/img/favicon.png"/>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/feather-icons/dist/feather.min.js"></script>
</head>
<body>
<div id="layoutDefault">
    <div id="layoutDefault_content">
        <main>
            <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light">
                <div class="container">
                    <a class="navbar-brand text-primary" href="home">Car Rental Reservation <System></System></a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation"><i data-feather="menu"></i></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto mr-lg-5">
                            <li class="nav-item"><a class="nav-link" href="">Home </a></li>
                            <li class="nav-item"><a class="nav-link" href="cars">Cars</a></li>
                        </ul>
                        <a class="btn-primary btn rounded-pill px-4 ml-lg-4"
                           href="login">Log in<i
                                class="ml-1"></i></a>
                    </div>
                </div>
            </nav>
            <header class="page-header page-header-light bg-img-cover overlay overlay-light overlay-80" style='background-image: url("https://source.unsplash.com/NyRe1Mj1pm4/1600x1200")'>
                <div class="page-header-content py-5">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-xl-8 col-lg-10 text-center">
                                <h1 class="page-header-title">Way better than a rental car</h1>
                                <p class="page-header-text mb-5">Book unforgettable cars from trusted hosts around the world</p>
                                      <!-- Put Your Searching components here -->


                            </div>
                        </div>
                    </div>
                </div>
                <div class="svg-border-rounded text-white">
                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 144.54 17.34" preserveAspectRatio="none" fill="currentColor"><path d="M144.54,17.34H0V0H144.54ZM0,0S32.36,17.34,72.27,17.34,144.54,0,144.54,0" /></svg>
                </div>
            </header>
            <section class="bg-white py-10">
                <div class="container">
                    <div class="row mb-5">
                        <div class="col-lg-4 mb-5">
                            <a class="card lift h-100" href="#!"
                            ><img class="card-img-top" src="https://source.unsplash.com/4WBvCqeMaDE/800x500" alt="..."/>
                                <div class="card-body">
                                    <h4 class="card-title mb-2">Outdoor Patio</h4>
                                    <p class="card-text">Our property features a beautiful, private outdoor area with seating and a pool.</p>
                                </div>
                                <div class="card-footer bg-transparent border-top d-flex align-items-center justify-content-between">
                                    <div class="small text-primary">See more</div>
                                    <div class="small text-primary"><i data-feather="arrow-right"></i></div></div
                                ></a>
                        </div>
                        <div class="col-lg-4 mb-5">
                            <a class="card lift h-100" href="#!"
                            ><img class="card-img-top" src="https://source.unsplash.com/8xyki0bqvgw/800x500" alt="..."/>
                                <div class="card-body">
                                    <h4 class="card-title mb-2">Full Kitchen</h4>
                                    <p class="card-text">A fully stocked kitchen with all modern amenities provides a peaceful cooking environment.</p>
                                </div>
                                <div class="card-footer bg-transparent border-top d-flex align-items-center justify-content-between">
                                    <div class="small text-primary">See more</div>
                                    <div class="small text-primary"><i data-feather="arrow-right"></i></div></div
                                ></a>
                        </div>
                        <div class="col-lg-4 mb-5">
                            <a class="card lift h-100" href="#!"
                            ><img class="card-img-top" src="https://source.unsplash.com/a4S6KUuLeoM/800x500" alt="..."/>
                                <div class="card-body">
                                    <h4 class="card-title mb-2">Comfortable Bedding</h4>
                                    <p class="card-text">With three newly updated bedrooms you will be sleeping soundly during your stay.</p>
                                </div>
                                <div class="card-footer bg-transparent border-top d-flex align-items-center justify-content-between">
                                    <div class="small text-primary">See more</div>
                                    <div class="small text-primary"><i data-feather="arrow-right"></i></div></div
                                ></a>
                        </div>
                    </div>
                </div>
            </section>


            <hr class="my-0" />
        </main>
    </div>

    <div id="layoutDefault_footer">
        <footer class="footer pt-10 pb-5 mt-auto bg-dark footer-dark">
            <div class="container">

                <hr class="my-5"/>
                <div class="row align-items-center">
                    <div class="col-md-6 small">Copyright &#xA9; MIU JUNE 2020</div>
                    <div class="col-md-6 text-md-right small">
                        <a href="javascript:void(0);">Privacy Policy</a>
                        &#xB7;
                        <a href="javascript:void(0);">Terms &amp; Conditions</a>
                    </div>
                </div>
            </div>
        </footer>
    </div>

</div>





<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<script src="https://bernietes.github.io/res/front/js/scripts.js"></script>
<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
<script >
    AOS.init({
        disable: 'mobile',
        duration: 600,
        once: true
    });
</script>



</body>

</html>
