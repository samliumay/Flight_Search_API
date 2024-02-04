package com.example.demo.Flight;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/Havaalani")
public class HavaalaniController {

    private final HavaalaniService havaalaniService;

    @Autowired
    public HavaalaniController(HavaalaniService havaalaniService){
        this.havaalaniService = havaalaniService;
    }
    @GetMapping
    public List<Havaalani> getHavaalani(){
        return havaalaniService.getHavaalani();
    }

    @PostMapping
    public void registerNewHavaalani(@RequestBody Havaalani havaalani){
        havaalaniService.addNewHavaalani(havaalani);
    }

}
