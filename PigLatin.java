public class PigLatin 
{
  public static String convertPigLatin(String str) 
  {
    String[] strArray = str.split(" ");
    
    for (int i = 0; i < strArray.length; i++) 
    {
      if (strArray[i].matches("[a-zA-Z]+"))
        strArray[i] = String.format("%s%say", strArray[i].substring(1), strArray[i].substring(0, 1));
      else
        continue;
    }
      return String.join(" ", strArray);   

  }
}