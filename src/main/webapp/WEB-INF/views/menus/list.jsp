<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="/img/favicon.png" />
<link rel="stylesheet" href="/css/common.css" />
<script src="https://cdn.jsdelivr.net/npm/browser-scss@1.0.3/dist/browser-scss.min.js"></script>
<style type="text/css">
 td { padding : 10px;  }
      width   : 150px; 
      text-align : center;
      }
 
 tr:first-child {
    background-color: black;
    color: white;
    }
</style>
</head>
<body>
 <main>
 <h2>메뉴 목록</h2>
  <table>
  <tr>
  <td>Menu_id</td>
  <td>Menu_name</td>
  <td>Menu_seq</td>
  </tr>
  <tr>
  <td colspan="3"><a href="/Menus/WriteForm">메뉴등록</a> </td>
  <td> </td>
  <td> </td>
  </tr>
  
  
  
  <c:forEach var="menu" items="${ menuList }" > 
  <tr>
  <td>${ menu.menu_id   }</td>
  <td>${ menu.menu_name }</td>
  <td>${ menu.menu_seq  }</td>
  </tr>
  </c:forEach>
  
  </table>
 
 
 
 </main>
</body>
</html>