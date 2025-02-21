
package com.tienda.controller;

import com.tienda.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;        
import org.springframework.annotation.RequestMapping;
        
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categoria);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
    }

}
