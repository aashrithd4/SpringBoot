package com.example.tusk.database;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor

@Table(name="feedback" )
@Entity

@Data
public class feedbackdb implements Serializable {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "message")
    private String message;
    @Column(name = "regarding")
    private Integer regarding;
    @Column(name = "code")
    private String code;
    @Column(name = "rating")
    private Integer rating;
}
