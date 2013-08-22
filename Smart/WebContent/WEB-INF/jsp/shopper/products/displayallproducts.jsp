<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title> Hi ${command.name} ! Enjoy your one stop shopping solution</title>
        
    </head>
    <body>
        <h2>Let the shopping begin!</h2><br />
        <form:form action="/Smart/shopper/displayallproducts.shopper">
           <table align="center" title="100%">
                <tr>
                	<td><h6>Product<h6></td>
                	<TD><h6>Description<h6><td></td>
                	<td><h6>Add to cart<h6></td>
                </tr>
                <tr>
                	<td><img src="./apple-iphone4.jpg" alt="image not available"/> </td>
                	<TD>Apple iPhone4 <h6><td></td>
                	<td><a href="#">Add to cart</a></td>
                </tr>
                
            </table>
        </form:form>
    </body>
</html>
