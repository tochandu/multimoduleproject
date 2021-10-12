package captemplate.controller;

import captemplate.impl.DataConsPub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {
    @Autowired
    DataConsPub dataConsPub;

    @PostMapping("pub/{msg}")
    public String pubMsg(@PathVariable("msg") final String msg){
        dataConsPub.dataPub(msg);
        return "Publisher Success ";
    }
}
