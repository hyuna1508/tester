function check_join(){
	

	var pwd= document.getElementById("memPwd").value;
	//비밀번호 자리수 확인
	if(pwd.length<8||pwd.length>30){
		document.getElementById("memPwd").value='';
		document.getElementById("lenpw").innerHTML="비밀번호는 8글자 이상, 30글자 이하만 사용가능합니다."
	}
	
	//비밀번호 일치 확인
	  if(document.getElementById("memPwd").value !='' && document.getElementById("ckmemPwd").value!=''){
          if(document.getElementById("memPwd").value==document.getElementById("ckmemPwd").value){
              document.getElementById("ckpw").innerHTML="비밀번호가 일치합니다."
              document.getElementById("ckpw").style.color="black";
              }
          else{
              document.getElementById("ckpw").innerHTML="비밀번호가 일치하지 않습니다.";
              document.getElementById("ckpw").style.color="red";
              }
          }
}

		

