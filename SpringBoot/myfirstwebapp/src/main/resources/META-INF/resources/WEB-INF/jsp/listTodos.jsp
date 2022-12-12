		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		
		<%@ include file = "common/header.jspf" %>
		<%@ include file = "common/navigation.jspf" %>
		
		<div class="container">
			<h1>Welcome ${name}</h1>
		
			<table class="table">
				<thead>
					<tr>
						<th>Id</th>
						<th>Description</th>
						<th>Target Date</th>
						<th>Is Done?</th>
						<th colspan="2">Actions</th>
					</tr>
				</thead>
				
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr>
							<td>${todo.id}</td>
							<td>${todo.description}</td>
							<td>${todo.targetDate}</td>
							<td>${todo.done}</td>
							<td>
								<a href="update-todo?id=${todo.id}" class="btn btn-info">Update</a>
							</td>
							<td>
								<a href="delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<hr />
			
			<a href="add-todo" class="btn btn-success">add todo</a>
		</div>
		
		<%@ include file = "common/footer.jspf" %>