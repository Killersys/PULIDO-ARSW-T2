var app = (function () {

var getRequest = function (url,callback) {
        console.log("get");
        $.get(url,callback)
    }

    var postRequest= function(url, roomInfo){
        $.post(url,roomInfo);
    }
    return {
        getWeatehr: function(name,callback){getRequest("/city/"+name,callback)} ,
        /*getRooms: function(callback){getRequest("/api/rooms",callback)},
        getUserById: function (userId,callback) {getRequest("/api/users/"+userId,callback)},
        getRoomById: function (roomId,callback) {getRequest("/api/rooms/"+roomId,callback)},
        getCurrentUserId: function (callback) {getRequest("/api/users/me",callback)}*/
    }
})();