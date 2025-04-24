package application;

import java.time.ZoneId;

public class AvailableZones {
    public static void main(String[] args) {

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

    }
}
