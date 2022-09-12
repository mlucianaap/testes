public class Eleitor {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public String verificarSePodeVotar(int idade) {
		if(idade >= 0 && idade < 16) {
			return "Você não pode votar!";
		} else if ((idade >= 16 && idade < 18) || (idade >= 70 && idade <= 150)) {
			return "O seu voto é facultativo!"; 
		} else if (idade >= 18 && idade < 70){
			return "Você é obrigado a votar!";
		} else {
			return "Idade inválida!";
		}
	}
}
