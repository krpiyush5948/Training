 function getTime() {
     var Time = new Date();
var hours = Time.getHours();
var Min = Time.getMinutes();
var Sec = Time.getSeconds();
var currentTime = hours + ":" + Min + ":" + Sec;
document.getElementById('time').innerHTML = currentTime;
}

setInterval(getTime, 1000);


