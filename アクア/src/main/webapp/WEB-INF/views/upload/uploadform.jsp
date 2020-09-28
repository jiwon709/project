<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 업로드</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
   function closeFunc() {
      close();
   }

   function move() {
	  window.opener.name = "parentPage"; //부모창의 이름 설정
	  document.myForm.target = "parentPage"; //타켓을 부모창으로 설정
	  document.myForm.action = "<c:url value='/file'/>";
	  document.myForm.submit();
	  self.close();
	}
</script>	
</head>
<body>
   
   <form name="myForm" method="post" enctype="multipart/form-data">
   <table>
   		<tr>
	   		<td><input type="file" id="uploadfile" name="uploadfile"></td>
	   		<td><input type="submit" value="업로드" onclick="move()"></td>
	   		<td><input type="button" value="취소" onclick="closeFunc()"></td>   
		</tr>
	</table>   
	</form>
	   
</body>
</html>