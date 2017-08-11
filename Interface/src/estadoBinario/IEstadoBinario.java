package interfaces;

public interface IEstadoBinario {

	public enum EstadoBinario {
		Ligado, Desligado
	};

	void ligar();

	void desligar();

	EstadoBinario getEstado();

}
