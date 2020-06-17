package com.miu.rental.controller;

import com.miu.rental.dao.UserRepository;
import com.miu.rental.dao.VehicleRepository;
import com.miu.rental.model.Vehicle;
import com.miu.rental.model.customAttributeType.BodyType;
import com.miu.rental.model.customAttributeType.Role;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/home",""})

public class HomeController extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //super.init();
        System.out.println("Data Initialized");

        //Initialize User Repository
        UserRepository.addUser("Melakselam","Mengistu","Melak", "Melak123456","melak@gmail.com", "CLIENT");
        UserRepository.addUser("Bernabas","Demisse","Berni", "Berni123456","bernabas@gmail.com", "CLIENT");
        UserRepository.addUser("Brook","Legamo","BrookL", "Brook123456","brook@gmail.com", "CLIENT");
        UserRepository.addUser("Alemayoh","Abrha","Alex", "Alex123456","alex@gmail.com", "ADMIN");

        // MADE CHANGES HERE : TYPE OF 'type' TO STRING
        //Initialize Vehicle Repository
       //new data
        VehicleRepository.addVehicle( "Toyota", 2000,4,185000,"used, minor scratches and dents on body","52Gh-414",55.0, true,"burgendy","Camry","http://media.ed.edmunds-media.com/toyota/corolla/2000/oem/2000_toyota_corolla_sedan_le_fq_oem_1_500.jpg");
        VehicleRepository.addVehicle( "Toyota", 2016,4,1850,"used, minor scratches and dents on body","1235-dsdf",85.0, true,"grey","Corolla","http://wpmedia.driving.ca/2016/11/chrome-image-379796.png?w=800&h=520&crop=1&quality=70&strip=all");
        VehicleRepository.addVehicle( "Toyota", 2016,4,500,"used, minor scratches and dents on body","1235-dsdf",185.0, true,"red","Corolla","https://www.mynrma.com.au/-/media/car-reviews/toyota/2016-toyota-corolla-hybid.jpg?h=500&w=1140&hash=5EC3DD7DC094A12001F34D5A2039B90D");
        VehicleRepository.addVehicle( "Tesla", 2020,4,1000,"used, minor scratches and dents on body","1235-dsdf",285.0, true,"white","Model X","https://o.aolcdn.com/images/dims3/GLOB/legacy_thumbnail/800x450/format/jpg/quality/85/https://s.yimg.com/os/creatr-uploaded-images/2019-04/85052e70-6527-11e9-bfb7-64a5761021dd");
        VehicleRepository.addVehicle( "Subaru", 2017,4,132000,"used, minor scratches and dents on body","1235-dsdf",115.0, true,"blue","WRX","https://carsmonitor.com/wp-content/gallery/2018-Subaru-Impreza-WRX-STI/2018-Subaru-Impreza-WRX-STI-2.jpg");
        VehicleRepository.addVehicle( "Toyota", 2019,4,13000,"used, minor scratches and dents on body","1235-dsdf",120.0, true,"grey","Yaris","http://img.sm360.ca/ir/w500c/images/newcar/ca/2019/toyota/yaris-hatchback/5dr-se/hatchback/exteriorColors/2018_toyota_yaris_hatchback_se_5-portes_032_gbatn.png");




        //new data



        VehicleRepository.addVehicle("12354dsdf","Toyota","Yaris", "HATCHBACK", "red", 2019);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.getAllVehicle().get(6).setImageUrl("https://mensfolio-my-production.s3-ap-southeast-1.amazonaws.com/2019/04/25142731/2019-03-28_18-00-06-800x524.jpg");
        VehicleRepository.addVehicle("12354dsdf","Nissan","Altima", "SEDAN", "maroon", 2019);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.getAllVehicle().get(7).setImageUrl("https://blogmedia.dealerfire.com/wp-content/uploads/sites/747/2018/04/2019-altima-3_o-2-1024x357.jpg");
        VehicleRepository.addVehicle("12354dsdf","Nissan","Titan XD", "PICKUP", "dark-grey", 2020);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.getAllVehicle().get(8).setImageUrl("https://www.yeniarabafiyati.com/wp-content/uploads/2019/09/Nissan-Titan-Carviser-5-800x445.jpg");
        VehicleRepository.addVehicle("12354dsdf","Toyota","RAV4", "CROSSOVER", "silver", 2020);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.getAllVehicle().get(9).setImageUrl("https://i1.wp.com/2020bestsuv.com/wp-content/uploads/2019/01/2020-Toyota-RAV4-review.jpg?resize=800%2C400&ssl=1");

        VehicleRepository.addVehicle("12354dsdf","Tesla","Model S", "SEDAN", "creamy", 2020);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.getAllVehicle().get(10).setImageUrl("https://pictures.topspeed.com/IMG/crop/202003/2021-bmw-i4-vs-2020--2_800x0w.jpg");

        VehicleRepository.addVehicle("12354dsdf","Toyota","Prius", "SEDAN", "red", 2016);// MADE CHANGES HERE CHANGED TYPE ARG
        VehicleRepository.getAllVehicle().get(11).setImageUrl("https://media.consumeraffairs.com/files/news/2017_Prius_Toyota.jpg");

        VehicleRepository.addVehicle( "Tesla", 2018,4,10000,"new","FT-345",650.0, true,"Silver","model x","https://source.unsplash.com/8xyki0bqvgw/800x500");
        VehicleRepository.addVehicle( "Toyota", 2021,4,20,"new","FT-345",350.0, true,"Black","corolla"," https://source.unsplash.com/8xyki0bqvgw/800x500");
        VehicleRepository.addVehicle( "nissan", 2022,2,00,"new","344",550.0, true,"white","netsan","https://source.unsplash.com/AfVTk16WhsY/800x500");
        VehicleRepository.addVehicle( "nissan", 2021,2,00,"new","3fe-44",550.0, true,"burgundy","wrx","https://source.unsplash.com/d1U4yTgezGQ/800x500");
        VehicleRepository.addVehicle( "Toyota", 2020,4,00,"new","Gh-44",450.0, true,"red","rav4","https://source.unsplash.com/XT3Kk0GelbE/800x500");



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/home.jsp");
        view.forward(req,resp);
    }
}
