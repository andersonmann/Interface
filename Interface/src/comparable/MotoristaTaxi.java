package comparable;

public class MotoristaTaxi implements Salario {

	private String nome;
	private String numCarteira;
	private String dataExpiracao;
	private double totalKmrodados;

	public MotoristaTaxi(String nome, String numCarteira, String data) {
		this.nome = nome;
		this.numCarteira = numCarteira;
		this.dataExpiracao = data;
		this.totalKmrodados = 10;
	}

	public String getNome() {
		return nome;
	}

	public String getDataExp() {
		return dataExpiracao;
	}

	public String getNumCarteira() {
		return numCarteira;
	}

	@Override
	public String toString() {
		return "MotoristaTaxi [nome=" + nome + ", numCarteira=" + numCarteira + ", totalKmrodados=" + totalKmrodados
				+ "]";
	}

	@Override
	public double getSalarioLiquido() {
		return totalKmrodados * 4.8;
	}

	@Override
	public double getTotalSalariosMinimos() {
		return getSalarioLiquido() / Salario.SALARIO_MINIMO;
	}
}
