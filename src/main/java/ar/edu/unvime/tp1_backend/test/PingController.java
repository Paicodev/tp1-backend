package ar.edu.unvime.tp1_backend.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping ("api/ping")

public class PingController {
    
    @GetMapping
    public Map<String, String> ping() {
        return Map.of("status", "ok", "materia", "Web II");
    }
    }
