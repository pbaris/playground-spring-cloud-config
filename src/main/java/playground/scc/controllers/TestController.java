package playground.scc.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panos Bariamis (pbaris)
 */
@RestController
public class TestController {

    @Value("${tenants.datasources.default.driver-class-name}")
    private String url;

    @GetMapping
    private ResponseEntity<Map<String, String>> test() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", url);
        map.put("key3", "value3");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
