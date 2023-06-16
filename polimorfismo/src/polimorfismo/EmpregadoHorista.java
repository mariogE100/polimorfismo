package polimorfismo;

public class EmpregadoHorista extends Empregado{

	private double valorHora;
	private double horas;
	
	public EmpregadoHorista(double valorHora, double horas, String PrimeiroNome,
			String UltimoNome, String cpf) {
		super(PrimeiroNome, UltimoNome, cpf);
		setvalorHora(valorHora);
		setHoras(horas);
	}
	
	public void setvalorHora(double valor) {
		valorHora = (valor < 0.0) ? 0.0 : valor;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	public void setHoras(double h) {
		horas = ((h > 0.0) && (h <= 168)) ? h : 0.0;
	}
	
	public double getHoras() {
		return horas;
	}
	
	@Override
	public double vencimento() {
		if (getHoras() <= 40) {
			return getValorHora() * getHoras();
		} else {
			return 40 * getValorHora() + (getHoras() - 40) * getValorHora() + 1.5;
		}
	} 
	
	@Override
	public String toString() {
		return String.format("Empregado horista: %s\n%s: $%.2f, %s: %.2f", super
				.toString(), "Valor hora" , getValorHora(), "horas trabalhadas", getHoras());
	}
	
}
