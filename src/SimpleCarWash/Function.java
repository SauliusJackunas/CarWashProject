package SimpleCarWash;

public class Function{

	private String washing;
	private String drying;
	private String polishing;
	private String waxing;
	
	public Function(String washing, String drying, String polishing, String waxing) {
		this.washing = washing;
		this.drying = drying;
		this.polishing = polishing;
		this.waxing = waxing;
	}
	
	public Function(String washing, String drying, String polishing) {
		this.washing = washing;
		this.drying = drying;
		this.polishing = polishing;
	}
	
	public Function(String washing, String drying) {
		this.washing = washing;
		this.drying = drying;
	}

	public String getWashing() {
		return "Washing..";
	}

	public String getDrying() {
		return "Drying..";
	}

	public String getPolishing() {
		return "Polishing..";
	}

	public String getWaxing() {
		return "Waxing..";
	}
}