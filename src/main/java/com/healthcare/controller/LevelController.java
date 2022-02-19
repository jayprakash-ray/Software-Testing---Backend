package com.healthcare.controller;

import com.healthcare.entity.Level;
import com.healthcare.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/level")
public class LevelController {
    @Autowired
    private LevelService levelService;

    @PostMapping("")
    public Level createLevel(@RequestBody Level level){
        return levelService.createLevel(level);
    }

    @GetMapping("")
    public List<Level> getAllLevels(){
        return levelService.getAllLevels();
    }

    @GetMapping("/{levelName}")
    public Level getLevel(@PathVariable String levelName){
        return levelService.getLevelByName(levelName);
    }
}