package SimpleCarWash;

public class Program {

	private String name;
	private String simple;
	private String basic;
	private String magic;
	private int price;
	private Function functions;

	public Program(String name, int price) {
		this.setName(name);
		this.price = price;
		if (name.equals("simple")) {
			setFunctions(new Function("washing", "drying"));
		} else if (name.equals("normal")) {
			setFunctions(new Function("washing", "drying", "polishing"));
		} else if(name.equals("magic"))	{	
			setFunctions(new Function("washing", "drying", "polishing", "waxing"));
		}

	}

	public Program(String name, String washing, String drying, String polishing, int price) {
		this.basic = name;
		this.price = price;
	}

	public Program(String name, String washing, String drying, String polishing, String waxing,
			int price) {
		this.basic = name;
		this.price = price;
	}

	public String getSimple() {
		return "Washing..";
	}

	public String getBasic() {
		return "Washing in basic mode..";
	}

	public String getMagic() {
		return "Magically washing..";
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Program Simple = " + simple + ", Basic = " + basic
				+ ", Magic = " + magic + ", Price = " + price + "]";
	}

	public Function getFunctions() {
		return functions;
	}

	public void setFunctions(Function functions) {
		this.functions = functions;
	}

	public void setName(String name) {
		this.name = name;
	}

}
