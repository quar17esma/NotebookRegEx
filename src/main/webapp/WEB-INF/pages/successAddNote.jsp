<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--<fmt:setLocale value="ru_RU" />--%>
<fmt:setBundle basename="Labels"/>
<html>
<head>
    <title><fmt:message key="title.note.add.success"/></title>
</head>
<body>

    <div class="main">
        <p><fmt:message key="note.add.success"/></p><br/>

        <form name="showNotebookForm" action="controller" method="post">
            <input type="hidden" name="command" value="SHOW_NOTEBOOK">
            <input class="button" type="submit" value="Show notebook">
        </form>

        <form name="inputNoteForm" action="controller" method="post">
            <input type="hidden" name="command" value="INPUT_NOTE">
            <input class="button" type="submit" value="Add new note">
        </form>

    </div>

</body>
</html>
