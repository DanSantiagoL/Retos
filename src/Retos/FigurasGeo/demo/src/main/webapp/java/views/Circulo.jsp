<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Circulo</title>
    <link rel="stylesheet" type="text/css" href="../css/Estilos.css">
</head>
<body>
    <ul class="menuPrincipal">
    <a href="Decagono.jsp"><img id = "flechaIzquierda" src="../Assets/flechaIzquierda.png" alt="Icono flechaIzquierda" width="50px" ></a>
    <li><b><a href="../../index.jsp" >Menu Principal</a></b></li>
    <li><b><a href="Octagono.jsp" >Calcular Octágono</a></b></li>
    <li><b><a href="Decagono.jsp" >Calcular Decágono</a></b></li>
    <li><b><u><a href="" >Calcular Círculo</a></u></b></li>
    </ul>
    
    <hr>
    <h2 >Calcular medidas de un Círculo</h2>
    <br>
    
    <form>
        <div style="text-align:center">
        <img id= "figura" src="../Assets/Circulo.png" alt="Icono Circulo" width="330"> 
        <br><br><br><br><br><br>
        <h4>Ingrese la medida del radio del Círculo:
        <input type="text" size="10" id ="radioCirculo"></h4>
        <br><br><br>
       <input type="submit" value = "Enviar" class="botonEnviar" onclick="Calcular();">
    </form>

</body>
    <script type="text/javascript">
        function Calcular()
        {
            var Numero1=parseFloat(document.getElementById('radioCirculo').value);
            var area;
            var perimetro;
            area = 3.1415*Numero1*Numero1;
            perimetro = 2*3.1415*Numero1;
            alert("El area del circulo es de: " + area + "\nY su perimetro de: " + perimetro);
        }

    </script>
</html>