public class Alphabets {
  public static void main(String[] args) {
   //Space complexity - O(1)
  //Time complexity - O(n) 
   String string="abcdefGHIJKL__mnOPQRstuvwxyZ";
   boolean visited[]=new boolean[26];
   
   if(checkAllTheLetters(string,visited))
    System.out.println("True");
   else
   System.out.println("False");  
   
    }
    static boolean checkAllTheLetters(String string,boolean visited[])
    {
     int tempIndex=0;
    
    for(int index=0;index<string.length();index++)
    {
        if(string.charAt(index)>='A'&&string.charAt(index)<='Z')
        {
         tempIndex=string.charAt(index)-'A';
        }
        else if(string.charAt(index)>='a'&&string.charAt(index)<='z')
        {
        tempIndex=string.charAt(index)-'a';
        }
        visited[tempIndex]=true;
    }
    
    for(int index=0;index<visited.length;index++)
    {
      if(visited[index]==false)
      {return false;}
    }
    return true;
    }
    
  
}
