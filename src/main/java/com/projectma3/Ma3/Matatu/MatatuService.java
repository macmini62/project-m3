package com.projectma3.Ma3.Matatu;

import com.projectma3.Ma3.Driver.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatatuService {

    public List<Matatu> getMatatu(){
        return List.of(
                new Matatu(
                        1L,
                        "KBQ990J",
                        10,
                        "Dere"
                )
        );
    }
}
