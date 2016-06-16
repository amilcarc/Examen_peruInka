<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Hoteles

<br>
<a href="frmHotel">Nuevo Hotel</a>
<br>

<display:table name="${listHotel}" id="item" class="table">
	<display:column title="Codigo" property="id"/>
	<display:column title="Nombre del Hotel" property="businessName" />
	<display:column title="RUC" property="ruc" />
	<display:column title="Direccion" property="address" />
	<display:column title="Telefono/Celular" property="phone" />
	<display:column title="Usuario" property="person.Id" />
	<display:column title="ROOT" property="root" />
	<display:column title="Estado" property="statusHotel.description" />
	<display:column title="OPC">
		<a href="editHotel?id=${item.id}">Modificar</a>
		<a href="deleteHotel?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>