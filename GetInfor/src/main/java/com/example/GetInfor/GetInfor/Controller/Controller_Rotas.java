package com.example.GetInfor.GetInfor.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
	
	
	@RequestMapping(value = "/Valores", method = RequestMethod.GET)
	public List<Model_user> GetList(){
		return Lista;
	}
	

	@RequestMapping(value = "/Cadastro", method = RequestMethod.POST)
	public ResponseEntity AddValues(@RequestBody String info, HttpServletResponse res) {
		
		try {
			
			Gson gson = new Gson();
			Model_user objModel = gson.fromJson(info, Model_user.class);
			
			String IPV4 = objModel.getIPV4();
			String IPV6 = objModel.getIPV6();
			String UserName = objModel.getUserName();
			String HostName = objModel.getHostName();
		    String Memory = objModel.getMemoryRAM();
			
		    
			if((IPV4 != "") && (IPV6 != "") && (UserName != "") && (HostName != "") && (Memory != "")) {
				Lista.add(new Model_user(IPV4, IPV6, UserName, HostName, Memory));
				
				//Lista.add(new Model_user("194.168", "d03a:ac7c:5ef2:2790%18", "Douglas", "", ""));
				//Lista.add(new Model_user("194.168", "d03a:ac7c:5ef2:2790%19", "Rian", "", ""));
				
				System.out.println("Add Sucessy");
			}
			
			return ResponseEntity.ok(info);
			
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();

		}
		
	}

	@RequestMapping(value = "/Delete", method = RequestMethod.PUT)
	public ResponseEntity DeleteValues(@RequestBody String info) {

		try {
		
			Gson gson = new Gson();
			Model_user objModel = gson.fromJson(info, Model_user.class);
			
			String IPV4 = objModel.getIPV4();
			String IPV6 = objModel.getIPV6();
			String UserName = objModel.getUserName();
			String HostName = objModel.getHostName();
		    String Memory = objModel.getMemoryRAM();
			
		    
			if((IPV4 != "") && (IPV6 != "") && (UserName != "") && (HostName != "") && (Memory != "")) {
				for(int i = 0; i < Lista.size(); i++) {
					Model_user lista = Lista.get(i);
					
					boolean IPV4Boll = lista.getIPV4().equals(IPV4);
					boolean IPV6Boll = lista.getIPV6().equals(IPV6);
					boolean UserNameBoll = lista.getUserName().equals(UserName);
					boolean HostNameBoll = lista.getHostName().equals(HostName);
					boolean MemoryBoll = lista.getMemoryRAM().equals(Memory);
					
					if(IPV4Boll && IPV6Boll && UserNameBoll && HostNameBoll && MemoryBoll) {
						Lista.remove(lista);
						break;
					}
				}
			}

			return ResponseEntity.ok(info);
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}

	}

}
