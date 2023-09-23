<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

</head>
<body>
<h2>Xin chào, ${ nv.ten }</h2>
<sf:form action="/nhan-vien/update/${ nv.ma }" method="POST"
         modelAttribute="nv">
    <div>
        <label>Mã</label>
        <span style="color: #ff0000">*</span>
        <sf:input type="text" name="ma" path="ma" />
        <sf:errors path="ma" cssStyle="color: #ff0000" />
    </div>
    <div>
        <label>Họ</label>
        <sf:input type="text" name="ho" path="ho" />
    </div>
    <div>
        <label>Tên đệm</label>
        <sf:input type="text" name="tenDem" path="tenDem" />
    </div>
    <div>
        <label>Tên</label>
        <sf:input type="text" name="ten" path="ten" />
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="1" /> <label>Nam</label>
        <input type="radio" name="gioiTinh" value="0" /> <label>Nữ</label>
    </div>
    <div>
        <label>Ngày sinh</label>
        <sf:input type="date" name="ngaySinh" path="ngaySinh" />
    </div>
    <div>
        <label>Địa Chỉ</label>
        <sf:input type="text" name="diaChi" path="diaChi" />
    </div>
    <div>
        <label>SDT</label>
        <sf:input type="text" name="sdt" path="sdt" />
    </div>
    <div>
        <button>Submit</button>
    </div>
</sf:form>
</body>
</html>