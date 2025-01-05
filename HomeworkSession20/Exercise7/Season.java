//Create an enum Season with constants SPRING, SUMMER, AUTUMN, and WINTER.
// Add a field for average temperature and a method to get a description for each season.

package Exercise7;

public enum Season {
    SUMMER(30, "Vara este cald si natura este verde."),
    AUTUMN(15,"Toamna este plina de culori aramii, iar temperaturile scad."),
    WINTER(-10, "Iarna este frig, zapada alba acopera toata natura oferind un peisaj de basm."),
    SPRING(20,"Primavara natur prinde viata, totul este inflorit iar temperaturile cresc.");

    private final int averageTemperature;
    private final String description;

    Season(int averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }

    public void displaySeasonInfo(){
        System.out.println(this.name() + ": " + description + "The average temperature is: "
                + getAverageTemperature()
                + " grade celsius.");
    }

}


