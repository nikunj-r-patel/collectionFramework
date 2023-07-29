package collectionFramework;

public class Shapes {
	
	private String shapeName;
	private int area;
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Shapes(String shapeName, int area) {
		super();
		this.shapeName = shapeName;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Shapes [shapeName=" + shapeName + ", area=" + area + "]";
	}
	

}
