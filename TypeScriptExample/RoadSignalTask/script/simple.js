var hstartInterval;
var vstartInterval;
var imple = /** @class */ (function () {
    function imple() {
        $(function () {
            $("#vroad").css("height", $(window).height());
        });
        $(function () {
            $("#hroad").css("width", $(window).innerWidth);
        });
    }
    imple.prototype.hyellowsignal = function () {
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
                }
                ;
                hstartInterval = setInterval(move, 20);
            });
        });
    };
    imple.prototype.hredsignal = function () {
        var leftOffset;
        $(function () {
            $("#btnred").on("click", function () {
                $("#imgsignal").attr("src", "images/redsignal.png");
                clearInterval(hstartInterval);
            });
        });
    };
    imple.prototype.hgreensignal = function () {
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
    };
    imple.prototype.vyellowsignal = function () {
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
    };
    imple.prototype.vredsignal = function () {
        $(function () {
            $("#sbtnred").on("click", function () {
                $("#imgsignal1").attr("src", "images/redsignal.png");
                clearInterval(vstartInterval);
            });
        });
    };
    imple.prototype.vgreensignal = function () {
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
    };
    return imple;
}());
var imp = new Simple();
simp.hredsignal();
simp.vredsignal();
simp.hgreensignal();
simp.vgreensignal();
simp.hyellowsignal();
simp.vyellowsignal();
