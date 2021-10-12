package captemplate.data.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "emp_data")
public class EmpData {
    private int empid;
    private String empName;
    private String empaddres;
    private int age;

    public EmpData(int empid, String empName, String empaddres, int age) {
        this.empid = empid;
        this.empName = empName;
        this.empaddres = empaddres;
        this.age = age;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpaddres() {
        return empaddres;
    }

    public void setEmpaddres(String empaddres) {
        this.empaddres = empaddres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
