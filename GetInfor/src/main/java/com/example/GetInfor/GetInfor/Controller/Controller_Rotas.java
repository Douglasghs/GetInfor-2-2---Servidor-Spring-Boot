package com.example.GetInfor.GetInfor.Controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Rotas {
	
	@RequestMapping(value = "/Cadastro", method = RequestMethod.POST)
	public ResponseEntity AddValues(@RequestBody Object info) {
		
		try {
			System.out.println("Adicionar -----------------------");
			System.out.println(info);
			
			return ResponseEntity.ok(info);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();

		}
		
	}
	
	@RequestMapping(value = "/Delete", method = RequestMethod.PUT)
	public ResponseEntity DeleteValues(@RequestBody Object info) {
		
		try {
			System.out.println("Delete ----------------------");
			System.out.println(info);
			
			return ResponseEntity.ok(info);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();

		}
		
	}
	
	
	
}
