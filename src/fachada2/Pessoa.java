package fachada2;

import java.io.Serializable;

public class Pessoa implements Serializable {

		
		private String nome;
		private String telefone;
		private String rg;

		public Pessoa(String nome,String telefone,String rg) {
			this.nome = nome;
			this.telefone = telefone;
			this.rg = rg;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}
		
		public String toString() {
			return nome + telefone + rg;
		}
	 
	}


