import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesr 
{
	public void serialization() throws IOException
	{
		Employee e = new Employee(395233,"Anupam");
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+ "\\test");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
	}
	
	public void Deserialization() throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\test");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee)ois.readObject();
		System.out.println(e.id + " "+e.name);
	}
}
