import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class BattleShips {

	public static ArrayList<ArrayList<String>> p1List = new ArrayList<ArrayList<String>>();
	public static ArrayList<ArrayList<String>> p2List = new ArrayList<ArrayList<String>>();
	public static ArrayList<ArrayList<String>> p1Hidden = new ArrayList<ArrayList<String>>();
	public static ArrayList<ArrayList<String>> p2Hidden = new ArrayList<ArrayList<String>>();
	
	public static int p1HitCount = 0;
	public static int p2HitCount = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> p1r1 = new ArrayList<String>();
		ArrayList<String> p1r2 = new ArrayList<String>();
		ArrayList<String> p1r3 = new ArrayList<String>();
		ArrayList<String> p1r4 = new ArrayList<String>();
		ArrayList<String> p1r5 = new ArrayList<String>();
		ArrayList<String> p1r6 = new ArrayList<String>();
		ArrayList<String> p1r7 = new ArrayList<String>();
		ArrayList<String> p1r8 = new ArrayList<String>();
		ArrayList<String> p1r9 = new ArrayList<String>();
		ArrayList<String> p1r10 = new ArrayList<String>();
		ArrayList<String> p1r11 = new ArrayList<String>();

		ArrayList<String> p2r1 = new ArrayList<String>();
		ArrayList<String> p2r2 = new ArrayList<String>();
		ArrayList<String> p2r3 = new ArrayList<String>();
		ArrayList<String> p2r4 = new ArrayList<String>();
		ArrayList<String> p2r5 = new ArrayList<String>();
		ArrayList<String> p2r6 = new ArrayList<String>();
		ArrayList<String> p2r7 = new ArrayList<String>();
		ArrayList<String> p2r8 = new ArrayList<String>();
		ArrayList<String> p2r9 = new ArrayList<String>();
		ArrayList<String> p2r10 = new ArrayList<String>();
		ArrayList<String> p2r11 = new ArrayList<String>();
		
		ArrayList<String> r1h = new ArrayList<String>();
		ArrayList<String> r2h = new ArrayList<String>();
		ArrayList<String> r3h = new ArrayList<String>();
		ArrayList<String> r4h = new ArrayList<String>();
		ArrayList<String> r5h = new ArrayList<String>();
		ArrayList<String> r6h = new ArrayList<String>();
		ArrayList<String> r7h = new ArrayList<String>();
		ArrayList<String> r8h = new ArrayList<String>();
		ArrayList<String> r9h = new ArrayList<String>();
		ArrayList<String> r10h = new ArrayList<String>();
		ArrayList<String> r11h = new ArrayList<String>();
		
		ArrayList<String> r1h2 = new ArrayList<String>();
		ArrayList<String> r2h2 = new ArrayList<String>();
		ArrayList<String> r3h2 = new ArrayList<String>();
		ArrayList<String> r4h2 = new ArrayList<String>();
		ArrayList<String> r5h2 = new ArrayList<String>();
		ArrayList<String> r6h2 = new ArrayList<String>();
		ArrayList<String> r7h2 = new ArrayList<String>();
		ArrayList<String> r8h2 = new ArrayList<String>();
		ArrayList<String> r9h2 = new ArrayList<String>();
		ArrayList<String> r10h2 = new ArrayList<String>();
		ArrayList<String> r11h2 = new ArrayList<String>();	

		ArrayList<Integer> p1ShipsPlaced = new ArrayList<Integer>();
		ArrayList<Integer> p2ShipsPlaced = new ArrayList<Integer>();

		p1r1.addAll(Arrays.asList(" -","1","2","3","4","5","6","7","8","9","10"));
		p1r2.addAll(Arrays.asList(" 1","~","~","~","~","~","~","~","~","~","~"));
		p1r3.addAll(Arrays.asList(" 2","~","~","~","~","~","~","~","~","~","~"));
		p1r4.addAll(Arrays.asList(" 3","~","~","~","~","~","~","~","~","~","~"));
		p1r5.addAll(Arrays.asList(" 4","~","~","~","~","~","~","~","~","~","~"));
		p1r6.addAll(Arrays.asList(" 5","~","~","~","~","~","~","~","~","~","~"));
		p1r7.addAll(Arrays.asList(" 6","~","~","~","~","~","~","~","~","~","~"));
		p1r8.addAll(Arrays.asList(" 7","~","~","~","~","~","~","~","~","~","~"));
		p1r9.addAll(Arrays.asList(" 8","~","~","~","~","~","~","~","~","~","~"));
		p1r10.addAll(Arrays.asList(" 9","~","~","~","~","~","~","~","~","~","~"));
		p1r11.addAll(Arrays.asList("10","~","~","~","~","~","~","~","~","~","~"));
		
		p2r1.addAll(Arrays.asList(" -","1","2","3","4","5","6","7","8","9","10"));
		p2r2.addAll(Arrays.asList(" 1","~","~","~","~","~","~","~","~","~","~"));
		p2r3.addAll(Arrays.asList(" 2","~","~","~","~","~","~","~","~","~","~"));
		p2r4.addAll(Arrays.asList(" 3","~","~","~","~","~","~","~","~","~","~"));
		p2r5.addAll(Arrays.asList(" 4","~","~","~","~","~","~","~","~","~","~"));
		p2r6.addAll(Arrays.asList(" 5","~","~","~","~","~","~","~","~","~","~"));
		p2r7.addAll(Arrays.asList(" 6","~","~","~","~","~","~","~","~","~","~"));
		p2r8.addAll(Arrays.asList(" 7","~","~","~","~","~","~","~","~","~","~"));
		p2r9.addAll(Arrays.asList(" 8","~","~","~","~","~","~","~","~","~","~"));
		p2r10.addAll(Arrays.asList(" 9","~","~","~","~","~","~","~","~","~","~"));
		p2r11.addAll(Arrays.asList("10","~","~","~","~","~","~","~","~","~","~"));

		r1h.addAll(Arrays.asList(" -","1","2","3","4","5","6","7","8","9","10"));
		r2h.addAll(Arrays.asList(" 1","~","~","~","~","~","~","~","~","~","~"));
		r3h.addAll(Arrays.asList(" 2","~","~","~","~","~","~","~","~","~","~"));
		r4h.addAll(Arrays.asList(" 3","~","~","~","~","~","~","~","~","~","~"));
		r5h.addAll(Arrays.asList(" 4","~","~","~","~","~","~","~","~","~","~"));
		r6h.addAll(Arrays.asList(" 5","~","~","~","~","~","~","~","~","~","~"));
		r7h.addAll(Arrays.asList(" 6","~","~","~","~","~","~","~","~","~","~"));
		r8h.addAll(Arrays.asList(" 7","~","~","~","~","~","~","~","~","~","~"));
		r9h.addAll(Arrays.asList(" 8","~","~","~","~","~","~","~","~","~","~"));
		r10h.addAll(Arrays.asList(" 9","~","~","~","~","~","~","~","~","~","~"));
		r11h.addAll(Arrays.asList("10","~","~","~","~","~","~","~","~","~","~"));	
		
		r1h2.addAll(Arrays.asList(" -","1","2","3","4","5","6","7","8","9","10"));
		r2h2.addAll(Arrays.asList(" 1","~","~","~","~","~","~","~","~","~","~"));
		r3h2.addAll(Arrays.asList(" 2","~","~","~","~","~","~","~","~","~","~"));
		r4h2.addAll(Arrays.asList(" 3","~","~","~","~","~","~","~","~","~","~"));
		r5h2.addAll(Arrays.asList(" 4","~","~","~","~","~","~","~","~","~","~"));
		r6h2.addAll(Arrays.asList(" 5","~","~","~","~","~","~","~","~","~","~"));
		r7h2.addAll(Arrays.asList(" 6","~","~","~","~","~","~","~","~","~","~"));
		r8h2.addAll(Arrays.asList(" 7","~","~","~","~","~","~","~","~","~","~"));
		r9h2.addAll(Arrays.asList(" 8","~","~","~","~","~","~","~","~","~","~"));
		r10h2.addAll(Arrays.asList(" 9","~","~","~","~","~","~","~","~","~","~"));
		r11h2.addAll(Arrays.asList("10","~","~","~","~","~","~","~","~","~","~"));

		p1List.add(p1r1);
		p1List.add(p1r2);
		p1List.add(p1r3);
		p1List.add(p1r4);
		p1List.add(p1r5);
		p1List.add(p1r6);
		p1List.add(p1r7);
		p1List.add(p1r8);
		p1List.add(p1r9);
		p1List.add(p1r10);
		p1List.add(p1r11);
		p2List.add(p2r1);
		p2List.add(p2r2);
		p2List.add(p2r3);
		p2List.add(p2r4);
		p2List.add(p2r5);
		p2List.add(p2r6);
		p2List.add(p2r7);
		p2List.add(p2r8);
		p2List.add(p2r9);
		p2List.add(p2r10);
		p2List.add(p2r11);
		
		p1Hidden.add(r1h);
		p1Hidden.add(r2h);
		p1Hidden.add(r3h);
		p1Hidden.add(r4h);
		p1Hidden.add(r5h);
		p1Hidden.add(r6h);
		p1Hidden.add(r7h);
		p1Hidden.add(r8h);
		p1Hidden.add(r9h);
		p1Hidden.add(r10h);
		p1Hidden.add(r11h);
		
		p2Hidden.add(r1h2);
		p2Hidden.add(r2h2);
		p2Hidden.add(r3h2);
		p2Hidden.add(r4h2);
		p2Hidden.add(r5h2);
		p2Hidden.add(r6h2);
		p2Hidden.add(r7h2);
		p2Hidden.add(r8h2);
		p2Hidden.add(r9h2);
		p2Hidden.add(r10h2);
		p2Hidden.add(r11h2);
		
		displayBoard("start");
		
		String message = "";
		int shipLength = 0;
		
		for(int i=1; i<7; i++){
			switch (i) {
			case 1: 
				message = "Player 1: Place your Patrol Boat 1x2 (Format: x,y,R|D)";
				shipLength = 2;
				break;
			case 2:
				message = "Player 1: Place your first Battleship 1x3 (Format: x,y,R|D)";
				shipLength = 3;
				break;
			case 3:
				message = "Player 1: Place your second Battleship 1x3 (Format: x,y,R|D)";
				shipLength = 3;
				break;
			case 4:
				message = "Player 1: Place your Submarine 1x3 (Format: x,y,R|D)";
				shipLength = 3;
				break;
			case 5:
				message = "Player 1: Place your Destroyer 1x4 (Format: x,y,R|D)";
				shipLength = 4;
				break;
			case 6:
				message = "Player 1: Place your Carrier 1x5 (Format: x,y,R|D)";
				shipLength = 5;
				break;
			}
			addShip(message, shipLength, "p1");
		}
		hideScreen();
		displayBoard("p2");
		for(int i=1; i<7; i++){
			switch (i) {
			case 1: 
				message = "Player 2: Place your Patrol Boat 1x2 (Format: x,y,R|D)";
				shipLength = 2;
				break;
			case 2:
				message = "Player 2: Place your first Battleship 1x3 (Format: x,y,R|D)";
				shipLength = 3;
				break;
			case 3:
				message = "Player 2: Place your second Battleship 1x3 (Format: x,y,R|D)";
				shipLength = 3;
				break;
			case 4:
				message = "Player 2: Place your Submarine 1x3 (Format: x,y,R|D)";
				shipLength = 3;
				break;
			case 5:
				message = "Player 2: Place your Destroyer 1x4 (Format: x,y,R|D)";
				shipLength = 4;
				break;
			case 6:
				message = "Player 2: Place your Carrier 1x5 (Format: x,y,R|D)";
				shipLength = 5;
				break;
			}
			addShip(message, shipLength, "p2");
		}
		hideScreen();
		displayBoard("");
		playGame();
	}

	public static void hideScreen() {
		for (int i=0; i<100; i++) {
			System.out.println("");
		}
	}

	public static void playGame() {
		Scanner sc=new Scanner(System.in);
		boolean winner = false;
		boolean validMove = true;
		String currentPlayer = "p1";
		String msg = "";
		String move = "";
		String[] xyShot = null;
		do {
			if (currentPlayer == "p1") {
				msg = "Player 1:";
			} else {
				msg = "Player 2:";
			}
			do {
				System.out.println(msg + " take your turn (x,y)");
				move = sc.next();
				xyShot = move.split(",");
				if ((Integer.parseInt(xyShot[0]) > 10) | (Integer.parseInt(xyShot[1]) > 10) | (Integer.parseInt(xyShot[0]) < 1) | (Integer.parseInt(xyShot[1]) < 1)) {
					validMove = false;
					System.out.println(msg + " Invalid move");
				} else {
					validMove = checkShot(Integer.parseInt(xyShot[0]),Integer.parseInt(xyShot[1]),currentPlayer);
				}
				if (validMove == true) {
					if (currentPlayer == "p1") {
						currentPlayer = "p2";
					} else {
						currentPlayer = "p1";
					}
				}
			} while (!validMove);
			if ((p1HitCount == 20) | (p2HitCount == 20)) {
				winner = true;
				if (currentPlayer == "p1") {
					System.out.println("Player 1 Wins!! Congratulations");
				} else {
					System.out.println("Player 1 Wins!! Congratulations");
				}
			}
		} while (!winner);
	}
	
	public static boolean checkShot(int y, int x, String player) {
		if (player == "p1") {
			if (p2List.get(x).get(y) == "S") {
				if (p2Hidden.get(x).get(y) == "X") {
					System.out.println("Already shot at this spot, try again");
				} else {
					System.out.println("A direct hit! Take another shot..");
				}
				p2Hidden.get(x).set(y, "X");
				displayBoard("");
				p1HitCount++;
				return false;
			} else {
				if ((p2List.get(x).get(y) == "X") | (p2List.get(x).get(y) == "O")) {
					System.out.println("Already shot at this spot, try again");
					displayBoard("");
					return false;
				} else {
					p2Hidden.get(x).set(y, "O");
					displayBoard("");
					return true;
				}
			}
		} else {
			if (p1List.get(x).get(y) == "S") {
				if (p1Hidden.get(x).get(y) == "X") {
					System.out.println("Already shot at this spot, try again");
				} else {
					System.out.println("A direct hit! Take another shot..");
				}
				p1Hidden.get(x).set(y, "X");
				System.out.println("A direct hit! Take another shot");
				displayBoard("");
				p2HitCount++;
				return false;
			} else {
				if ((p1List.get(x).get(y) == "X") | (p1List.get(x).get(y) == "O")) {
					System.out.println("Already shot at this spot, try again");
					displayBoard("");
					return false;
				} else {
					p1Hidden.get(x).set(y, "O");
					displayBoard("");
					return true;
				}
			}
		}
	}
	
	public static void addShip(String msg, int sL, String player) {
		String[] positionOfShip = null;
		boolean valid = false;
		boolean outOfBounds = false;
		Scanner sc=new Scanner(System.in);
		String temp = "";
		String position = "";
		for(int i=0; i<sL; i++) {
			do {
				if (i == 0) {
					do {
						outOfBounds = false;
						System.out.println(msg);
						position=sc.next();
						positionOfShip = position.split(",");
						if (positionOfShip[2].equals("D")) {
							if (Integer.parseInt(positionOfShip[1]) + sL > 10) {
								outOfBounds = true;
								System.out.println("Ship length too long for direction and starting position");
							}
						} else if (positionOfShip[2].equals("R")) {
							if (Integer.parseInt(positionOfShip[0]) + sL > 10) {
								outOfBounds = true;
								System.out.println("Ship length too long for direction and starting position");
							}
						}
					}
					while (outOfBounds);
					
				}
				valid = checkShipPos(Integer.parseInt(positionOfShip[0]),Integer.parseInt(positionOfShip[1]), player);
				if (valid == true) {
					if (positionOfShip[2].equals("D")) {
						temp = ""+(Integer.parseInt(positionOfShip[1])+1);
						positionOfShip[1] = temp;
					} else if (positionOfShip[2].equals("R")) {
						temp = ""+(Integer.parseInt(positionOfShip[0])+1);
						positionOfShip[0] = temp;
					}
				} else {
					do {
						if (i != 0) {
							if (positionOfShip[2].equals("D")) {
								temp = ""+(Integer.parseInt(positionOfShip[1])-1);
								positionOfShip[1] = temp;
							} else if (positionOfShip[2].equals("R")) {
								temp = ""+(Integer.parseInt(positionOfShip[0])-1);
								positionOfShip[0] = temp;
							}
							removeShip(Integer.parseInt(positionOfShip[0]),Integer.parseInt(positionOfShip[1]), player);
							i--;
						}
					} while (i != 0);
				}
			} while (!valid);
		}
	}	
	
	public static void removeShip(int y, int x, String player) {
		if (player == "p1") {
			p1List.get(x).set(y, "~");
			displayBoard("p1");
		} else if (player == "p2") {
			p2List.get(x).set(y, "~");
			displayBoard("p2");
		}
	}
	
	public static boolean checkShipPos(int y, int x, String player) {
		if (player == "p1") {
			if (p1List.get(x).get(y) == "~") {
				p1List.get(x).set(y, "S");
				displayBoard("p1");
				return true;
			} else {
				System.out.println("Cannot place ship here, overlapping existing ship");
				return false;
			}
		} else {
			if (p2List.get(x).get(y) == "~") {
				p2List.get(x).set(y, "S");
				displayBoard("p2");
				return true;
			} else {
				System.out.println("Cannot place ship here, overlapping existing ship");
				return false;
			}
		}
	}
	
	public static void displayBoard(String when) {
		System.out.println("------- Player 1 -------||------- Player 2 ------");
		if (when == "start") {
			for(int x = 0; x < 11; x++)
			{
			    for(int z = 0; z < 11; z++) {
			        System.out.print("" + p1List.get(x).get(z));
			        System.out.print(" ");
			    }
			    if (x == 0) {
			    	System.out.print("||");
			    } else {
			    	System.out.print(" ||");
			    }
			    for(int z = 0; z < 11; z++)
		        {
		        	System.out.print(p2List.get(x).get(z));
		        	System.out.print(" ");
		    	}
		    	System.out.println("");
			}
			System.out.println("-------------------------------------------------");
		} else if (when == "p1" | when == "p2") {
			for(int x = 0; x < 11; x++)
			{
			    for(int z = 0; z < 11; z++)
			        {
			    	if (when == "p1") {
			    		System.out.print("" + p1List.get(x).get(z));
			    	} else if (when == "p2") {
			    		System.out.print("" + p1Hidden.get(x).get(z));
			    	}
			    	System.out.print(" ");
			    }
			    if (x == 0) {
			    	System.out.print("||");
			    } else {
			    	System.out.print(" ||");
			    }
			    for(int z = 0; z < 11; z++)
		        {
			    	if (when == "p1") {
			    		System.out.print("" + p2Hidden.get(x).get(z));
			    	} else if (when == "p2") {
			    		System.out.print("" + p2List.get(x).get(z));
			    	}
			    	System.out.print(" ");
		        }
		    	System.out.println("");
			}
			System.out.println("-------------------------------------------------");
		} else {
			for(int x = 0; x < 11; x++)
			{
			    for(int z = 0; z < 11; z++) {
			        System.out.print("" + p1Hidden.get(x).get(z));
			        System.out.print(" ");
			    }
			    if (x == 0) {
			    	System.out.print("||");
			    } else {
			    	System.out.print(" ||");
			    }
			    for(int z = 0; z < 11; z++)
		        {
		        	System.out.print(p2Hidden.get(x).get(z));
		        	System.out.print(" ");
		    	}
		    	System.out.println("");
			}
			System.out.println("-------------------------------------------------");
		}
	}
}
