<%--
  Created by IntelliJ IDEA.
  User: solom
  Date: 6/17/2020
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Grace
  Date: 6/14/2020
  Time: 6:26 PM
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
                    <div class="navbar-brand text-primary">Your Request is Reserved</div>
                    <div class="navbar-toggler" type="button" data-toggle="collapse"
                         data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                         aria-expanded="false" aria-label="Toggle navigation"></div>
                </div>
            </nav>
            <!-- Put Your content in here -->
            <div class="container">
                <div class="card bg-light">
                <div class="row justify-content-center">
                    <div class="col-lg-10">
                        <div class="d-flex align-items-center justify-content-between">
                            <h3 class="mb-0">Reservation Summary</h3>
                            <div class="badge badge-primary-soft text-primary badge-marketing">1 Openings</div>
                        </div>
                        <hr class="mb-0">
                        <ul class="list-group list-group-flush list-group-careers">
                            <li class="list-group-item">
                                <a href="#!">Vehicle Make</a>
                                <div class="small">${vehicle.make}</div>
                            </li>
                            <li class="list-group-item">
                                <a href="#!">Vehicle Model</a>
                                <div class="small">${vehicle.model}</div>
                            </li>
                            <li class="list-group-item">
                                <a href="#!">Vehicle Type</a>
                                <div class="small">${vehicle.type}</div>
                            </li>
                            <li class="list-group-item">
                                <a href="#!">Year</a>
                                <div class="small">${vehicle.year}</div>
                            </li>
                            <li class="list-group-item">
                                <a href="#!">Capacity</a>
                                <div class="small">${vehicle.capacity}</div>
                            </li>
                            <li class="list-group-item">
                                <a href="#!">Mileage</a>
                                <div class="small">${vehicle. mileage}</div>
                            </li>
                            <a href="#!">Plate Number</a>
                            <div class="small">${vehicle.plateNumber}</div>
                        </li>
                            <li class="list-group-item">
                                <a href="#!">Rent Price</a>
                                <div class="small">${vehicle.rentPrice}</div>
                            </li>
                        </ul>
                        <hr class="mb-0">
                            <div class="card-body text-center p-5" >
                                 Reservation Completed
                                Thank you For Choosing Us!
                            </div>
                        <a class="btn btn-info btn-marketing rounded-pill" href="reservation-cancel">Back To Home</a>
                        </div>
                    </div>
                </div>
            </div>

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