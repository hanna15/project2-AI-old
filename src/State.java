package proj2;

import java.util.HashSet;

public class State {
	HashSet<Position> whites;
	HashSet<Position> blacks;
	boolean isWhite;
	
	State(HashSet<Position> w, HashSet<Position> b, boolean player) {
		whites = w;
		blacks = b;
		isWhite = player;
	}
	
	//eda getallLegalActionssWhite()
	//og  getallLegalActionsBlack()
	void getAllLegalActions() {
		//tharf ad gefa legal moves af �llum hv�tum, e�a �llum sv�rtum (hvor sem er ad gera)
		//alltaf � raun 3 m�guleg move, �fram, h�gri drepa, vinstri drepa, en svo mismunandi hvort s� l�glegt
		//hvert move � raun skilgreint sem f�rslan fr� n�v pos til nyju pos (t.d. klasi med 2 pos)
	}
	boolean isGoalState() {
		//ef allir white komir �t � hinn endann
		return false;
	}
	
	//State successorState(State s, Action a) {
	//	
	//}
}
