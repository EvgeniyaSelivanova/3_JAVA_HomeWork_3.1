public class Main {
    public static void main(String[] args) {
        float ticket=10500.42F;
        int equivalent=20;
        if (ticket>0) {
            int miles=(int)ticket/equivalent;
            System.out.println(miles);}
        else {
            System.out.println("Wrong cost ticket");
        }
    }
}
