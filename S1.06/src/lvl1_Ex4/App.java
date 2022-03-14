package lvl1_Ex4;

public class App {

	public static void main(String[] args) {
		GenericMethods try1 = new GenericMethods();
		System.out.println(try1.f("Hola", 6, '€', "prueba"));
		GenericMethods try2 = new GenericMethods();
		System.out.println(try2.f('=', 6));
		GenericMethods try3 = new GenericMethods();
		System.out.println(try3.f('@', '?', "Prueba 2", 86, 58));

	}

}
