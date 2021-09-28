import java.util.*;
import java.io.*;

public class TaskTwo implements Comparable <Player> {
	int x = 0;
	ArrayList<String> n = new ArrayList<String>();
	ArrayList<Integer> s = new ArrayList<Integer>();

	private String playerid;
	private int playerscore;

	public void Player (String name, int score) {
		playerid = name;
		playerscore = score;
	}

	static class ScoreComparator implements Comparator <Player> {
		public int compare(Player lf1, Player lf2) {
			int scoreA = lf1.getScore ();
			int scoreB = lf2.getScore ();

			if (scoreA == scoreB) {
				return 0;
			}

			else if (scoreA > scoreB) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}

	public String getName() {
		return playerid;
	}

	public int getScore() {
		return playerscore;
	}

	public String toString () {
		return playerid+" "+playerscore;
	}

	public int compareTo(Player lf) {
		return getName ().compareTo (lf.getName ());
	}

	public void writeScores() {
		try {
			n.add (playerid);
			s.add(playerscore);
		}

		catch (InputMismatchException ime) {
			System.out.println(ime+": INVALID DATA!");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main (String[] args) {
		Player x = new Player("String", 40);
		x.writeScores ();
	}
}