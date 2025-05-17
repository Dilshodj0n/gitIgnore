import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserCounter {
    Map<Long, Long> count(Map<String, UserStats>... visits) {
        Map<Long,Long> result = new HashMap<>();

        for (Map<String, UserStats> visit : visits) {
            if (visit == null) continue;

            for (Map.Entry<String, UserStats> entry : visit.entrySet()) {
                String idStr = entry.getKey();
                UserStats stats = entry.getValue();

                if (idStr == null || stats == null) continue;

                try {
                    Long userId = Long.parseLong(idStr);
                    Optional<Long> optionalCount = stats.getVisitCount();

                    if (optionalCount.isPresent()) {
                        result.put(userId, result.getOrDefault(userId, 0L) + optionalCount.get());
                    }
                } catch (NumberFormatException e) {
                    // Not a valid number, skip
                }

            }
        }
        return result;
    }
}
