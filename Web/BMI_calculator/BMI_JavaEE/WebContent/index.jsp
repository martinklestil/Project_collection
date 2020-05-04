<!-- Für Java -->
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>BMI Rechner mit JavaScript</title>
	<link rel="stylesheet" type="text/css" href="./css/index.css" />
</head>
<body>

	<div class="formular">
		<div class="bmi-calculator">
			<h3>Erklärung</h3>
			<p>Ein kleines Projekt um den Einsatz von Java zu zeigen.</p>

		</div>
		<form class="bmi-calculator" action="BMIServlet "method="post">
			<h3>BMI - Rechner</h3>

			<br /> <label for="height">Körpergröße in m:</label> <input
				type="number" id="height" name="height" step="0.01" min="0.50"
				max="4" /> <br /> <label for="weight">Gewicht in kg:</label> <input
				type="number" id="weight" name="weight" step="0.10" min="10"
				max="400" /> <br />
			<button id="calculate">BMI berechnen</button>
		</form>
		<div class="bmi-calculator">
			<h3>BMI Berechnung</h3>
			<p id="bmi">${BMI}</p>

			<div id="weight">${BMIDescription}</div>
		</div>


	</div>
</body>
</html>