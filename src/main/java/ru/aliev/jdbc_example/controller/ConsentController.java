package ru.aliev.jdbc_example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.aliev.jdbc_example.consent.DocConsent;
import ru.aliev.jdbc_example.dto.DocConsentDTO;
import ru.aliev.jdbc_example.service.DocConsentService;

@RestController
@RequiredArgsConstructor
public class ConsentController {
    private final DocConsentService consentService;

    @PostMapping("/save-consents")
    public void saveConsents(@RequestBody DocConsentDTO consentDTO){
        consentService.processConsentUpload(consentDTO);
    }

    @GetMapping("/get-consents")
    public DocConsent getConsents(Long id){
        return null;
    }

}
