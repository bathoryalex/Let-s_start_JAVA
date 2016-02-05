package java_xml_handler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MovieManager
{
	private static final String OUTPUT_FILE = "filmek.xml";

	public static void main(String[] args)
	{
		ArrayList<Movie> movies = new ArrayList<Movie>();

		Movie mTitanic = new Movie("Titanic", Genre.ROMANTIC, 200, 4.8);
		Person pWinslet = new Person("Kate", "Winslet", Gender.FEMALE, true, true);
		Person pDicaprio = new Person("Leonardo", "Di Caprio", Gender.MALE, false, true);
		mTitanic.getCast().add(pWinslet);
		mTitanic.getCast().add(pDicaprio);
		movies.add(mTitanic);

		Movie mTheMatrix = new Movie("TheMatrix", Genre.SCI_FI, 140, 5.0);
		Person pReeves = new Person("Keanu", "Reeves", Gender.MALE, false, false);
		Person pMoss = new Person("Carrie-Anne", "Moss", Gender.FEMALE, false, true);
		mTheMatrix.getCast().add(pReeves);
		mTheMatrix.getCast().add(pMoss);
		movies.add(mTheMatrix);

		Movie mInception = new Movie("Inception", Genre.SCI_FI, 160, 5.0);
		Person pCotillard = new Person("Marion", "Cotillard", Gender.FEMALE, true, true);
		mInception.getCast().add(pCotillard);
		mInception.getCast().add(pDicaprio);
		movies.add(mInception);

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("<Movies>");
		for (Movie mov : movies)
		{
			stringBuilder.append(mov.toXMLString());
		}
		stringBuilder.append("</Movies>");

		xmlWriter(stringBuilder.toString());
	}

	//F�JLBA�R�S
	public static void xmlWriter(String content)
	{
		try
		{

			File file = new File(OUTPUT_FILE);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("XML f�jl l�trehozva!");

		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}