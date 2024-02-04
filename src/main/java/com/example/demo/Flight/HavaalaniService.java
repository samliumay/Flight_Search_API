package com.example.demo.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HavaalaniService {

    private final HavaalaniRepository havaalaniRepository;

    @Autowired
    public HavaalaniService(HavaalaniRepository havaalaniRepository) {
        this.havaalaniRepository = havaalaniRepository;
    }

    public List<Havaalani> getHavaalani(){
     return havaalaniRepository.findAll();
    }

    public void addNewHavaalani(Havaalani havaalani) {
        havaalaniRepository.save(havaalani);
    }
}
