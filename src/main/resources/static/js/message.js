/**
 * 
 */
 	const baseUrl = getBaseURL();
	
	document.getElementById('messageForm').addEventListener('submit',function(e){
		e.preventDefault();
		
		const message = {
			message: document.getElementById('message_id').value,
		};
		
		fetch(baseUrl + '/message',{
			method: 'Post',
			headers:{
				'Content-Type':'application/json',
			},
			body:JSON.stringify(message)
		})
		.then(response => {
			if (response.ok){
				alert('메시지가 성공적으로 생성되엇음');
				document.getElementById('messageForm').reset();
			}else{
				alert('메시지 생성에 실패');
			}
		})
		.catch(error => {
			console.error('Error:',error);
			alert('오류가 발생');
		});
		
	});