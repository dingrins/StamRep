package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Articles extends Controller{
	
	public static Result index() {
        
	       //return ok("bla");
	    	return ok(views.html.articles.render("Welcome to my Articles."));
	    }
	
}
