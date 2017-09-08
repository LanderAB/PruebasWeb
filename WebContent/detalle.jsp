<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<h1>Detalle Cancion</h1>

<%
	//recoger ATRIBUTOS
	String msg = (String)request.getAttribute("mensaje");
	Cancion c = (Cancion)request.getAttribute("cancion");

%>

<p style="color:green;"><%=msg %> </p>

<p><%=c.getNombre()%> - <%=c.getArtista()%> - <%=c.getDuracion()%></p>
