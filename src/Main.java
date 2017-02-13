import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {

writeTextToFile("products.txt","We are having so much fun!!!\n");

StringBuilder output = readTextFromFile("products.txt");


    }


    public static void writeTextToFile(String fileName, String Input)
    {
        Path filePath = Paths.get(fileName);

        File productsFile = filePath.toFile();

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(
                    productsFile, true)); // append = true


            // PrintWriter out2 = new PrintWriter(productsFile);

            out.print(Input);

            out.close();

        }

        catch (FileNotFoundException ex)
        {



        }

    }

    public static StringBuilder readTextFromFile(String fileName)
    {
        Path filePath = Paths.get(fileName);

        File productsFile = filePath.toFile();
        StringBuilder result = new StringBuilder();

        try {
            FileReader r = new FileReader(productsFile);
            BufferedReader reader = new BufferedReader(r);

            String line =reader.readLine();
            while (line !=null) {
               // System.out.println(line);
                result.append(line+"\n");
                line = reader.readLine();
            }

            reader.close();
            return result;
        }

        catch (FileNotFoundException ex)
        {

return null;

        }
        catch (IOException ex)
        {
return null;
        }



    }
}
