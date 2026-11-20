
fun.js
function ad(a,b){
    return a+b;
}
// let ad =add(5,10);
console.log(ad(5,10));

let add =function(a,b){
    return a+b;
}
// let ad =add(5,10);
console.log(add(5,10));
//console.log(ad);
let sub=(a,b)=>{
    return a-b
}
console.log(sub(5,10));

hello.html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <script src="fun.js"></script>
    
<form action="https://www.google.com" method="post">
    <label for="name">Name :</label>

    <input type="text" id="name" name="name"></input><br></br>

    <label for="email">email :</label>
    <input type="text" id="name" name="name"></input><br></br>
    <label type="text" id="email" name="email"></label><br></br>
    <input type="radio" name="gender" value="male">male</input>
    
    <button type="reset">reset</button>
    <button type="submit">submit</button>



</form>
</body>
</html>


script.html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <script src="script.js"></script>
</body>
</html>


script.js
let age=20;
let nationality= "india";

if(age>=18 && nationality==="india"){
    console.log("eligible");

}else{
    console.log("not eligible");
}


hello.html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>hello</title>
</head>
<body>
    <h1 id="hello">hello world</h1>

    <script>
        let a =document.getElementById("hello");
        a.innerHTML="<h2>hello javascript</h2>";
        a.style.color="red";
    </script>
</body>

</html>










