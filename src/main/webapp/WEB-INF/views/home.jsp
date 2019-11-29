<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<title>Gestion du territoire - Home</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style1.css">
</head>
<body>
	<h1>Ma France et ses richesses</h1>
	<div>
		<f:form action="departement">
			<input type="submit" value="Gestion des Département"/>
		</f:form>
	</div>
	
	<div>
		<f:form action="lieu">
			<input type="submit" value="Gestion des Lieux" />
		</f:form>
	</div>
	<div>
		<f:form action="monument">
			<input type="submit" value="Gestion des Monuments" />
		</f:form>
	</div>
	<div>
		<f:form action="celebrite">
			<input type="submit" value="Gestion des Célébrités" />
		</f:form>
	</div>
</body>
</html>
