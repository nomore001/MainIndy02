package fillRegisterProfile;

public class Occupation {
	private boolean selected;
	private String occName;
	
	public Occupation(){
		
	}
	
	public Occupation(boolean selected, String occName){
		this.selected = selected;
		this.occName = occName;
	}
	
	public boolean getSelected(){
		return this.selected;
	}
	
	public String getOccupationName(){
		return this.occName;
	}

	public void editOccupation(boolean selected) {
		this.selected = selected;
	}

	public void editOther(String other) {
		this.occName = other;
	}
}
