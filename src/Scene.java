public class Scene {

	String name;
	double width;
	double height;
	double recursionDepth;
	
	public Scene(){
	}
	
	public Scene(String NAME, double WIDTH, double HEIGHT, double RD){
		name = NAME;
		width = WIDTH;
		height = HEIGHT;
		recursionDepth = RD;
	}
	
	public String toString(){
		String result = "Scene: " + name + " " + width + " " + height + " " + recursionDepth;
		return result;
	}
}
