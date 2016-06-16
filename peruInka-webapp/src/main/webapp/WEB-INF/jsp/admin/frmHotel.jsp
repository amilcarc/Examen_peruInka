<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">HOTEL</div>
		<div class="span10">


			<legend>Formulario Hotel : ${opc}</legend>
			<form:form commandName="hotel" action="saveHotel" method="POST">

				<input type="text" name="id" id="id" value="${hotel.id}">

				<table>

					<tr>
						<td>Nombre del Hotel:</td>
						<td><form:input path="businessName" id="businessName" />
						<td />
					</tr>

					<tr>
						<td>RUC:</td>
						<td><form:input path="ruc" id="ruc" />
						<td />
					</tr>


					<tr>
						<td>Direccion:</td>
						<td><form:input path="address" id="address" />
						<td />
					</tr>
					<tr>
						<td>Telefono/Celular:</td>
						<td><form:input path="phone" id="phone" />
						<td />
					</tr>
					
					<tr>
						<td>User:</td>
						<td><form:input path="person.Id" id="numDocument" />
						<td />
					</tr>

					<tr>
						<td>Estado</td>
						<td><form:select path="statusHotel.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusHotel}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>
					<tr>
						<td>root</td>
						<td><form:input path="root" id="root" />
						</td>
					</tr>

					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<%-- DNI: <form:input path="dni" id="dni"/><br> --%>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<br>


			</form:form>


		</div>
	</div>
</div>