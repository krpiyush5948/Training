var clickbutton=document.getElementById("btn");

clickbutton.addEventListener('click',multiply);

function multiply(){
    var val1 = parseInt(document.getElementById("num1").value);
    var val2 = parseInt(document.getElementById("num2").value);
    console.log(val1*val2);
    
}
