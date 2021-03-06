package sch.ami.train.model;

import javax.persistence.*;

@Entity
@Table(name = "train")
public class Train extends AuditModel {

    @Id
    @GeneratedValue(generator = "train_generator")
    @SequenceGenerator(
            name = "train_generator",
            sequenceName = "train_sequence",
            initialValue = 1000
    )
    private int id;

    public int getId() {
        return id;
    }

    @Column(columnDefinition = "date")
    private String time_arr;

    @Column(columnDefinition = "date")
    private String time_dep;
}
