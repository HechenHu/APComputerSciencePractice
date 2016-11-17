import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Name 
{
	private Pattern reg;
	private Matcher m;
	public void MatchPattern(String text,String target)
{
			reg = Pattern.compile(target);
			m = reg.matcher(text);

}
	public void printResult(String name)
	{
		if(m.find())
		{
				System.out.println("First Name: "+name.substring(0, m.start()));
				System.out.println("Last Name : "+name.substring(m.start()+1,name.length()) );
				System.out.println("Full Name : "+name);
		}
		else
			System.out.println("Invalid Input!");

	}
}
