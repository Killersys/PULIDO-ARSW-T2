apiclient = (function () {

    return {
		
        buscar: function(city, callback) {
			
            var get = $.getJSON(`/wea/city/${ city }`);
            $.when (get).done(function (data) {
                callback(data);
				
            });
        }
    }
})();
