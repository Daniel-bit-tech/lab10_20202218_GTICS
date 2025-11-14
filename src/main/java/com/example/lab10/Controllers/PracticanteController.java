package com.example.lab10.Controllers;

import com.example.lab10.Entity.Practicante;
import com.example.lab10.Repository.PracticantesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/practicantes")

public class PracticanteController {

    private final PracticantesRepository repo;

    public PracticanteController(PracticantesRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Practicante> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Practicante crear(@RequestBody Practicante p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Practicante actualizar(@PathVariable Long id, @RequestBody Practicante p) {
        p.setId(Math.toIntExact(id));
        return repo.save(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
