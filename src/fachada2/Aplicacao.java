package fachada2;

import java.io.IOException;
import java.io.Serializable;

public class Aplicacao implements Serializable {

	public static void main(String[] args) throws IOException{
		
		ArrayPessoa pessoa = new ArrayPessoa();
		Pessoa p = new Pessoa("hiago", "87167388", "85554f");
		Pessoa q = new Pessoa("hiago", "87167388", "8555412");
		Pessoa r = new Pessoa("hiago", "87167388", "8555412");
		
		pessoa.addPessoa(p);
		
		pessoa.RecuperarPessoa(null);
		
        }	
 	
	}


