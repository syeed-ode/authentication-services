package com.syeedode.authentication.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Account Services
 * <p>
 * Author: syeedode
 * Date: 9/14/17
 */
@Service
public class UserGateway {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    RestTemplate sslRestTemplate;

    public UserResponse getUserData() {
        URI url = UriComponentsBuilder.fromHttpUrl("http://localhost").port(8080).path("user").build().toUri();
//        url = UriComponentsBuilder.fromHttpUrl("https://localhost").port(8443).path("user").build().toUri();
        ResponseEntity<UserResponse> responseEntity = sslRestTemplate.exchange(url, HttpMethod.GET, null, UserResponse.class);
        return responseEntity.getBody();
    }

    public String getStringData() {
        URI url = UriComponentsBuilder.fromHttpUrl("https://localhost").port(8443).path("adcontent").build().toUri();
        url = UriComponentsBuilder.fromHttpUrl("http://localhost").port(8080).path("adcontent").build().toUri();
        RequestEntity<String> requestEntity = RequestEntity.post(url).body("Who is Silvia?");
        ResponseEntity<String> responseEntity = sslRestTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return responseEntity.getBody();
    }
}
