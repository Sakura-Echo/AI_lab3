package knap;

public class Gene {
	private int pos;
	private double x;
	private double y;
	private boolean phenotype = false;
	public Gene(){
		this.x = 0;
		this.y = 0;
		this.phenotype = false;
	}
	public Gene(double x, double y){
		this.pos = 0;
		this.x = x;
		this.y = y;
		this.phenotype = false;
	}
	public Gene(int pos, double x, double y){
		this.pos = pos;
		this.x = x;
		this.y = y;
		this.phenotype = false;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public boolean isPhenotype() {
		return phenotype;
	}
	public void setPhenotype(boolean phenotype) {
		this.phenotype = phenotype;
	}
	/*calculate distance to g*/
	public double distanceTo(Gene g){
		double a = Math.abs(this.x - g.getX());
		double b = Math.abs(this.y - g.getY());
		return Math.sqrt(a*a + b*b);
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	
}
