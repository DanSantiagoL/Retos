<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Decagono</title>
    <link rel="stylesheet" type="text/css" href="../css/Estilos.css">
</head>
<body>
    <ul class="menuPrincipal">
    <a href="Octagono.jsp"><img id = "flechaIzquierda" src="../Assets/flechaIzquierda.png" alt="Icono flechaIzquierda" width="50px" ></a>
    <li><b><a href="../../index.jsp" >Menu Principal</a></b></li>
    <li><b><a href="Octagono.jsp" >Calcular Octágono</a></b></li>
    <li><b><u><a href="" >Calcular Decágono</a></u></b></li>
    <li><b><a href="Circulo.jsp" >Calcular Círculo</a></b></li>
    <a href="Circulo.jsp"><img id = "flechaDerecha" src="../Assets/flechaDerecha.png" alt="Icono flechaDerecha" width="50px" ></a>
    </ul>
    
    <hr>
    <h2 id="CalcularDecagono">Calcular medidas de un Decágono</h2>
    <br>
    
    <form>
        <div style="text-align:center">
        <img id= "figura" src="../Assets/Decagono.png" alt="Icono Decagono" width="330"> 
        <br><br><br>
        <h4>Ingrese la medida de un lado del Decágono:
        <input type="text" size="10" id="lado"></h4>
        <br><br><br>
       <h4>Ingrese la medida del apotema del Decágono:
        <input type="text" size="10" id="apotema"></h4>
        
        
        <input type="submit" value = "Enviar" class="botonEnviar" onclick="Calcular();"> 
    </form>
    
</body>
<script type="text/javascript">
    function Calcular()
    {
        var Numero1=parseFloat(document.getElementById('lado').value);
        var Numero2=parseFloat(document.getElementById('apotema').value);
        var area;
        var perimetro;
        area = 5*Numero2*Numero1;
        perimetro = 10*Numero1;
        alert("El area del decagono es de: " + area + "\nY su perimetro de: " + perimetro);
    }

</script>
</html>