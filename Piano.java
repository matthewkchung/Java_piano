// Java Program to Illustrate Record Class
 
package package01;
 
// Class
public class Piano {
		// Define variables for array
		private int id;							// ID of piece
		private String op;						// Opus number of piece
		private String title;					// Title of piece
		private String subtitle;				// Piece's optional subtitle
		private String key;						// Key of piece
		private String compDate;				// Piece's composition dates in years
		private int year;						// Piece's year of publication
		private String inputString = "";		// Needed to parse csv data
		
		// Default Constructor
	    public Piano() {}
	    
		/**
		 * Parses a cvs string containing Exoplanet data
		 * @param string
		 */
		public Piano(String string) {

			inputString = string;

			// Tokenize using "," operator
			String[] tokens = inputString.trim().split(",");

			// Create a variable "token" to hold id
			String token = "";
			token = tokens[0].trim();
			// Check that id has a length
			if (token.length()>0) {
				this.id = Integer.parseInt(token);
			}
			// Set id to an invalid value if it does not have a length
			else {
				this.id = -1;
			}

			token = tokens[1].trim();
			// Check that op has a length
			if (token.length()>0) {
				this.op = token;
			}
			// Set op to an invalid value if it does not have a length
			else {
				this.op = "null";
			}

			token = tokens[2].trim();
			// Check that title has a length
			if (token.length()>0) {
				this.title = token;
			}
			// Set title to an invalid value if it does not have a length
			else {
				this.title = "null";
			}

			token = tokens[3].trim();
			// Check that subtitle has a length
			if (token.length()>0) {
				this.subtitle = token;
			}
			// Set subtitle to an invalid value if it does not have a length
			else {
				this.subtitle = "null";
			}

			token = tokens[4].trim();
			// Check that key has a length
			if (token.length()>0) {
				this.key = token;
			}
			// Set key to an invalid value if it does not have a length
			else {
				this.key = "null";
			}

			token = tokens[5].trim();
			// Check that compDate has a length
			if (token.length()>0) {
				this.compDate = token;
			}
			// Set observationDates to an invalid value if it does not have a length
			else {
				this.compDate = "null";
			}

			token = tokens[6].trim();
			// Check that year has a length
			if (token.length()>0) {
				this.year = Integer.parseInt(token);
			}
			// Set year to an invalid value if it does not have a length
			else {
				this.year = -1;
			}
		}
		
		@Override
		// Use toString override to create a formatted Chopin piece catalog
		public String toString() {
			StringBuilder report = new StringBuilder();
			report.append(String.format("ID:					%s\n",this.id));
			report.append(String.format("Title: 					%s\n",this.title));
			report.append(String.format("Subtitle: 				%s\n",this.subtitle));
			report.append(String.format("Opus: 					%s\n",this.op));
			report.append(String.format("Key: 					%s\n",this.key));
			report.append(String.format("Composition date: 			%s\n",this.compDate));
			report.append(String.format("Year: 					%s\n",this.year));
			return report.toString();
		}
 
    // Getting the value of contactNumber
    // @return the value of contactNumber
    // public int getContactNumber() { return contactNumber; }
 
    // Set the value of contactNumber
    // @param contactNumber new value of contactNumber
//    public void setContactNumber(int contactNumber)
//    {
// 
//        this.contactNumber = contactNumber;
//    }
 
	// Getting the value of idNum
    // @return the value of idNum
    public int getIdNum() { 
    	return this.id; 
    }
    
 // Getting the value of title
    // @return the value of title
    public String getTitle() { 
    	return this.title; 
    }
 
    // Setting the value of idNumber
    // @param idNumber new value of idNumber
    public void setIdNum(int idNum)
    {
        this.id = idNum;
    }
    
    // Setting the value of op
    // @param op new value of op
    public void setOp(String op)
    {
        this.op = op;
    }
    
    // Setting the value of title
    // @param title new value of title
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    // Setting the value of subtitle
    // @param subtitle new value of subtitle
    public void setSubtitle(String subtitle)
    {
        this.subtitle = subtitle;
    }
    
    // Setting the value of key
    // @param key new value of key
    public void setKey(String key)
    {
        this.key = key;
    }
    
    // Setting the value of compDate
    // @param compDates new value of compDate
    public void setCompDate(String compDate)
    {
        this.compDate = compDate;
    }
    
    // Setting the value of year
    // @param year new value of year
    public void setYear(int year)
    {
        this.year = year;
    }
 
    // Getting the value of name
    // @return the value of name
    // public String getName() { return name; }
 
    // Setting the value of name
    // @param name new value of name
   //  public void setName(String name) { this.name = name; }
 
    // toString() Method
    // @return
}