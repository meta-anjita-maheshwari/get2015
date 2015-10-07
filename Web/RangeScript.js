/*Function for creating matrix of no+1 X 3, where no=number of rows entered*/
function createMatrix() {
    no = document.getElementById("number").value;
    document.write("<link rel='stylesheet' href='Style.css' type='text/css'>");
	document.write("<section><table><tr><th>Name</th><th>min</th><th>max</th></tr>");
	for(i=0;i<no;i++){
		document.write("<tr><td><input id='num"+i+"0' type='text'></td><td><input id='num"+i+"1' type='number' min='0' max='10'></td><td><input id='num"+i+"2' type='number'></td></tr>");
	}
	document.write("</table></section><button id='button1' value='OK' onclick='createRangeGraph()'>OK</button>");
}

/*Function for creating*/
function createRangeGraph() {
	var max=new Array(no);
	var min=new Array(no);
	var name=new Array(no);
	for(i=0;i<no;i++){
		name[i]=document.getElementById("num"+i+"0").value;	
		min[i]=parseInt(document.getElementById("num"+i+"1").value);
		max[i]=parseInt(document.getElementById("num"+i+"2").value);	
		if(name[i]==""){
			alert("Enter name in row"+(i+1));
			return;
		}
		else if(min[i]==""){
			alert("Enter min value in row"+(i+1));
			return;
		}
		else if(max[i]==""){
			alert("Enter max value in row"+(i+1));
			return;
		}
		else if(min[i] > max[i]){		
			alert("In row"+(i+1)+"min value is greater than max value");
			return;
		}
	}
	for(i=0;i<no;i++){
		document.write("<br><br><section><table id='table1' style='border:2px solid black;border-collapse: collapse;'>");
		for(i=0;i<no;i++){
			document.write("<tr>");
			for(j=0;j<12;j++){
				if(j==0){
					document.write("<td style='width:50px;border-right:2px solid black;border-bottom:2px solid black;'>"+name[i]+"</td>");
				}
				else{
					if((j-1)>=min[i] && (j-1)<=max[i]){
						document.write("<td style='width:50px; background-color:red; border-bottom:2px solid black;'></td>");
					}
					else{
						document.write("<td style='width:50px;border-bottom:2px solid black;'></td>");
					}
				}
			}
			document.write("</tr>");
		}
		document.write("</table></section>");
	}
}
