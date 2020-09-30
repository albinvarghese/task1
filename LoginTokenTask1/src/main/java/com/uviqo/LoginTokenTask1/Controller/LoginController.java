package com.uviqo.LoginTokenTask1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uviqo.LoginTokenTask1.Model.APIResponse;
import com.uviqo.LoginTokenTask1.Model.LoginDTO;
import com.uviqo.LoginTokenTask1.Service.UserService;

@RestController
@Service
public class LoginController {
	
    @Autowired
    private UserService userService;

    @PostMapping("/loginpage")
    public APIResponse login(@RequestBody LoginDTO login)  {
    	
        return userService.login(login, null);
    }
}
