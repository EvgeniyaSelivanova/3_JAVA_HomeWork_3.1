public class Main {
    public static void main(String[] args) {
        float cost_ticket=10500.45F;
        int miles_equivalent=20;
        if (cost_ticket>0) {
            float quantity_miles = cost_ticket/miles_equivalent;
            int miles=(int)quantity_miles;
            System.out.println(miles);}
        else {
            System.out.println("Wrong cost ticket");
        }
    }
}
