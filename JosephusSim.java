import java.util.*;
import java.io.*;

public class JosephusSim {
	private PersonNode circle;     // a PersonNode pointer that tracks first node
	private int size;              // the number of people in the circle
	private int eliminationCount;  // the number to count to for elimination
	private PersonNode track;      // a PersonNode pointer to help with elimination

	public JosephusSim(String fileName) {
		try {
			// load names from the file in order, generating a singly linked list of PersonNodes
			Scanner file = new Scanner(new File(fileName));
			size = 0;
			while(file.hasNextLine()) {
				String name = file.nextLine();
				add(name);
				size++;
			}

			// make the ring circular by attaching last node's next to front
			PersonNode cur = circle;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = circle;

			// remember the last node as the one in front of the next to get eliminated
			track = circle;
			for(int i = 0; i < size; i++) {
				track = track.next;
			}

			// generate, print, and save the random elimination count
			Random rand = new Random();
			eliminationCount = rand.nextInt(size / 2) + 1;
			System.out.println("=== Elimination count is " + eliminationCount + " ===");
		}
		catch(FileNotFoundException e) {
			System.out.println("Something went wrong with " + fileName);
		}
	}

	// optional helper method for constructing the circle
	private void add(String val) {
		if(circle == null) {
			circle = new PersonNode(val);
		}
		else {
			PersonNode cur = circle;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = new PersonNode(val);
		}
	}

	public void eliminate() {
		// Special case if elimination count = 1
		if(eliminationCount == 1) {
			PersonNode eliminated = circle;
			System.out.println(eliminated.name + " eliminated!");
			circle = circle.next;
		}
		else {
			// count to the elimination count
			PersonNode cur = circle;
			for(int i = 0; i < eliminationCount - 2; i++) {
				cur = cur.next;
			}

			// print who will be eliminated
			PersonNode eliminated = cur.next;
			System.out.println(eliminated.name + " eliminated!");

			// eliminate the person and update "front" of the circle and size
			cur.next = eliminated.next;
			circle = eliminated.next;
		}
		size--;
	}

	public boolean isOver() {
		// check if there's only one person left in the circle
		return size == 1;
	}

	public String toString() {
		// if there's only one person left, print them as the last survivor
		if(size == 1) {
			return circle.name;
		}
		// print the remaining survivors (watch out for infinite loop since list is circular)
		StringBuilder result = new StringBuilder();
		PersonNode cur = circle;
		int count = 0;
		for(int i = 0; i < size; i++) {
			count++;
			result.append(i + 1);
			result.append(". ");
			result.append(cur.name);
			if(count > 5) {
				result.append("\n");
				count = 0;
			}
			else {
				result.append("\t\t");
			}
			cur = cur.next;
		}
		return result.toString();
	}

}
