<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lieu</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<body>

<h1>La France avec ses richesses</h1>
<div>
		<f:form modelAttribute="projetForm" method="post" action="rechercheslieu">
			<table>
				<tr>
					<td>codeInsee du Lieu:</td>
					<td><f:input path="codeInsee"/></td>
					<td><f:errors path="codeInsee"></f:errors></td>
					<td><input type="submit" value="Recherches" /></td>
				
				</tr>
			</table>
			
		</f:form>
	</div>
	<c:if test="${not empty projetForm.lieu2 }">	
	<div>
		<table class="table1">
		
		<tr>
			<td> Lieu:</td>
			<td>${projetForm.lieu2.nomCommune}</td>
		</tr>
		
		<tr>
			<td>code Insee:</td>
			<td>${projetForm.lieu2.codeInsee}</td>
		</tr>
		
		<tr>
			<td>Longitude:</td>
			<td>${projetForm.lieu2.logitude}</td>
		</tr>
		
		<tr>
			<td>Latitude:</td>
			<td>${projetForm.lieu2.latitude}</td>
		</tr>
		<tr>
			<td>Numero de département:</td>
			<td>${projetForm.lieu2.dept.numDepartement}</td>
		</tr>
		
		</table>
	</div>
	
	<div>
	<table class="table1">
	<tr>
		<th>codeMonument</th><th>nomMonument</th><th>proprietaire</th>
		<th>typeMonument</th><th>longitude</th>
		<th>latitude</th>
	</tr>
	<c:forEach items="${projetForm.monument}" var="mo">
		<tr>
			<td>${mo.codeMonument}</td>
			<td>${mo.nomMonument }</td>
			<td>${mo.proprietaire}</td>
			<td>${mo.typeMonument}</td>
			<td>${mo.longitude}</td>
			<td>${mo.latitude}</td>
			
			
		</tr>
	</c:forEach>		
	</table>
	</div>
	</c:if>
	<c:if test="${not empty projetForm.exception }">
		<div>
			${projetForm.exception}
		</div>
	</c:if>
	<div>
		<f:form modelAttribute="projetForm" action="ajoutOuSupLieu">
		<tr>
			<td>Ajouter-Lieu:<f:radiobutton path="ajoutOuSupLieu" value="ajoutLieu" onclick="this.form.submit()"/></td>
			<td>Supprimer-Lieu:<f:radiobutton path="ajoutOuSupLieu" value="supprimeLieu" onclick="this.form.submit()"/></td>
		</tr>
		<c:if test="${not empty projetForm.ajoutOuSupLieu }">
		<tr>
			<c:if test="${projetForm.ajoutOuSupLieu=='ajoutLieu'}">
					<tr>
						<td>Remplir les champs pour ajouter le Lieu</td>
						<td>codeInsee</td>
						<td><f:input path="codeInsee"/></td>
						<td><f:errors path="codeInsee"></f:errors>
						<td>nom-Commune</td>
						<td><f:input path="nomCommune"/></td>
						<td><f:errors path="nomCommune"></f:errors>
						<td>logitude</td>
						<td><f:input path="logitude"/></td>
						<td><f:errors path="logitude"></f:errors>
						<td>latitude</td>
						<td><f:input path="latitude"/></td>
						<td><f:errors path="latitude"></f:errors>
						<td>Departement-attaché</td>
						<td><f:input path="lieu2.dept.numDepartement"/></td>
						<td><f:errors path="lieu2.dept.numDepartement"></f:errors>	
				
					</tr>		
			</c:if>	
			<c:if test="${projetForm.ajoutOuSupLieu=='supprimeLieu'}">
			<tr>
			<td>saisir le numéro du département à supprimer</td>
			<td>num De partement</td>
			<td><f:input path="codeInsee"/> </td>
			<td><f:errors path="codeInsee"></f:errors> </td>
			</tr>	
			</c:if>
			<tr>
				<td><input type="submit" name="ValiderLieu" value="ok"></td>
			</tr>
		</c:if>
		</f:form>
	</div>
		
	

</body>
</html>