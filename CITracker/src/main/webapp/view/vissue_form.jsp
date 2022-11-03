<html>
<body>

	<h1>Your Issue is</h1>
	<br>
	<table border="1">
		<tr>
			<th>Issue Id</th>
			<th>Issue Date</th>
			<th>Customer Id</th>
			<th>Category</th>
			<th>Description</th>
			<th>Status</th>
			<th>CC Rep Id</th>
		</tr>
		<tr>
			<td>${issueid}</td>
			<td>${issuedate}</td>
			<td>${cid}</td>
			<td>${issuecat}</td>
			<td>${issuedesc}</td>
			<td>InProgress</td>
			<td>CCR5</td>
		</tr>
	</table>
	<br>
	<a href="http://localhost:8888/hi">Back to Login Page</a>
	<br>
	<a
		href="http://localhost:8888/login?cid=101&cname=Uttam&cadd=Indore&pnum=9111140982&lid=uttam.mewada%40gmail.com&password=uttam123&Submit=Submit">Back
		to Customer Page</a>
	<br>
</body>
</html>