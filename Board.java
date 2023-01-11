

public class Board {

	private final int NUM_OF_COLUMNS = 7;
	private final int NUM_OF_ROW = 6;
	private char [] [] mainboard = new char [NUM_OF_ROW] [NUM_OF_COLUMNS];
	private int l;
	private int m;
	
	/* 
	 * The board object must contain the board state in some manner.
	 * You must decide how you will do this.
	 * 
	 * You may add addition private/public methods to this class is you wish.
	 * However, you should use best OO practices. That is, you should not expose
	 * how the board is being implemented to other classes. Specifically, the
	 * Player classes.
	 * 
	 * You may add private and public methods if you wish. In fact, to achieve
	 * what the assignment is asking, you'll have to
	 * 
	 */
	
	public Board() {
		
	}
	
	public void printBoard() {
		for (int i =0; i<NUM_OF_ROW; i++) {
			for (int j =0; j<NUM_OF_COLUMNS; j++) {
				
				
				System.out.print(mainboard[i][j] + "|");
				
				
			}
			System.out.println();
			
		}
	}
	
	public boolean checkhorizontal() {
		for (int i =0; i<NUM_OF_ROW; i++) {
			for (int j =0; j<NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+2] && mainboard[i][j+2]== mainboard[i][j+3] && mainboard[i][j+3]!= '_')  {
					
							return true;
						}
					}
				
			
		}
					
		
		return false;
		
		
	}
	
	
	public boolean checkvertical() {
		for (int i =0; i<NUM_OF_ROW-3; i++) {
			for (int j =0; j<NUM_OF_COLUMNS; j++) {
				if (mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+2][j] && mainboard[i+2][j]== mainboard[i+3][j] && mainboard[i+3][j]!= '_')  {
					
							return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean checkdiagonal1() {
		for (int i =0; i<NUM_OF_ROW-3; i++) {
			for (int j =0; j<NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+2][j+2] && mainboard[i+2][j+2]== mainboard[i+3][j+3] && mainboard[i+3][j+3]!= '_')  {
					
							return true;
							
						}
						
				}
				
				}
				return false;
		
		
	}
	
	public boolean checkdiagonal() {
		for (int i =0; i<(NUM_OF_ROW-3); i++) {
		 if (mainboard[i][i] == mainboard[i+1][i+1] && mainboard[i+1][i+1]== mainboard[i+2][i+2] && mainboard[i+2][i+2]== mainboard[i+3][i+3] && mainboard[i+3][i+3]!= '_')  {
				
							return true;
						}
		
					}
				
				
				
				
			
		
		return false;
		
		
	}
	
	public boolean checkdiagonal2() {
		for (int i =3; i<NUM_OF_ROW; i++) {
			for (int j =0; j<NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-2][j+2] && mainboard[i-2][j+2]== mainboard[i-3][j+3] && mainboard[i-3][j+3]!= '_')  {
					
							return true;
							
						}
				}
				
				}
				
			
		
		return false;
		
		
	}
	
	public boolean isColumnAvailable(int k) {
		
			for (int j =0; j<NUM_OF_ROW; j++) {
				if (mainboard[ j][k-1] == '_') {
					return true;
				}
				
			
			}
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	public boolean containsWin() {
		
	    if (checkhorizontal() || checkvertical() || checkdiagonal() || checkdiagonal1() || checkdiagonal2())  
	
	  {
		return true;
		
	  }
		return false;
	  }
	
	public boolean isTie() {
	if (containsWin()== false) {
		for (int i =0; i<NUM_OF_ROW; i++) {
			for (int j =0; j<NUM_OF_COLUMNS; j++) {
				if(mainboard[i][j]== '_') {
					return false;}
				
			    else {
			    	continue;
			    }
			    	
			    }
				
			}
		return true;
	}
	else {
		return true;
	}
	}
	   
		
	
	
	public void reset() {
		for (int i =0; i<NUM_OF_ROW; i++) {
			for (int j =0; j<NUM_OF_COLUMNS; j++) {
				mainboard[i][j]= '_';
		
	}
		}
	}
	
	public void insertintocell(int c,char s) {
		for (int i=NUM_OF_ROW-1; i>-1; i--) {
			
			 
	    	if (mainboard[i][c-1] == '_') {
	    		mainboard[i][c-1] = s;
	    		break;
	    	}
	    	else {
	    		continue;
	    	}
	    }
	}
	public boolean WecanWinhor(char s) {
		for (int i =NUM_OF_ROW-1; i> -1; i--) {
			for (int j =NUM_OF_COLUMNS-4; j>-1; j--) {
				if (mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+2] &&  mainboard[i][j+2]== s && mainboard[i][j+3] == '_') {
				 return true;
				}
				else if(mainboard[i][j] == mainboard[i][j+2] && mainboard[i][j+2]== mainboard[i][j+3] &&  mainboard[i][j+3]== s && mainboard[i][j+1] == '_') {
					return true;
				}
				else if(mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+3] &&  mainboard[i][j+3]== s && mainboard[i][j+2]== '_') {
					return true;
					
				}
				
			}
				
			}
		return false;
	}
	public boolean WecanWinver(char s) {
		for (int i =0; i< NUM_OF_ROW-3; i++) {
			for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+2][j] &&  mainboard[i+2][j]== s) {
				 return true;
				}
				else if(mainboard[i][j] == mainboard[i+2][j] && mainboard[i+2][j]== mainboard[i+3][j] &&  mainboard[i+3][j]== s && mainboard[i+1][j] == '_') {
					return true;
				}
				else if(mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+3][j] &&  mainboard[i+3][j]== s && mainboard[i+2][j]== '_') {
					return true;
				}
				
			}
				
			}
		return false;
	}
	public boolean WecanWindiag(char s) {
		for (int i =0; i< NUM_OF_ROW-3; i++) {
			for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+2][j+2] &&  mainboard[i+2][j+2]== s && mainboard[i+2][j+2]== '_') {
				return true;
				}
				else if(mainboard[i][j] == mainboard[i+2][j+2] && mainboard[i+2][j+2]== mainboard[i+3][j+3] &&  mainboard[i+2][j+2]== s && mainboard[i+1][j+1]== '_') {
					return true;
					
				}
                else if(mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+3][j+3] &&  mainboard[i+3][j+3]== s && mainboard[i+2][j+2]== '_') {
                	return true;
					
				}
				
			}
				
			}
		return false;
	}
	
	public boolean WecanWindiagtoo(char s) {
		for (int i =3; i< NUM_OF_ROW; i++) {
			for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-2][j+2] && mainboard[i-2][j+2]== s && mainboard[i-3][j+3]== '_') {
				return true;
				}
				else if(mainboard[i][j] == mainboard[i-2][j+2] && mainboard[i-2][j+2]== mainboard[i-3][j+3] &&  mainboard[i-3][j+3]== s && mainboard[i-1][j+1]== '_') {
					return true;
					
				}
                else if(mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-3][j+3] &&  mainboard[i-3][j+3]== s && mainboard[i-2][j+2]== '_') {
                	return true;
					
				}
				
			}
				
			}
		return false;
	}
	
	
	
	
	
	
	
	
	public void LetsWindiag(char s) {
		for (int i =0; i< NUM_OF_ROW-3; i++) {
			for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+2][j+2] && mainboard[i+2][j+2]== s) {
					mainboard[i+3][j+3] = s;
					}
					else if(mainboard[i][j] == mainboard[i+2][j+2] && mainboard[i+2][j+2]== mainboard[i+3][j+3] &&  mainboard[i+2][j+2]== s&& mainboard[i+1][j+1]== '_') {
					   mainboard[i+1][j+1] = s;
					}
						
						
					
	                else if(mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+3][j+3] &&  mainboard[i+3][j+3]== s && mainboard[i+2][j+2]== '_') {
	                	mainboard[i+2][j+2] = s;
	                
	                }	
				}
			}
		}
			
				
			
		
				
			
	
	
	
	public void LetsWindiagtoo(char s) {
		for (int i =3; i< NUM_OF_ROW-3; i++) {
			for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
				if (mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-2][j+2] && mainboard[i-2][j+2]== s) {
				mainboard[i-3][j+3] = s;
				}
				else if(mainboard[i][j] == mainboard[i-2][j+2] && mainboard[i-2][j+2]==mainboard[i-3][j+3] &&  mainboard[i-3][j+3]== s && mainboard[i-1][j+1]== '_') {
				 mainboard[i-1][j+1] = s;
				}
					
					
				
                else if(mainboard[i][j] ==mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-3][j+3] &&  mainboard[i-3][j+3]== s && mainboard[i-2][j+2]== '_') {
                	mainboard[i-2][j+2] = s;
                
                }	
			}
		}
	}
	
	
	
	
		
		public void LetsWinhor(char s) {
			for (int i =NUM_OF_ROW-1; i> -1; i--) {
				for (int j =3; j> -1; j--) {
					if (mainboard[i][j] ==mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+2] && mainboard[i][j+2]== s) {
					mainboard[i][j+3] = s;
					}
					else if(mainboard[i][j] ==mainboard[i][j+2] && mainboard[i][j+2]== mainboard[i][j+3] &&  mainboard[i][j+3]== s && mainboard[i][j+1] == '_') {
					 mainboard[i][j+1] = s;
					}
					else if(mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+3] &&  mainboard[i][j+3]== s && mainboard[i][j+2]== '_') {
						mainboard[i][j+2] = s;
					}
					
				}
					
				}
		
	}
		public void LetsWinver(char s) {
			for (int i =0; i< NUM_OF_ROW-3; i++) {
				for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
					if (mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+2][j] && mainboard[i+2][j]== s) {
					 mainboard[i+3][j] = s;
					}
					else if(mainboard[i][j] == mainboard[i+2][j] && mainboard[i+2][j]== mainboard[i+3][j] &&  mainboard[i+3][j]== s && mainboard[i+1][j] == '_') {
						mainboard[i+1][j] = s;
					}
					else if(mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+3][j] &&  mainboard[i+3][j]== s && mainboard[i+2][j]== '_') {
						mainboard[i+2][j] = s;
					}
					
				}
					
				}
			
		}
	
		public void BlocktheirWinhor(char s) {
			mainboard[l][m] = s;
			
		}
			/**for (int i =5; i> -1; i--) {
				for (int j =3; j> -1; j--) {
					if (mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+2] && mainboard[i][j+2]!= s && mainboard[i][j+2]!= '_' ) {
					    mainboard[i][j+3] = s;
					   
					   
					}
					else if(mainboard[i][j] == mainboard[i][j+2] && mainboard[i][j+2]== mainboard[i][j+3] &&  mainboard[i][j+3]!= s && mainboard[i][j+3] != '_') {
						mainboard[i][j+1] = s;
						
						
						
						}
					else if(mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+3] && mainboard[i][j+3]!= s && mainboard[i][j+3]== '_') {
						mainboard[i][j+2] = s;
					
						
					}
					
					
				}**/
					
				
		
	
	
		public void BlocktheirWinver(char s) {
			mainboard[l][m] = s;
			/**for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+2][j] && mainboard[i+2][j]!= s && mainboard[i+2][j]!= '_') {
					 mainboard[i+3][j] = s;
					}
					else if(mainboard[i][j] == mainboard[i+2][j] && mainboard[i+2][j]== mainboard[i+3][j] && mainboard[i+3][j]!= s && mainboard[i+3][j] != '_') {
						mainboard[i+1][j] = s;
					}
					else if(mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+3][j] &&  mainboard[i+3][j]!= s && mainboard[i+3][j]!= '_') {
						mainboard[i+2][j] = s;
					}
					
				}
					
				}**/
			
		}
		
		public void Blocktheirwindiag(char s) {
			mainboard[l][m] = s;
			/**for (int i =0; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+2][j+2] && mainboard[i+2][j+2]!= s && mainboard[i+2][j+2]!= '_') {
						mainboard[i+3][j+3] = s;
						}
						else if(mainboard[i][j] == mainboard[i+2][j+2] && mainboard[i+2][j+2]== mainboard[i+3][j+3] && mainboard[i+3][j+3]!= s && mainboard[i+3][j+3]!= '_') {
						   mainboard[i+1][j+1] = s;
						}
							
							
						
		                else if(mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+3][j+3] &&  mainboard[i+3][j+3]!= s && mainboard[i+3][j+3]!= '_') {
		                	mainboard[i+2][j+2] = s;
		                
		                }	
					}
				}**/
			}
		
		public void Blocktheirwindiag2(char s) {
			mainboard[l][m] = s;
			/**for (int i =3; i< 6-3; i++) {
				for (int j =0; j< 7-3; j++) {
					if (mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-2][j+2] && mainboard[i-2][j+2]!= s && mainboard[i-2][j+2]!= '_') {
					mainboard[i-3][j+3] = s;
					}
					else if(mainboard[i][j] == mainboard[i-2][j+2] && mainboard[i-2][j+2]== mainboard[i-3][j+3] &&  mainboard[i-3][j+3]!= s && mainboard[i-3][j+3]!= '_') {
					 mainboard[i-1][j+1] = s;
					}
						
						
					
	                else if(mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-3][j+3] &&  mainboard[i-3][j+3]!= s && mainboard[i-3][j+3]!= '_') {
	                	mainboard[i-2][j+2] = s;
	                
	                }	
				}
			}**/
		}
		
			
		
			

		
		
		
		
		
		
		
		public boolean TheycanWinhor(char s) {
			for (int i =NUM_OF_ROW-1; i> -1; i--) {
				for (int j =3; j> -1; j--) {
					if (mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+2] && mainboard[i][j+2]!= s &&  mainboard[i][j+2]!= '_') {
						l = i;
						m = j+3;
					 return true;
					}
					else if(mainboard[i][j] == mainboard[i][j+2] && mainboard[i][j+2]== mainboard[i][j+3] &&  mainboard[i][j+3]!= s && mainboard[i][j+3] != '_') {
						l = i;
						m = j+1;
						return true;
					}
					else if(mainboard[i][j] == mainboard[i][j+1] && mainboard[i][j+1]== mainboard[i][j+3] &&  mainboard[i][j+3]!= s && mainboard[i][j+3]!= '_') {
						l = i;
						m = j+2;
						return true;
					}
					
				}
					
				}
			return false;
		}
	
		public boolean TheycanWinver(char s) {
			for (int i =2; i>-1; i--) {
				for (int j =NUM_OF_COLUMNS-1; j>-1; j--) {
					if (mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]==mainboard[i+2][j] &&  mainboard[i+2][j]!= s &&  mainboard[i+2][j]!= '_') {
					l = i;
					m = i+3;
					 return true;
					}
					else if(mainboard[i][j] == mainboard[i+2][j] && mainboard[i+2][j]== mainboard[i+3][j] &&  mainboard[i+3][j]!= s && mainboard[i+3][j] != '_') {
						l = i+1;
						m = j;
						return true;
					}
					else if(mainboard[i][j] == mainboard[i+1][j] && mainboard[i+1][j]== mainboard[i+3][j] &&  mainboard[i+3][j]!= s && mainboard[i+3][j]!= '_') {
						l = i+2;
						m = j;
						return true;
					}
					else if(mainboard[i+1][j] == mainboard[i+2][j] && mainboard[i+2][j]== mainboard[i+3][j] &&  mainboard[i+3][j]!= s && mainboard[i+3][j]!= '_') {
						l = i;
						m = j;
						return true;
					}
					
					
				}
					
				}
			return false;
		}
		
		public boolean TheycanWindiag(char s) {
			for (int i =0; i< NUM_OF_ROW-3; i++) {
				for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
					if (mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+2][j+2] &&  mainboard[i+2][j+2]!= s && mainboard[i+2][j+2]!= '_') {
						l = i+3;
						m = j+3;
					return true;
					}
					else if(mainboard[i][j] == mainboard[i+2][j+2] && mainboard[i+2][j+2]== mainboard[i+3][j+3] && mainboard[i+3][j+3]!= s && mainboard[i+3][j+3]!= '_') {
						l = i+1;
						m = j+1;
						return true;
						
					}
	                else if(mainboard[i][j] == mainboard[i+1][j+1] && mainboard[i+1][j+1]== mainboard[i+3][j+3] &&  mainboard[i+3][j+3]!= s && mainboard[i+3][j+3]!= '_') {
	                	l = j+2;
	                	m = j+2;
	                	return true;
						
					}
					
				}
					
			}
			return false;
			
			
		}
		public boolean TheycanWindiagtoo(char s) {
			for (int i =3; i< NUM_OF_ROW; i++) {
				for (int j =0; j< NUM_OF_COLUMNS-3; j++) {
					if (mainboard[i][j] == mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-2][j+2] &&  mainboard[i-2][j+2]!= s && mainboard[i-2][j+2]!= '_') {
						l = i-3;
						m = j + 3;
					return true;
					}
					else if(mainboard[i][j] == mainboard[i-2][j+2] && mainboard[i-2][j+2]== mainboard[i-3][j+3] &&  mainboard[i-3][j+3]!= s && mainboard[i-3][j+3]!= '_') {
						l= i-1;
						m = j+1;
						return true;
						
					}
	                else if(mainboard[i][j] ==mainboard[i-1][j+1] && mainboard[i-1][j+1]== mainboard[i-3][j+3] && mainboard[i-3][j+3]!= s && mainboard[i-3][j+3]!= '_') {
	                	l = i-2;
	                	m = j+2;
	                	return true;
						
					}
					
				}
					
				}
			return false;
		}

	
}
	

