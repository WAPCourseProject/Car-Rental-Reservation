package com.miu.rental.controller;

import com.google.gson.Gson;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.Vehicle;
import com.miu.rental.model.customAttributeType.BodyType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet("/search")
public class VehicleSearchController extends HttpServlet {

    Gson mapper = new Gson();

    private Integer[] parseDate(String s){
        String[] d = s.split("-");
        Integer[] di = {Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2])};
        return di;
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer[] ld;
        LocalDate startDate = null;
        LocalDate endDate = null;
        final String make = request.getParameter("vehicleMake");
        final String model = request.getParameter("vehicleModel");
        final String type = request.getParameter("vehicleType");
        final String color = request.getParameter("vehicleColor");
        final String yearStr = request.getParameter("vehicleYear");

        System.out.println(make);
        ArrayList<Vehicle> vRepo = VehicleRepository.getAllVehicles();
//        for(Vehicle v: vRepo){
//            System.out.println(v.toString());
//        }
//        System.out.println(UserRepository.getById(1));

        Stream<Vehicle> searchResult = vRepo.parallelStream();

        if(!(request.getParameter("startDate") == null || request.getParameter("startDate") == "")){
            ld = parseDate(request.getParameter("startDate"));
            startDate = LocalDate.of(ld[0],ld[1],ld[2]);
            System.out.println("in startDate");
        }
        if(!(request.getParameter("endDate") == null || request.getParameter("endDate") == "")){
            ld = parseDate(request.getParameter("endDate"));
            endDate = LocalDate.of(ld[0],ld[1],ld[2]);
            System.out.println("in endDate");
        }
        if(!(make == null || make == "")) {
            searchResult = searchResult.filter(v -> v.getMake().equals(make));
            System.out.println("in make");
        }
        if(!(model == null || model == "")){
            searchResult = searchResult.filter(v -> v.getModel().equals(model));
            System.out.println("in model");
        }

        if(!(type == null || type == "")){
            searchResult = searchResult.filter(v -> v.getType().equals(BodyType.valueOf(type.toUpperCase())));
            System.out.println("in type");
        }

        if(!(color == null || color == "")){
            searchResult = searchResult.filter(v -> v.getColor().equals(color));
            System.out.println("in color");
        }

        if(!(yearStr == null || yearStr == "")){
            final Integer year = Integer.parseInt(yearStr);
            searchResult = searchResult.filter(v -> v.getYear().equals(year));
            System.out.println("in year");
        }

        List<Vehicle> filteredResult = searchResult.collect(Collectors.toList());

        String jsonSearchResult = "{\"filteredVehicles\":[";

        int i = 0;
        int size = filteredResult.size();
        for(Vehicle v: filteredResult){
            jsonSearchResult += mapper.toJson(v,Vehicle.class);
            i++;
            if(i < size){
                jsonSearchResult += ",";
            }
        }

        jsonSearchResult += "]}";
        System.out.println(jsonSearchResult);
        response.getWriter().print(jsonSearchResult);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
