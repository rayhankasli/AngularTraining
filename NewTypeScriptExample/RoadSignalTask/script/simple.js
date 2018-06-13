var hstartInterval;
var vstartInterval;
var Simple = /** @class */ (function () {
    function Simple() {
        $(function () {
            $("#vroad").css("height", $(window).height());
        });
        $(function () {
            $("#hroad").css("width", $(window).innerWidth);
        });
    }
    Simple.prototype.hyellowsignal = function () {
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
    Simple.prototype.hredsignal = function () {
        var leftOffset;
        $(function () {
            $("#btnred").on("click", function () {
                $("#imgsignal").attr("src", "images/redsignal.png");
                clearInterval(hstartInterval);
            });
        });
    };
    Simple.prototype.hgreensignal = function () {
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
    Simple.prototype.vyellowsignal = function () {
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
    Simple.prototype.vredsignal = function () {
        $(function () {
            $("#sbtnred").on("click", function () {
                $("#imgsignal1").attr("src", "images/redsignal.png");
                clearInterval(vstartInterval);
            });
        });
    };
    Simple.prototype.vgreensignal = function () {
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
    return Simple;
}());
var simp = new Simple();
simp.hredsignal();
simp.vredsignal();
simp.hgreensignal();
simp.vgreensignal();
simp.hyellowsignal();
simp.vyellowsignal();
