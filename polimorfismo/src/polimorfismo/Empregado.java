package polimorfismo;

public abstract class Empregado {

	private String PrimeiroNome;
	private String UltimoNome;
	private String cpf;
	
	public Empregado(String PrimeiroNome, String UltimoNome, String cpf) {
		this.PrimeiroNome = PrimeiroNome;
		this.UltimoNome = UltimoNome;
		this.cpf = cpf;
	}
	
	public void setPnome(String s) {
		PrimeiroNome = s;
	}
	
	public String getPnome() {
		return PrimeiroNome;
	}
	
	public void setLnome(String s) {
		UltimoNome = s;
	}
	
	public String getLnome() {
		return UltimoNome;
	}
	
	public void setCPF(String c) {
		cpf = c;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s\ncpf: %s", getPnome(), getLnome(), getCPF() );
	}
	\
	public abstract double vencimento();
}
