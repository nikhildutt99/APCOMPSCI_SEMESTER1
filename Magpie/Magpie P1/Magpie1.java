public class Magpie1
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";
		statement=statement.trim();
		if(statement.length() ==0)
		{
			response = "Say something, please.";
		}
		 
		else if (findKeyword(statement,"no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (findKeyword(statement,"mother") >= 0
				|| findKeyword(statement,"father") >= 0
				|| findKeyword(statement,"sister") >= 0
				|| findKeyword(statement,"brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		/* its the same thing as for the family stuff i just changed the keywords*/
		else if (findKeyword(statement,"cat") >= 0
				|| findKeyword(statement,"dog") >= 0
				|| findKeyword(statement,"fish") >= 0
				|| findKeyword(statement,"turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement,"Robinette") >= 0)
		{
			response = "Robinette HAHA";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	private int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();
		int psn = phrase.indexOf(goal, startPos);

		
		while (psn >= 0) {
			
			String before = "", after = "";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn);
			}

			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(),psn + goal.length() + 1);
			}

			
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
				return psn;
			}

			psn = phrase.indexOf(goal, psn + 1);

		}
		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 *
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}
}