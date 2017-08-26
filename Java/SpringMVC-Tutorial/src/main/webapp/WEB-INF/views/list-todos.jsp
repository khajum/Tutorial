<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<table class="table table-stripped">
		<caption><spring:message code="todo.caption" /></caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th>Is Completed?</th>
				<th></th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<th>${todo.desc}</th>
					<th><fmt:formatDate pattern="dd/MM/YYYY"
							value="${todo.targetDate}" /></th>
					<th><c:out value="${todo.done?'Yes':'No'}"></c:out></th>
					<th><a type="button" class="btn btn-primary"
						href="./update-todo?id=${todo.id}">Update</a> <a type="button"
						class="btn btn-warning" href="./delete-todo?id=${todo.id}">Delete</a></th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div>
	<a type="button" class="btn btn-success" href="./add-todo">Add</a>
</div>

<%@ include file="common/footer.jsp"%>