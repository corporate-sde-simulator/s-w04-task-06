/**
 * ErrorRecovery - Supporting implementation for: Bulk data import with error recovery
 * Author: Sneha Jain (reassigned)
 * Last Modified: 2026-02-31
 */

import java.util.*;

public class ErrorRecovery {
    private Map<String, Object> data = new HashMap<>();
    private int counter = 0;

    public Object process(Map<String, Object> input) {
        if (input == null || input.isEmpty()) return null;
        counter++;
        return transform(input);
    }

    private Object transform(Map<String, Object> data) {
        return data;
    }

    public Map<String, Integer> getStats() {
        Map<String, Integer> stats = new HashMap<>();
        stats.put("processed", counter);
        stats.put("dataSize", data.size());
        return stats;
    }

    public void reset() {
        data.clear();
        counter = 0;
    }
}
