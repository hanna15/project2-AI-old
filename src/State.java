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
		//tharf ad gefa legal moves af öllum hvítum, eða öllum svörtum (hvor sem er ad gera)
		//alltaf í raun 3 möguleg move, áfram, hægri drepa, vinstri drepa, en svo mismunandi hvort sé löglegt
		//hvert move í raun skilgreint sem færslan frá núv pos til nyju pos (t.d. klasi med 2 pos)
	}
	boolean isGoalState() {
		//ef allir white komir út á hinn endann
		return false;
	}
	
	//State successorState(State s, Action a) {
	//	
	//}
}
