package com.julioluis.ticketapp.controller;

import com.julioluis.ticketapp.model.Plane;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("planes")
public class PlaneController {

    @GetMapping
    public ResponseEntity<List<Plane>> getAllPlane() {
        return ResponseEntity.ok(Arrays.asList(new Plane(1L,"Airlane 1",100),
                new Plane(2L,"Airlane 2",150),
                new Plane(3L,"Airlane 3",200)));
    }
}
