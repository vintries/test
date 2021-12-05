package com.ts.sol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Stream;


public class FileBasedSolution extends Solution {
	
	private Collection<Bank> collection;
	
	public FileBasedSolution(String fileName) throws IOException {
		load(fileName);
	}
	
	@Override
	public synchronized void load(final String arg) throws IOException {
		final Collection<Bank> banks = new LinkedList<>();
		try(Stream<String> stream = Files.lines(Paths.get(arg))){
			//skip header
			stream.skip(1).forEach(line -> {
				String[] arr = line.split(",");
				if(arr.length == 6) {
					Bank bank = new Bank(Integer.valueOf(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5]);
					banks.add(bank);
				} else {
					System.err.println("Invalid input...");
					System.err.println(line);
				}
			});
		}
		collection = Collections.unmodifiableCollection(banks);
	}

	@Override
	public Collection<Bank> getCache() {
		return collection;
	}

	@Override
	public Collection<Bank> filter(int filter, String... args) {
		return filter(getCache(), filter, args);
	}

}
