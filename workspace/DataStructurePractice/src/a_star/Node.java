package a_star;

public class Node {

//	Node northNode, northEastNode, eastNode, southEastNode, southNode, southWestNode, westNode, northWestNode;
	private int gValue, fValue, hValue;	
	int row, col;
	
	
	public Node(){
	}

	public int getgValue() {
		return gValue;
	}

	public void setgValue(int gValue) {
		this.gValue = gValue;
	}

	public int getfValue() {
		return fValue;
	}

	public void setfValue(int fValue) {
		this.fValue = fValue;
	}

	public int gethValue() {
		return hValue;
	}

	public void setHValue(int hValue) {
		this.hValue = hValue;
	}
	
	
}
