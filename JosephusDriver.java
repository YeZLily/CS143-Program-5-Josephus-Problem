import java.util.*;

public class JosephusDriver {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		JosephusSim simulation = new JosephusSim("people.txt");

		while(!simulation.isOver()) {
			System.out.println(simulation);
			System.out.println("\nContinue elimination? <press enter>");
			console.nextLine(); // make the user hit enter to continue
			simulation.eliminate();
		}

		System.out.println(simulation);
	}

}
/*
# PROGRAM OUTPUT
=== Elimination count is 4 ===
1. Marcelle		2. Hashir		3. Boubacar		4. edgar		5. Nelson		6. Sarinya
7. Dario		8. Joaquin		9. Aurel		10. Crystal		11. Michael		12. Jesse
13. Joshua		14. Thomas		15. Angelina		16. Visal		17. Zoheb		18. Owen
19. Marc		20. Grace		21. Milady		22. Lily

Continue elimination? <press enter>

edgar eliminated!
1. Nelson		2. Sarinya		3. Dario		4. Joaquin		5. Aurel		6. Crystal
7. Michael		8. Jesse		9. Joshua		10. Thomas		11. Angelina		12. Visal
13. Zoheb		14. Owen		15. Marc		16. Grace		17. Milady		18. Lily
19. Marcelle		20. Hashir		21. Boubacar

Continue elimination? <press enter>

Joaquin eliminated!
1. Aurel		2. Crystal		3. Michael		4. Jesse		5. Joshua		6. Thomas
7. Angelina		8. Visal		9. Zoheb		10. Owen		11. Marc		12. Grace
13. Milady		14. Lily		15. Marcelle		16. Hashir		17. Boubacar		18. Nelson
19. Sarinya		20. Dario

Continue elimination? <press enter>

Jesse eliminated!
1. Joshua		2. Thomas		3. Angelina		4. Visal		5. Zoheb		6. Owen
7. Marc		8. Grace		9. Milady		10. Lily		11. Marcelle		12. Hashir
13. Boubacar		14. Nelson		15. Sarinya		16. Dario		17. Aurel		18. Crystal
19. Michael

Continue elimination? <press enter>

Visal eliminated!
1. Zoheb		2. Owen		3. Marc		4. Grace		5. Milady		6. Lily
7. Marcelle		8. Hashir		9. Boubacar		10. Nelson		11. Sarinya		12. Dario
13. Aurel		14. Crystal		15. Michael		16. Joshua		17. Thomas		18. Angelina


Continue elimination? <press enter>

Grace eliminated!
1. Milady		2. Lily		3. Marcelle		4. Hashir		5. Boubacar		6. Nelson
7. Sarinya		8. Dario		9. Aurel		10. Crystal		11. Michael		12. Joshua
13. Thomas		14. Angelina		15. Zoheb		16. Owen		17. Marc

Continue elimination? <press enter>

Hashir eliminated!
1. Boubacar		2. Nelson		3. Sarinya		4. Dario		5. Aurel		6. Crystal
7. Michael		8. Joshua		9. Thomas		10. Angelina		11. Zoheb		12. Owen
13. Marc		14. Milady		15. Lily		16. Marcelle

Continue elimination? <press enter>

Dario eliminated!
1. Aurel		2. Crystal		3. Michael		4. Joshua		5. Thomas		6. Angelina
7. Zoheb		8. Owen		9. Marc		10. Milady		11. Lily		12. Marcelle
13. Boubacar		14. Nelson		15. Sarinya

Continue elimination? <press enter>

Joshua eliminated!
1. Thomas		2. Angelina		3. Zoheb		4. Owen		5. Marc		6. Milady
7. Lily		8. Marcelle		9. Boubacar		10. Nelson		11. Sarinya		12. Aurel
13. Crystal		14. Michael

Continue elimination? <press enter>

Owen eliminated!
1. Marc		2. Milady		3. Lily		4. Marcelle		5. Boubacar		6. Nelson
7. Sarinya		8. Aurel		9. Crystal		10. Michael		11. Thomas		12. Angelina
13. Zoheb

Continue elimination? <press enter>

Marcelle eliminated!
1. Boubacar		2. Nelson		3. Sarinya		4. Aurel		5. Crystal		6. Michael
7. Thomas		8. Angelina		9. Zoheb		10. Marc		11. Milady		12. Lily


Continue elimination? <press enter>

Aurel eliminated!
1. Crystal		2. Michael		3. Thomas		4. Angelina		5. Zoheb		6. Marc
7. Milady		8. Lily		9. Boubacar		10. Nelson		11. Sarinya

Continue elimination? <press enter>

Angelina eliminated!
1. Zoheb		2. Marc		3. Milady		4. Lily		5. Boubacar		6. Nelson
7. Sarinya		8. Crystal		9. Michael		10. Thomas

Continue elimination? <press enter>

Lily eliminated!
1. Boubacar		2. Nelson		3. Sarinya		4. Crystal		5. Michael		6. Thomas
7. Zoheb		8. Marc		9. Milady

Continue elimination? <press enter>

Crystal eliminated!
1. Michael		2. Thomas		3. Zoheb		4. Marc		5. Milady		6. Boubacar
7. Nelson		8. Sarinya

Continue elimination? <press enter>

Marc eliminated!
1. Milady		2. Boubacar		3. Nelson		4. Sarinya		5. Michael		6. Thomas
7. Zoheb

Continue elimination? <press enter>

Sarinya eliminated!
1. Michael		2. Thomas		3. Zoheb		4. Milady		5. Boubacar		6. Nelson


Continue elimination? <press enter>

Milady eliminated!
1. Boubacar		2. Nelson		3. Michael		4. Thomas		5. Zoheb

Continue elimination? <press enter>

Thomas eliminated!
1. Zoheb		2. Boubacar		3. Nelson		4. Michael

Continue elimination? <press enter>

Michael eliminated!
1. Zoheb		2. Boubacar		3. Nelson

Continue elimination? <press enter>

Zoheb eliminated!
1. Boubacar		2. Nelson

Continue elimination? <press enter>

Nelson eliminated!

Congratulations Boubacar for being the only survivor!
*/