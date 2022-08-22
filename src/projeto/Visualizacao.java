package projeto;

public class Visualizacao {
    private aluno espectador;
    private video filme;
    
    
    
	public aluno getEspectador() {
		return espectador;
	}


	public void setEspectador(aluno espectador) {
		this.espectador = espectador;
	}


	public video getFilme() {
		return filme;
	}


	public void setFilme(video filme) {
		this.filme = filme;
	}


	public Visualizacao(aluno espectador, video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setToAssistindo(this.espectador.getToAssistindo() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}


	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
    
    
}
