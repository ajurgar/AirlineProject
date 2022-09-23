public enum FlightInfo {
    F1("EDI", "GLA", "8:00", "3232"),
    F2("GLA", "EDI", "4:30" ,"1494"),
    F3("EDI", "SEV", "22:00", "6788");

    private final String departure;
    private final String destination;
    private final String time;
    private final String flightNumber;


    FlightInfo(String departure, String destination, String time, String flightNumber) {
        this.departure = departure;
        this.destination = destination;
        this.time = time;
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getTime() {
        return time;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
