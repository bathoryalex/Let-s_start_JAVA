//Ez a fájl nem kell a program futtatásához.
package java_xml_handler;

import java.util.HashMap;
import java.util.List;

public class Tools
{
	public static String toXMLTag(String tagName, String tagValue)
	{
		StringBuffer xmlTag = new StringBuffer();
		xmlTag.append('<');
		xmlTag.append(tagName);
		xmlTag.append('>');
		xmlTag.append(tagValue);
		xmlTag.append("</");
		xmlTag.append(tagName);
		xmlTag.append('>');

		return xmlTag.toString();
	}

	public static String[] getMovieTitles(List<Movie> movies)
	{
		String[] movieTitles = new String[movies.size()];
		for (int i = 0; i < movies.size(); i++)
		{
			movieTitles[i] = movies.get(i).getTitle();
		}
		return movieTitles;
	}

	public static HashMap<Person, Integer> getMoviesPerPerson(List<Movie> movies)
	{
		HashMap<Person, Integer> moviesPerPerson = new HashMap<Person, Integer>();
		for (Movie movie : movies)
		{
			for (Person person : movie.getCast())
			{
				if (!moviesPerPerson.containsKey(person))
				{
					moviesPerPerson.put(person, new Integer(0));
				}
				moviesPerPerson.put(person, moviesPerPerson.get(person) + 1);
			}
		}

		return moviesPerPerson;
	}
}
