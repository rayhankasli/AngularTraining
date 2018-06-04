
var startInterval; 
var cardiv = document.getElementById("vcard");
console.log("Division"+cardiv);

// $(document).ready(function(){
// 	$("#vcard").css("height", $(window).height());
// });

function stop() // Stop the Interval
{
    clearInterval(startInterval);
}

//JQuery for Red Signal Button
$(document).ready(function ($) {
    $("#btnred").click(function () {
        stop();
        $("#imgsignal").attr("src", "images/redsignal.png");
    });
});



//JQuery for Green Signal Button
$(document).ready(function ($) {
    $("#btngreen").click(function () {
        stop();
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
        startInterval = setInterval(move, 1);
    }); 
});

//JQuery for Yellow Signal Button
$(document).ready(function ($) {
    $("#btnyellow").click(function () {
        stop();
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
        startInterval = setInterval(move, 20);
    });
});

//JQuery for Red Signal Button
$(document).ready(function ($) {
    $("#sbtnred").click(function () {
        stop();
        $("#imgsignal1").attr("src", "images/redsignal.png");
    });
});



//JQuery for Green Signal Button
$(document).ready(function ($) {
    $("#sbtngreen").click(function () {
        
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
        startInterval = setInterval(move, 1);

        


    }); 
});

//JQuery for Yellow Signal Button
$(document).ready(function ($) {
    $("#sbtnyellow").click(function () {
       
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
        startInterval = setInterval(move, 20);

        


    }); 
});







