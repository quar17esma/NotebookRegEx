<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Note successfully added</title>
</head>
<body>

    <div class="main">

        Your note is successfully add to notebook.<br/>

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
