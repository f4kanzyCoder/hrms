package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.JobTitle;
import kodlamaio.hrms.entities.concretes.User;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
