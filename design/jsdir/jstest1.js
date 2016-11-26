/**
 * Created by zihua on 16-11-26.
 */
function changeColor(){
    element=document.getElementById("off_pic");
    if(element.src.match("bulboff")){
        element.src="images/pic_bulbon.gif";
    }
    else{
        element.src="images/pic_bulboff.gif";
    }
}

function frontcolor() {
    element=document.getElementById("fronts");
    element.style.color="#ee0000";
}

function checkNumber(){
    var x=document.getElementById("inputs");
    if(x==""||isNaN(x)){
        alert("sb");
    }
}

function writerdoc(){
    document.write("haha");
}

function drawsome(){



}