package comparable;

public class ProfHorista extends Professor {

	public ProfHorista(String nome, int matricula, int cargaHoraria, float valorHora) {
		super(nome, matricula, cargaHoraria, valorHora);
		// TODO Auto-generated constructor stub
	}

	public double getSalarioLiquido() {
		return getValorHora() * getCargaHoraria() * 4.5;
	}
}
