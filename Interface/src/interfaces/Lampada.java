package interfaces;

public class Lampada implements IEstadoBinario {
	private int tensao;
	private int potencia;
	private boolean ligada;

	public Lampada(int t, int p) {
		// TODO Auto-generated constructor stub
		tensao = t;
		potencia = p;
		ligada = false;
	}

	/**
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @return the tensao
	 */
	public int getTensao() {
		return tensao;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		ligada = true;
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		ligada = false;
	}

	public String toString() {
		String aux = tensao + "-" + potencia + ":";
		if (ligada)
			aux += "ligada";
		else
			aux += "desligada";
		return aux;
	}

	@Override
	public EstadoBinario getEstado() {
		// TODO Auto-generated method stub
		if (ligada)
			return EstadoBinario.Ligado;
		else
			return EstadoBinario.Desligado;
	}

}
