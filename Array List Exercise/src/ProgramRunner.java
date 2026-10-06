import java.util.ArrayList;
public class ProgramRunner
	{
	static	ArrayList <Program> shows = new ArrayList <Program>();
		public static void main(String[] args)
			{
		
			shows.add(new Program ("Breaking Bad", "Drama", 3));
			shows.add(new Program ("Better Call Saul", "Drama", 6));
			shows.add(new Program ("The Simpsons", "Comedy", 38));
			shows.add(new Program ("Family Guy", "Comedy", 24));
			shows.add(new Program ("Family Feud", "Game Show", 4));
			displayPrograms();
			}
		public static void displayPrograms() 
			{
				for(int i = 0; i < shows.size(); i++) 
					{
						System.out.println(shows.get(i).getTitle() + " | " + shows.get(i).getGenre() + " | " + shows.get(i).getNumberOfSeasonsAired());
					}
				// this is a change
			}
	}
