package model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student {
    @Id
    @Column(name = "Student_ID")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;

}
