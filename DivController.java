package com.example.demo.div;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/div")
public class DivController {
    @Autowired
    private DivRepository repository;

    @GetMapping
    public List<Div> getAllDiv(){
        return repository.findAll();
    }

}

