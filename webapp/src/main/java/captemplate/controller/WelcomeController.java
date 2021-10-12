package captemplate.controller;

import captemplate.api.verifyPerson.v1.VerifyPersonRequest;
import captemplate.api.verifyPerson.v1.VerifyPersonResponse;
import captemplate.service.VerifyPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    @Autowired
    VerifyPersonService verifyPersonService;

    @PostMapping("verify")
    @ResponseBody
    public ResponseEntity<VerifyPersonResponse> getverify(@RequestBody VerifyPersonRequest request, @Header HttpHeaders headers) {
        logger.info("Request JSON:- "+request);
        logger.info("Headers :- "+headers);
        return  verifyPersonService.getResponse(request,headers);
    }

}