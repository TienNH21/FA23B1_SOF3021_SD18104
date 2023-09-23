<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>

</head>
<body>

<table>
    <thead>
    <tr>
        <td>Mã</td>
        <td>Họ</td>
        <td>Tên đệm</td>
        <td>Tên</td>
        <td>Giới tính</td>
        <td>Ngày sinh</td>
        <td>Địa chỉ</td>
        <td>SDT</td>
        <td colspan="2">Thao tác</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ data }" var="nv">
        <tr>
            <td>${ nv.ma }</td>
            <td>${ nv.ho }</td>
            <td>${ nv.tenDem }</td>
            <td>${ nv.ten }</td>
            <td>${ nv.gioiTinh }</td>
            <td>${ nv.ngaySinh }</td>
            <td>${ nv.diaChi }</td>
            <td>${ nv.sdt }</td>
            <td><a href="/nhan-vien/edit/${nv.ma}">Update</a></td>
            <td><a href="/nhan-vien/delete/${nv.ma}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>