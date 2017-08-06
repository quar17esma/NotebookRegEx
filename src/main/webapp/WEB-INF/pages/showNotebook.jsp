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

<table>

    <thead>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Middle name</th>
        <th>Initials</th>
        <th>Nick</th>
        <th>Commentary</th>
        <th>Group</th>
        <th>Home Phone #</th>
        <th>Mob. Phone #</th>
        <th>Mob. Phone # (Alt.)</th>
        <th>e-mail</th>
        <th>skype</th>
        <th>Post code</th>
        <th>City</th>
        <th>Street</th>
        <th>House #</th>
        <th>Apartment #</th>
        <th>Added</th>
        <th>Last Modified</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${Notebook.notesList}" var="note">
        <tr>
            <td><c:out value="${note.firstName}"/></td>
            <td><c:out value="${note.lastName}"/></td>
            <td><c:out value="${note.middleName}"/></td>
            <td><c:out value="${note.lastNameInitials}"/></td>
            <td><c:out value="${note.nickName}"/></td>
            <td><c:out value="${note.commentary}"/></td>
            <td><c:out value="${note.group.toString()}"/></td>
            <td><c:out value="${note.contacts.phoneNumberHome}"/></td>
            <td><c:out value="${note.contacts.phoneNumberMobile}"/></td>
            <td><c:out value="${note.contacts.phoneNumberMobileAlt}"/></td>
            <td><c:out value="${note.contacts.email}"/></td>
            <td><c:out value="${note.contacts.skype}"/></td>
            <td><c:out value="${note.address.postIndex}"/></td>
            <td><c:out value="${note.address.city}"/></td>
            <td><c:out value="${note.address.street}"/></td>
            <td><c:out value="${note.address.houseNumber}"/></td>
            <td><c:out value="${note.address.apartmentNumber}"/></td>
            <td><c:out value="${note.address.fullAddress}"/></td>
            <td><c:out value="${note.dateNoteAdded}"/></td>
            <td><c:out value="${note.dateNoteLastModified}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>

</body>
</html>
