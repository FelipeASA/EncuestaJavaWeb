<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
try{
String p1=request.getParameter("p1");
String p2=request.getParameter("p2");
String p3=request.getParameter("p3");
String p4=request.getParameter("p4");
String p5=request.getParameter("p5");
String p6=request.getParameter("p6");
String p7=request.getParameter("p7");
String p8=request.getParameter("p8");
String obs =request.getParameter("obs");

out.print("p1: "+ p1 +"<br>");
out.print("p2: "+ p2 +"<br>");
out.print("p3: "+ p3 +"<br>");
out.print("p4: "+ p4 +"<br>");
out.print("p5: "+ p5 +"<br>");
out.print("p6: "+ p6 +"<br>");
out.print("p7: "+ p7 +"<br>");
out.print("p8: "+ p8 +"<br>");
if(!obs.equalsIgnoreCase("")){
    out.print("obs: "+ obs +"<br>");
}


}catch(Exception ex){
    
}




%>
<a href="index.jsp">Volver a la encuesta</a>