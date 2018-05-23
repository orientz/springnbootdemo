package com.example.springbootdemo.service;

import com.example.springbootdemo.db.mapper.ActorMapper;
import com.example.springbootdemo.db.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    @Autowired
    private ActorMapper actorMapper;

    public Actor getInfo(){
        return actorMapper.selectByPrimaryKey((short) 2);
    }
    public int insert(){
        Actor actor =new Actor();
        actor.setActorId((short) 1);
        actor.setFirstName("zyy");
        actor.setLastName("zyy");
        return actorMapper.insert(actor);
    }
}
