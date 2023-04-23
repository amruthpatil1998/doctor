package com.example.Docter.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Docter.modle.Docter;
import com.example.Docter.service.DocterService;

@RestController
public class DocterController {

	@Autowired
	private DocterService service;
	
	@GetMapping("/test")
	public String test() {
		return "hai";
	}

	@PostMapping("/save")
	public Docter saveDocT(@RequestBody Docter docter) {
		Docter emp = service.save(docter);
		return emp;
	}

	@GetMapping("/getAll")
	public List<Docter> getAllEmpl() {
		List<Docter> ml = service.getallemp();
		return ml;
	}

	@DeleteMapping("/delete/{id}")
	public String docDelet(@PathVariable("id") int id) {
		service.deleteD(id);
		return "this id is deleted : "+id;

	}
}
