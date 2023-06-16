package polimorfismo;

public class EmpregadoComissionado extends Empregado{

	private double VendasBruta;
	private double porcentagemComissao;
	
	public EmpregadoComissionado(double vendaBruta, double porcComissao, String PrimeiroNome, 
			String UltimoNome, String cpf) {
		super(PrimeiroNome, UltimoNome, cpf);
		setVendaBruta(vendaBruta);
		setTaxaComissao(porcComissao);
	}
	
	public void setVendaBruta(double vendas) {
		VendasBruta = (vendas <0.0) ? 0.0 : vendas;
	}
	
	public double getVendaBruta() {
		return VendasBruta;
	}
	
	public void setTaxaComissao(double taxa) {
		porcentagemComissao = (taxa >0.0 && taxa < 1.0) ? taxa: 0.0;
	}
	
	public double getTaxaComissao() {
		return porcentagemComissao;
	}
	
	@Override
	public double vencimento() {
		return getTaxaComissao() = getVendaBruta();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%.2f; %s: %.2f", "Empregado" +
				"Comissionado" , super.toString(),
				"Vendas Brutas", getVendaBruta(),
				"Porcentagem comissao", getTaxaComissao());
	}
}
