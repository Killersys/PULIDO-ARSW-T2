var api = apiclient;
var app = (function () {

    var city;

    var buscar = function (data) {
        $("#lblname").text("City: "+data.name);
        console.info(data);
        document.getElementById("datos").textContent = "City: "+data.name+
        "\r\nId: "+data.id+
        "\r\nVisibility: "+data.visibility+
        "\r\nTimezone: "+data.timezone+
        "\r\nHumidity: "+data.main.humidity+
        "\r\nTemperatura Maxima: "+data.main.temp+
        "\r\nTemperatura Minima: "+data.main.temp_min+
        "\r\nCountry: "+data.sys.country+
        "\r\nLongitud: "+data.coord.lon+
        "\r\nLatitud: "+data.coord.lat
        ;
    }
		

    return {
        buscar: function(ciudad){
            app.buscar(ciudad, buscar);
        }}})();