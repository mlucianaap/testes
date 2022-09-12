import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conta {
	private Date dataPagamento;
	private String dataVencimento;
	private double total;
	private double multa;
	
	public Conta() {
		this.dataPagamento = null;
		this.dataVencimento = "12/09/2022";
		this.total = 0.0;
		this.multa = 0.0;
	}
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
	
	public double calcularMulta(String dataVencimento, double total) {
		this.dataPagamento = new Date();
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
		
		try {
			Date vencimento = formato.parse(dataVencimento);
			if(vencimento.before(this.dataPagamento)) {
				this.multa = 0.02 * total;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return this.multa;
	}
}
