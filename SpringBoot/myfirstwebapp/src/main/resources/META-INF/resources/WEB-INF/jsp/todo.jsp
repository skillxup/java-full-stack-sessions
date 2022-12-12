		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
		
		<%@ include file = "common/header.jspf" %>
		<%@ include file = "common/navigation.jspf" %>
		
		<div class="container">
			<h1>Enter Todo details</h1>
			
			<form:form method="POST" modelAttribute="todo">
				<fieldset class="mb-3">
					<form:label path="description">Description</form:label>
					<form:input type="text" path="description" required="required" />
					<form:errors path="description" cssClass="text-danger" />	
				</fieldset>
				
				<fieldset class="mb-3">
					<form:label path="targetDate">Target Date</form:label>
					<form:input type="text" path="targetDate" required="required" />
					<form:errors path="targetDate" cssClass="text-danger" />	
				</fieldset>
				
				
				<form:input type="hidden" path="id" />
				<form:input type="hidden" path="done" />
				<input type="submit" class="btn btn-success" />
			</form:form>
			
		</div>
		
		<%@ include file = "common/footer.jspf" %>
		<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
		<script>
		$('#targetDate').datepicker({
		    format: 'yyyy-mm-dd'
		});
		</script>