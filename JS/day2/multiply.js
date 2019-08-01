var clickbutton = document.getElementById("btn");

clickbutton.addEventListener('click', multiply);

function multiply() {
    var value1 = parseInt(document.getElementById("num1").value);
    var value2 = parseInt(document.getElementById("num2").value);
    console.log(value1 * value2);

}