package POO;

public class TesteAnimal {

	public static void main (String args[]) {
		Animal chihuahua = new Cachorro("Doguinho", 10, "Auau", "Correr", "Ra��o");
		Animal pregui�a = new Pregui�a("Flecha", 5, "...", "Escalar", "Folhas");
		Animal cavalo = new Cavalo("Sans�o", 20, "Quatro patas bom, duas patas ruim", "Correr", "Verduras");

		System.out.println("O cachorro "+chihuahua.getNome()+" faz o barulho "+chihuahua.getSom()+" quando "+chihuahua.getLocomover());
		System.out.println("O cavalo "+cavalo.getNome()+" faz o barulho "+cavalo.getSom()+" quando "+cavalo.getLocomover());
		System.out.println("A pregui�a "+pregui�a.getNome()+" faz o barulho "+pregui�a.getSom()+" quando "+pregui�a.getLocomover());

	}

}
