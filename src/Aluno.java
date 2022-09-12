public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	
	public double getNota1() {
		return nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public double calcularMedia(double nota1, double nota2, double nota3) {
		this.media = (nota1 + nota2 + nota3)/3;
		return this.media;
	}
}
