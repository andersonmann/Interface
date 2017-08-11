package comparable;

public class Professor implements Salario, Comparable<Professor> {
	private String nome;
	private int matricula;
	private int cargaHoraria;
	private double valorHora;

	public Professor(String nome, int matricula, int cargaHoraria, float valorHora) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargaHoraria = cargaHoraria;
		this.valorHora = valorHora;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getValorHora() {
		return valorHora;
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", matricula=" + matricula + ", cargaHoraria=" + cargaHoraria
				+ ", valorHora=" + valorHora + "]";
	}

	@Override
	public double getSalarioLiquido() {
		return valorHora * cargaHoraria;
	}

	@Override
	public double getTotalSalariosMinimos() {
		return getSalarioLiquido() / Salario.SALARIO_MINIMO;
	}

	@Override
	public int compareTo(Professor o) {
		// return this.nome.compareTo(o.getNome());
		// return o.getNome().compareTo(this.nome);

		return this.cargaHoraria - o.getCargaHoraria();
		/*
		 * if(this.cargaHoraria == o.getCargaHoraria()) return 0;
		 * 
		 * else if(this.cargaHoraria > o.getCargaHoraria()) return 1;
		 * 
		 * else return -1;
		 */
	}
}
