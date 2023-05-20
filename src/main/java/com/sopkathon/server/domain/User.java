package com.sopkathon.server.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long point;

    public void addPoint(){
        this.point ++;
    }

    public void subPoint(){
        if(this.point==0){
            this.point++;
        }
        else {
            this.point--;
        }
    }

    @Builder
    public User(Long id, String name, Long point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }
}
