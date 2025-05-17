import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UserCounter userCounter = new UserCounter();


        Map<String, UserStats> day1 = new HashMap<>();
        day1.put("1", new UserStats(null));
        day1.put("12", new UserStats(4l));
        day1.put("14", new UserStats(1l));
        day1.put(null, new UserStats(1l));




        Map<String, UserStats> day3 = new HashMap<>();
        day3.put("1", new UserStats(null));
        day3.put("4", new UserStats(3l));
        day3.put("8", new UserStats(2l));
        day3.put("12", new UserStats(1l));




        Map<String, UserStats> day4 = new HashMap<>();
        day4.put("12", new UserStats(4l));
        day4.put("4", null);
        day4.put("1", new UserStats(2l));
        day4.put("19", new UserStats(3l));

        /*
        1 -> 2
        19 -> 3
        4 -> 3
        8 -> 2
        12 -> 9
        14 -> 1
         */

        Map<Long, Long> count = userCounter.count(day1,null,day3,day4);

        count.forEach((aLong, aLong2) ->
                System.out.printf("userId = '%s'\t\t counter = '%s'\n",aLong,aLong2));

    }
}