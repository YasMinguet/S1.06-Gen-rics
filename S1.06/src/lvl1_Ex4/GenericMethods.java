package lvl1_Ex4;

public class GenericMethods<T> {

	public static <T> String f(T...ts ) {
		String s="Los valores son: \n";
		for (int i = 0; i < ts.length; i++) {
            s += (ts[i] + " ");
        }
		return s;
	}
}
