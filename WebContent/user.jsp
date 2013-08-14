<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.thunderfoxes.com/tablibs" prefix="comm" %>

<h1>${pageContext.request.requestURL}</h1>
<h1>${username}</h1>
<h1>${comm:ftd(startTime)}</h1>
<h1>${comm:ftdt(startTime)}</h1>
<h1>${comm:ftt(startTime)}</h1>
