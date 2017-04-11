package org.dontpanic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple REST controller that takes String parameters
 * Created by stevie on 11/04/17.
 */
@RestController
public class SimpleController {

    @RequestMapping("/simple")
    public void simple(@RequestParam String param1, @RequestParam String param2) {

    }

}
