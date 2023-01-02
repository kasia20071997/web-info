package com.kantanyuk.webinfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@RestController
public class GetInfo {

	UUID uuid = UUID.randomUUID();

    @GetMapping("/info")
    public Map<String, String> sayHello() {
        return Map.of(
                "uuid", uuid.toString(),
                "time", LocalDateTime.now().toString(),
                "host", getHost(),
                "ip", getIP()
        );
    }

    private String getHost() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "UNKNON: " + e.getMessage();
        }
    }

    private String getIP() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return "UNKNON: " + e.getMessage();
        }
    }
}
