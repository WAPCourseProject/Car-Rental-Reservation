<%--
  Created by IntelliJ IDEA.
  User: brocklife
  Date: 6/14/2020
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8"/>
    <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="../assets/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <title>
        Admin  Home Page
    </title>
    <meta content='width=device-width, initial-scale=1.0, shrink-to-fit=no' name='viewport'/>
    <!--     Fonts and icons     -->
    <link rel="stylesheet" type="text/css"
          href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
    <!-- CSS Files -->
    <link href="<c:url value='../resources/css/bootstrap.css'/>" rel="stylesheet"/>
    <link href=" <c:url value='../resources/css/material-dashboard.min.css?v=2.1.2'/>" rel="stylesheet"/>
    <!-- CSS Just for demo purpose, don't include it in your project -->
<%--    <link href="<c:url value='/re/css/demo.css'/>" rel="stylesheet"/>--%>
    <script src="https://cdn.jsdelivr.net/npm/feather-icons/dist/feather.min.js"></script>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/scriptCar.js"></script>
<<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/delete.js"></script>
</head>
<body class="">
<div class="wrapper ">
    <div class="sidebar" data-color="green" data-background-color="white" data-image="../assets/img/sidebar-1.jpg">
        <!--
          Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

          Tip 2: you can also add an image using data-image tag
      -->
        <div class="logo"><a href="#" class="simple-text logo-normal">
            Manage Car
        </a></div>
        <div class="sidebar-wrapper">
            <ul class="nav">
                <li class="nav-item   ">
                    <a class="nav-link" href="/admin/admindashboard">
                        <i class="material-icons">dashboard</i>
                        <p> Admin Dashboard</p>
                    </a>
                </li>
                <!--                <l class="nav-item ">-->
                <!--                    <a class="nav-link" href="admin/profile">-->
                <!--                        <i class="material-icons">location_searching</i>-->
                <!--                        <p>User Profile</p>-->
                <!--                    </a>-->
                <!--                </li>-->

            </ul>
        </div>
    </div>
    <div class="main-panel">
        <!-- Navbar -->

        <!-- End Navbar -->
        <div class="content">
            <div class="container-fluid">
                <div class=" col-4 ml-5"><h2 class="green-text">Add Vehicle</h2>
                    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#basicExampleModal">
                       Add Vehicle
                    </button>
                </div>

                <div class="row">
                    <div class="col-lg-11 col-md-13 mx-auto mt-lg-3">
                        <div class="card">
                            <div class="card-header card-header-success">
                                <h5 class="card-title text-center">Car List</h5>
                                <p class="card-category "></p>
                            </div>
                            <div class="card-body table-responsive">
                                <table class="table  table-hover" id="dtBasicExample">
                                    <thead class="text-success">
                                     <th>Id</th>
                                    <th>Make</th>
                                    <th>Color</th>
                                    <th>year</th>
                                    <th>Capacity</th>
                                    <th>Milegae</th>
                                    <th>Condition</th>
                                    <th>PlateNumber</th>
                                    <th>RentPrice</th>
                                    <th>Availability</th>
                                    <th>Picture</th>
                                    <th></th>
                                    <th></th>
                                    </thead>
                                    <tbody>

                                    <c:forEach items="${vehicles}" var="vehicle">
                                        <tr>
                                            <td><c:out value="${vehicle.id}"/></td>
                                            <td><c:out value="${vehicle.make}"/></td>
                                            <td><c:out value="${vehicle.color}"/></td>
                                            <td><c:out value="${vehicle.year}"/></td>
                                            <td><c:out value="${vehicle.capacity}"/></td>
                                            <td><c:out value="${vehicle.mileage}"/></td>
                                            <td><c:out value="${vehicle.condition}"/></td>
                                            <td><c:out value="${vehicle.plateNumber}"/></td>
                                            <td><c:out value="${vehicle.rentPrice}"/></td>
                                            <td><c:out value="${vehicle.imageUrl}"/></td>
                                            <td>
                                            <td><a   href="#" class ="btn btn-secondary
