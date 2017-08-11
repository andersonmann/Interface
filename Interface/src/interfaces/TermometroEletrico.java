package interfaces;

public class TermometroEletrico extends Termometro implements IEstadoBinario {

	private boolean ligado;
	
	public TermometroEletrico() {
		super();
		ligado = false;
	}

	@Override
	public void ligar() {
		ligado = true;		
	}

	@Override
	public void desligar() {
		ligado = false;		
	}

	@Override
	public EstadoBinario getEstado() {
		if(ligado)
			return EstadoBinario.Ligado;
		else
			return EstadoBinario.Desligado;
	}
	
	@Override
	public double getTemperatura(){
		if(ligado)
			return super.getTemperatura();
		else
			return 0; // desligado
	}

	@Override
	public void aumentar(double temperatura) {
		if(ligado)
		super.aumentar(temperatura);
	}

	@Override
	public void diminuir(double temperatura) {
		if(ligado)
		super.diminuir(temperatura);
	}	

}
