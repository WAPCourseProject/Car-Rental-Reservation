<%--
  Created by IntelliJ IDEA.
  User: Grace
  Date: 6/14/2020
  Time: 3:58 PM
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
    <link rel="icon" type="image/x-icon" href="https://bernietes.github.io/res/front/assets/img/favicon.png"/>
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
                            <li class="nav-item"><a class="nav-link" href="cars">Browse Cars</a></li>
                        </ul>
                        <a class="btn-primary btn rounded-pill px-4 ml-lg-4"
                           href="login">Log in<i
                                class="ml-1"></i></a>
                    </div>
                </div>
            </nav>
            <header class="page-header page-header-dark bg-gradient-primary-to-secondary">
                <div class="page-header-content mb-n5">
                    <div class="container">
                        <div class="row justify-content-center align-items-center">
                            <div class="col-lg-6" data-aos="fade-right">
                                <h1 class="page-header-title">Car Rental Reservation Component</h1>
                                <p class="page-header-text mb-5">Looking for car rentals in Iowa City? Save up to 40%. Latest prices: Economy $26/day. Compact $26/day. Intermediate $28/day. Standard $31/day. </p>

                            </div>
                            <div class="col-lg-6 z-1" data-aos="fade-left">
                                <div class="device-wrapper mx-auto mb-n15">
                                    <div class="device" data-device="iPhoneX" data-orientation="portrait"
                                         data-color="black">
                                        <div class="screen"><img class="img-fluid z-1"
                                                                 src="https://source.unsplash.com/MmsbpVzPZjg/518x1122"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="svg-border-waves text-white">
                    <svg class="wave" style="pointer-events: none" fill="currentColor" preserveAspectRatio="none"
                         xmlns="http://www.w3.org/2000/svg" xlink="http://www.w3.org/1999/xlink" viewBox="0 0 1920 75">
                        <defs>
                            <style>
                                .a {
                                    fill: none;
                                }

                                .b {
                                    clip-path: url(#a);
                                }

                                .d {
                                    opacity: 0.5;
                                    isolation: isolate;
                                }
                            </style>
                            <clipPath id="a">
                                <rect class="a" width="1920" height="75"/>
                            </clipPath>
                        </defs>
                        <title>wave</title>
                        <g class="b">
                            <path class="c"
                                  d="M1963,327H-105V65A2647.49,2647.49,0,0,1,431,19c217.7,3.5,239.6,30.8,470,36,297.3,6.7,367.5-36.2,642-28a2511.41,2511.41,0,0,1,420,48"/>
                        </g>
                        <g class="b">
                            <path class="d"
                                  d="M-127,404H1963V44c-140.1-28-343.3-46.7-566,22-75.5,23.3-118.5,45.9-162,64-48.6,20.2-404.7,128-784,0C355.2,97.7,341.6,78.3,235,50,86.6,10.6-41.8,6.9-127,10"/>
                        </g>
                        <g class="b">
                            <path class="d"
                                  d="M1979,462-155,446V106C251.8,20.2,576.6,15.9,805,30c167.4,10.3,322.3,32.9,680,56,207,13.4,378,20.3,494,24"/>
                        </g>
                        <g class="b">
                            <path class="d"
                                  d="M1998,484H-243V100c445.8,26.8,794.2-4.1,1035-39,141-20.4,231.1-40.1,378-45,349.6-11.6,636.7,73.8,828,150"/>
                        </g>
                    </svg>
                </div>
            </header>
            <section class="bg-white py-10">
                <div class="container">
                    <div class="row text-center">
                        <div class="col-lg-4 mb-5 mb-lg-0">
                            <div class="icon-stack icon-stack-xl bg-gradient-primary-to-secondary text-white mb-4"><i
                                    data-feather="layers"></i></div>
                            <h3>Built for developers</h3>
                            <p class="mb-0">Our customizable, block-based build system makes creating your next project
                                fast and easy!</p>
                        </div>
                        <div class="col-lg-4 mb-5 mb-lg-0">
                            <div class="icon-stack icon-stack-xl bg-gradient-primary-to-secondary text-white mb-4"><i
                                    data-feather="smartphone"></i></div>
                            <h3>Modern responsive design</h3>
                            <p class="mb-0">Featuring carefully crafted, mobile-first components, your end product will
                                function beautifully on any device!</p>
                        </div>
                        <div class="col-lg-4">
                            <div class="icon-stack icon-stack-xl bg-gradient-primary-to-secondary text-white mb-4"><i
                                    data-feather="code"></i></div>
                            <h3>Complete documentation</h3>
                            <p class="mb-0">All of the layouts, page sections, components, and utilities are fully
                                covered in this products docs.</p>
                        </div>
                    </div>
                </div>
            </section>
            <hr/>


            <section class="bg-white py-10">

                <div class="svg-border-waves text-dark">
                    <svg class="wave" style="pointer-events: none" fill="currentColor" preserveAspectRatio="none"
                         xmlns="http://www.w3.org/2000/svg" xlink="http://www.w3.org/1999/xlink" viewBox="0 0 1920 75">
                        <defs>
                            <style>
                                .a {
                                    fill: none;
                                }

                                .b {
                                    clip-path: url(#a);
                                }

                                .d {
                                    opacity: 0.5;
                                    isolation: isolate;
                                }
                            </style>
                            <clipPath id="a">
                                <rect class="a" width="1920" height="75"/>
                            </clipPath>
                        </defs>
                        <title>wave</title>
                        <g class="b">
                            <path class="c"
                                  d="M1963,327H-105V65A2647.49,2647.49,0,0,1,431,19c217.7,3.5,239.6,30.8,470,36,297.3,6.7,367.5-36.2,642-28a2511.41,2511.41,0,0,1,420,48"/>
                        </g>
                        <g class="b">
                            <path class="d"
                                  d="M-127,404H1963V44c-140.1-28-343.3-46.7-566,22-75.5,23.3-118.5,45.9-162,64-48.6,20.2-404.7,128-784,0C355.2,97.7,341.6,78.3,235,50,86.6,10.6-41.8,6.9-127,10"/>
                        </g>
                        <g class="b">
                            <path class="d"
                                  d="M1979,462-155,446V106C251.8,20.2,576.6,15.9,805,30c167.4,10.3,322.3,32.9,680,56,207,13.4,378,20.3,494,24"/>
                        </g>
                        <g class="b">
                            <path class="d"
                                  d="M1998,484H-243V100c445.8,26.8,794.2-4.1,1035-39,141-20.4,231.1-40.1,378-45,349.6-11.6,636.7,73.8,828,150"/>
                        </g>
                    </svg>
                </div>
            </section>
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
