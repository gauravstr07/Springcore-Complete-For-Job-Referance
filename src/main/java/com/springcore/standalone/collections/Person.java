package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feesStructure;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStructure=" + feesStructure + "]";
	}

	public Map<String, Integer> getFeesStructure() {
		return feesStructure;
	}

	public void setFeesStructure(Map<String, Integer> feesStructure) {
		this.feesStructure = feesStructure;
	}

}
