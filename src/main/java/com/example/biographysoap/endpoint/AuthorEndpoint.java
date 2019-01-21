package com.example.biographysoap.endpoint;

import com.example.biography.GetBioRequest;
import com.example.biography.GetBioResponse;
import com.example.biographysoap.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AuthorEndpoint {

    @Autowired
    private AuthorService authorService;


    @PayloadRoot(namespace = "http://example.com/biography",
            localPart = "getBioRequest")
    @ResponsePayload
    public GetBioResponse getAuthorRequest(@RequestPayload GetBioRequest request) {
        GetBioResponse response = new GetBioResponse();
        response.setAuthor(authorService.getAuthor(request.getName()));
        return response;
    }
}
