package captemplate.impl;

import captemplate.domain.services.publisher.JMSPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataConsPub {
    private static final Logger logger = LoggerFactory.getLogger(DataConsPub.class);
    @Autowired
    JMSPublisher jmsPublisher;

    public String dataPub(String msg) {
        logger.info("Publisher msg:- "+msg);
        jmsPublisher.publish(msg);
        return "Success";
    }
}
