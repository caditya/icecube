<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Great Shopping!</title>
    <link rel="stylesheet" href="<spring:theme code="style"/>" type="text/css" />    
    </head>
    <body>
    Current Locale : ${pageContext.response.locale}
        <table>
    <tbody>
        <tr><td>Change Theme:</td><td><form name="themeChangeForm" method="get">
            <select name="theme" onchange="submitform()">
                <option selected="selected">--</option>
                <option value="default">Default</option>
                <option value="blue">Blue</option>
                <option value="black">Black</option>
            </select>
            <input type='text' name='lang' value="nl"/>
         </form></td></tr>
    </tbody>
</table>

<script type="text/javascript">
function submitform()
{
document.themeChangeForm.submit();
}
</script>
        
        <h2>Let the shopping begin!</h2><br />
        <form:form action="/Smart/shopper/displayallproducts.shopper">
        ${command.name}
           <table>
                <tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
                <tr><td><spring:message code='shopper.name'/>: </td>
                <td><form:input path="name" /></td></tr>
                <tr><td colspan="2"><input type="submit" value="Enjoy!" /></td></tr>
            </table>
        </form:form>
    </body>
</html>
