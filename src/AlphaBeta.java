package proj2;

public class AlphaBeta {
	static final int MAX = Integer.MAX_VALUE;
	static final int MIN = Integer.MIN_VALUE;
	
	
	//svo depth og playclock, startclock etc
	private int value;
	private int envWidth;
	private int envHeight;
	private State currState;
	private String myRole;
	
	AlphaBeta(int w, int h, State curr, String role) {
		currState = curr;
		envWidth = w;
		envHeight = h;
		myRole = role;
		value = maxValue(currState, MIN, MAX);
		//return the action in ACTIONS(state) with value v
		//bestMove();
	}
	
	Move bestMove() { //dummy fall
		return new Move(new Position(0,0), new Position(0,0), true);
	}
	//Move bestMove() {
		//for (Move m : currState.getAllLegalMoves(envWidth, envHeight)) {
			//if( m.getUtility() == value) { //return the action in ACTIONS(state) with value v
			//	return m;                 //veit ekki alveg hvernig vid faum thetta utility ?
			//}
		//}
	//}

	private int minValue(State s, int alpha_min, int beta_max) {
		if(s.isGoalState(envHeight)) { //veit hann potto "who's turn it is ?"
			 if (s.isWhite && myRole.equals("white") || !s.isWhite && myRole.equals("black")) { //if we are the winners
				 return 100; 
			 }
			 else if(s.isWhite && myRole.equals("black") || !s.isWhite && myRole.equals("white")) { //if we are the loosers
				 return -100;
			 }
			 return 0; //??? when would we really return 0 ?
		} 
		value = MAX;
		for (Move m : s.getAllLegalMoves(envWidth, envHeight)) {
			value = Math.min(value, maxValue(s.successorState(m), alpha_min, beta_max));
			if(value <= alpha_min) {
				return value;
			}
			beta_max = Math.min(beta_max, value);
		}
		return value;
	}
	
	private int maxValue(State s, int alpha_min, int beta_max) {
		if(s.isGoalState(envHeight)) {
			 if (s.isWhite) { //return the utility of the state - hvernig er thad reiknad ? //rather: if we are the player
				 return 100;  //lika hvenaer skilum vid 0 ?
			 }
			 return -100;
		}
		value = MIN;
		for (Move m : s.getAllLegalMoves(envWidth, envHeight)) {
			value = Math.max(value, minValue(s.successorState(m), alpha_min, beta_max));
			if(value >= beta_max) {
				return value;
			}
			alpha_min = Math.max(alpha_min, value);
		}
		return value;
	}
}
