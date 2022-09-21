/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Student extends Person {

    //
    // Instance Data Fields
    //
    private String email;
    private University university;
    private Card card;
    //
    // Constructors
    //
    public Student() {

    }
    public Student(String firstname,String lastname,String email){
        super(firstname,lastname);
        this.email=email;
        this.university=new University("San Francisco State University");
    }
    @Override
    public void sayGreeting(String string) {
        System.out.println(string+" Welcome to my university!");
    }



    //
    // Instance Methods
    //
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    // Override
    //
}