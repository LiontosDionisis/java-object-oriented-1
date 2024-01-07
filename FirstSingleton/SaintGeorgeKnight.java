package gr.aueb.cf.TEST;

public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {}

    public static SaintGeorgeKnight getInstance() { return INSTANCE; }

    public void embarkOnMission() {
        System.out.println("*Gets on his horse and draws his sword...*");
    }
}
