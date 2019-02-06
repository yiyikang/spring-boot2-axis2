package com.sillycat.springbootaxis.service;

import org.springframework.core.io.Resource;

public class Axis2ServiceInfo {

	private String name;

	private Resource resource;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

}
