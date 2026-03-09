// 18. Find Itinerary for Tickets

import java.util.HashMap;

public class R {
    public static String getStart(HashMap<String, String> ticket) {
        HashMap<String, String> revMap = new HashMap<>();
        for (String key : ticket.keySet()) {
            revMap.put(ticket.get(key), key);
        }
        for (String key : ticket.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }

    public static void findItinerary(HashMap<String, String> ticket) {
        String strPoint = getStart(ticket);
        System.out.print(strPoint);
        for (String st : ticket.keySet()) {
            System.out.print(" -> " + ticket.get(strPoint));
            strPoint = ticket.get(strPoint);
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bangluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");
        findItinerary(ticket);
        System.out.println();
    }
}