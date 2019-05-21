

var identificationCookie = Cookies.get('DeviceId');
SetCookie();

function SetCookie() {
    if (identificationCookie == null || identificationCookie == "") {
        $('#myModal').modal('show');
    }
}

function saveDeviceId() {
    var input = $("#txtDeviceName").val();
    if (input != null && input != "") {
        $('#myModal').modal('hide');
        Cookies.set('DeviceId', input);
    }
}

function getId() {
    if (identificationCookie == null || identificationCookie == "") {
        {
            $.ajax({
                method: "GET",
                url: "localhost:8080/topics/iframe/"+ identificationCookie,
                data: {}
            })
                .done(function (msg) {
                    if (msg == "true") {
                        $("#divCamFeed").removeClass('d-none');
                    } else {
                        $("#divCamFeed").addClass('d-none');
                    }
                    setTimeout(function () {
                        getId();
                    }, 10000);
                });
        }
    }
}

getId();
