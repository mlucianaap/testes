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
	
	@Test
	public void testarGetNota1() {
		double resultado = new Aluno().getNota1();
		assertEquals(0.0, resultado);
	}
	
	@Test
	public void testarGetNota2() {
		double resultado = new Aluno().getNota2();
		assertEquals(0.0, resultado);
	}
	
	@Test
	public void testarGetNota3() {
		double resultado = new Aluno().getNota3();
		assertEquals(0.0, resultado);
	}
	
	/*
	 * Questão 2
	 * */
	@Test
	public void testarPagamentoSemAtraso() {
		String dataVencimento = "10/09/2023";
		double total = 100.0;
		double resultado = new Conta().calcularMulta(dataVencimento, total);
		assertEquals(0.0, resultado);
	}
	
	@Test
	public void testarPagamentoComAtraso() {
		String dataVencimento = "10/09/2022";
		double total = 100.0;
		double resultado = new Conta().calcularMulta(dataVencimento, total);
		assertEquals(2.0, resultado);
	}
	
	@Test
	public void testarGetDataVencimento() {
		String resultado = new Conta().getDataVencimento();
		assertEquals("12/09/2022", resultado);
	}
	
	@Test
	public void testarGetTotal() {
		double resultado = new Conta().getTotal();
		assertEquals(0.0, resultado);
	}
	
	@Test
	public void testarGetMulta() {
		double resultado = new Conta().getMulta();
		assertEquals(0.0, resultado);
	}
	
	/*
	 * Questão 3
	 * */
	@Test
	public void testarSeEleitorPodeVotar() {
		int idade = 18;
		String resultado = new Eleitor().verificarSePodeVotar(idade);
		assertEquals("Você é obrigado a votar!", resultado);
	}
	
	@Test
	public void testarSeEleitorDeMenorPodeVotar() {
		int idade = 13;
		String resultado = new Eleitor().verificarSePodeVotar(idade);
		assertEquals("Você não pode votar!", resultado);
	}
	
	@Test
	public void testarEleitorFacultativo() {
		int idade1 = 17;
		int idade2 = 70;
		String resultado1 = new Eleitor().verificarSePodeVotar(idade1);
		String resultado2 = new Eleitor().verificarSePodeVotar(idade2);
		assertEquals("O seu voto é facultativo!", resultado1);
		assertEquals("O seu voto é facultativo!", resultado2);
	}
	
	@Test
	public void testarEleitorComIdadeMaiorQueLimite() {
		int idade = 151;
		String resultado = new Eleitor().verificarSePodeVotar(idade);
		assertEquals("Idade inválida!", resultado);
	}
	
	@Test
	public void testarEleitorComIdadeMenorQueLimite() {
		int idade = -1;
		String resultado = new Eleitor().verificarSePodeVotar(idade);
		assertEquals("Idade inválida!", resultado);
	}
	
	@Test
	public void testarSetGetNome() {
		Eleitor eleitor = new Eleitor();
		eleitor.setNome("João");
		String resultado = eleitor.getNome();
		assertEquals("João", resultado);
	}
	
	@Test
	public void testarSetGetIdade() {
		int resultado = new Eleitor().getIdade();
		assertEquals(0, resultado);
	}
}