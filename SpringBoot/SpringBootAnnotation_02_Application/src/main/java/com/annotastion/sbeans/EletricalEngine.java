package com.annotastion.sbeans;

import org.springframework.stereotype.Component;

@Component("Ele")
public class EletricalEngine implements IEngineAllType {
	
	public EletricalEngine() {
		System.out.println(" I am EletricalEngine ... with 0 paramCunstructor");
	}

	@Override
	public void start() {
		System.out.println("EletricalEngine is Start... By By");
		}

	@Override
	public void stop() {
		System.out.println("EletricalEngine is your last Stop.. tack care..");
	}

}
