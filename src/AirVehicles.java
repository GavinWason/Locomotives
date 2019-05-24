public class AirVehicles extends Locomotive {

    private int numberOfEngines;
    private String purpose;

    public AirVehicles (Sting manufacturer, String capacity, int numberOfEngines, String purpose) {
        super(manufacturer, capacity);
        this.numberOfEngines = numberOfEngines;
        this.purpose = purpose;

    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;

    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}

}
