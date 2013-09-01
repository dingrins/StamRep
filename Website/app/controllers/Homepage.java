package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Homepage extends Controller {
  
    public static Result index() {
        
       //return ok("bla");
    	return ok(views.html.homepage.render("Welcome to my new site."));
    }
  
    public static Result loadAbout() {
        System.out.println("load about");
     	return ok(views.html.modal.about.render());
     }
    
    public static Result loadCenterArea(){
        System.out.println("load about");
     	return ok(views.html.modal.about.render());
    }
}
