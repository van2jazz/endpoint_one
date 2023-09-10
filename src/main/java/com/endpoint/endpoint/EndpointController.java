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

    @GetMapping("/info")
    public Endpoint EndpointInformation(
            @RequestParam String slack_name,
            @RequestParam String track)
    {
        LocalDateTime currentTime = LocalDateTime.now(ZoneOffset.UTC);
        DayOfWeek currentDay = currentTime.getDayOfWeek();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"));
//        DateTime formattedTime = DateTime.now( DateTimeZone.UTC );

        String githubFileUrl = "https://github.com";
        String githubRepoUrl = "https://github.com";

        return new Endpoint(
                slack_name,
                currentDay.toString(),
                formattedTime,
                track,
                githubFileUrl,
                githubRepoUrl,
                200
        );


//        Endpoint endpoint = new Endpoint();
//        endpoint.setSlackName("slack_Name");
//        endpoint.setCurrentDay(LocalDateTime.now().getDayOfWeek().toString());
//        endpoint.setUtcTime(LocalDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME));
//        endpoint.setTrack(track);
//        endpoint.setGithubFileUrl("https://github.com");
//        endpoint.setGithubRepoUrl("https://github.com");
//
//        endpoint.setStatusCode(200);


    }




}
