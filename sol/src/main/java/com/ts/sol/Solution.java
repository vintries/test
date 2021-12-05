package com.ts.sol;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public abstract class Solution {

	public abstract void load(String arg) throws IOException;
	public abstract Collection<Bank> getCache();
	public abstract Collection<Bank> filter(int filter, String ... args);
	
	protected Collection<Bank> filter(final Collection<Bank> banks, final int filter, final String ... args) {
		
		if((banks == null || args == null || 1 < args.length) && filter != 7) {
			System.err.println("Invalid inputs ...");
		}
		
		Collection<Bank> temp = Collections.emptyList();
		switch (filter) {
		
			//search by zip code
			case 1:
			{
				temp = banks.stream().filter(bank -> bank.getZip().equalsIgnoreCase(args[0]))
						.collect(Collectors.toList());
				break;
				
			}
			//search by by state
			case 2:
			{
				temp = banks.stream().filter(bank -> bank.getState().equalsIgnoreCase(args[0]))
						.collect(Collectors.toList());
				break;
				
			}
			//search by city
			case 3:
			{
				temp = banks.stream().filter(bank -> bank.getCity().equalsIgnoreCase(args[0]))
						.collect(Collectors.toList());
				break;
				
			}
			//search by type
			case 4:
			{
				temp = banks.stream().filter(bank -> bank.getType().equalsIgnoreCase(args[0]))
						.collect(Collectors.toList());
				break;
				
			}
			//search by Bank name
			case 5:
			{
				temp = banks.stream().filter(bank -> bank.getName().equalsIgnoreCase(args[0]))
						.collect(Collectors.toList());
				break;
				
			}
			//search by City & State
			case 6:
			{
				temp = banks.stream().filter(bank -> bank.getCity().equalsIgnoreCase(args[0]))
						.filter(bank -> bank.getState().equalsIgnoreCase(args[1])).collect(Collectors.toList());
				break;
				
			}
			
			default:{
				System.err.println("Invalid search criteria...");
				break;
			}

		}
		return Collections.unmodifiableCollection(temp);
	}

}
