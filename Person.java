/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.
public sealed abstract class Person implements Greeting permits Student, Player, President, GeneralManager, Manager {

    //
    // Instance Data Fields
    //
    private String firstname;
    private String lastname;
    //
    // Constructors
    //
    public Person() {
    }

    public Person(String firstname, String lastname){
        this.lastname=lastname;
        this.firstname =firstname;
    }

    // Instance Methods
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    //
    // Language
    //

    //
    // @override
    //
}