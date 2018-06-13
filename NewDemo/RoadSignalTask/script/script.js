// Global Variable
var hstartInterval;
var vstartInterval; 

$(document).ready(function(){
	$("#vroad").css("height", $(window).height());
});

$(document).ready(function(){
	$("#hroad").css("width", $(window).innerWidth);
});

function hstop() // Stop the Interval
{
    clearInterval(hstartInterval);
}

function vstop() // Stop the Interval
{
    clearInterval(vstartInterval);
}



//JQuery for Red Signal Button
$(document).ready(function ($) {
    $("#btnred").click(function () {
        hstop();
        $("#imgsignal").attr("src", "images/redsignal.png");
        
    });
});



//JQuery for Green Signal Button
$(document).ready(function ($) {
    $("#btngreen").click(function () {
        hstop();
        $("#imgsignal").attr("src", "images/greensignal.png");
        var car = document.getElementById("car");
        var leftOffset = 0;
        function move() {
            car.style.marginLeft = leftOffset + "px";
            leftOffset += 2;
            
            if (leftOffset > window.innerWidth) {
                leftOffset = 0;
            }

        };
        hstartInterval = setInterval(move, 1);
    }); 
});

//JQuery for Yellow Signal Button
$(document).ready(function ($) {
    $("#btnyellow").click(function () {
        hstop();
        $("#imgsignal").attr("src", "images/yellowsignal.png");
        
        var car = document.getElementById("car");
        var leftOffset = 0;
        function move() {
            car.style.marginLeft = leftOffset + "px";
            leftOffset += 2;
            if (leftOffset > window.innerWidth) {
                leftOffset = 0;
            }
        };
        hstartInterval = setInterval(move, 20);
    });
});

//JQuery for Red Signal Button
$(document).ready(function ($) {
    $("#sbtnred").click(function () {
        vstop();
        $("#imgsignal1").attr("src", "images/redsignal.png");
    });
});



//JQuery for Green Signal Button
$(document).ready(function ($) {
    $("#sbtngreen").click(function () {
        vstop();
        $("#imgsignal1").attr("src", "images/greensignal.png");
        var car = document.getElementById("vcar");
        
        var leftOffset = 0;
        function move() {
            car.style.marginTop = leftOffset + "px";
            leftOffset += 2;
          
                      

             if (leftOffset > window.innerHeight) {
                leftOffset = 0;
             }
        };
        vstartInterval = setInterval(move, 1);

        


    }); 
});

//JQuery for Yellow Signal Button
$(document).ready(function ($) {
    $("#sbtnyellow").click(function () {
       vstop();
        $("#imgsignal1").attr("src", "images/yellowsignal.png");
        
        var car = document.getElementById("vcar");
        var leftOffset = 0;
        function move() {
            car.style.marginTop = leftOffset + "px";
            leftOffset += 2;
          
                      

             if (leftOffset > window.innerHeight) {
                leftOffset = 0;
             }
        };
        vstartInterval = setInterval(move, 20);

        


    }); 
});







