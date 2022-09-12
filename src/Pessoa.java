import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa extends Conta {
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String realizarPagamento(String dataVencimento, double total) {
		setDataPagamento(new Date());
		Date dataPagamento = getDataPagamento();
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
		
		try {
			Date vencimento = formato.parse(dataVencimento);
			if(vencimento.before(dataPagamento)) {
				calcularMulta(total);
				return "Pagamento realizado com multa!";
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return "Pagamento realizado!";
	}
}
