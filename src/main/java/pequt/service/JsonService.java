package pequt.service;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonService {
	@Autowired ObjectMapper objectMapper;
	
	public Map<String, Object> mapFromJson(String json) {
		try {
			return objectMapper.readValue(json, new TypeReference<Map<String,Object>>() {});
		} catch (Exception e) {
			return null;
		}
	}

	public String jsonFromMap(Map<String, Object> map) {
		try {
			return objectMapper.writeValueAsString(map);	
		} catch (Exception e) {
			return "{}"; 
		}
	}
}