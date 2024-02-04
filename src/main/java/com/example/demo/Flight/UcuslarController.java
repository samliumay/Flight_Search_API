package com.example.demo.Flight;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/Ucuslar")
public class UcuslarController {

    private final UcuslarService ucuslarService;

    public UcuslarController(UcuslarService ucuslarService) {
        this.ucuslarService = ucuslarService;
    }

    @GetMapping
    public List<Ucuslar> getUcuslar(){
        return ucuslarService.getUcuslar();
    }


}
