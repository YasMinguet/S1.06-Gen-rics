package lvl1_Ex3;

public class App {

	public static void main(String[] args) {
		GenericMethods try1 = new GenericMethods();
		try1.setN3('€');
		try1.f("Hola", 6);
		GenericMethods try2 = new GenericMethods();
		try2.setN3("Perro");
		try2.f('=', 6);
		GenericMethods try3 = new GenericMethods();
		try3.setN3(9);
		try3.f('@', '?');

	}

}
