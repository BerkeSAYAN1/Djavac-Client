
public class FindingPath {
	public static void main(String [] args) {
		//System.out.println("Working Directory: "+System.getProperty("user.dir"));
		String val=changethepath();
		System.out.println(val);
	}
	
	public static String changethepath() {
		String directory=System.getProperty("user.dir");
		String val="";


		val=directory.replace("\"", "\\")+"\'";
		return val;
	}
}