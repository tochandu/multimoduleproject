package captemplate.data.repository;

import captemplate.data.model.EmpData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDataRepository extends MongoRepository<EmpData, String> {
}
