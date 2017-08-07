<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Note successfully added</title>
</head>
<body>
    Your note is successfully add to notebook.
    <br/>
    <a href='../addNote.jsp'>Add new Note</a>

    <div class="main">
        <form name="showNotebookForm" action="controller" method="post">
            <input type="hidden" name="command" value="SHOW_NOTEBOOK">
            <br>
            <input class="button" type="submit" value="Show notebook">
        </form>
        <%--<form name="addNoteForm" action="controller" method="post">--%>
            <%--<input type="hidden" name="command" value="">--%>
            <%--<br>--%>
            <%--<input class="button" type="submit" value="Show notebook">--%>
        <%--</form>--%>
    </div>

</body>
</html>
