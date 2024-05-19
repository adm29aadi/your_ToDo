package com.example.myfirstapp.login;

import org.springframework.stereotype.Service;

@Service
public class UserAuthentication {
     public boolean authenticateuser(String name,String password)
     {
    	 boolean ans1=name.equalsIgnoreCase("adarsh");
    	 boolean ans2=password.equalsIgnoreCase("7897");
    	 return ans1&&ans2;
     }
}
