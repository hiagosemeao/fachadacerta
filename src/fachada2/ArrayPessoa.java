package fachada2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

	public class ArrayPessoa implements Serializable {
		private ArrayList<Pessoa> pessoas;


		public ArrayPessoa() {

			this.pessoas = new ArrayList <Pessoa>();
		}

		public void addPessoa (Pessoa p) {

			try {
				this.pessoas.add(p);
				File f = new File ("Arquivo.dat");
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(pessoas);
				oos.close();
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Houve um erro interno, falha na abertura do arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
			}

		}

		public void RecuperarPessoa(File f) {
			try {
				f = new File("Arquivo.dat");
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Object o = ois.readObject();
				ArrayList<Pessoa> clone = (ArrayList<Pessoa>) o;
				System.out.println(o);
			}catch (Exception e ) {
				JOptionPane.showMessageDialog(null, "Houve um erro interno, falha na abertura do arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}

		public String getNomePessoa(int indice) {
			return pessoas.get(indice).getNome();

		}

		public String getTelefonePessoa(int indice) {

			return pessoas.get(indice).getTelefone();

		}

		public String getRgPessoa(int indice) {
			return pessoas.get(indice).getRg();


		}


		public void imprimir (){

			for (int i = 0; i < this.pessoas.size(); i++) {
				System.out.println(this.pessoas.get(i));
				
			}
		}

	}



