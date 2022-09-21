/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Card {



    //
    // Instance Data Fields
    //
    private int artSize = 12;     // Please change artSize, if needed, to get an identical output
    private String artFont = "Courier"; // Please change artFont, if needed, to get an identical output
    private Student student;
    private String recipient;
    private String message;
    private char artSymbol;

    //
    // Constructors
    //
    public Card() {
    }

    public Card(int artSize,String artFont,String recipient, String message, char artSymbol){
        this.artSize=artSize;
        this.artFont=artFont;
        this.recipient=recipient;
        this.message=message;
        this.artSymbol=artSymbol;
        this.student=new Student();
    }
    //
    // Instance Methods
    //
    void printCard(int artSize,String artFont, String recipient, String message,char artSymbol, Student student){
        try {
            SFGiantsCardGenerator.generateSFGiantsCard(this.recipient,this.message, student.getFirstname(),
                    student.getEmail(),this.artSymbol,this.artSize,this.artFont );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //
    // Additional Instance Methods
    //
    public int getArtSize() {
        return artSize;
    }

    public void setArtSize(int artSize) {
        this.artSize = artSize;
    }
    public String getArtFont() {
        return artFont;
    }

    public void setArtFont(String artFont) {
        this.artFont = artFont;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public char getArtSymbol() {
        return artSymbol;
    }

    public void setArtSymbol(char artSymbol) {
        this.artSymbol = artSymbol;
    }
    //
    // Language
    //

}
