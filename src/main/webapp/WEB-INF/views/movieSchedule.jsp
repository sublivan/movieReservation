<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2021-04-22
  Time: 오후 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="css/movieSchedule.css"/>
    <title>Title</title>
</head>

<body>

<div class="container">
    <section>
        <h2> 상영중인 영화</h2>
        <div class="row">
            <c:forEach var="movieSchedule" items="${movieSchedules}">
            <div class="movieInfo">
                <div class="row">
                    <img src="/resources/poster/${movieSchedule.title}.jpg" class="poster" alt="movie poster">
                </div>
                <div class="row">
                    <div class="col">
                            ${movieSchedule.title}
                    </div>
                </div>

                <div class="row">
                    <div class="col">
                            ${movieSchedule.screenRoom.name} / 총 좌석 : ${movieSchedule.screenRoom.seats}
                    </div>
                </div>
                <br/>
                <div class="row">
                    <span>예약가능시간</span>
                    <c:forEach var="schedule" items="${movieSchedule.schedules}">
                        <form action="/bookDetail" method="get">
                            <input type="hidden" name="scheduleId" value="${schedule.id}">
                            <button type="submit">${schedule.time}</button>
                        </form>
                    </c:forEach>
                </div>
                <br/>

            </div>
            </c:forEach>
    </section>
</div>

</body>
</html>
