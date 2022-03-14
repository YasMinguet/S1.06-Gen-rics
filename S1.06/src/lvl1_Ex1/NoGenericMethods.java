package lvl1_Ex1;

public class NoGenericMethods {

	private Object[] dataElement;
	private int i = 0;
	private Object a;
	private Object b;
	private Object c;

	public NoGenericMethods(Object a, Object b, Object c) {
		this.a = a;
		this.b = b;
		this.c = c;
		dataElement = new Object[] { a, b, c };

	}

	public Object get(int i) {
		return dataElement[i];
	}

	public void add(Object o) {
		dataElement[i] = o;
		i++;
	}

	public void print() {
		for (int i = 0; i < dataElement.length; i++) {
			System.out.println(dataElement[i]);
		}
	}

}
