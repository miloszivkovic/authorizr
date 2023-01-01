package com.mzivkovic.authorizr.controllers;

import com.mzivkovic.authorizr.dto.request.AccessTokenRequest;
import com.mzivkovic.authorizr.dto.request.AuthorizeRequest;
import com.mzivkovic.authorizr.dto.response.AccessTokenResponse;
import com.mzivkovic.authorizr.dto.response.AuthorizeResponse;
import com.mzivkovic.authorizr.util.HttpConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

    @GetMapping(HttpConstants.PATH_AUTHORIZE)
    public ResponseEntity<AuthorizeResponse> authorize(AuthorizeRequest authorizeRequest) {
        // TODO
        return ResponseEntity.ok(null);
    }

    @PostMapping(HttpConstants.PATH_TOKEN)
    public ResponseEntity<AccessTokenResponse> getAccessToken(AccessTokenRequest accessTokenRequest) {
        // TODO
        return ResponseEntity.ok(null);
    }
}
