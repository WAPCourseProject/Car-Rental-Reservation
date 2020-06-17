/*
$(document).on("click", "a.delete", function(event) {
    event.preventDefault();
    var id = $(this).data("rowid");
    var row = $(this).closest("tr");
    $.ajax({
        url: "vehicle",
        type: "POST",
        data: {
            operation: "remove",
            id: id
        },
        success: function(response){
            row.remove();
        },
        error: function (response) {
            console.log("Something went wrong");
        }
    });

});*/

$("#tbl_vehicles tr td delete").click(function(e) {
// e.preventDefault();
    var row = $(this).closest('tr');
    var rowid = row.attr('id');
    var url = $(this).attr('href');
    var ajaxUrl = url.substring(url.lastIndexOf("/") + 1, url.length);
    input_box = confirm("Are you sure you want to delete this Record?");
    if (input_box == true) {
        // Output when OK is clicked
        // Here you are sending your servlet URL to ajax.
        $.ajax({
            url : ajaxUrl,
            type : "POST",
            async : false,
            success : function() {
                $('#'+rowid).remove();
                alert('Record Deleted');
            }
        });

        return false;
    } else {
        // Output when Cancel is clicked
        // alert("Delete cancelled");
        return false;
    }
});
