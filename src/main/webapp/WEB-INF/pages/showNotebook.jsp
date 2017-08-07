<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }

        .button {
            width: 100px;
        }

    </style>

    <title>Show Notebook</title>
</head>
<body>
<c:forEach items="${Notebook.notesList}" var="note">
    Name: <c:out value="${note.firstName}"/><br/>
    Surname: <c:out value="${note.lastName}"/><br/>
    Middle name: <c:out value="${note.middleName}"/><br/>
    Initials: <c:out value="${note.lastNameInitials}"/><br/>
    Nick: <c:out value="${note.nickName}"/><br/>
    Commentary: <c:out value="${note.commentary}"/><br/>
    Group: <c:out value="${note.group.toString()}"/><br/>
    Home Phone #: <c:out value="${note.contacts.phoneNumberHome}"/><br/>
    Mob. Phone #: <c:out value="${note.contacts.phoneNumberMobile}"/><br/>
    Mob. Phone # (Alt.): <c:out value="${note.contacts.phoneNumberMobileAlt}"/><br/>
    e-mail: <c:out value="${note.contacts.email}"/><br/>
    skype: <c:out value="${note.contacts.skype}"/><br/>
    Post code: <c:out value="${note.address.postIndex}"/><br/>
    City: <c:out value="${note.address.city}"/><br/>
    Street: <c:out value="${note.address.street}"/><br/>
    House #; <c:out value="${note.address.houseNumber}"/><br/>
    Apartment #: <c:out value="${note.address.apartmentNumber}"/><br/>
    Full address: <c:out value="${note.address.fullAddress}"/><br/>
    <br/>
    Added: <c:out value="${note.dateNoteAdded}"/><br/>
    Last Modified: <c:out value="${note.dateNoteLastModified}"/><br/>
    <hr>
    </c:forEach>
<br>

</body>
</html>
