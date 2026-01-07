package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller return value is view name
// @ResponseBody return value is message body
@RestController
@Slf4j
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // + operation is executed regardless of logging level
        // String "info log=Spring" is allocated always in memory
        // instead, use log.trace("info log={}", name);
        log.trace(" info log=" + name);

        System.out.println("name = " + name); // instead, use slf4j
        log.trace("trace log={}", name);
        log.debug("debug log={}", name); // development recommended
        log.info("  info log={}", name); // production recommended
        log.warn("  warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
