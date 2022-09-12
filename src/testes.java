import junit.framework.TestCase;

import org.junit.Test;

public class testes extends TestCase {
	/*
	 * Questão 1
	 * */
	
	@Test
	public void testarCalculoDaMedia() {
		double n1 = 9.0;
		double n2 = 10.0;
		double n3 = 5.0;
		final double resultado = new Aluno().calcularMedia(n1, n2, n3);
		assertEquals(8.0, resultado);
	}
	
	Aluno aluno = new Aluno();
	
	@Test
	public void testarSetGetNota1() {
		aluno.setNota1(10.0);
		double resultado = aluno.getNota1();
		assertEquals(10.0, resultado);
	}
	
	@Test
	public void testarSetGetNota2() {
		aluno.setNota2(9.0);
		double resultado = aluno.getNota2();
		assertEquals(9.0, resultado);
	}
	
	@Test
	public void testarSetGetNota3() {
		aluno.setNota3(5.0);
		double resultado = aluno.getNota3();
		assertEquals(5.0, resultado);
	}
	
	/*
	 * Questão 2
	 * */
	@Test
	public void testarPagamentoSemMulta() {
		String dataVencimento = "10/09/2023";
		double total = 100.0;
		String resultado = new Pessoa().realizarPagamento(dataVencimento, total);
		assertEquals("Pagamento realizado!", resultado);
	}
	
	@Test
	public void testarPagamentoComMulta() {
		String dataVencimento = "10/09/2022";
		double total = 100.0;
		String resultado = new Pessoa().realizarPagamento(dataVencimento, total);
		assertEquals("Pagamento realizado com multa!", resultado);
	}
	
	@Test
	public void testarCalculoMulta() {
		double total = 100.0;
		double resultado = new Conta().calcularMulta(total);
		assertEquals(2.0, resultado);
	}
	
	/*
	 * Questão 3
	 * */
	Eleitor eleitor = new Eleitor("João", 25);
	
	@Test
	public void testarSeEleitorPodeVotar() {
		
		assertEquals("Você é obrigado a votar!", eleitor.verificarSePodeVotar(eleitor.getIdade()));
	}
	
	@Test
	public void testarSeEleitorDeMenorPodeVotar() {
		assertEquals("Você não pode votar!", eleitor.verificarSePodeVotar(13));
	}
	
	@Test
	public void testarEleitorFacultativo() {
		assertEquals("O seu voto é facultativo!", eleitor.verificarSePodeVotar(17));
		assertEquals("O seu voto é facultativo!", eleitor.verificarSePodeVotar(75));
	}
	
	@Test
	public void testarEleitorComIdadeMaiorQueLimite() {
		assertEquals("Idade inválida!", eleitor.verificarSePodeVotar(200));
	}
	
	@Test
	public void testarEleitorComIdadeMenorQueLimite() {
		assertEquals("Idade inválida!", eleitor.verificarSePodeVotar(-10));
	}
}