<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<title>Accueil</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<body>
	<h1>La France avec ses richesses</h1>
	<div>
	<p> saisir le code pour rechercher un Département</p>
		<f:form modelAttribute="projetForm" method="post" action="recherchesdep">
			<table>
				<tr>
					<td>numero Departement:</td>
					<td><f:input path="numDepartement"/></td>
					<td><f:errors path="numDepartement"></f:errors></td>
					<td><input type="submit" value="Recherches" /></td>
				
				</tr>
			</table>
			
		</f:form>
	</div>
	
	<c:if test="${not empty projetForm.departement }">	
	
	<div>
	<p> Les informations sur le Département</p>
		<table class="table1">
		
		<tr>
			<td> departement:</td>
			<td>${projetForm.departement.nomDepartement}</td>
		</tr>
		
		<tr>
			<td>Chef Lieu:</td>
			<td>${projetForm.departement.chefLieu}</td>
		</tr>
		
		<tr>
			<td>Région:</td>
			<td>${projetForm.departement.region}</td>
		</tr>
		
		</table>
	</div>
	
	
	
	<div>
	<p> Voci les Lieux situé dans le departement</p>
	<table class="table1">
	<tr>
		<th>Code insee</th><th>nom de la commune</th><th>Latitude</th><th>Longitude</th>
	</tr>
	<c:forEach items="${projetForm.lieu}" var="li">
		<tr>
			<td>${li.codeInsee}</td>
			<td>${li.nomCommune }</td>
			<td>${li.latitude}</td>
			<td>${li.logitude}</td>
			
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
		<f:form modelAttribute="projetForm" action="ajoutOuSupDept">
		<tr>
			<td>Ajouter-département:<f:radiobutton path="ajoutOuSupDept" value="ajout" onclick="this.form.submit()"/></td>
			<td>Supprimer-département:<f:radiobutton path="ajoutOuSupDept" value="supprime" onclick="this.form.submit()"/></td>
		</tr>
		<c:if test="${not empty projetForm.ajoutOuSupDept }">
		<tr>
			<c:if test="${projetForm.ajoutOuSupDept=='ajout'}">
					<tr>
						<td>Remplir les champs pour ajouter le département</td>
						<td>numDepartement</td>
						<td><f:input path="numDepartement"/></td>
						<td><f:errors path="numDepartement"></f:errors>
						<td>chef Lieu</td>
						<td><f:input path="chefLieu"/></td>
						<td><f:errors path="chefLieu"></f:errors>
						<td>nomDepartement</td>
						<td><f:input path="nomDepartement"/></td>
						<td><f:errors path="nomDepartement"></f:errors>
						<td>region</td>
						<td><f:input path="region"/></td>
						<td><f:errors path="region"></f:errors>	
				
					</tr>		
			</c:if>	
			<c:if test="${projetForm.ajoutOuSupDept=='supprime'}">
			<tr>
			<td>saisir le numéro du département à supprimer</td>
			
			<td>num De partement</td>
			<td><f:input path="numDepartement"/> </td>
			<td><f:errors path="numDepartement"></f:errors> </td>
			</tr>	
			</c:if>
			<tr>
				<td><input type="submit" name="Valider" value="ok"></td>
			</tr>
		</c:if>
		</f:form>
	</div>
		
</body>
</html>
