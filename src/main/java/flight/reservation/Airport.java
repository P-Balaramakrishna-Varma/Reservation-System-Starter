package flight.reservation;

import flight.reservation.flight.Flight;

import java.util.List;

public class Airport {

    private final String name;
    private final String code;
    private final String location;
    private List<Flight> flights;
    private String[] allowedAircrafts;

    public Airport(String name, String code, String location) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.allowedAircrafts = new String[]{"A380", "A350", "Embraer 190", "Antonov AN2", "H1", "H2", "HypaHype"};
    }

    public Airport(String name, String code, String location, String[] allowedAircrafts) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.allowedAircrafts = allowedAircrafts;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public String[] getAllowedAircrafts() {
        return allowedAircrafts;
    }

    public static class AirportConstructor {
        private String name;
        private String code;
        private String location;
        private String[] allowedAircrafts;
        private List<Flight> flights;

        public AirportConstructor withName(String name) {
            this.name = name;
            return this;
        }

        public AirportConstructor withCode(String code) {
            this.code = code;
            return this;
        }

        public AirportConstructor withLocation(String location) {
            this.location = location
            return this;
        }

        public AirportConstructor withAllowedAircrafts(String[] allowedAircrafts) {
            this.allowedAircrafts = allowedAircrafts;
            return this;
        }

        public AirportConstructor withFlights(List<Flight> flights) {
            this.flights = flights;
            return this;
        }

        public Airport build() throws IllegalArgumentException {
            return new Airport(name, code, location, allowedAircrafts);
        }
    }
}


