import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;
import java.rmi.Naming;
public class Copy_ClientMain2{
	public static void main(String[] args) throws Exception
	{
			System.out.println(toplam(5, 3));
			System.out.println(deneme(5, 4));
			System.out.println(cikar(2020, 1994));
			System.out.println(carp(2020, 1995));
			System.out.println(carps(2020, 1995));
			System.out.println(asdqwe(2020, 1995));
			System.out.println(halil(2020, 1995));
			System.out.println(carpim(2020, 1995));
			System.out.println(carpma(2020, 1995));
			System.out.println(carpmama(2020, 1995));
			System.out.println(halo(2020, 1995));
			System.out.println(strDeneme());
			System.out.println(asdasd());
			System.out.println(bubizimdeneme());
			System.out.println(bubizimdene());
			System.out.println(bubizimdeN());
			System.out.println(berke());
			System.out.println(onbes());
			piApproximation();
		}
	public static int deneme(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.deneme( x, y);
	}
	public static int carpma(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.carpma( x, y);
	}
	public static int halil(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.halil( x, y);
	}
	public static int carpim(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.carpim( x, y);
	}
	public static int carpmama(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.carpmama( x, y);
	}
	public static java.lang.String asdasd() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.asdasd();
	}
	public static int cikar(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.cikar( x, y);
	}
	public static int carps(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.carps( x, y);
	}
	public static java.lang.String bubizimdeneme() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.bubizimdeneme();
	}
	public static java.lang.String bubizimdene() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.bubizimdene();
	}
	public static java.lang.String bubizimdeN() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.bubizimdeN();
	}
	public static int toplam(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.toplam( x, y);
	}
	public static int onbes() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.onbes();
	}
	public static java.lang.String strDeneme() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.strDeneme();
	}
	public static java.lang.String berke() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.berke();
	}
	public static void piApproximation() throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		name.piApproximation();
	}
	public static int halo(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.halo( x, y);
	}
	public static int carp(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.carp( x, y);
	}
	public static int asdqwe(int x, int y) throws Exception { 
		RMIInterface name = (RMIInterface) Naming.lookup("//192.168.56.1:12345/MyServer");
		return name.asdqwe( x, y);
	}
}
