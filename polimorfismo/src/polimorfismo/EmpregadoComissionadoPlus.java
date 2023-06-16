package polimorfismo;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado{

	private double salarioBase;
	
	public EmpregadoComissionadoPlus (double salario, double vendabruta, double porcComissao, String PrimeiroNome,  
			String UltimoNome, String cpf) {
		super(vendabruta, porcComissao, PrimeiroNome, UltimoNome, cpf);
		setSalarioBase(salario);
	}
	
	public void setSalarioBase(double salario) {
		salarioBase = (salario < 0.0) ? 0.0 : salario;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	@Override
	public double vencimento() {
		return getSalarioBase() + super.vencimento();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%.2f", "Base assalariado", super.
				toString(), "Salario base", getSalarioBase());
		}
	}
}
