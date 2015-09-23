/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Message;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author isaac
 */
  @RestController
public class HelloWorldRestController {
    
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {
 
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
 
    
}