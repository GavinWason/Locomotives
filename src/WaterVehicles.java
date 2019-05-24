public class WaterVehicles {
    private String distance;
    private int numberOfPropellers;
    private int waterdepth;

    public WaterVehicles (int numberOfPropellers, int waterdepth, String distance){
        this.numberOfPropellers = numberOfPropellers;
        this.waterdepth = waterdepth;
        this.distance = distance;
    }

    public int getNumberOfPropellers() {
        return numberOfPropellers;
    }

    public void setNumberOfPropellers(int numberOfPropellers) {
        this.numberOfPropellers = numberOfPropellers;
    }

    public int getWaterdepth() {
        return waterdepth;
    }

    public void setWaterdepth(int waterdepth) {
        this.waterdepth = waterdepth;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}