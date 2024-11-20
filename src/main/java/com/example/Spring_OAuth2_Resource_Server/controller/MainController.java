package com.example.Spring_OAuth2_Resource_Server.controller;

import com.example.Spring_OAuth2_Resource_Server.model.dto.ResDTO;
import com.example.Spring_OAuth2_Resource_Server.model.dto.ResWrapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/me")
    public ResWrapper me() {

        ResDTO resDTO = new ResDTO();
        resDTO.setUsername(SecurityContextHolder.getContext().getAuthentication().getName());

        ResWrapper resWrapper = new ResWrapper();
        resWrapper.setResponse(resDTO);

        return resWrapper;
    }
}
