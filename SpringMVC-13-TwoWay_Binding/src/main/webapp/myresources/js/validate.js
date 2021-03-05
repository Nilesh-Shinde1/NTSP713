function validate(){
//	alert("alert..1!");
//	document.getElementById("bookName").innerHtml="This is the name"
////	alert(!frm.bookId.value);
//	document.getElementById("bookId").innerHtml="";
//	document.getElementById("bookName").innerHtml="";
//	document.getElementById("bookPrn").innerHtml="";
//	document.getElementById("bookAuthors").innerHtml="";
//	document.getElementById("bookPrice").innerHtml="";
//	document.getElementById("bookQty").innerHtml="";
	
	let id=frm.bookId.value;
	var x = document.forms["bookForm"]["sname"].value;
	alert(x);
	  
	let name=frm.bookName.value;
	let prn=frm.bookPrn.value;
	let authors=frm.bookAuthors.value;
	let price=frm.bookPrice.value;
	let qty=frm.bookQty.value;
	alert(id);
	if(!id){
		alert("id is null")
		document.getElementById("bookId").innerHtml = "Id is required";
		alert(document.getElementById("bookId").innerHtml);
	}
	if(!name){
		document.getElementById("bookName").innerHTML = "Name is required";
		alert(document.getElementById("bookName").innerHTML);
	}
	if(!prn){
		document.getElementById("bookPrn").innerHTML = "PRN is required";
	}
	if(!authors){
		document.getElementById("bookAuthors").innerHTML = "Authors is required";
	}
	
	console.log("done",document.getElementById("bookId").innerHtml);
}