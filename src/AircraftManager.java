public class AircraftManager {
    public static Aircraft[] getAircrafts() {
        return new Aircraft[] {
            new Aircraft("Boeing 787", 170, 920, "Economy"),
            new Aircraft("Airbus A078", 160, 878, "Business"),
            new Aircraft("Airbus A130", 180, 853, "Economy"),
            new Aircraft("Boeing 799", 350, 911, "Business"),
            new Aircraft("Boeing 230", 200, 900, "Economy"),
            new Aircraft("Airbus A512", 420, 1178, "Business")
        };
    }
}
