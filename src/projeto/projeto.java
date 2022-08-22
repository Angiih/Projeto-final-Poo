package projeto;

public class projeto {

	public static void main(String[] args) {
		video v[] = new video [3];
		v[0] = new video ("Programação!");
		v[1] = new video ("Java");
		v[2] = new video ("Poo");
		
		
		aluno al[] = new aluno [2];
		al[0] = new aluno("Angi", 22, "F", "Jubs");
		al[1] = new aluno("Mat" 24, "M", "Mats");
		
		Visualizacao vis = new Visualizacao(al[0].v[2]);
		System.out.println(vis.toString());
		
	    
		
		System.out.println(v[0].toString());
		System.out.println(al[0].toString());
	}

}
