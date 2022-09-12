import java.util.Date;

public class Conta {
	private Date dataPagamento;
	private String dataVencimento;
	private double total;
	private double multa;
	
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public double getTotal() {
		return total;
	}
	public double getMulta() {
		return multa;
	}
	public double calcularMulta(double total) {
		this.multa = 0.02 * total;
		return multa;
	}
}
