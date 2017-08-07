<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%--<fmt:setLocale value="ru_RU" />--%>
<fmt:setBundle basename="Labels"/>
<!DOCTYPE html>
<html>
<head>
    <style>
        .field {
            clear: both;
            text-align: left;
            line-height: 25px;
        }

        label {
            float: left;
            padding-right: 10px;
        }

        .button {
            width: 100px;
        }

        .main {
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;
        }
    </style>

    <title>Show Notebook
        <fmt:message key="show.notebook"/>
    </title>
</head>
<body>
    <br>
    <form name="inputNoteForm" action="controller" method="post">
        <input type="hidden" name="command" value="INPUT_NOTE">
        <input class="button" type="submit" value="Add new note">
    </form>
    <br/>
    <c:forEach items="${Notebook.notesList}" var="note">
        <div class="field">
            <label><fmt:message key="first.name"/></label>
            <c:out value="${note.firstName}"/>
        </div>
        <div class="field">
            <label><fmt:message key="last.name"/></label>
            <c:out value="${note.lastName}"/>
        </div>
        <div class="field">
            <label><fmt:message key="middle.name"/></label>
            <c:out value="${note.middleName}"/>
        </div>
        <div class="field">
            <label><fmt:message key="last.name.initials"/></label>
            <c:out value="${note.lastNameInitials}"/>
        </div>
        <div class="field">
            <label><fmt:message key="nick.name"/></label>
            <c:out value="${note.nickName}"/>
        </div>
        <div class="field">
            <label><fmt:message key="commentary"/></label>
            <c:out value="${note.commentary}"/>
        </div>
        <div class="field">
            <label><fmt:message key="group"/></label>
            <c:out value="${note.group.toString()}"/>
        </div>
        <div class="field">
            <label><fmt:message key="phone.number.home"/></label>
            <c:out value="${note.contacts.phoneNumberHome}"/>
        </div>
        <div class="field">
            <label><fmt:message key="phone.number.mobile"/></label>
            <c:out value="${note.contacts.phoneNumberMobile}"/>
        </div>
        <div class="field">
            <label><fmt:message key="phone.number.mobile.alt"/></label>
            <c:out value="${note.contacts.phoneNumberMobileAlt}"/>
        </div>
        <div class="field">
            <label><fmt:message key="email"/></label>
            <c:out value="${note.contacts.email}"/>
        </div>
        <div class="field">
            <label><fmt:message key="skype"/></label>
            <c:out value="${note.contacts.skype}"/>
        </div>
        <div class="field">
            <label><fmt:message key="post.index"/></label>
            <c:out value="${note.address.postIndex}"/>
        </div>
        <div class="field">
            <label><fmt:message key="city"/></label>
            <c:out value="${note.address.city}"/>
        </div>
        <div class="field">
            <label><fmt:message key="street"/></label>
            <c:out value="${note.address.street}"/>
        </div>
        <div class="field">
            <label><fmt:message key="house"/></label>
            <c:out value="${note.address.houseNumber}"/>
        </div>
        <div class="field">
            <label><fmt:message key="apartment"/></label>
            <c:out value="${note.address.apartmentNumber}"/>
        </div>
        <div class="field">
            <label><fmt:message key="address.full"/></label>
            <c:out value="${note.address.fullAddress}"/>
        </div>
        <div class="field">
            <label><fmt:message key="date.note.added"/></label>
            <c:out value="${note.dateNoteAdded}"/>
        </div>
        <div class="field">
            <label><fmt:message key="date.note.last.modified"/></label>
            <c:out value="${note.dateNoteLastModified}"/>
        </div>
        <hr>

    </c:forEach>

</body>
</html>
