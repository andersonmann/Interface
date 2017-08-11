package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		Salario p1 = new Professor("Fulano", 1, 40, 38);
		Salario m1 = new MotoristaTaxi("Ze", "7812872872", "28/04/2013");
		Salario h1 = new ProfHorista("Beltrano", 2, 20, 32);

		System.out.println(p1.getSalarioLiquido());
		System.out.println(m1.getSalarioLiquido());
		System.out.println(h1.getSalarioLiquido());

		if (p1 instanceof Professor)
			System.out.println(((Professor) p1).getNome());

		if (m1 instanceof MotoristaTaxi)
			System.out.println(((MotoristaTaxi) m1).getNome());

		if (h1 instanceof ProfHorista)
			System.out.println(((ProfHorista) h1).getNome());

		List<String> lista1 = new ArrayList<String>();
		lista1.add("Fulano");
		lista1.add("Beltrano");
		lista1.add("Ciclano");
		lista1.add("Huguinho");
		lista1.add("Zezinho");
		lista1.add("Luizinho");

		Collections.sort(lista1);
		System.out.println(lista1);

		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(15);
		lista2.add(1);
		lista2.add(5);
		lista2.add(8);
		lista2.add(25);
		lista2.add(3);

		Collections.sort(lista2);
		System.out.println(lista2);

		List<Professor> lista3 = new ArrayList<Professor>();
		lista3.add(new Professor("Fulano", 1, 20, 32));
		lista3.add(new Professor("Beltrano", 2, 10, 20));
		lista3.add(new Professor("Ciclano", 3, 15, 22));
		lista3.add(new Professor("Huguinho", 4, 18, 30));
		lista3.add(new Professor("Zezinho", 5, 21, 32));

		Collections.sort(lista3);
		for (Professor p : lista3)
			System.out.println(p.getNome() + " - " + p.getCargaHoraria());

	}

}
