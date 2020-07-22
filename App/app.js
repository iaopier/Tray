$(document).ready(function(){
	$.ajax({
        url: "http://localhost:8080/listavendedores",
        contentType: "application/json",
        type:'GET',
        dataType: 'json',
        headers:{    
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*' 
        },
        success: function(result){
            console.log(result);
            for(var i = 0 ; i < result.length ; ++i){
            	var newNode = document.createElement('div');
            	newNode.innerHTML = "ID do Vendedor: " + result[i].id + "<br> Nome: " + result[i].nome  + "<br> Email: " + result[i].email;
            	var div = document.getElementById('listaVendedores');
            	div.appendChild(newNode);
            	var br = document.createElement('br');
            	div.appendChild(br);
            }
        }
    })
})

function criarVendedor(){
	var arr = {
        	nome:document.getElementById("nome").value,
        	email: document.getElementById("email").value
        };
	$.ajax({
        url: "http://localhost:8080/criar",
        contentType: "application/json",
        type:'POST',
        dataType: 'json',
        data:JSON.stringify(arr),
        headers:{    
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*' 
        },
        success: function(result){
        	location.reload();
            }
        
    })
}

function lancarVenda(){
	var arr = {
        	idVendedor:document.getElementById("idvend").value,
        	valorVenda: document.getElementById("valorvend").value
        };
	$.ajax({
        url: "http://localhost:8080/lancavenda",
        contentType: "application/json",
        type:'POST',
        dataType: 'json',
        data:JSON.stringify(arr),
        headers:{    
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*' 
        },
        success: function(result){
        	alert("Venda Lançada");
            }
        
    })
}

function listarVendas(){
	var id = document.getElementById("idlist").value;
	$.ajax({
        url: "http://localhost:8080/listavenda/"+id,
        contentType: "application/json",
        type:'GET',
        dataType: 'json',
        headers:{    
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin': '*' 
        },
        success: function(result){
        	
        	for(var i = 0 ; i < result.length ; ++i){
            	var newNode = document.createElement('div');
            	newNode.innerHTML = "ID do Vendedor: " + result[i].id + "<br> Nome: " + result[i].nome  + "<br> Email: " + result[i].email + "<br> Comissao: " 
            	+ result[i].comissao + "<br> Valor venda: " + result[i].valorVenda + "<br> Data venda: " + result[i].dataVenda;
            	var div = document.getElementById('listaVendasVendedor');
            	div.appendChild(newNode);
            	var br = document.createElement('br');
            	div.appendChild(br);
            }
            }
        
    })
}

