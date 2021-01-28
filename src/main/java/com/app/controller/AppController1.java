package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppController1.class);

    @GetMapping("/test")
    public String test() {
        LOGGER.trace("TRACE - THIS IS MESSAGE NUMBER {}, NUMBER {}, NUMBER {}", 1, 2, 3);
        LOGGER.debug("DEBUG - THIS IS MESSAGE NUMBER {}, NUMBER {}, NUMBER {}", 1, 2, 3);
        LOGGER.info("INFO - THIS IS MESSAGE NUMBER {}, NUMBER {}, NUMBER {}", 1, 2, 3);
        LOGGER.warn("WARN - THIS IS MESSAGE NUMBER {}, NUMBER {}, NUMBER {}", 1, 2, 3);
        LOGGER.error("ERROR - THIS IS MESSAGE NUMBER {}, NUMBER {}, NUMBER {}", 1, 2, 3);
        return "TEST";
    }

}
