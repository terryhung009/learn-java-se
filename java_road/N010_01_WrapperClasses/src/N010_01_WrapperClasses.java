
public class N010_01_WrapperClasses {

	public static void main(String[] args) {
		
		Integer i = new Integer(8);
		Double d = new Double("3.14");
		Boolean b = new Boolean(true);
//		
//		
//		int i2 = i.intValue();
//		double d2 = d.doubleValue();
//		boolean b2 = b.booleanValue();
//		
//		int x =8;
//		String s =x +"";
//		String s2= i.toString();
		
		
		String data = "12345";
//		int n = Integer.parseInt(data);
		
//		System.out.println(n);
		
//		double q =Double.parseDouble(data);
//		System.out.println(q);
		
//		char r = data.charAt(0);
		
		
//		data = "true";
//		data = "TRUE";
//		
//		boolean r =Boolean.parseBoolean(data);
//		System.out.println(r);
		
		data = "100";
		int m = Integer.parseInt(data, 2);
		int n = Integer.parseInt(data, 8);
		int o = Integer.parseInt(data, 16);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		
	}
}
