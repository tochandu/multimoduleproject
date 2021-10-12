package captemplate.controller;

import captemplate.data.model.EmpData;
import captemplate.service.EmpdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpdataController {

    @Autowired
    EmpdataService empdataService;
    @GetMapping("empdata")
    public String mainWithParam(){
       List<EmpData> empDataList= empdataService.getEmpdataList();
        return empDataList.toString();
    }
}
