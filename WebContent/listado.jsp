<%@page import="com.ipartek.formacion.canciones.pojo.Cancion"%>
<%@page import="java.util.ArrayList"%>

<h1>Listado de Canciones</h1>

//Primera

<%
	ArrayList<Cancion> canciones = (ArrayList<Cancion>) request.getAttribute("listado");
%>
<!-- Primera forma de maquetar + java -->
<%
	out.print("<ol>");
	for (int i = 0; i < canciones.size(); i++) {
		out.print("<li> " + "Titulo :  " + canciones.get(i).getNombre() + "      Artista: "
				+ canciones.get(i).getArtista() + "     Duracion:  " + canciones.get(i).getDuracion()
				+ "</li>");
	}

	out.print("</ol>");
%>

<!-- Segunda forma de maquetar + java -->
<ol>
	<%
		for (Cancion c : canciones) {
	%>
	<li><%=c.getNombre()%> - <%=c.getArtista()%> <b><%=c.getDuracion()%></b></li>
	<%
		}
	%>
</ol>

<h2>Crear Cancion</h2>

<form action="crear" method="post">

	<input type="text" name="nombre"
		placeholder="Escribe el nombre de la cancion" required> 
	<br>
	<br> 
	
	<input type="text" name="artista"
		placeholder="Escribe el nombre del artista" required> 
		
		<br>
	<br> 
	
	<input type="text" name="duracion"
		placeholder="Escribe la duracion de la cancion" required> 
	
	<input type="submit" value="Crear Cancion Nueva">

</form>










