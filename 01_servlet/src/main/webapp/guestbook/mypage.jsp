<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 방 명 록 </title>
<script type="text/javascript">
	function save_go(f) {
		// 검사
		f.action = "/01_servlet/Guest";
		f.submit();
	}
</script>
<style type="text/css">
	a { text-decoration: none;}
	table{width: 600px; border-collapse:collapse; text-align: center;}
	table,th,td{border: 1px solid black; padding: 3px}
	div{width: 600px; margin:auto; text-align: center;}
</style>


</head>
<body>
	<div>
		<h2>${name} 님 환영합니다.</h2>
		<hr />
		<input type="button" value="마이페이지"   onclick="mypage_go(this.form)" />
		<form method="post">
			<table>
				<tr align="center">
					<td bgcolor="#99ccff">비밀번호</td>
					<td><input type="password" name="pwd" size ="20"/></td>
				</tr>
				
				<tfoot>
					<tr align="center">
						<td colspan="2">
							<input type="hidden" name="cmd" value="write_ok">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="취소" />
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>