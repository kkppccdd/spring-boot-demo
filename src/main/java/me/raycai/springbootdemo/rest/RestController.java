package me.raycai.springbootdemo.rest;

import me.raycai.springbootdemo.domain.Blank;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@RequestMapping("/rest")
public class RestController {
    
    @GetMapping("/{resourceType}/{id}")
    @ResponseBody
    public Object get(@PathVariable(name = "id") final String id){
        return new Blank(id);
    }
    
    @GetMapping("/{resourceType}")
    @ResponseBody
    public Object list(@PathVariable(name="resourceType") final String resourceType){
        return Arrays.asList(new Blank("1"),new Blank("2"));
    }
}
