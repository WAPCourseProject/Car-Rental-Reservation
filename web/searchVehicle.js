$(
    function () {
        "use strict";

        const url = "search";
        const btnSearch = $("#btnSearch");
        const searchByRentPeriod = $("#searchByRentPeriod");
        const searchByVehicleMake = $("#searchByVehicleMake");
        const searchByVehicleModel = $("#searchByVehicleModel");
        const searchByVehicleType = $("#searchByVehicleType");
        const searchByVehicleColor = $("#searchByVehicleColor");
        const searchByVehicleYear = $("#searchByVehicleYear");
        const displayWin = $("#searchDisplay");



        searchByVehicleModel.addClass("turnoff-search-param");
        searchByVehicleType.addClass("turnoff-search-param");
        searchByVehicleColor.addClass("turnoff-search-param");
        searchByVehicleYear.addClass("turnoff-search-param");

        $(".addFilter").click(addFilterHandler);
        $(".removeFilter").click(removeFilterHandler);


        function addFilterHandler(e){
            e.preventDefault();
            $(this).parent("div").parent("div").next().toggleClass("turnoff-search-param");//CHECK IF IT'S SUPPOSED TO BE BLOCK


        }

        function removeFilterHandler(e){
            e.preventDefault();
            // $(this).parent("div").prev().children(".addFilter").css("display","inline");
            //
            if($(this).parent("div").parent("div").attr("id") ==="searchByVehicleMake" && $(searchByVehicleModel).css("display") !=="none"){
                $(searchByVehicleModel).toggleClass("turnoff-search-param");
            }
            $(this).parent("div").parent("div").toggleClass("turnoff-search-param");
        }

        function success(data){
            window.location = data["url"];
        }

        function reserveReqHandler(e){
            const vId = $(this).find("img").attr("alt");
            const data = {"vehicleId": vId};


            $.post("requestReserve",data,success,"json");
        }

        function addCarCard(vehicle){

            const action = $("<div>");
            action.addClass("small");
            action.addClass("text-primary");
            action.html("Clik to Reserve");
            const arrowImg = $("<i>");
            const arrow = $("<div>");
            arrow.addClass("small");
            arrow.addClass("text-primary");
            arrow.append(arrowImg);

            const divFooter = $("<div>");
            divFooter.addClass("card-footer");
            divFooter.addClass("bg-transparent");
            divFooter.addClass("border-top");
            divFooter.addClass("d-flex");
            divFooter.addClass("align-items-center");
            divFooter.addClass("justify-content-between");
            divFooter.append(action);
            divFooter.append(arrow);

            const infoHeader = $("<h4>");
            infoHeader.addClass("card-title");
            infoHeader.addClass("mb-2");
            infoHeader.html("" + vehicle.make + " " + vehicle.model); //add make and model of car here

            const infoBody = $("<p>");
            infoBody.addClass("card-text");
            infoBody.html("Color: " + vehicle.color + "<br>Year :" + vehicle.year + "<br> Price: " + vehicle.rentPrice); //add specs of the car here

            const divInfo = $("<div>");
            divInfo.addClass("card-body");
            divInfo.append(infoHeader);
            divInfo.append(infoBody);

            const imgCar = $("<img>");
            imgCar.addClass("card-img-top");
            imgCar.attr("src",vehicle.imageUrl); //add image of car here
            imgCar.attr("alt",vehicle.vehicleId);

            const anchCard = $("<a>");
            anchCard.addClass("card");
            anchCard.addClass("lift");
            anchCard.addClass("h-100");
            anchCard.attr("href","#!"); 
            anchCard.append(imgCar);
            anchCard.append(divInfo);
            anchCard.append(divFooter);
            anchCard.click(reserveReqHandler);


            const divWrap = $("<div>");
            divWrap.addClass("col-lg-4");
            divWrap.addClass("col-lg-4");
            divWrap.append(anchCard)

            $("#displayRow").append(divWrap);

        }



        function searchHandler(e){
            e.preventDefault();
            let data = {};//initialize the search parameters to be fetched

            $("#displayRow").empty();

            if($("#rentStart").val() !== ""  && $("#rentEnd").val() !== ""){
                data['startDate'] = $("#rentStart").val();
                data["endDate"] = $("#rentEnd").val();
            }

            if(searchByVehicleMake.css("display") !== "none" && $("#vehicleMake").val() !== ""){
                data["vehicleMake"] = $("#vehicleMake").val();
            }

            if(searchByVehicleModel.css("display") !== "none" && $("#vehicleModel").val() !== ""){
                data["vehicleModel"] = $("#vehicleModel").val();
            }

            if(searchByVehicleType.css("display") !== "none" && $("#vehicleType").val() !== ""){
                data["vehicleType"] = $("#vehicleType").val();
            }

            if(searchByVehicleColor.css("display") !== "none" && $("#vehicleColor").val() !== ""){
                data["vehicleColor"] = $("#vehicleColor").val();
            }

            if(searchByVehicleYear.css("display") !== "none" && $("#vehicleYear").val() !== ""){
                data["vehicleYear"] = $("#vehicleYear").val();
            }

            $.post(url,data,processData, "json");
        }

        function processData(data){

            let vehicles = data["filteredVehicles"];
            for( const vehicle of vehicles){

                addCarCard(vehicle);

            }
        }

        btnSearch.click(searchHandler);
    }
)