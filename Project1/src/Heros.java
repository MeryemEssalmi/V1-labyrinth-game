public class Heros extends Personne{
	int ptvie=3;
	Heros(int x1, int y1) {
		super(x1, y1);
		// TODO Auto-generated constructor stub
	}
	public void move(String M){
		if (M.equals("L") && x>1){
			x=x-1;
		}
		else if (M.equals("R") && x<19){
			x=x+1;
		}
		else if (M.equals("U") && y>1){
			y=y-1;
		}
		else if (M.equals("D") && x<19){
			y=y+1;
		}
	}
	public void attack(){
	}
}