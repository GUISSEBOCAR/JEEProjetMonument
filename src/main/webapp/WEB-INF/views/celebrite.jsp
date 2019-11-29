<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Celebrite</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<body>
<h1>La France avec ses richesses</h1>

<div>
<f:form modelAttribute="projetForm" method="post" action="recherchescelebrite">
			<table>
				<tr>
					<td>numCelebrite:</td>
					<td><f:input path="numCelebrite"/></td>
					<td><f:errors path="numCelebrite"></f:errors></td>
					<td><input type="submit" value="Recherches" /></td>
				
				</tr>
			</table>
			
		</f:form>
	</div>
	<c:if test="${not empty projetForm.celebrite2 }">	
	<div>
		<table class="table1">
		
		<tr>
			<td> Num Célébrité:</td>
			<td>${projetForm.celebrite2.numCelebrite}</td>
		</tr>
		
		<tr>
			<td>Nom:</td>
			<td>${projetForm.celebrite2.nom}</td>
		</tr>
		
		<tr>
			<td>Prénon:</td>
			<td>${projetForm.celebrite2.prenom}</td>
		</tr>
		
		<tr>
			<td>Epoque:</td>
			<td>${projetForm.celebrite2.epoque}</td>
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
		<f:form modelAttribute="projetForm" action="ajoutOuSupCelebrite">
		<tr>
			<td>Ajouter-Celebrite:<f:radiobutton path="ajoutOuSupCelebrite" value="ajoutCelebrite" onclick="this.form.submit()"/></td>
			<td>Supprimer-Celebrite:<f:radiobutton path="ajoutOuSupCelebrite" value="supprimeCelebrite" onclick="this.form.submit()"/></td>
			<td>AssocieA:<f:radiobutton path="ajoutOuSupCelebrite" value="associeA" onclick="this.form.submit()"/></td>
		</tr>
		<c:if test="${not empty projetForm.ajoutOuSupCelebrite }">
		<tr>
			<c:if test="${projetForm.ajoutOuSupCelebrite=='ajoutCelebrite'}">
					<tr>
						<td>Remplir les champs pour ajouter une Célébrité</td>
						<td>Nom</td>
						<td><f:input path="nom"/></td>
						<td><f:errors path="nom"></f:errors>
						<td>Prénom</td>
						<td><f:input path="prenom"/></td>
						<td><f:errors path="prenom"></f:errors>
						<td>Nationalite</td>
						<td><f:input path="nationalite"/></td>
						<td><f:errors path="nationalite"></f:errors>
						<td>Epoque</td>
						<td><f:input path="epoque"/></td>
						<td><f:errors path="epoque"></f:errors>
				
					</tr>		
			</c:if>	
			<c:if test="${projetForm.ajoutOuSupCelebrite=='supprimeCelebrite'}">
			<tr>
			<td>saisir le numéro de la Célbrité à supprimer</td>
			<td>num célébrite</td>
			<td><f:input path="numCelebrite"/> </td>
			<td><f:errors path="numCelebrite"></f:errors> </td>
			</tr>	
			</c:if>
			<tr>
			
			<c:if test="${projetForm.ajoutOuSupCelebrite=='associeA'}">
			<tr>
			<td>associer une celébrité à un monument</td>
			<td>nom Monument</td>
			<td><f:input path="monument2.codeMonument"/> </td>
			<td><f:errors path="monument2.codeMonument"></f:errors> </td>
			<td>num célébrite</td>
			<td><f:input path="celebrite2.numCelebrite"/> </td>
			<td><f:errors path="celebrite2.numCelebrite"></f:errors> </td>
			</tr>	
			</c:if>
			<tr>
				<td><input type="submit" name="ValiderCelebrite" value="ok"></td>
			</tr>
		</c:if>
		</f:form>
	</div>
		
</body>
</html>