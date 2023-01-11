
import java.util.Random;

class AIPlayer extends Player{
	
	public AIPlayer(char symbol, Board board, String name) {
		super(symbol, board, name);
		
	}

	public void makeMove(Board board) {
		Random rand = new Random();
		int upperbound = 6;
		int lowerbound = 1;
		//int int_random = rand.nextInt(upperbound);
		int int_random2 = rand.nextInt(upperbound - lowerbound) + lowerbound;;
		
		if (board.WecanWinhor(symbol)) {
			board.LetsWinhor(symbol);
		}
		else if (board.WecanWinver(symbol)) {
			board.LetsWinver(symbol);
		}
		else if (board.WecanWindiag(symbol)) {
	    	board.LetsWindiag(symbol);
	    }
		else if (board.WecanWindiagtoo(symbol)) {
			board.LetsWindiagtoo(symbol);
	    }
		
		else if(board.TheycanWinver(symbol)) {
			board.BlocktheirWinver(symbol);
	    }
		else if(board.TheycanWinhor(symbol)) {
			board.BlocktheirWinhor(symbol);
	    }
		else if(board.TheycanWindiag(symbol)) {
			board.Blocktheirwindiag(symbol);
	    }
		else if(board.TheycanWindiagtoo(symbol)) {
			board.Blocktheirwindiag2(symbol);
	    }
		/**else {
			board.insertintocell(int_random2, symbol);
			}**/
		board.insertintocell(int_random2, symbol);
	}
	   
	
	public char Extractsymbol() {
		return symbol;
	}
	
	
	
	
	
	
			/**if (board.mainboard[5][int_random2]== '_') {
						board.mainboard[5][int_random2]= symbol;
			           
			
					}
			else 
				if (board.mainboard[4][int_random2]== '_') {
							board.mainboard[4][int_random2]= symbol;
							
				           
				
						}
				else 
					if (board.mainboard[3][int_random2]== '_') {
								board.mainboard[3][int_random2]= symbol;}
								
								
					else 
						if (board.mainboard[2][int_random2]== '_') {
									board.mainboard[2][int_random2]= symbol;
					           
					
							}
						else 
							if (board.mainboard[1][int_random2]== '_') {
										board.mainboard[1][int_random2]= symbol;
							}
							else 
								if (board.mainboard[0][int_random2]== '_') {
											board.mainboard[0][int_random2]= symbol;
								}
		
			//TODO
		}**/
			

		
		
	    	
	    

	
		
		
	
	
	/**public boolean WecanWinhor() {
		for (int i =0; i< 6-3; i++) {
			for (int j =0; j< 7-3; j++) {
				if (board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+2] &&  board.mainboard[i][j+2]== symbol && board.mainboard[i][j+3] == '_') {
				 return true;
				}
				else if(board.mainboard[i][j] == board.mainboard[i][j+2] && board.mainboard[i][j+2]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]== symbol && board.mainboard[i][j+1] == '_') {
					return true;
				}
				else if(board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]== symbol && board.mainboard[i][j+2]== '_') {
					return true;
					
				}
				
			}
				
			}
		return false;
	}
	public boolean WecanWinver() {
		for (int i =0; i< 6-3; i++) {
			for (int j =0; j< 7-3; j++) {
				if (board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+2][j] &&  board.mainboard[i+2][j]== symbol) {
				 return true;
				}
				else if(board.mainboard[i][j] == board.mainboard[i+2][j] && board.mainboard[i+2][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]== symbol && board.mainboard[i+1][j] == '_') {
					return true;
				}
				else if(board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]== symbol && board.mainboard[i+2][j]== '_') {
					return true;
				}
				
			}
				
			}
		return false;
	}
	public boolean WecanWindiag() {
		for (int i =0; i< 6-3; i++) {
			for (int j =0; j< 7-3; j++) {
				if (board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+2][j+2] &&  board.mainboard[i+2][j+2]== symbol && board.mainboard[i+2][j+2]== '_') {
				return true;
				}
				else if(board.mainboard[i][j] == board.mainboard[i+2][j+2] && board.mainboard[i+2][j+2]== board.mainboard[i+3][j+3] &&  board.mainboard[i+2][j+2]== symbol && board.mainboard[i+1][j+1]== '_') {
					return true;
					
				}
                else if(board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+3][j+3] &&  board.mainboard[i+3][j+3]== symbol && board.mainboard[i+2][j+2]== '_') {
                	return true;
					
				}
				
			}
				
			}
		return false;
	}
	
	public boolean WecanWindiagtoo() {
		for (int i =3; i< 6; i++) {
			for (int j =0; j< 7-3; j++) {
				if (board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-2][j+2] &&  board.mainboard[i-2][j+2]== symbol && board.mainboard[i-3][j+3]== '_') {
				return true;
				}
				else if(board.mainboard[i][j] == board.mainboard[i-2][j+2] && board.mainboard[i-2][j+2]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]== symbol && board.mainboard[i-1][j+1]== '_') {
					return true;
					
				}
                else if(board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]== symbol && board.mainboard[i-2][j+2]== '_') {
                	return true;
					
				}
				
			}
				
			}
		return false;
	}
	
	
	
	
	
	
	
	
	public void LetsWindiag() {
		for (int i =0; i< 6-3; i++) {
			for (int j =0; j< 7-3; j++) {
				if (board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+2][j+2] && board.mainboard[i+2][j+2]== symbol) {
					board.mainboard[i+3][j+3] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+2][j+2] && board.mainboard[i+2][j+2]== board.mainboard[i+3][j+3] &&  board.mainboard[i+2][j+2]== symbol && board.mainboard[i+1][j+1]== '_') {
					   board.mainboard[i+1][j+1] = symbol;
					}
						
						
					
	                else if(board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+3][j+3] &&  board.mainboard[i+3][j+3]== symbol && board.mainboard[i+2][j+2]== '_') {
	                	board.mainboard[i+2][j+2] = symbol;
	                
	                }	
				}
			}
		}
			
				
			
		
				
			
	
	
	
	public void LetsWindiagtoo() {
		for (int i =3; i< 6-3; i++) {
			for (int j =0; j< 7-3; j++) {
				if (board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-2][j+2] && board.mainboard[i-2][j+2]== symbol) {
				board.mainboard[i-3][j+3] = symbol;
				}
				else if(board.mainboard[i][j] == board.mainboard[i-2][j+2] && board.mainboard[i-2][j+2]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]== symbol && board.mainboard[i-1][j+1]== '_') {
				   board.mainboard[i-1][j+1] = symbol;
				}
					
					
				
                else if(board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]== symbol && board.mainboard[i-2][j+2]== '_') {
                	board.mainboard[i-2][j+2] = symbol;
                
                }	
			}
		}
	}
	
	
	
	
		
		public void LetsWinhor() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+2] && board.mainboard[i][j+2]== symbol) {
					 board.mainboard[i][j+3] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i][j+2] && board.mainboard[i][j+2]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]== symbol && board.mainboard[i][j+1] == '_') {
					 board.mainboard[i][j+1] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]== symbol && board.mainboard[i][j+2]== '_') {
						board.mainboard[i][j+2] = symbol;
					}
					
				}
					
				}
		
	}
		public void LetsWinver() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+2][j] && board.mainboard[i+2][j]== symbol) {
					 board.mainboard[i+3][j] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+2][j] && board.mainboard[i+2][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]== symbol && board.mainboard[i+1][j] == '_') {
						board.mainboard[i+1][j] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]== symbol && board.mainboard[i+2][j]== '_') {
						board.mainboard[i+2][j] = symbol;
					}
					
				}
					
				}
			
		}
	
		public void BlocktheirWinhor() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+2] && board.mainboard[i][j+2]!= symbol && board.mainboard[i][j+2]!= '_' ) {
					 board.mainboard[i][j+3] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i][j+2] && board.mainboard[i][j+2]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]!= symbol && board.mainboard[i][j+3] != '_') {
						 board.mainboard[i][j+1] = symbol;
						}
					else if(board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]!= symbol && board.mainboard[i][j+3]== '_') {
						board.mainboard[i][j+2] = symbol;
					}
					
				}
					
				}
		
	}
	
		public void BlocktheirWinver() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+2][j] && board.mainboard[i+2][j]!= symbol && board.mainboard[i+2][j]!= '_') {
					 board.mainboard[i+3][j] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+2][j] && board.mainboard[i+2][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]!= symbol && board.mainboard[i+3][j] != '_') {
						board.mainboard[i+1][j] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]!= symbol && board.mainboard[i+3][j]!= '_') {
						board.mainboard[i+2][j] = symbol;
					}
					
				}
					
				}
			
		}
		
		public void Blocktheirwindiag() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+2][j+2] && board.mainboard[i+2][j+2]!= symbol && board.mainboard[i+2][j+2]!= '_') {
						board.mainboard[i+3][j+3] = symbol;
						}
						else if(board.mainboard[i][j] == board.mainboard[i+2][j+2] && board.mainboard[i+2][j+2]== board.mainboard[i+3][j+3] &&  board.mainboard[i+3][j+3]!= symbol && board.mainboard[i+3][j+3]!= '_') {
						   board.mainboard[i+1][j+1] = symbol;
						}
							
							
						
		                else if(board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+3][j+3] &&  board.mainboard[i+3][j+3]!= symbol && board.mainboard[i+3][j+3]!= '_') {
		                	board.mainboard[i+2][j+2] = symbol;
		                
		                }	
					}
				}
			}
		
		public void Blocktheirwindiag2() {
			for (int i =3; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-2][j+2] && board.mainboard[i-2][j+2]!= symbol && board.mainboard[i-2][j+2]!= '_') {
					board.mainboard[i-3][j+3] = symbol;
					}
					else if(board.mainboard[i][j] == board.mainboard[i-2][j+2] && board.mainboard[i-2][j+2]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]!= symbol && board.mainboard[i-3][j+3]!= '_') {
					   board.mainboard[i-1][j+1] = symbol;
					}
						
						
					
	                else if(board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]!= symbol && board.mainboard[i-3][j+3]!= '_') {
	                	board.mainboard[i-2][j+2] = symbol;
	                
	                }	
				}
			}
		}
		
			
		
			

		
		
		
		
		
		
		
		public boolean TheycanWinhor() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+2] &&  board.mainboard[i][j+2]!= symbol &&  board.mainboard[i][j+2]!= '_') {
					 return true;
					}
					else if(board.mainboard[i][j] == board.mainboard[i][j+2] && board.mainboard[i][j+2]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]!= symbol && board.mainboard[i][j+3] != '_') {
						return true;
					}
					else if(board.mainboard[i][j] == board.mainboard[i][j+1] && board.mainboard[i][j+1]== board.mainboard[i][j+3] &&  board.mainboard[i][j+3]!= symbol && board.mainboard[i][j+3]!= '_') {
						return true;
					}
					
				}
					
				}
			return false;
		}
	
		public boolean TheycanWinver() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7; j++) {
					if (board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+2][j] &&  board.mainboard[i+2][j]!= symbol &&  board.mainboard[i+2][j]!= '_') {
					 return true;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+2][j] && board.mainboard[i+2][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]!= symbol && board.mainboard[i+3][j] != '_') {
						return true;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+1][j] && board.mainboard[i+1][j]== board.mainboard[i+3][j] &&  board.mainboard[i+3][j]!= symbol && board.mainboard[i+3][j]!= '_') {
						return true;
					}
					
					
				}
					
				}
			return false;
		}
		
		public boolean TheycanWindiag() {
			for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+2][j+2] &&  board.mainboard[i+2][j+2]!= symbol && board.mainboard[i+2][j+2]!= '_') {
					return true;
					}
					else if(board.mainboard[i][j] == board.mainboard[i+2][j+2] && board.mainboard[i+2][j+2]== board.mainboard[i+3][j+3] &&  board.mainboard[i+3][j+3]!= symbol && board.mainboard[i+3][j+3]!= '_') {
						return true;
						
					}
	                else if(board.mainboard[i][j] == board.mainboard[i+1][j+1] && board.mainboard[i+1][j+1]== board.mainboard[i+3][j+3] &&  board.mainboard[i+3][j+3]!= symbol && board.mainboard[i+3][j+3]!= '_') {
	                	return true;
						
					}
					
				}
					
			}
			return false;
			
			
		}
		public boolean TheycanWindiagtoo() {
			for (int i =3; i< 6; i++) {
				for (int j =0; j< 7-3; j++) {
					if (board.mainboard[i][j] == board.mainboard[i-1][j+1] && board.mainboard[i-1][j+1]== board.mainboard[i-2][j+2] &&  board.mainboard[i-2][j+2]!= symbol && board.mainboard[i-2][j+2]!= '_') {
					return true;
					}
					else if(board.mainboard[i][j] == board.mainboard[i-2][j+2] && board.mainboard[i-2][j+2]== board.mainboard[i-3][j+3] &&  board.mainboard[i-3][j+3]!= symbol && board.mainboard[i-3][j+3]!= '_') {
						return true;
						
					}
	          **/	
		
		

}
