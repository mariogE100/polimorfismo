package polimorfismo;

public class EmpregadoAssalariado extends Empregado{

	private double salarioSemanal;
	
	public EmpregadoAssalariado(double s, String PrimeiroNome, String UltimoNome, String cpf ) {
		super(PrimeiroNome, UltimoNome, cpf);
		setsalarioSemanal(s);
	}
	
	public void setsalarioSemanal(double salario) {
		salarioSemanal = salario < 0.0 ? 0.0 : salario;
	}
	
	public double getsalarioSemanal() {
		return salarioSemanal;
	}
	
	@Override
	public double vencimento() {
		return getsalarioSemanal();
	}
	
	public String toString() {
		return String.format("Empregado assalariado: %s\n%s: $%.2f", super, 
				toString(), "Salario semanal", getsalarioSemanal());
	}
}
