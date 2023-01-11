
import java.util.Scanner;



class HumanPlayer extends Player {
	public HumanPlayer(char symbol, Board board, String name) {
		super(symbol, board, name);
		// TODO Auto-generated constructor stub
	}
	//HumanPlayer humanPlayer = new HumanPlayer(symbol,board,name);
	public static int correctcolumn;
	public void makeMove(Board board) {
		Scanner myObj = new Scanner(System.in);
		System.out.println(name + " "+ "enter column number");
		int userinput = myObj.nextInt();
		if (board.isColumnAvailable(userinput) == false) {
			
			reprompting();
			
			 
		} 
		else {
			correctcolumn = userinput;
		}
		
	
	
	    
	    board.insertintocell(correctcolumn,symbol);
	
	 
	    	/**if (board.mainboard[i][correctcolumn-1] == '_') {
	    		board.mainboard[i][correctcolumn-1] = symbol;
	    		break;
	    	}
	    	else {
	    		continue;
	    	}
	    }**/}

	    	
	

	public void reprompting() {
		Scanner user = new Scanner(System.in);
		System.out.println(name + " "+ "enter column number");
		int usersinput = user.nextInt();
		if (board.isColumnAvailable(usersinput) == false) {
			
			reprompting();
		}
		else {
			correctcolumn = usersinput;
		}
		
		
	}
	
  
	

}
