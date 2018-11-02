package com.app.happygraph;

import com.app.happygraph.model.DataStore;
import com.app.happygraph.model.HappyIndex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
public class HappyGraphApplication {

    private static Map<String, List<HappyIndex>> cacheData = new HashMap<>();

    static {
        cacheData = DataStore.getDataStore().stream().collect(Collectors.groupingBy(HappyIndex::getUserName));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getWelcomeMessage() {
        return "Welcome to Happy Graph API";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    @ResponseBody
    public String getWelcomeMessage(@PathVariable("username") String username) {
        return "Welcome to Happy Graph API + " + username + " !!!";
    }


    @RequestMapping("/happy-graph/indexes")
    public Map allIndexes() {
        Map model = new HashMap();
        model.put("content", cacheData);
        return model;
    }

    @RequestMapping("/happy-graph/indexes/{username}")
    public ResponseEntity userIndexes(@PathVariable String username) {
        if (username == null || username.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("invalid parameter");
        }
        Map model = new HashMap();
        model.put("content", cacheData.get(username));
        return ResponseEntity.status(HttpStatus.OK).body(model);
    }

    public static void main(String[] args) {
        SpringApplication.run(HappyGraphApplication.class, args);
    }
}
