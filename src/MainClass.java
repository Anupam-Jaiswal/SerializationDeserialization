import java.io.IOException;

public class MainClass 
{
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		SerDesr obj = new SerDesr();
		obj.serialization();
		obj.Deserialization();
	}
}
