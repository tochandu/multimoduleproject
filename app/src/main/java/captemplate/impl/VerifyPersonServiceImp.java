package captemplate.impl;

import captemplate.api.verifyPerson.v1.VerifyPersonRequest;
import captemplate.api.verifyPerson.v1.VerifyPersonResponse;
import captemplate.api.verifyPerson.v1.components.SystemError;
import captemplate.service.VerifyPersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VerifyPersonServiceImp implements VerifyPersonService {
    private static final Logger logger = LoggerFactory.getLogger(VerifyPersonServiceImp.class);
    @Override
    public ResponseEntity<VerifyPersonResponse> getResponse(VerifyPersonRequest request, HttpHeaders header) {
        logger.debug("VerifyPersonRequest -"+request);
        try {
            VerifyPersonResponse personResponse = new VerifyPersonResponse();
            if (null != request)
                personResponse.setResult(VerifyPersonResponse.Result.APPROVED);
            else
                personResponse.setResult(VerifyPersonResponse.Result.NOT_APPROVED);
            return new ResponseEntity<>(personResponse, HttpStatus.OK);
        }catch (Exception ex) {
            VerifyPersonResponse personResponse = new VerifyPersonResponse();
            SystemError systemError = new SystemError();
            systemError.setCode("0000");
            systemError.setMessage("Error :"+ex.getMessage());
            systemError.setSubCode("1111");
            systemError.setCreatorApplicationId("CapID");
            List<SystemError> systemErrorList = new ArrayList<>();
            systemErrorList.add(systemError);
            personResponse.setSystemError(systemErrorList);
            return new ResponseEntity<>(personResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
