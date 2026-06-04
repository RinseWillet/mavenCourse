


@RestController
public class ExampleController 	{

	public Map<String, Object> getIndex() {
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("hello", "world");

		return map;
	}
}
