package main.queries;

public class AuthQueries{
    public static String userSignIn(){
        return "SELECT password FROM user WHERE emailId = ?";
    }
    public static String userInDb(){
        return "SELECT password FROM user WHERE emailId = ?";
    }
    public static String userSignUp(){
        return "INSERT INTO user(userName , emailId , password, gender, dob, mobile_No,aadhaar_no , address, pincode) VALUES (? , ?, ? , ?, ?, ?, ?, ?, ?)";
    }
    public static String adminSingIn(){
        return "SELECT adminPassword FROM admin WHERE adminEmail = ?";
    } 
}
