apiclient = (function() {

	return {
		getWeatherByCityName : function(id, callback) {
			axios({
				url: "https://openweathermap.org/data/2.5/weather?q="+id+"&appid=332a9b44aa3b26f48c38ccada00e8181",
				method: 'get',
				callback(data);
			  })
			  
	      
		}
	}

})();