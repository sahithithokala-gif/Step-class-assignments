public class TrafficLight {
    private final String id;
    private String color;

    public TrafficLight(String id) {
        this.id = id;
        this.color = "RED"; // Starts on RED
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String next() {
        switch (color) {
            case "RED":
                color = "GREEN";
                break;
            case "GREEN":
                color = "YELLOW";
                break;
            case "YELLOW":
                color = "RED";
                break;
        }
        return color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println(t.getColor()); // RED
        System.out.println(t.next());     // GREEN
        System.out.println(t.next());     // YELLOW
        System.out.println(t.next());     // RED
    }
}