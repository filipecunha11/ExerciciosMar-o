package collection;

import java.util.ArrayList;

public class Aluno {
	
	String nome; int contato; double nota;
	
	public Aluno()
	{
		ArrayList<Aluno> alunos = new ArrayList<>();
		Aluno aluno = new Aluno("Armando", 987654321, 14.9);
		alunos.add(aluno);
		aluno = new Aluno("Alzira", 956789132, 18.4);
		alunos.add(aluno);
		aluno = new Aluno("Fernando", 920981976, 5.0);
		alunos.add(aluno);
		aluno = new Aluno("Zacarias", 964530254, 16.1);
		alunos.add(aluno);
		aluno = new Aluno("Edna", 904489778, 9.5);
		alunos.add(aluno);
		
		ordenar(alunos);
		listar(alunos);
	}
	
	public Aluno(String nome, int contato, double nota) {
		this.nome = nome;
		this.contato = contato;
		this.nota = nota;
	}
	
	public ArrayList<Aluno> ordenar(ArrayList<Aluno> alunos)
	{
	
		for (int i = 0 ; i < alunos.size()-1 ; i++ )
		{
			for (int j = 0 ; j <= i ; j++)
			{
			    if(alunos.get(j).getNota() < alunos.get(j+1).getNota()){
			    	 nota = alunos.get(j).getNota();
			    	 nome = alunos.get(j).getNome();
			    	 contato = alunos.get(j).getContato();
			    	 
			    	 Aluno aluno = new Aluno(alunos.get(j+1).getNome(),
			    			 alunos.get(j+1).getContato(),
			    			 alunos.get(j+1).getNota());
			    	 
			    	 alunos.set(j, aluno);
			    	 aluno = new Aluno(nome, contato, nota);
			    	 alunos.set(j+1, aluno);
			    }
			}
		}
		return alunos;
	}

	public void listar(ArrayList<Aluno> alunos)
	{
		for (int i = 0 ; i < alunos.size() ; i++)
		{
			System.out.println("\nNome: " + alunos.get(i).getNome());
			System.out.println("Contato: " + alunos.get(i).getContato());
			System.out.println("Nota: " + alunos.get(i).getNota());
		}
	}
	
	/******* Getters & Setters *******/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
