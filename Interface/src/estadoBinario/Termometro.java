package estadoBinario;

public class Termometro {

	private double temperatura;

	public Termometro() {
		temperatura = 0.0;
	}

	/**
	 * @return the temperatura
	 */
	public double getTemperatura() {
		return temperatura;
	}

	/**
	 * @param temperatura
	 *            the temperatura to set
	 */
	public void aumentar(double temperatura) {
		this.temperatura += temperatura;
	}

	public void diminuir(double temperatura) {
		this.temperatura -= temperatura;
	}

	public String toString() {
		return "Temp: " + temperatura;
	}

}
