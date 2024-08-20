package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.AdminDTO;
import com.example.demo.entity.Admin;
import com.example.demo.exception.AdminNotAddedException;
import com.example.demo.exception.AdminNotDeletedException;
import com.example.demo.exception.AdminNotFoundException;
import com.example.demo.exception.AdminNotUpdatedException;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public ResponseEntity<AdminDTO> addAdmin(@RequestBody AdminDTO adminDTO) throws AdminNotAddedException{
		adminService.addAdmin(adminDTO);
		return new ResponseEntity<AdminDTO>(HttpStatus.CREATED);
		
	}
	@PutMapping("/updateAdmin")
	public ResponseEntity<AdminDTO> updateAdmin(@RequestBody AdminDTO adminDTO) throws AdminNotUpdatedException{
		adminService.updateAdmin(adminDTO);
		return new ResponseEntity<AdminDTO>(HttpStatus.OK);
	}
	@GetMapping("/getAdminById/{id}")
	public Admin getAdminById(@PathVariable("id") Long id) throws AdminNotFoundException  {
		 Admin admin=adminService.getAdminById(id) ;
		return  admin;
	}
	@DeleteMapping("/deleteAdminById/{id}")
	public String deleteAdminById(@PathVariable("id") Long id) throws AdminNotDeletedException {
		adminService.deleteAdmin(id);
		return "Admin Deleted Successfully";
		
	}
//	@PostMapping("/login")
//	public ResponseEntity getAdmin(@RequestParam String username,@RequestParam String password) throws AdminNotFoundException {
//			Admin admin = adminService.getAdmin(username, password);
//			return new ResponseEntity(HttpStatus.OK);
//			
		
		
	//}
}
