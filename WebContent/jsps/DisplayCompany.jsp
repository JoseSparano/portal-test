<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>
<%@taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@taglib
	uri="http://www.ibm.com/xmlns/prod/websphere/portal/v6.1/portlet-client-model"
	prefix="portlet-client-model"%><portlet-client-model:init>
	<portlet-client-model:require module="ibm.portal.xml.*" />
	<portlet-client-model:require module="ibm.portal.portlet.*" />
</portlet-client-model:init>
<portlet:defineObjects />
<p>Este es un hola mundo de Porlet con Pragma! :)</p>

Los datos de la compañia son:
Nombre: ${company.companyName}
address1: ${company.address1}
address2: ${company.address2}
city: ${company.city}
state: ${company.state}
zip: ${company.zip}
country: ${company.country}

