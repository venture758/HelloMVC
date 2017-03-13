package com.venture.service;

import org.springframework.stereotype.Component;

import com.venture.api.CompactDisc;

@Component
public class CompactDiscImpl implements CompactDisc {

	@Override
	public void play() {
		System.err.println("¡¾play¡¿");
	}

}
