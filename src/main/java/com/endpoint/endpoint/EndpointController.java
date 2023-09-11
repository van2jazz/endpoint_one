package com.endpoint.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
public class EndpointController {

    @GetMapping("/api")
    public Endpoint EndpointInformation(
            @RequestParam String slack_name,
            @RequestParam String track)
    {
        LocalDateTime currentTime = LocalDateTime.now(ZoneOffset.UTC);
        DayOfWeek currentDay = currentTime.getDayOfWeek();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));

        String githubFileUrl = "https://spring-demo-projects.onrender.com/info?slack_name=dayo&track=backend";
        String githubRepoUrl = "https://github.com/van2jazz/endpoint_one";

        return new Endpoint(
                slack_name,
                currentDay.toString(),
                formattedTime,
                track,
                githubFileUrl,
                githubRepoUrl,
                200
        );
    }




}
