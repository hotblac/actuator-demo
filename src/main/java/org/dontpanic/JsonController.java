package org.dontpanic;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * A REST controller that takes a JSON serialized object
 * Created by stevie on 11/04/17.
 */
@RestController
public class JsonController {

    @RequestMapping(value = "/json", method = RequestMethod.POST)
    public void json(@RequestBody ModelObject modelObject) {

    }

}
