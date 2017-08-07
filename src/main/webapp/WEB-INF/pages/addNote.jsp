<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <fmt:bundle basename="Labels">
        <title>
            <fmt:message key="add.note"/>
        </title>
    </fmt:bundle>

    <style>
        .field {
            clear: both;
            text-align: right;
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
</head>
<body>
<fmt:bundle basename="Labels">
    <div class="main">
        <form name="addNoteForm" action="controller" method="post">
            <input type="hidden" name="command" value="ADD_NOTE">

            <div class="field">
                <label for="firstName">
                    <fmt:message key="first.name"/>
                </label>
                <input id="firstName" type="text" name="firstName" placeholder="Name"
                       required="required" autofocus="autofocus">
            </div>

            <div class="field">
                <label for="lastName">
                    <fmt:message key="last.name"/>
                </label>
                <input id="lastName" type="text" name="lastName" placeholder="Surname"
                       required="required">
            </div>

            <div class="field">
                <label for="middleName">
                    <fmt:message key="middle.name"/>
                </label>
                <input id="middleName" type="text" name="middleName" placeholder="Middle name"
                       required="required">
            </div>

            <div class="field">
                <label for="nickName">
                    <fmt:message key="nick.name"/>
                </label>
                <input id="nickName" type="text" name="nickName" placeholder="Nick name"
                       required="required">
            </div>

            <div class="field">
                <label for="commentary">
                    <fmt:message key="commentary"/>
                </label><br>
                <textarea id="commentary" name="commentary" placeholder="Commentary" cols="41" wrap="soft"
                          required="required">
            </textarea>
            </div>

            <div class="field">
                <label>
                    <fmt:message key="group"/>
                </label>
                <input type="radio" name="group" value="FRIENDS"> Friends
                <input type="radio" name="group" value="FAMILY"> Family
                <input type="radio" name="group" value="WORK"> Work
            </div>

            <div class="field">
                <label for="homePhoneNumber">
                    <fmt:message key="phone.number.home"/>
                </label>
                <input id="homePhoneNumber" type="tel" name="homePhoneNumber" placeholder="+38(XXX)XXX-XX-XX"
                       required="required"
                       pattern="[\+]38[\(]\d{3}[\)]\d{3}[\-]\d{2}[\-]\d{2}"
                       title="Phone number format +38(XXX)XXX-XX-XX">
            </div>

            <div class="field">
                <label for="mobilePhoneNumber">
                    <fmt:message key="phone.number.mobile"/>
                </label>
                <input id="mobilePhoneNumber" type="tel" name="mobilePhoneNumber" placeholder="+38(XXX)XXX-XX-XX"
                       required="required"
                       pattern="[\+]38[\(]\d{3}[\)]\d{3}[\-]\d{2}[\-]\d{2}"
                       title="Phone number format +38(XXX)XXX-XX-XX">
            </div>

            <div class="field">
                <label for="mobilePhoneNumberAlt">
                    <fmt:message key="phone.number.mobile.alt"/>
                </label>
                <input id="mobilePhoneNumberAlt" type="tel" name="mobilePhoneNumberAlt" placeholder="+38(XXX)XXX-XX-XX"
                       required="required"
                       pattern="[\+]38[\(]\d{3}[\)]\d{3}[\-]\d{2}[\-]\d{2}"
                       title="Phone number format +38(XXX)XXX-XX-XX">
            </div>

            <div class="field">
                <label for="email">
                    <fmt:message key="email"/>
                </label>
                <input id="email" type="email" name="email" placeholder="e-mail" required="required">
            </div>

            <div class="field">
                <label for="skype">
                    <fmt:message key="skype"/>
                </label>
                <input id="skype" type="text" name="skype" placeholder="skype" required="required">
            </div>

            <div class="field">
                <label for="postIndex">
                    <fmt:message key="post.index"/>
                </label>
                <input id="postIndex" type="text" name="postIndex" placeholder="Post index"
                       required="required">
            </div>

            <div class="field">
                <label for="city">
                    <fmt:message key="city"/>
                </label>
                <input id="city" type="text" name="city" placeholder="City" required="required">
            </div>

            <div class="field">
                <label for="street">
                    <fmt:message key="street"/>
                </label>
                <input id="street" type="text" name="street" placeholder="Street" required="required">
            </div>

            <div class="field">
                <label for="houseNumber">
                    <fmt:message key="house"/>
                </label>
                <input id="houseNumber" type="text" name="houseNumber" placeholder="House number"
                       required="required">
            </div>

            <div class="field">
                <label for="apartmentNumber">
                    <fmt:message key="apartment"/>
                </label>
                <input id="apartmentNumber" type="text" name="apartmentNumber"
                       placeholder="Apartment number" required="required">
            </div>

            <br>
            <input class="button" type="submit" value="Submit">

        </form>
    </div>
</fmt:bundle>
</body>
</html>
