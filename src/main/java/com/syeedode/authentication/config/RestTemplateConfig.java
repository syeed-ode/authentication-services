package com.syeedode.authentication.config;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/**
 * Authentication Services
 * Account Resource
 * <p>
 * Author: syeedode
 * Date: 9/15/17
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @Bean("sslRestTemplate")
    public RestTemplate sslRestTemplate() {
        SocketFactory sslSocketFactory = SSLSocketFactory.getDefault();

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);

        RestTemplate restTemplate = new RestTemplate(requestFactory);

        return restTemplate;
    }
}
