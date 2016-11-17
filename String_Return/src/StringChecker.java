import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringChecker 
{
	public void MatchPattern(String text,String target)
	{
		Pattern reg = Pattern.compile(target);
		Matcher m = reg.matcher(text);
		System.out.println(" Looking For "+target+" "+m.find());
	}
}
