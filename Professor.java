
public class Professor extends Funcionario{

	private String classe;

	public Professor(String nome, String classe){
		super(nome, 2);
		this.classe = classe;
                setSalario (calcularSalario());
	}
	public String getClasse(){
		return this.classe;
	}
	public void setClasse(String classe){
		this.classe = classe;
	}
	public String toString(){
		String res ="";
		res += super.toString();
		res += "Classe: " + this.classe + "\n";
		return res;
	}
	public double calcularSalario(){
		switch(this.classe){
			case "A":
				return 3000+(100*this.getDiarias());
			case "B":
				return 5000+(100*this.getDiarias());
			case "C":
				return 7000+(100*this.getDiarias());
			case "D":
				return 9000+(100*this.getDiarias());
			default:
				return 11000+(100*this.getDiarias());
		}
	}

	
}