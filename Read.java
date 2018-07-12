import java.io.*;
public class Read
{
  public static void main(String[] args)throws Exception
  {
  // We need to provide file path as the parameter:
  // double backquote is to avoid compiler interpret words
  // like \test as \t (ie. as a escape sequence)
  File file = new File("test.txt");
 
  BufferedReader br = new BufferedReader(new FileReader(file));
 
  String st;
  st = br.readLine();
  st = br.readLine();
  int n = Integer.parseInt(st.split(" ")[0]);
  int k = Integer.parseInt(st.split(" ")[1]);
  int v = Integer.parseInt(st.split(" ")[2]);
  while ((st = br.readLine()) != null)
    System.out.println(st);
    
  }
}