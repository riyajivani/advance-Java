<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL example</title>
    </head>
    <body>
        <h1>This is JSTL page!</h1>
        
        <!--1. out tag to print variable-->
        
        <!--2. set tag  to create variable-->
        
        <c:set var="i" value="230" scope="application"></c:set>
        <h1><c:out value="${i}"></c:out></h1>
        
        
        <!--3. remove-->
        
        <%--<c:remove var="i"></c:remove>--%>
        
        <h1><c:out value="${i}"></c:out></h1>
        
        <hr>
        
        <!--4. if: true=>print-->
        
        <c:if test="${i>23}">
            <h1>yes condition is true...i>23</h1>
        </c:if>
            
        <!-- 5. for switch in java use choose,when,otherwise together here-->
            
        <c:choose>
            <c:when test="${i>0}">
                <h3>the number is positive</h3>
            </c:when>
                
            <c:when test="${i<0}">
                <h3>the number is negative</h3>
            </c:when>
                
            <c:otherwise>
                <h3>default...the number is zero</h3>   
            </c:otherwise>   
        </c:choose>
                
        <!--6.for each:for repeat something-->
        
        <c:forEach var="j" begin="1" end="10">
            <h4>value of j is <c:out value="${j}"></c:out></h4>
        </c:forEach>
            
            <!--7. redirect-->
            
        <%--<c:redirect url="https://www.youtube.com/"></c:redirect>--%>
        
        <!--8. param tag-->
        
        <c:url var="myURL" value="https://www.youtube.com/">
            <c:param name="q" value="Java Learning"></c:param>
        </c:url>
        
        </<h1><c:out value="${myURL}"></c:out></h1>
        
        <c:redirect url="${myURL}"></c:redirect>
        
    </body>
</html>
