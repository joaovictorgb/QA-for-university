package main;


public class Professor {
	
    private String nome;
    private String id;

    public Professor(String nome, String id) {
        this.nome = nome;
        this.setId(id);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



}