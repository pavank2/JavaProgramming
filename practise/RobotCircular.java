package practise;

public class RobotCircular {

	public static void main(String[] args) {
		
		String s= "GGLGLGLGLGGLL";
		
		int i=0,g=0,l=0,r=0;
		int dir=0,x=0,y=0;
		while (i<s.length()) {
			char move = s.charAt(i);
			 if (move == 'R')
				  dir = (dir+1)%4;
			else if (move == 'L')
				  dir = (4+dir - 1) % 4;

			else //move is G
			{
			 if (dir == 0)
				 y++;
			 else if (dir == 1)
				 x++;
			 else if (dir == 2)
				 y--;
			 else //dir == 3
				 x--;
			}
			
			 if (x == 0 && y == 0) {
				 System.out.println("Circular Robot");
				 return;
			 }

			i++;
		}
		
		System.out.println("Not a circular robot");

	}

}
