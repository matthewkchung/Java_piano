
// Java Program to Illustrate StudentRecordLinkedList Class
package package01;

// Import statements
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PianoLinkedList
{
	
	public final static String DATA_FILE = "chopin_piano_pieces.csv";
	
	public static List<Piano> loadData(String filename) {

		// Declare the output
		List<Piano> data = null;

		// Declare some file IO controls
		File file = new File(filename);
		Scanner scanner = null;

		try {
			// Load the Piano data from the file
			data = new ArrayList<>();
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine().trim();
				if (!line.startsWith("id,")) {
					// System.out.println(line);
					Piano piano = new Piano(line);
					// System.out.println(piano);
					data.add(piano);
				}
			}
		} 

		catch(Exception ex) {
			System.out.println("Unable to load the data in \"" + filename + "\"");
		}
		finally {
			if (scanner!=null) {
				scanner.close();
			}
		}
		
		return data;

	}
	
		// Main driver method
		public static void main(String[] args) throws FileNotFoundException {
			List<Piano> PianoList = loadData(DATA_FILE);
			// Piano piano = new Piano();
			
			// Creating option integer variable
			int option = 0;
			Scanner keyboard = new Scanner(System.in);

			// Do - While loop
			do {
				menu();
				option = keyboard.nextInt();

				// Switch case
				switch (option) {

				// Case 1
				case 1:

					// Display message
					System.out.print(
							"What is the piano piece id Number? ");

					int idNum = keyboard.nextInt();

					// Display message
					System.out.print(
							"What is the piece's opus? ");

					String op = keyboard.nextLine();
					keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's title? ");

					String title = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's subtitle? ");

					String subtitle = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's key? ");

					String key = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's dates of composition? ");

					String compDate = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's publication year? ");

					int year = keyboard.nextInt();

					// Create csv string
					String csvPiece = Integer.toString(idNum) + "," + op + "," + title + "," + subtitle + "," + key + "," + compDate + "," + Integer.toString(year);
					
					Piano AddPiano = new Piano(csvPiece);
					PianoList.add(AddPiano);
					System.out.println(
							"The piece" + title + "has been successfully added");
					System.out.println(
							AddPiano.toString());
					// Break statement used to terminate program
					// from here only once it entered this case
					break;

					// Case 2
				case 2:

					// Display message
					System.out.print(
							"What is the piece id number ? ");
					int PianoId = keyboard.nextInt();
					int DelPianoId = -1;
					// Invoke remove/delete record
					for (Piano temp : PianoList) {
						if (PianoId == temp.getIdNum())
							DelPianoId = PianoId;
					}
					if (DelPianoId != -1) {
						PianoList.remove(DelPianoId);
						System.out.println(
								"The piece " + PianoList.get(DelPianoId).getTitle() + " has been successfully deleted.");
					}
					else {
						System.out.println(
								"Sorry," + PianoId + " is not a valid id number. Please try again.");
					}
					break;


					// Case 3
				case 3:

					// Display message
					System.out.print(
							"What is the piano piece id Number? ");

					int PianoIdNum = keyboard.nextInt();

					// Display message
					System.out.print(
							"What is the piece's opus? ");

					String opus = keyboard.nextLine();
					keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's title? ");

					String PianoTitle = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's subtitle? ");

					String PianoSubtitle = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's key? ");

					String PianoKey = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's dates of composition? ");

					String PianoCompDate = keyboard.nextLine();

					// Display message
					System.out.print(
							"What is the piece's publication year? ");

					int PianoYear = keyboard.nextInt();

					// Set each value
					// piano.setIdNum(PianoIdNum);
					for (Piano change: PianoList) {
						if (change.getIdNum()==PianoIdNum) {
							change.setOp(opus);
							change.setTitle(PianoTitle);
							change.setSubtitle(PianoSubtitle);
							change.setKey(PianoKey);
							change.setCompDate(PianoCompDate);
							change.setYear(PianoYear);
						}
							
					}

					// Print confirmation of record update
					System.out.println(
							"Record Updated Successfully");

					break;

					// Case 4
				case 4:

					// Display message
					System.out.print(
							"What is the Piano id ? ");
					int PianoID = keyboard.nextInt();

					for (Piano temp: PianoList) {
						if (PianoID == temp.getIdNum()) {
							System.out.println(
									"The Piano has been found");
							System.out.println(
									temp.toString());
						}
					}
					break;

					// Case 5
				case 5:
					// If record list is empty then
					// print the message below
					if (PianoList.isEmpty()) {
						// Print statement
						System.out.println("The list has no records\n");
					}
					else {
						// Iterating Record list
						// using for each loop
						for (Piano temp : PianoList) {
							// Printing the list
							System.out.println(
									temp.toString());
						}
					}
					break;

					// Case 6
				case 9:

					// Display message
					System.out.println(
							"\nThank you for using the program. Goodbye!\n");
					System.exit(0);

					break;

					// Case 7: Default case
					// If none above case executes
				default:

					// Print statement
					System.out.println("\nInvalid input\n");
					break;
				}
			}

			// Checking condition
			while (option != 9);
			keyboard.close();

		}

	// Method 2
	// Menu - Static menu for displaying options
	public static void menu()
	{

		// Printing statements displaying menu on console
		System.out.println("MENU");
		System.out.println("1: Add Piece");
		System.out.println("2: Delete Piece");
		System.out.println("3: Update Piece");
		System.out.println("4: Search Piece");
		System.out.println("5: Display Pieces");
		System.out.println("9: Exit program");
		System.out.print("Enter your selection : ");
	}
}
