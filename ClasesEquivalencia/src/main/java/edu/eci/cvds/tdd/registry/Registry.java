package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	private ArrayList<Integer> idRegistrados = new ArrayList<Integer>();
    public RegisterResult registerVoter(Person p) {
    	if (!p.isAlive()) {
    		return RegisterResult.DEAD;
    	}
    	else if (p.getAge() < 18) {
    		return RegisterResult.UNDERAGE;
    	}
    	else if (p.getAge() < 0 || p.getAge() > 100) {
    		return RegisterResult.INVALID_AGE;
    	}
    	else if (idRegistrados.contains(p.getId())) {
    		return RegisterResult.DUPLICATED;
    	}
    	else {
    		idRegistrados.add(p.getId());
    		// TODO Validate person and return real result.
    		return RegisterResult.VALID;
    	}
    }
}