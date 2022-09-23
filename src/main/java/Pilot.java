public class Pilot {

    private String name;
    private Rank rank;
    private String pilotLicenseNumber;

    public Pilot(String name, Rank rank, String pilotLicenseNumber){
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getName(){
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return pilotLicenseNumber;
    }
}
