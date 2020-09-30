package com.uviqo.LoginTokenTask1.Service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import com.uviqo.LoginTokenTask1.Model.APIResponse;
import com.uviqo.LoginTokenTask1.Model.LoginDTO;
//import com.uviqo.LoginTask1.Repository.UserDAOImpl;
import com.uviqo.LoginTokenTask1.Model.UserDTO;
import com.uviqo.LoginTokenTask1.Repository.UserDAO;



@Transactional
@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;

//	@Autowired
//	private UserDAOImpl userDaoImpl;


	public APIResponse login(LoginDTO login, @RequestParam("username") String username) {
		UserDTO user = userDAO.findByUsername(login.getUsername());
		if (user == null) {
			return new APIResponse(403, "No user found", null);
		}

		if (user.getPassword().equals(login.getPassword())) {

			return new APIResponse(200, "Login Success", null);

		}
		return new APIResponse(401, "Password Mismatches", null);
	}
}

