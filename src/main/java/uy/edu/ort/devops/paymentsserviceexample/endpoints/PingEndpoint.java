package uy.edu.ort.devops.paymentsserviceexample.endpoints;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import uy.edu.ort.devops.paymentsserviceexample.domain.PaymentStatus;

@RestController
@RequestMapping("/ping")
public class PingEndpoint {
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public String ping() {
        return "pong";
    }
}
