/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Club extends Organization {

    //
    // Instance Data Fields
    //
    private FrontOffice frontOffice;
    private OwnerGroup ownerGroup;
    private String name;
    private String shortName;
    private int establishmentYear;
    private String colors;
    private String ballpark;
    private int worldsTitles;
    private int nlPennants;
    private int wildcardBerths;
    private String owners;
    //
    // Constructors
    //
    public Club(){}
    public Club(String name) {
        super();
        this.name=name;
    }
    public Club(String name,String shortName,int establishmentYear, String colors, String ballpark,int worldsTitles,
                int nlPennants,int wildcardBerths,OwnerGroup ownerGroup){
        super();
        this.frontOffice=new FrontOffice();
        this.ownerGroup=new OwnerGroup();
        this.name=name;
        this.shortName=shortName;
        this.establishmentYear=establishmentYear;
        this.colors=colors;
        this.ballpark=ballpark;
        this.worldsTitles=worldsTitles;
        this.nlPennants=nlPennants;
        this.wildcardBerths=wildcardBerths;
        this.ownerGroup=new OwnerGroup();
    }
    public static String getOfficialSong() {
        return "Take Me out to the Ball Game";
    }



    //
    // Static Methods
    //

    //
    // Instance Methods
    //
    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }

    public FrontOffice getFrontOffice() {
        return frontOffice;
    }

    public void setFrontOffice(FrontOffice frontOffice) {
        this.frontOffice = frontOffice;
    }

    public OwnerGroup getOwnerGroup() {
        return ownerGroup;
    }

    public void setOwnerGroup(OwnerGroup ownerGroup) {
        this.ownerGroup = ownerGroup;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
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

    public String getBallpark() {
        return ballpark;
    }

    public void setBallpark(String ballpark) {
        this.ballpark = ballpark;
    }

    public int getWorldsTitles() {
        return worldsTitles;
    }

    public void setWorldsTitles(int worldsTitles) {
        this.worldsTitles = worldsTitles;
    }

    public int getNlPennants() {
        return nlPennants;
    }

    public void setNlPennants(int nlPennants) {
        this.nlPennants = nlPennants;
    }

    public int getWildcardBerths() {
        return wildcardBerths;
    }

    public void setWildcardBerths(int wildcardBerths) {
        this.wildcardBerths = wildcardBerths;
    }

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}