<%--
  Created by IntelliJ IDEA.
  User: brocklife
  Date: 6/16/2020
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.miu.rental.dao.VehicleDAO"%>
<%@ page import="com.miu.rental.model.admin.Vehicle" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Page</title>
</head>
<body>
<%
    String idTemp = request.getParameter("id");
    int id = Integer.parseInt(idTemp);
    String make = request.getParameter("make");
    String model = request.getParameter("model");
    String color = request.getParameter("color");
    int capacity = Integer.parseInt("capacity");
    int year = Integer.parseInt(request.getParameter("year"));
    String condition = request.getParameter("condition");
    int mileage = Integer.parseInt(request.getParameter("mileage"));
    int price = Integer.parseInt(request.getParameter("rentPrice"));
    String platenumber = request.getParameter("plateNumber");
    boolean available = request.getParameter("available")

    VehicleDAO da = new VehicleDAO();
    Vehicle vehicle = new Vehicle(id, make, year, capacity, mileage, condition, platenumber,
            price, available, color,model);
    da.updateVehicle(vehicle);

    response.sendRedirect("/admin/vehicle");
%>
</body>
</html>
