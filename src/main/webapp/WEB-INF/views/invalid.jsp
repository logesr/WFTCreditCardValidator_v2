<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CreditCard-Invalid</title>
	<style>
		#msg{
		  background-color: #ff7c4d;
		  height:200px;
		  align:center;
		}
		h1{
		  align:center;
		}
	</style>
</head>
<body>


		<div id="msg">
			<center>
			<h1>Invalid PAN Entry !!!</h1>
			</center>
		</div>
		<a href="<c:url value="/"/>">Enter Again</a>
</body>
</html>