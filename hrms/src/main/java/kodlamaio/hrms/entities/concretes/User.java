package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity

@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="dtype")
    private String dtype;
    @Column(name="company_name")
    private String companyName;
    @Column(name="web_adress")
    private String webAdress;
    public User() {

    }


    public User(int id, String email, String password,String dtype,String companyName,String webAdress) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.dtype=dtype;
        this.companyName=companyName;
        this.webAdress=webAdress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebAdress() {
        return webAdress;
    }

    public void setWebAdress(String webAdress) {
        this.webAdress = webAdress;
    }
}
