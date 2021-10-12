package captemplate.impl;

import captemplate.data.model.EmpData;
import captemplate.data.repository.EmpDataRepository;
import captemplate.service.EmpdataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpdataServiceImp implements EmpdataService {
    @Autowired
    EmpDataRepository empDataRepository;

    @Override
    public List<EmpData> getEmpdataList() {
        return empDataRepository.findAll();
    }
}
