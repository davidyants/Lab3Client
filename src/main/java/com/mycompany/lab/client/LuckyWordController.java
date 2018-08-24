/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author evda
 */
@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }

}
