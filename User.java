package com.example.demo.user;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.div.Div;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    // @Column(name = "belong_to")
    // private int belongTo;

    @Column(name = "joined_at")
    private LocalDateTime joinedAt;

    @Column(name = "login_at")
    private LocalDateTime loginAt;

    @ManyToOne
    @JoinColumn(name = "belong_to")
    private Div div;

    public String getFromName() {
        return null;
    }
    
}
