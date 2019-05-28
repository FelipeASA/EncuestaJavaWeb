<%-- 
    Document   : index
    Created on : 08-04-2019, 11:06:51
    Author     : duoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta</title>
        <link rel="stylesheet" href="css/bootstrap.css"/>
        <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="js/jquery.validate.js"></script>
        
        <script type="text/javascript">
            $(document).ready(function (){
                $("#frm").validate({
                    rules:{
                        
                        p1: "required",
                        p2: "required",
                        obs: "required"
                    },
                    messages:{
                        obs:"Debe ingresar una observación"
                    }
                });
            });
        </script>
    </head>
    <body>
        <h1>Responder encuesta</h1>
        <h3>Seleccione un valor del 1 a 5 según su grado de acuerdo</h3>
        <form id="frm" name="frm" method="POST" action="request.jsp">
            <table class="table table-bordered table-striped">
                <thead></thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Las instalaciones cumplen son confortables</td>
                        <td><input type="radio" name="p1" value="1"/></td>
                        <td><input type="radio" name="p1" value="2"/></td>
                        <td><input type="radio" name="p1" value="3"/></td>
                        <td><input type="radio" name="p1" value="4"/></td>
                        <td><input type="radio" name="p1" value="5"/></td>

                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Los horarios nos permiten desarrollar nuestras tareas</td>
                        <td><input type="radio" name="p2" value="1"/></td>
                        <td><input type="radio" name="p2" value="2"/></td>
                        <td><input type="radio" name="p2" value="3"/></td>
                        <td><input type="radio" name="p2" value="4"/></td>
                        <td><input type="radio" name="p2" value="5"/></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Disponemos de laboratorios para horarios fuera de la clase</td>
                        <td><input type="radio" name="p3" value="1"/></td>
                        <td><input type="radio" name="p3" value="2"/></td>
                        <td><input type="radio" name="p3" value="3"/></td>
                        <td><input type="radio" name="p3" value="4"/></td>
                        <td><input type="radio" name="p3" value="5"/></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Los docentes son puntuales con la entrada</td>
                        <td><input type="radio" name="p4" value="1"/></td>                
                        <td><input type="radio" name="p4" value="2"/></td>
                        <td><input type="radio" name="p4" value="3"/></td>
                        <td><input type="radio" name="p4" value="4"/></td>
                        <td><input type="radio" name="p4" value="5"/></td>
                    <tr/>
                    <tr>
                        <td>5</td>
                        <td>El material compartido cumple los objetivos</td>
                        <td><input type="radio" name="p5" value="1"/></td>
                        <td><input type="radio" name="p5" value="2"/></td>
                        <td><input type="radio" name="p5" value="3"/></td>
                        <td><input type="radio" name="p5" value="4"/></td>
                        <td><input type="radio" name="p5" value="5"/></td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td>Los ejemplos nos aclaran las dudas</td>
                        <td><input type="radio" name="p6" value="1"/></td>
                        <td><input type="radio" name="p6" value="2"/></td>
                        <td><input type="radio" name="p6" value="3"/></td>
                        <td><input type="radio" name="p6" value="4"/></td>
                        <td><input type="radio" name="p6" value="5"/></td>
                    </tr>
                    <tr>
                        <td>7</td>
                        <td>Los PC nos permiten desarrollar bien nuestras actividades de programación</td>
                        <td><input type="radio" name="p7" value="1"/></td>
                        <td><input type="radio" name="p7" value="2"/></td>
                        <td><input type="radio" name="p7" value="3"/></td>
                        <td><input type="radio" name="p7" value="4"/></td>
                        <td><input type="radio" name="p7" value="5"/></td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td>El internet está disponible 100%</td>
                        <td><input type="radio" name="p8" value="1"/></td>
                        <td><input type="radio" name="p8" value="2"/></td>
                        <td><input type="radio" name="p8" value="3"/></td>
                        <td><input type="radio" name="p8" value="4"/></td>
                        <td><input type="radio" name="p8" value="5s"/></td>
                    </tr>
               
                <tr>
                    <td>Observación: </td>
                    <td colspan="6">
                        <textarea class="form-control" id="obs" name="obs"></textarea>
                    </td>
                </tr>
                <td colspan="7">
                <input class ="btn-success" type="submit" value="Enviar"/>
                </td>
                 </tbody>
            </table>
        </form>
    </body>
</html>
