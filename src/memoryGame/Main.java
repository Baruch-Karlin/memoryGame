package memoryGame;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards cards = new Cards();
		HashMap<String, String> deck = cards.creatDeck();
		String[] keys = deck.keySet().toArray(new String[0]);
		String[] values = deck.values().toArray(new String[0]);
		System.out.println(keys);

		LinkedList<String> a = cards.shuffle(keys);
		LinkedList<String> b = cards.shuffle(values);
		System.out.println(a);
		System.out.println(b);
	}

}
