package interfaces;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		Lampada lamp1 = new Lampada(110, 60);
		lamp1.ligar();
		System.out.println(lamp1);
		if (lamp1.getEstado() == IEstadoBinario.EstadoBinario.Ligado)
			System.out.println("Esta ligada!");

		// Um ArrayList de IEstadoBinario pode armazenar QUALQUER objeto cuja
		// classe implemente a interface
		ArrayList<IEstadoBinario> lista = new ArrayList<>();
		lista.add(new Lampada(220, 100));
		lista.add(new TermometroEletrico());

		System.out.println();
		System.out.println("Estado dos objetos na lista");
		// Note que dentro do for so e possivel acessar os metodos definidos na
		// interface IEstadoBinario!
		for (IEstadoBinario obj : lista)
			System.out.println(obj.getEstado());

	}

}
