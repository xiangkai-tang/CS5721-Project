package main;

import controller.Controller;
import entities.Module;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test
		for(Module module: Controller.getInstance().getAllModule()) {
			System.out.println(" Module Code: " + module.getModule_no());
			System.out.println(" Module Name: " + module.getModule_name());
			System.out.println(" Lecturer Name: " + module.getLecturer_name());
			System.out.println(" Credit: " + module.getCredit());
		}
	}

}