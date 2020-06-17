$(function () {
    $('#btn_add').click(addVehicle);
     // $('#del_but').click(removeData());
    // $('.delete').click(deletebyclick())
    function addVehicle() {
        let carMake = $('#make').val();
        let carModel = $('#model').val();
        let carColor = $('#color').val();
        let capacity = $('#capacity').val()
        let year = $('#year').val();
        let condition = $('#condition').val();
        let mileage = $('#mileage').val();
        let rentPrice = $('#rentPrice').val();
        let plateNumber = $('#plateNumber').val();
        let availability = $('#available').val();


        let vehicle = {
            make: carMake,
            model: carModel,
            color: carColor,
            capacity: capacity,
            year: year,
            condition: condition,
            mileage: mileage,
            rentPrice: rentPrice,
            plateNumber: plateNumber,
            available: availability
        };

        $.post('/Car_Rental_Reservation_war/admin/vehicle', {vehicle: JSON.stringify(vehicle)}, carData, "json");


    }

    /*function removeData() {

        let url_id = $(this).val();

        $.ajax({
            type: "POST",
            url: 'deleteVehicle' + url_id,
            data: {_method: 'delete', _token :token},
            success: function (data) {
                console.log(data);
                $("deleteVehicle" + url_id).remove();
            },
            error: function (data) {
                console.error('Error:', data);
            }
        });}*/


        function carData(data) {
        //data = JSON.parse(data);

        let td0 = $('<td>').text(data.vehicleId);
        let td1 = $('<td>').text(data.make);
        let td2 = $('<td>').text(data.model);
        let td3 = $('<td>').text(data.color);
        let td4 = $('<td>').text(data.capacity);
        let td5 = $('<td>').text(data.year);
        let td6 = $('<td>').text(data.condition);
        let td7 = $('<td>').text(data.mileage);
        let td8 = $('<td>').text(data.rentPrice);
        let td9 = $('<td>').text(data.plateNumber);
        let td10 = $('<td>').text(data.available);
        // let td11 = $('<td>').text(data.imageUrl);
        let tr = $('<tr>').append(td0).append(td1).append(td2)
            .append(td3)
            .append(td4).append(td5)
            .append(td6)
            .append(td7)
            .append(td8)
            .append(td9)
            .append(td10)
            // .append(td11)
        ;
        $('#tbl_vehicles>tbody').append(tr);
    }




       /* // Delete
        function deletebyclick(){
            let el = this;
            let id = this.id;
            let splitid = id.split("_");

            // Delete id
            let deleteid = splitid[1];

            // AJAX Request
            $.ajax({
                url: 'vehicle.jsp',
                type: 'POST',
                data: { id:deleteid },
                success: function(response){

                    if(response == 1){
                        // Remove row from HTML Table
                        $(el).closest('tr').css('background','tomato');
                        $(el).closest('tr').fadeOut(800,function(){
                            $(this).remove();
                        });
                    }else{
                        alert('Invalid ID.');
                    }

                }
            });}
*/




})

