package lvl1_Ex3;

public class GenericMethods<T> {
	private T n1;
	private T n2;
	private T n3;

	GenericMethods() {
		n1 = null;
		n2 = null;
		n3 = null;
	}

	public T getN1() {
		return n1;
	}

	public void setN1(T n1) {
		this.n1 = n1;
	}

	public T getN2() {
		return n2;
	}

	public void setN2(T n2) {
		this.n2 = n2;
	}

	public T getN3() {
		return n3;
	}

	public void setN3(T n3) {
		this.n3 = n3;
	}

	public void f(T n1, T n2) {
		System.out.println("El primer valor es: " + n1 + "\nEl segundo es: " + n2 + "\nEl tercero es: " + n3);
	}
}
