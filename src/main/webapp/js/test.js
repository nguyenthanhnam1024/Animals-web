
function loaddata(){
	var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function(){
	    if(xhr.readyState === XMLHttpRequest.DONE){
		    document.getElementById('output').innerHTML = xhr.responseText;
	    }
   };
   xhr.open('GET', '/Animals/ServletSelectAllImageAnimals')
   xhr.send();
}
$(document).ready(function(){
	 
    		$('#send').onclick(function(){
    			$.ajax({
    				url : '/Animals/views/InsertIAnimal.jsp',
    				method : 'post',
    				data : {
    					id : $('#id').val(),
    					ten : $('#ten').val(),
    					url : $('#url').val(),
    					lop : $('#lop').val()
    				},
    				success : function(res){
    					document.getElementById('nhan').innerHTML += `res`
    				}
    			})
    		})
    	})

