package eh;

public class Szemely {
	
	private final String name;
	private final int hash;
	
	public Szemely(String name) {
		this.name=name;
		hash = ++Szemely.counter;
	}
	
	@Override
	public String toString() {
		return "a nevem: "+name;
	}
	
	@Override
	public boolean equals(Object sz) {
		if(sz instanceof Szemely) {
			return ((Szemely)sz).name.equals(name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public int hashCode(int plusOne) {
		return name.hashCode()+plusOne;
	}
}