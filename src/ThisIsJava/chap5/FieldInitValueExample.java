package chap5;
public class FieldInitValueExample {
	public static void main (String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField:" + fiv.byteField);
		System.out.println("shortField" + fiv.shortField);
		System.out.println("intField" + fiv.intField);
		System.out.println("longField" +fiv.longField);
		System.out.println("booleanField" +fiv.booleanField);
		System.out.println("charField" +fiv.charField);
		System.out.println("floatField: " +fiv.floatField);
		System.out.println("double: " +fiv.doubleField);
		System.out.println("arrField: " +fiv.doubleField);
		System.out.println("referenceField: " +fiv.referenceField);
	}
}