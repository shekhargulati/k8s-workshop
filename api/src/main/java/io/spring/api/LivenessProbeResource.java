package io.spring.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivenessProbeResource {

    private int count;

    @GetMapping(path = "/isAlive", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> check() {
        if (count < 5) {
            count++;
            return ResponseEntity.ok("Alive");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
