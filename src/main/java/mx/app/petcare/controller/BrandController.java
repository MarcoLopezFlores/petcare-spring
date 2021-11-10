package mx.app.petcare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.app.petcare.dto.BrandReadDto;
import mx.app.petcare.service.BrandService;

@RestController
@RequestMapping("/petcare/brand")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@GetMapping("/")
	public ResponseEntity<List<BrandReadDto>> findAll(){
		return brandService.findAll();
	}

}