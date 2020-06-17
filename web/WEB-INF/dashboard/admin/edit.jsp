<%--
  Created by IntelliJ IDEA.
  User: brocklife
  Date: 6/16/2020
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
    Document   : EditPost
    Created on : Aug 8, 2015, 11:08:34 PM
    Author     : Thang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit</title>
</head>
<body>

<h1>Edit Car Detail</h1>
<div style="width: 900px; margin-left: auto; margin-right: auto">


        <form action="/admin/edit" method="post">
            <input type="hidden" name="id" value="${getById.vehicleId}">
            <div class="modal-body">


                <div>
                    <input type="text" id="make"
                           value="${getById.make}" placeholder="Make"/>
                </div>
                <div>
                    <input type="text" id="model"
                           value="${getById.model}" placeholder="Model"/>
                </div>
                <div>
                    <input type="text" id="color"
                           value="${getById.color}" placeholder="Color"/>
                </div>
                <div>
                    <input type="number" id="capacity"
                           value="${getById.capacity}" placeholder="Capacity"/>
                </div>
                <div>
                    <input type="number" id="year"
                           value="${getById.year}"  placeholder="Year"/>
                </div>
                <div>
                    <input type="text" id="condition"
                           value="${getById.condition}" placeholder="Condition"/>
                </div>

                <div>
                    <input type="number" id="mileage"
                           value="${getById.mileage}" placeholder="Mileage"/>
                </div>
                <div>
                    <input type="number" id="rentPrice"
                           value="${getById.rentPrice}"  placeholder="rentPrice"/>
                </div>

                <div>

                    <input type="text" id="plateNumber"
                           value="${getById.plateNumber}"  placeholder="PlateNumber"/>
                </div>

                <div>
                    <input type="text" id="available"
                           value="${getById.available}" placeholder="Availability"/>
                </div>
                <input type="submit" value="Submit">

            </div>
        </form>

</div>
</body>
</html>
