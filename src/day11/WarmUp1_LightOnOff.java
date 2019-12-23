package day11;

public class WarmUp1_LightOnOff {
    public static void main(String[] args) {
        String targetOption = "ki";

        switch (targetOption) {
            case "bd":
                System.out.println("bedroom light on");
                break;
            case "lr":
                System.out.println("living room light on");
                break;
            case "ki":
                System.out.println("kitchen light on");
                break;
            default:
                System.out.println("no such room");
        }
    }
}
