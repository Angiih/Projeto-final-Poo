package projeto;

public class aluno extends pessoa {
  private String login;
  private int toAssistindo;
private Object espectador;
  
  
  
  
  
public aluno(String nome, int idade, String sexo, String login, int toAssistindo) {
	super(nome, idade, sexo);
	this.login = login;
	this.toAssistindo = 0;
	
}


public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public int getToAssistindo() {
	return toAssistindo;
}
public void setToAssistindo(int toAssistindo) {
	this.toAssistindo = toAssistindo;
}


@Override
public String toString() {
	return "aluno [" + super.toString() + "\n login=" + login + ", toAssistindo=" + toAssistindo + "]";
}
  
  
  
}
