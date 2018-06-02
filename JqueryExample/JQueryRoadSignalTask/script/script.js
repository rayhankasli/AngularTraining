var startInterval; //Variable for start interval for perticular function 

function stop() // Stop the Interval
{
    clearInterval(startInterval);
}

//JQuery for Red Signal Button
$(document).ready(function ($) {
    $("#btnred").click(function () {
        stop(); //Call stop function for stop the Current Interval
        $("#imgsignal").attr("src", "images/redsignal.png"); //Change the Signal 
    });
});



//JQuery for Green Signal Button
$(document).ready(function ($) {
    $("#btngreen").click(function () {
        stop(); //Call stop function for stop the Current Interval
        $("#imgsignal").attr("src", "images/greensignal.png"); //Change the Signal
        var car = document.getElementById("car"); 
        var leftOffset = 0;
        function move() {
            car.style.marginLeft = leftOffset + "px";
            leftOffset += 2;
            
            if (leftOffset > window.innerWidth) {
                leftOffset = 0;
            }

        };
        startInterval = setInterval(move, 10);
    });
});

//JQuery for Yellow Signal Button
$(document).ready(function ($) {
    $("#btnyellow").click(function () {
        stop(); //Call stop function for stop the Current Interval
        $("#imgsignal").attr("src", "images/yellowsignal.png"); //Change the Signal 
        var car = document.getElementById("car");
        var leftOffset = 0;
        function move() {
            car.style.marginLeft = leftOffset + "px";
            leftOffset += 2;
            if (leftOffset > window.innerWidth) {
                leftOffset = 0;
            }
        };
        startInterval = setInterval(move, 20);
    });
});








