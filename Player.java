/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields
    private Club club;
    private String position;
    private int jerseyNumber;
    private String batHand;
    private String throwHand;
    private int debutYear;
    //
    // Constructors
    //
    public Player() {
    }
    public Player(String firstname,String lastname,String position,int jerseyNumber,String batHand,String throwHand, int debutYear){
    super(firstname,lastname);
    this.club=new Club("San Francisco Giants");
    this.position=position;
    this.jerseyNumber=jerseyNumber;
    this.batHand=batHand;
    this.throwHand=throwHand;
    this.debutYear=debutYear;
    }
    @Override
    public void sayGreeting(String string) {

    }

    //
    // Instance Methods
    //
    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getBatHand() {
        return batHand;
    }

    public void setBatHand(String batHand) {
        this.batHand = batHand;
    }

    public String getThrowHand() {
        return throwHand;
    }

    public void setThrowHand(String throwHand) {
        this.throwHand = throwHand;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    //
    // Additional Instance Methods
    //

    //
    // Language
    //

    //
    // @Override
    //
}
