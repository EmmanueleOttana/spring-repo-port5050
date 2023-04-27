package co.develhope.springrepositories2.controllers;

import co.develhope.springrepositories2.entities.ProgrammingLanguage;
import co.develhope.springrepositories2.repositories.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class ProgrammingLanguageController {

    @Autowired
    ProgrammingLanguageRepository repoProgrammingLanguage;

    @PostMapping("/create/{name}/{firstAppearance}")
    public ProgrammingLanguage createProgrammingLanguage(@PathVariable String name, @PathVariable int firstAppearance){
        ProgrammingLanguage pl = new ProgrammingLanguage(name,firstAppearance);
        repoProgrammingLanguage.saveAndFlush(pl);
        return pl;
    }
    @GetMapping("/all")
    public List<ProgrammingLanguage> getAll(){
        return repoProgrammingLanguage.findAll();
    }
    @GetMapping("/all/{pageToView}")
    public Page<ProgrammingLanguage> getPage(@PathVariable int pageToView){
        Pageable pageable = PageRequest.of(pageToView-1,2);
        return repoProgrammingLanguage.findAll(pageable);
    }

    @PutMapping("/update/{id}")
    public ProgrammingLanguage updateProgrammingLanguage(@PathVariable long id, @PathParam(value = "name") String name){
        repoProgrammingLanguage.getById(id).setName(name);
        repoProgrammingLanguage.saveAndFlush(repoProgrammingLanguage.getById(id));
        return repoProgrammingLanguage.getById(id);
    }

}
