import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main
{
	private static int[] CaveRooms;
	
	public static int[] Layout(String filename) throws IOException
		{
			Scanner fin = new Scanner(new FileReader(filename));
			
			int rooms = fin.nextInt();
			
			CaveRooms = new int[rooms];
			
			for(int i = 0; i < rooms; i++)
			{
				CaveRooms[i] = fin.nextInt();
			}
			fin.close();
			
			Arrays.sort(CaveRooms);
			
			return CaveRooms;
		}
		public int[] getRandomCaves;
		
		int numcaves = CaveRooms.length;
		
		public int[] enemy = new int[numcaves-1]; //temp array that wholes the num of caves - 1
		
		ArrayList<Integer> randomCave = new ArrayList<Integer>();
		{ //create an array list
		//starts at 2 to avoid placing "enemies" in starter cave
		for (int i=2; i < CaveRooms.length + 1; i++)
		{
			randomCave.add(i);
		}
		
		Collections.shuffle(randomCave); //shuffle the contents of the arraylis
		
		for (int i = 0; i < CaveRooms.length-1; i++)
		{
			enemy[i] = randomCave.get(i); //put shuffled array into temp array
		}
	}
	
	    

	enum Danger
	{
		Wumpus("There is a foul stench, that smelly smell that smells smelly"),
		Bats("You hear the sound of wings flapping"),
		Holes("A cold draft washes over you, you curse because you forgot your mittens"),
		Spider("You hear clicking and spinning, and feel a shiver down your back. You always hated spiders");
		private String warning;
		Danger(String warning)
		{
			this.warning = warning;
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println(CaveRooms);
	}
}

