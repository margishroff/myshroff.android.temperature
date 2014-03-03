package myshroff.android.temperature;

//Margi - The below class has two functions to convert from C to F and F to C
public class ConverterUtil {
	
	public static float covertFtoC(float fahrenheit)
	{
		return ((fahrenheit - 32)* 5 /9 );
	}
	
	public static float covertCtoF(float celsius)
	{
		return ((celsius * 9)/5)+32;
	}

} 