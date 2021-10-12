package captemplate.domain.services.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class JMSPublisher {
    private static final Logger logger = LoggerFactory.getLogger(JMSPublisher.class);
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void publish( String msg){
        logger.info("published msg ="+msg);
        jmsMessagingTemplate.convertAndSend(queue,msg);

    }
}
