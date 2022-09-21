/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //

    //
    // Instance Data Fields
    //
    private String name;
    private String address;
    private String latinMotto;
    private String englishMotto;
    private String universityType;
    private int establishmentYear;
    private String colors;
    private String nickname;
    private String location;
    private String mascot;
    private String website;
    //
    // Constructors
    //
    public University() {
    }
    public University(String name){
        super();
        this.name=name;

    }
    public University(String name,String location,String address,String latinMotto,String englishMotto,String universityType,
                      int establishmentYear,String colors,String nickname,String mascot,String website){
    super();
    this.name=name;
    this.address=address;
    this.location=location;
    this.latinMotto=latinMotto;
    this.englishMotto=englishMotto;
    this.universityType=universityType;
    this.establishmentYear=establishmentYear;
    this.colors=colors;
    this.nickname=nickname;
    this.mascot=mascot;
    this.website=website;

    }

    //
    // Instance Methods
    //
    @Override
    public void displayAbout() {
        System.out.println("Official Name:\t"+this.name+"\nMotto in Latin:\t"+this.latinMotto+"\nMotto in English:\t" +
                this.englishMotto+"\nType:\t"+this.universityType+"\nYear of Establishment:\t"+this.establishmentYear+
                "\nLocation:\t"+this.location+"\nAddress:\t"+this.address+"\nColors:\t"+this.colors+"\nNickname:\t"+this.nickname+
                "\nMascot:\t"+this.mascot+"\nWebsite:\t"+this.website);
    }

    @Override
    public void displayMission() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getLatinMotto() {
        return latinMotto;
    }

    public void setLatinMotto(String latinMotto) {
        this.latinMotto = latinMotto;
    }
    public String getEnglishMotto() {
        return englishMotto;
    }

    public void setEnglishMotto(String englishMotto) {
        this.englishMotto = englishMotto;
    }
    public String getUniversityType() {
        return universityType;
    }

    public void setUniversityType(String universityType) {
        this.universityType = universityType;
    }
    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
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