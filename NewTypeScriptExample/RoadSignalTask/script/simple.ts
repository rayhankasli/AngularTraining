//decalre global variable for handle interval
var hstartInterval;
var vstartInterval;

//craete class which handle multiple action
class Simple {

    
    //create constructor
    constructor() {
        
        //jquery function for set hight and width of window
        $(function(){
            $("#vroad").css("height", $(window).height());
        });
        
        $(function(){
            $("#hroad").css("width", $(window).innerWidth);
        });
        

    }


    

    //function of yellow signal horizontal road 
    hyellowsignal() {
        
        $(function () {
            $("#btnyellow").on("click", function () {
                $("#imgsignal").attr("src", "images/yellowsignal.png");
                clearInterval(hstartInterval);
                var car = document.getElementById("car");
                var leftOffset = 0;
                function move() {
                    car.style.marginLeft = leftOffset + "px";
                    leftOffset += 2;
                    if (leftOffset > window.innerWidth) {
                        leftOffset = 0;
                    }
                };
                //start interval
                hstartInterval = setInterval(move, 20);

            });
        });
    }

    //function of red signal horizontal road
    hredsignal() {
        var leftOffset;

        $(function () {
            $("#btnred").on("click", function () {
                
                $("#imgsignal").attr("src", "images/redsignal.png");

                clearInterval(hstartInterval);

            });
        });
    }


    //function of green signal horizontal road
    hgreensignal() {

        

        $(function () {
            $("#btngreen").on("click", function () {
             
                $("#imgsignal").attr("src", "images/greensignal.png");
                clearInterval(hstartInterval);
                var car = document.getElementById("car");
                var leftOffset = 0;
                function move() {
                    car.style.marginLeft = leftOffset + "px";
                    leftOffset += 2;

                    if (leftOffset > window.innerWidth) {
                        leftOffset = 0;
                    }
                }
                //start interval
                hstartInterval = setInterval(move, 1);
            });
        });
    }


    //function of yellow signal vertical road
    vyellowsignal()
    {
        $(function () {
            $("#sbtnyellow").on("click", function () {
               
                $("#imgsignal1").attr("src", "images/yellowsignal.png");
                clearInterval(vstartInterval);
                var car = document.getElementById("vcar");
                var leftOffset = 0;
                function move() {
                    car.style.marginTop = leftOffset + "px";
                    leftOffset += 2;

                    if (leftOffset > window.innerHeight) {
                        leftOffset = 0;
                    }
                }
                //start interval
                vstartInterval = setInterval(move, 20);
            });
        });
    }


    //function of red signal vertical road
    vredsignal()
    {
        $(function () {
            $("#sbtnred").on("click", function () {
                
                $("#imgsignal1").attr("src", "images/redsignal.png");

                clearInterval(vstartInterval);

            });
        });
    }

    //function of green signal vertical road
    vgreensignal()
    {
        $(function () {
            $("#sbtngreen").on("click", function () {
                
                $("#imgsignal1").attr("src", "images/greensignal.png");
                clearInterval(vstartInterval);
                var car = document.getElementById("vcar");
                var leftOffset = 0;
                function move() {
                    car.style.marginTop = leftOffset + "px";
                    leftOffset += 2;

                    if (leftOffset > window.innerHeight) {
                        leftOffset = 0;
                    }
                }
                //start interval
                vstartInterval = setInterval(move, 1);
            });
        });
    }

}

// create object to access class and their function 
let simp = new Simple();
simp.hredsignal();
simp.vredsignal();
simp.hgreensignal();
simp.vgreensignal();
simp.hyellowsignal();
simp.vyellowsignal();