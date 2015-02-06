//source: https://www.udemy.com/java-tutorial/#/lecture/152283
//casting = remenea jedneho typu premennej na inu
//neda sa castnut String to int

public class CastingNumVals {
	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 3435355;
		
		float floatValue = 3554.4f;
		double doubleValue = 32.1;
		
		System.out.println(Byte.MAX_VALUE);		//ukaze maximalnu hodnotu typu premennej
		
		intValue = (int)longValue;		//convert long na int
		System.out.println(intValue);
		
		doubleValue = intValue;				//convert int na double
		System.out.println(doubleValue);	//prida desatinnu ciarku
		
		intValue = (int)floatValue;			//convert float na int
		System.out.println(intValue);		//odsekne za desatinnou ciarkou
		
		//won't work as we expect to!!
		// 128 is too big for a byte
		byteValue = (byte)128;
		System.out.println(byteValue);
		
	}
}


