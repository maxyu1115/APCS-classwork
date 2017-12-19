
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Magpie3 {
    public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                else if (statement.indexOf("eat") >= 0
				|| statement.indexOf("ate") >= 0
				|| statement.indexOf("lunch") >= 0
				|| statement.indexOf("dinner") >= 0
                                || statement.indexOf("breakfast") >= 0
                                || statement.indexOf("food") >= 0
                                || statement.indexOf("tasty") >= 0)
		{
			response = "Tell me more about your plans.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		Random r = new Random();
		int whichResponse = (int)(r.nextInt(NUMBER_OF_RESPONSES));
		String[] response = {"Interesting, tell me more.","Hmmm.","Do you really think so?",
                    "You don't say."};
		return response[whichResponse];
	}
}
