<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>

</head>
<body>
<h2>Xin chào, ${ nv.ten }</h2>
<form action="/nhan-vien/store" method="POST">
    <div>
        <label>Mã</label>
        <input type="text" name="ma" />
    </div>
    <div>
        <label>Họ</label>
        <input type="text" name="ho" />
    </div>
    <div>
        <label>Tên đệm</label>
        <input type="text" name="tenDem" />
    </div>
    <div>
        <label>Tên</label>
        <input type="text" name="ten" />
    </div>
    <div>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" value="1" /> <label>Nam</label>
        <input type="radio" name="gioiTinh" value="0" /> <label>Nữ</label>
    </div>
    <div>
        <label>Ngày sinh</label>
        <input type="date" name="ngaySinh" />
    </div>
    <div>
        <label>Địa Chỉ</label>
        <input type="text" name="diaChi" />
    </div>
    <div>
        <label>SDT</label>
        <input type="text" name="sdt" />
    </div>
    <div>
        <button>Submit</button>
    </div>
</form>
</body>
</html>