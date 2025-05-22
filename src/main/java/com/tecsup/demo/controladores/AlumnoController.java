package com.tecsup.demo.controladores;
import com.tecsup.demo.modelo.entidades.Alumno;
import com.tecsup.demo.servicios.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.Map;
@Controller
@SessionAttributes("alumno")
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("alumnos", alumnoService.listar());
        return "listarAlumnoView";
    }

    @GetMapping("/buscarAlumno")
    public String buscarAlumno(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("titulo", "Resultados de búsqueda de alumnos para: " + keyword);
        model.addAttribute("alumnos", alumnoService.buscarPorNombre(keyword));
        return "listarAlumnoView"; // Asegúrate de que esa vista exista
    }

    @GetMapping("/form")
    public String crear(Map<String, Object> model) {
        Alumno alumno = new Alumno();
        model.put("alumno", alumno);
        return "formAlumnoView";
    }
    @GetMapping("/form/{id}")
    public String editar(@PathVariable("id") Integer id, Map<String, Object> model) {
        Alumno alumno = null;
        if (id > 0) {
            alumno = alumnoService.buscar(id);
        } else {
            return "redirect:/alumno";
        }
        model.put("alumno", alumno);
        return "formAlumnoView";
    }
    @PostMapping("/form")
    public String guardar(@Valid Alumno alumno, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            return "formAlumnoView";
        }
        alumnoService.grabar(alumno);
        status.setComplete();
        return "redirect:/alumno";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        if (id > 0) {
            alumnoService.eliminar(id);
        }
        return "redirect:/alumno";
    }


}
