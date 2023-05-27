function checkPwd(){
	var id=document.getElementById("id").value;
	var name=document.getElementById("name").value;
	var mail=document.getElementById("mail").value;
	var dob=document.getElementById("dob").value;
	var nat=document.getElementById("nat").value;
	var gen=document.getElementById("gen").value;
	var cond=document.getElementById("cond").value;
	var pwd=document.getElementById("pwd").value;
	var cPwd=document.getElementById("cpwd").value;
	var msg=document.getElementById("msg");
	
	
	if (pwd.length!=0 && cPwd.length!=0  ){
		if(pwd==cPwd){
			
			return true;
		}
		else{
			alert("passwords do not match");
			return false;
		}
	}
	
	else{
	     alert("you cannot leave any inputs empty")
		return false;
	}
	
}