package satr.beta.sample.timer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class TimerController {

    @GetMapping("/timer/all")
    public Map<String, Integer> timer() {
        Map<String, Integer> result = new LinkedHashMap<>();

        LocalDateTime time = LocalDateTime.now();
        result.put("year", time.getYear());
        result.put("month", time.getMonthValue());
        result.put("day", time.getDayOfMonth());
        result.put("hour", time.getHour());
        result.put("minute", time.getMinute());
        result.put("second", time.getSecond());
        return result;
    }
}
