package com.projectma3.Ma3.Matatu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/matatu")
public class MatatuController {
    @Autowired
    private final MatatuService matatuService;

    public MatatuController(MatatuService matatuService){
        this.matatuService=matatuService;
    }

    @GetMapping
    public List<Matatu> getMatatu(){
      return matatuService.getMatatu();
    }
}
