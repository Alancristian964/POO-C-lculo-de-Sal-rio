
public class Terceirizado extends Funcionario{
	private int horasTrabalhadas;
	private String insalubre;

	public Terceirizado(String nome, int horasTrabalhadas,
		String insalubre) {
		super(nome, 0);
		this.horasTrabalhadas = horasTrabalhadas;
		this.insalubre = insalubre;
                setSalario (calcularSalario());
	} 

	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public String isInsalubre() {
		return this.insalubre;
	}
	public void setInsalubre(String insalubre) {
		this.insalubre = insalubre;
	}

	public double calcularSalario(){

		double salario =  4 *  this.horasTrabalhadas;

		if(this.insalubre.equals("sim")){
			salario +=500;
		}

		return salario;

	}

	public String toString(){
		String res ="";
		res += super.toString();
		res += "Horas de Trabalho: " + this.horasTrabalhadas +"\n" +
		"Salubridade: " + this.insalubre + "\n";
		return res;
	}

}

