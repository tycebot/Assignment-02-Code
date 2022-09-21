/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: GeneralManager.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class GeneralManager extends Person {

    //
    // Instance Data Fields
    //
    FrontOffice frontOffice;
    //
    // Constructors
    //
    public GeneralManager() {
    }
    public GeneralManager(String firstname,String lastname){
        super(firstname,lastname);
        this.frontOffice= new FrontOffice();
    }
    @Override
    public void sayGreeting(String string) {

    }

    //
    // Instance Methods
    //
    public FrontOffice getFrontOffice() {
        return frontOffice;
    }

    public void setFrontOffice(FrontOffice frontOffice) {
        this.frontOffice = frontOffice;
    }
    //
    // Language
    //

    //
    // Override
    //
}