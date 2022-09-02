package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="job_title")
public class JobTitle {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    public JobTitle(){}
    public JobTitle(int id, String title) {
        this.id = id;
        this.title = title;
    }


}
