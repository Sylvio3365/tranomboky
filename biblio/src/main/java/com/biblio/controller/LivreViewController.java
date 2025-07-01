package com.biblio.controller;

import com.biblio.model.Livre;
import com.biblio.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/livre")
public class LivreViewController {
    @Autowired
    private LivreService service;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("livres", service.findAll());
        return "livre/list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("livre", new Livre());
        return "livre/form";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Integer id, Model model) {
        model.addAttribute("livre", service.findById(id));
        return "livre/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Livre livre) {
        service.save(livre);
        return "redirect:/livre/list";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Integer id, Model model) {
        model.addAttribute("livre", service.findById(id));
        return "livre/detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteById(id);
        return "redirect:/livre/list";
    }
}
