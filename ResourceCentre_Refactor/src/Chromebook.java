
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = super.toString();
		// Write your codes here
<<<<<<< HEAD
		output = String.format("%-33s %-5s", output, os);
=======
		output = String.format("%-63s %-20s", output, os);
>>>>>>> branch 'master' of https://github.com/Joeyyy1111/ResourceCentre_Refactor.git
		return output;
	}
}


