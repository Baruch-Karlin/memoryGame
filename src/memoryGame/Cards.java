package memoryGame;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Cards {

	private static final int List = 0;

	public HashMap<String, String> creatDeck() {
		HashMap<String, String> deck = new HashMap<String, String>();
		deck.put("dog", "woff");
		deck.put("cat", "meow");
		deck.put("bird", "chirp");
		deck.put("1", "2");
		deck.put("3", "4");
		deck.put("5", "6");
		deck.put("7", "9");

		return deck;

	}

	public LinkedList<String> shuffle(String[] array) {

		Random random = new Random();
		LinkedList<String> newList = new LinkedList<String>();

		List<String> list = Arrays.asList(array);
		LinkedList<String> originalList = new LinkedList<String>(list);
		int amount = originalList.size();

		for (int i = 0; amount > 0; i++) {
			int index = random.nextInt(amount);
			newList.add(i, originalList.remove(index));
			amount--;
		}

		return newList;

	}
}
