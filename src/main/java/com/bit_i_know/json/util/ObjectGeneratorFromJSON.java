package com.bit_i_know.json.util;

import java.io.File;
import java.io.IOException;

import com.bit_i_know.json.model.Candidate;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author pradeep.
 * 
 * 
 *         Generating an Model object from JSON.
 */
public class ObjectGeneratorFromJSON {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Candidate candidate = mapper.readValue(new File("C:\\Pradeep.json"), Candidate.class);
			System.out.println(candidate.getName());
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
