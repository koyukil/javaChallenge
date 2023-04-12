package com.example.demo.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "user")
public class userModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String name;
    private String email;
    private String Password;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "user_phone", joinColumns = @JoinColumn(name = "id" ))
    private List<userPhone> phones;


    private String createdDate;
    private String modifiedDate;
    private String lastLoginDate;
    private String accessToken;
    private boolean isActive;


}