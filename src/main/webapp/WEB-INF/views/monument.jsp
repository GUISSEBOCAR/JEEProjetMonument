<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Monument</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<body>
<h1>La France avec ses richesses</h1>

<div>
	<p> saisir le code pour rechercher un monument</p>
		<f:form modelAttribute="projetForm" method="post" action="recherchesmonument">
			<table>
				<tr>
					<td>nom du Monument:</td>
					<td><f:input path="codeMonument"/></td>
					<td><f:errors path="codeMonument"></f:errors></td>
					<td><input type="submit" value="Recherches" /></td>
				
				</tr>
			</table>
			
		</f:form>
	</div>
	
	
	<c:if test="${not empty projetForm.monument2 }">	
	<div>
	
	<p> Voici les informations sur le Monument</p>
		<table class="table1">
		
		<tr>
			<td> codeMonument:</td>
			<td>${projetForm.monument2.codeMonument}</td>
		</tr>
		
		<tr>
			<td>nomMonument:</td>
			<td>${projetForm.monument2.nomMonument}</td>
		</tr>
		
		<tr>
			<td>proprietaire:</td>
			<td>${projetForm.monument2.proprietaire}</td>
		</tr>
		
		<tr>
			<td>typeMonument:</td>
			<td>${projetForm.monument2.typeMonument}</td>
		</tr>
		<tr>
			<td>longitude :</td>
			<td>${projetForm.monument2.longitude}</td>  
		</tr>
		
		<tr>
			<td> latitude :</td>
			<td>${projetForm.monument2.latitude}</td>    
		</tr>
		
		</table>
	</div>
	<div>
	<table class="table1">
	<tr>
		<th>numCelebrite</th><th>nom</th><th>prenom</th>
		<th>nationalite</th><th>epoque</th>
		
	</tr>
	<c:forEach items="${projetForm.monument}" var="ce">
		<tr>
			<td>${ce.numCelebrite}</td>
			<td>${ce.nom }</td>
			<td>${ce.prenom}</td>
			<td>${ce.nationalite}</td>
			<td>${ce.epoque}</td>
			
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
	
	<P>pour ajouter ou suprimer un monument </P>
	
		<f:form modelAttribute="projetForm" action="ajoutOuSupMonument">
		<tr>
			<td>Ajouter-Monument:<f:radiobutton path="ajoutOuSupMonument" value="ajoutMonument" onclick="this.form.submit()"/></td>
			<td>Supprimer-monument:<f:radiobutton path="ajoutOuSupMonument" value="supprimeMonument" onclick="this.form.submit()"/></td>
		</tr>
		<c:if test="${not empty projetForm.ajoutOuSupMonument }">
		<tr>
			<c:if test="${projetForm.ajoutOuSupMonument=='ajoutMonument'}">
					<tr>
						<td>Remplir les champs pour ajouter le Monument</td>
						<td>code-Monument</td>
						<td><f:input path="codeMonument"/></td>
						<td><f:errors path="codeMonument"></f:errors>
						<td>nom-Monument</td>
						<td><f:input path="nomMonument"/></td>
						<td><f:errors path="nomMonument"></f:errors>
						<td>proprietaire</td>
						<td><f:input path="proprietaire"/></td>
						<td><f:errors path="proprietaire"></f:errors>
						<td>typeMonument</td>
						<td><f:input path="typeMonument"/></td>
						<td><f:errors path="typeMonument"></f:errors>
						<td>longitude</td>
						<td><f:input path="longitude"/></td>
						<td><f:errors path="longitude"></f:errors>	
						<td>latitude</td>
						<td><f:input path="latitude"/></td>
						<td><f:errors path="latitude"></f:errors>	
						<td>Departement-attaché</td>
						<td><f:input path="monument2.localite.codeInsee"/></td>
						<td><f:errors path="monument2.localite.codeInsee"></f:errors>	
				
				
					</tr>		
			</c:if>	
			<c:if test="${projetForm.ajoutOuSupMonument=='supprimeMonument'}">
			<tr>
			<td>saisir le code du monument à supprimer</td>
			<td>code du monument</td>
			<td><f:input path="codeMonument"/> </td>
			<td><f:errors path="codeMonument"></f:errors> </td>
			</tr>	
			</c:if>
			<tr>
				<td><input type="submit" name="ValiderMonument" value="ok"></td>
			</tr>
		</c:if>
		</f:form>
	</div>
	
	<div>
		<f:form modelAttribute="projetForm" method="post" action="distanceMonument">
			<table>
				<tr>
					<td>nom du Monument A:</td>
					<td><f:input path="monumen2.codeMonument.monumentA"/></td>
					<td><f:errors path="codeMonument.monumentA"></f:errors></td>
					<td>nom du Monument B:</td>
					<td><f:input path="monument2.codeMonument.monumentB"/></td>
					<td><f:errors path="monument2.codeMonument.monumentB"></f:errors></td>
					<td><input type="submit" value="Recherches" /></td>
				
				</tr>
			</table>
			
		</f:form>
	</div>
	<c:if test="${not empty projetForm.monument2 }">	
	<div>
	
	<p> Voici les informations sur le Monument</p>
		<table class="table1">
		
		<tr>
			<td> codeMonument:</td>
			<td>${projetForm.distance}</td>
		</tr>
		</table>
		</div>
		</c:if>
	
	

</body>
</html>