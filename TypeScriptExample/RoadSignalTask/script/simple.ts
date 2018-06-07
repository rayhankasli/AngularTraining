var hstartInterval;
var vstartInterval;


class Simple {



    constructor() {
        $(function(){
            $("#vroad").css("height", $(window).height());
        });
        
        $(function(){
            $("#hroad").css("width", $(window).innerWidth);
        });
        

    }


    


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
                hstartInterval = setInterval(move, 20);

            });
        });
    }

    hredsignal() {
        var leftOffset;

        $(function () {
            $("#btnred").on("click", function () {
                
                $("#imgsignal").attr("src", "images/redsignal.png");

                clearInterval(hstartInterval);

            });
        });
    }

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
                hstartInterval = setInterval(move, 1);
            });
        });
    }


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
                vstartInterval = setInterval(move, 20);
            });
        });
    }

    vredsignal()
    {
        $(function () {
            $("#sbtnred").on("click", function () {
                
                $("#imgsignal1").attr("src", "images/redsignal.png");

                clearInterval(vstartInterval);

            });
        });
    }

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
                vstartInterval = setInterval(move, 1);
            });
        });
    }

}

let simp = new Simple();
simp.hredsignal();
simp.vredsignal();
simp.hgreensignal();
simp.vgreensignal();
simp.hyellowsignal();
simp.vyellowsignal();