">Edit</a> </td>

                                            </td>
                                            <td ><a
                                                    id ="del_but"  class = "btn btn-danger delete"  onclick="return confirm('Are you sure?')" href="/admin/deleteVehicle?id=${vehicle.id}">Delete</a>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="footer">

    </footer>
</div>
</div>

<!--Modlas-->


<!-- Modal -->
<div class="modal fade" id="basicExampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Add new Car</h5>
                <button type="button" class="cancel" data-dismiss="modal" aria-label="Cancel">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <!--            <form class="text-center" style="color: #757575;" action="#!">-->
            <form class="text-center" style="color: #757575;" action="#">
                <div class="modal-body">

                        <div>
                             <input class ="form-control mb-sm-4" type="text" id="vehicle_id"
                                                                         readonly="readonly" placeholder="Id"/>
                        </div>
                        <div>
                             <input class ="form-control mb-sm-4"  type="text" id="make"
                                                                  placeholder="Make"/>
                        </div>
                        <div>
                             <input class ="form-control mb-sm-4" type="text" id="model"
                                                                    placeholder="Model"/>
                        </div>
                        <div>
                             <input class ="form-control mb-sm-4" type="text" id="color"
                                                                    placeholder="Color"/>
                        </div>
                        <div>
                             <input class ="form-control mb-sm-4"  type="number" id="capacity"
                                                                          placeholder="Capacity"/>
                        </div>
                        <div>
                             <input type="number" class ="form-control mb-sm-4" id="year"
                                                                  placeholder="Year"/>
                        </div>
                        <div>
                             <input type="text" class ="form-control mb-sm-4" id="condition"
                                                                            placeholder="Condition"/>
                        </div>

                        <div>
                             <input class ="form-control mb-sm-4" type="number" id="mileage"
                                                                        placeholder="Mileage"/>
                        </div>

                        <div>
                            <div>
                                 <input class ="form-control mb-sm-4" type="number" id="price"
                                                                            placeholder="price"/>
                            </div>
                            <input class ="form-control mb-sm-4" type="text" id="plateNumber"
                                                                                placeholder="PlateNumber"/>
                        </div>

                        <div>
                             <input class ="form-control mb-sm-4"  type="text" id="available"
                                                                            placeholder="Availability"/>
                        </div>
                        <div>
                            <input class ="form-control mb-sm-4" type="text" id="imageUrl"
                                                                         placeholder="image"/>
                        </div>
                        <div>
                            <input id="btn_add" type="submit" value="Add  Car">
                        </div>

                </div>
            </form>

        </div>
    </div>
</div>

<!--  ================                                         -->
<!--<div class="modal fade" id="updatexampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="updateModalLabel"> Update Entry</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            &lt;!&ndash;            <form class="text-center" style="color: #757575;" action="#!">&ndash;&gt;
            <form class="text-center" style="color: #757575;" action="#" th:action="@{/admin/entry/updateentry}"


                <input  class = "secid" type="hidden"   th:field="*{id}"/>
                <div class="modal-body">
                    <input type="text" id="materialSubscript" class="form-control mb-4 secname" placeholder="Entry Name" th:field="*{entryName}">
                    <input type="number" min="0" id="materialupdate" class="form-control mb-4 secnum1" placeholder="FPP Number" th:field="*{FPPNum}">
                    <input type="number" min="0" id="materialupdatempp" class="form-control mb-4 secnum2" placeholder="MPP Number" th:field="*{MPPNum}">
                    <input type="date" id="start4" class="form-control mb-4 secdate1" placeholder="Start Date"th:field="*{startDate}" >
                    <input type="date" id="end4" class="form-control mb-4 secdate2" placeholder="End Date"th:field="*{endDate}" >


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-success">Update changes</button>
                </div>
            </form>

        </div>
    </div>
</div>-->


<!--=============================-->
<!--Modal end-->

<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/ resources/js/addons/datatables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/material-dashboard.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>


</body>

</html>