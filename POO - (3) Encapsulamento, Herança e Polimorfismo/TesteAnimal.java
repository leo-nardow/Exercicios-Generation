package POO;

public class TesteAnimal {

	public static void main (String args[]) {
		Animal chihuahua = new Cachorro("Doguinho", 10, "Auau", "Correr", "Ração");
		Animal preguiça = new Preguiça("Flecha", 5, "...", "Escalar", "Folhas");
		Animal cavalo = new Cavalo("Sansão", 20, "Quatro patas bom, duas patas ruim", "Correr", "Verduras");

		System.out.println("O cachorro "+chihuahua.getNome()+" faz o barulho "+chihuahua.getSom()+" quando "+chihuahua.getLocomover());
		System.out.println("O cavalo "+cavalo.getNome()+" faz o barulho "+cavalo.getSom()+" quando "+cavalo.getLocomover());
		System.out.println("A preguiça "+preguiça.getNome()+" faz o barulho "+preguiça.getSom()+" quando "+preguiça.getLocomover());

	}

}
