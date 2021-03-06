/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educircle.domain;
import java.io.Serializable;
import javax.persistence.Embeddable;
/**
 *
 * @author RASCAL
 */
@Embeddable
public class Result implements Serializable
{
    public String StudentName;
    public String SubjectName;
    public Double StudentMarks;

    public Result() {
    }

    public String getStudentName() {
        return StudentName;
    }
            
    public String getSubjectName() {
        return SubjectName;
    }

    public Double getStudentMarks() {
        return StudentMarks;
    }

    public Result(Builder builder)
    {
        this.StudentName=builder.StudentName;
        this.SubjectName=builder.SubjectName;
        this.StudentMarks=builder.StudentMarks;
     }
    public static class Builder
    {
        private String StudentName;
        private String SubjectName;
        private Double StudentMarks;
    
    public Builder (String StudentName)
    {
        this.StudentName=StudentName;
        
    }
    public Builder SubjectName (String value)
    {
        this.SubjectName=value;
        return this;
    }
    public Builder StudentMarks(Double value)
    {
        this.StudentMarks=value;
        return this;
    }
    public Builder copy(Result value){
        this.StudentName=value.StudentName;
        this.SubjectName=value.SubjectName;
        this.StudentMarks=value.StudentMarks;
        return this;
    }
    public Result build()
    {
        return new Result(this);
    }
    }
}
