package captemplate.service;

import captemplate.api.verifyPerson.v1.VerifyPersonRequest;
import captemplate.api.verifyPerson.v1.VerifyPersonResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public interface VerifyPersonService {
    public ResponseEntity<VerifyPersonResponse> getResponse(VerifyPersonRequest request, HttpHeaders header);
}
