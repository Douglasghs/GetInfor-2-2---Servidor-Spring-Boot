package com.example.GetInfor.GetInfor.Controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.GetInfor.GetInfor.Model.Model_user;
import com.google.gson.Gson;

@RestController
public class Controller_Rotas {

	ArrayList<Model_user> Lista = new ArrayList<>();

	@RequestMapping(value = "/Cadastro", method = RequestMethod.POST)
	public ResponseEntity AddValues(@RequestBody Object info) {
		
		try {
			Gson gson = new Gson();
			Model_user objModel = gson.fromJson(info.toString(), Model_user.class);
			
			String IPV4 = objModel.getIPV4();
			String IPV6 = objModel.getIPV6();
			String UserName = objModel.getUserName();
			String HostName = objModel.getHostName();
		    String Memory = objModel.getMemoryRAM();
			
			if((IPV4.equalsIgnoreCase("")) && (IPV6.equalsIgnoreCase("")) && (UserName.equalsIgnoreCase("")) && (HostName.equalsIgnoreCase("")) && (Memory.equalsIgnoreCase(""))) {
				Lista.add(new Model_user(IPV4, IPV6, UserName, HostName, Memory));
			}else {
				// retornar que a página nãio tá com os parametros corretos
			}
			
			System.out.println(info.toString());
		 
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
