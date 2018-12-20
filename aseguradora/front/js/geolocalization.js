// Google Maps Url Example: http://maps.google.com/maps?q=24.197611,120.780512

var options = {
  enableHighAccuracy: true,
  timeout: 5000,
  maximumAge: 0
};

function success(pos) {
  var crd = pos.coords;
  console.log('Your current position is:');
  console.log(`Latitude : ${crd.latitude}`);
  console.log(`Longitude: ${crd.longitude}`);
  console.log(`More or less ${crd.accuracy} meters.`);
  console.log(`Google Maps Url: http://maps.google.com/maps?q=${crd.latitude},${crd.longitude}`);
  document.getElementById("geolocationButton").innerHTML = '<button  class="btn btn-success disabled">Obtenido</button>';
}
function error(err) {
  console.warn(`ERROR(${err.code}): ${err.message}`);
  document.getElementById("geolocationButton").innerHTML = ' <p>Ocurrió un Error ('+ err.code +')</p><button onclick="geolocation()" class="btn btn-warning disabled">Reintentar</button>';
}

function geolocation() {
  navigator.geolocation.getCurrentPosition(success, error, options);
  document.getElementById("geolocationButton").innerHTML = '<button  class="btn btn-warning"><div class="loader"></div></button>';
}
