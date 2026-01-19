import java.io.*;
import java.util.*;
public class Chip
{
    public static void main(String[] arr) throws IOException
    {
        FileReader fr = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String itera = br.readLine();
        int iteration = Integer.parseInt(itera);
        int[][] data = new int[iteration][5];
        String line;

        /*while((line = br.readLine()) != null)
        {
            String[] values = line.split("\\s+");
        }
        System.out.println(values);*/
        for(int r = 0; r < data.length; r++)
        {
            line = br.readLine();
            for(int c = 0; c < data[r].length; c++)
            {
                //int value = Integer.parseInt(br.read());
                int[] temp = new int[5];
                data[r][c] = Integer.parseInt(line);
            }
        }
        System.out.println(data);
    }
}