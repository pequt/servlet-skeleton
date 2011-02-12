package pequt.service;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

public class JsonServiceTest {
	private JsonService dut;
	private static final String JSON_STRING = "{\"num\":12345,\"str\":\"string\",\"nullnull\":null,\"bool\":true}";
	private Map<String, Object> map;

	@Before
	public void setUp() {
		dut = new JsonService();
		
		// objectMapper will be created in Spring 3 application context - mimic it
		dut.objectMapper = new ObjectMapper();
		
		// HashMap doesn't preserve order of inserted keys. LinkedHashmap does.
		map = new LinkedHashMap<String, Object>();
		map.put("num", 12345);
		map.put("str", "string");
		map.put("nullnull", null);
		map.put("bool", true);
	}
	
	@Test
	public void jsonFromMap() {
		assertEquals(JSON_STRING, dut.jsonFromMap(map));
	}
	
	@Test
	public void mapFromJson() {
		assertEquals(map, dut.mapFromJson(JSON_STRING));
	}
	
	@Test
	public void mapFromJson_date() {
		// see http://wiki.fasterxml.com/JacksonFAQDateHandling
		Map<String, Object> m = new HashMap<String, Object>();
		m.put("date", new Date(12345));
		assertEquals("{\"date\":12345}", dut.jsonFromMap(m));
	}
}