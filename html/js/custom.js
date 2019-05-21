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
    //alert(identificationCookie);
    identificationCookie = Cookies.get('DeviceId');
    var str = "http://192.168.0.102:8080/topics/iframe/" + identificationCookie;
    //var str = "localhost:8080/topics/iframe/" + identificationCookie;
    //alert(str);
    if (identificationCookie != null || identificationCookie != "") {
        $.ajax({
                method: "GET",
                url: str,
                data: {}
            })
            .done(function(msg) {
                console.log("output:"+msg);
                if (Number(msg)>0) {
                    if ($("#divCamFeed").hasClass("d-none")) {
                        $("#divCamFeed").removeClass('d-none');
                        showFrame(msg);
                        setTimeout(function() {
                        
                        }, 5000);
                    }
                } else {
                    $("#divCamFeed").addClass('d-none');
                }
                setTimeout(function() {
                    getId();
                }, 1000);
            });
        //alert(data);


    }

}

function showFrame(frameId){
    if(frameId==1){
        $("#iframeCam").attr("src", "http://192.168.0.111/");
    }
    if(frameId==2){
        $("#iframeCam").attr("src", "http://192.168.0.112/");
    }
    if(frameId==3){
        $("#iframeCam").attr("src", "http://192.168.0.113/");
    }
    if(frameId==4){
        $("#iframeCam").attr("src", "http://192.168.0.92/");
    }
    if(frameId==5){
        $("#iframeCam").attr("src", "http://192.168.0.93/");
    }
    if(frameId==6){
        $("#iframeCam").attr("src", "http://192.168.0.94/");
    }
    if(frameId==7){
        $("#iframeCam").attr("src", "http://192.168.0.80/");
    }
    if(frameId==8){
        $("#iframeCam").attr("src", "http://192.168.0.81/");
    }
    if(frameId==9){
        $("#iframeCam").attr("src", "http://192.168.0.95/");
    }
    if(frameId==10){
        $("#iframeCam").attr("src", "http://192.168.0.96/");
    }
    if(frameId==11){
        $("#iframeCam").attr("src", "http://192.168.0.97/");
    }
}

getId();
