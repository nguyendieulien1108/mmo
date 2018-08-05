package com.bh4life.grabssh.controller;

import com.bh4life.grabssh.model.SSH;
import com.bh4life.grabssh.repository.SSHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    SSHRepository sshRepository;
    @RequestMapping("/home")
    public String index(Model model){
        ArrayList<SSH> list = (ArrayList)sshRepository.findAll();
        model.addAttribute("list",list);
        return "home";
    }
}
