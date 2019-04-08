import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
        int[] ray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        char temp;
        int count = 0;
        if(a.length()!=b.length())
        {
            return false;
        }
            
        for(int i = 0; i<a.length();i++)
        {
            temp = Character.toUpperCase(a.charAt(i));
            switch(temp)
            {
                case 'A' :
                    ray[0]++;
                    break;
                case 'B' :
                    ray[1]++;
                    break;
                case 'C':
                    ray[2]++;
                    break;
                case 'D' :
                    ray[3]++;
                    break;
                case 'E' :
                    ray[4]++;
                    break;
                case 'F' :
                    ray[5]++;
                    break;
                case 'G' :
                    ray[6]++;
                    break;
                case 'H' :
                    ray[7]++;
                    break;
                case 'I' :
                    ray[8]++;
                    break;
                case 'J' :
                    ray[9]++;
                    break;
                case 'K' :
                    ray[10]++;
                    break;
                case 'L' :
                    ray[11]++;
                    break;
                case 'M' :
                    ray[12]++;
                    break;
                case 'N' :
                    ray[13]++;
                    break;
                case 'O' :
                    ray[14]++;
                    break;
                case 'P' :
                    ray[15]++;
                    break;
                case 'Q' :
                    ray[16]++;
                    break;
                case 'R' :
                    ray[17]++;
                    break;
                case 'S' :
                    ray[18]++;
                    break;
                case 'T' :
                    ray[19]++;
                    break;
                case 'U' :
                    ray[20]++;
                    break;
                case 'V' :
                    ray[21]++;
                    break;
                case 'W' :
                    ray[22]++;
                    break;
                case 'X' :
                    ray[23]++;
                    break;
                case 'Y' :
                    ray[24]++;
                    break;
                case 'Z' :
                    ray[25]++;
                    break;
                default:
                    break;
                }
                temp = Character.toUpperCase(b.charAt(i));
                switch(temp)
                {
                    case 'A' :
                        ray[0]--;
                        break;
                    case 'B' :
                        ray[1]--;
                        break;
                    case 'C':
                        ray[2]--;
                        break;
                    case 'D' :
                        ray[3]--;
                        break;
                    case 'E' :
                        ray[4]--;
                        break;
                    case 'F' :
                        ray[5]--;
                        break;
                    case 'G' :
                        ray[6]--;
                        break;
                    case 'H' :
                        ray[7]--;
                        break;
                    case 'I' :
                        ray[8]--;
                        break;
                    case 'J' :
                        ray[9]--;
                        break;
                    case 'K' :
                        ray[10]--;
                        break;
                    case 'L' :
                        ray[11]--;
                        break;
                    case 'M' :
                        ray[12]--;
                        break;
                    case 'N' :
                        ray[13]--;
                        break;
                    case 'O' :
                        ray[14]--;
                        break;
                    case 'P' :
                        ray[15]--;
                        break;
                    case 'Q' :
                        ray[16]--;
                        break;
                    case 'R' :
                        ray[17]--;
                        break;
                    case 'S' :
                        ray[18]--;
                        break;
                    case 'T' :
                        ray[19]--;
                        break;
                    case 'U' :
                        ray[20]--;
                        break;
                    case 'V' :
                        ray[21]--;
                        break;
                    case 'W' :
                        ray[22]--;
                        break;
                    case 'X' :
                        ray[23]--;
                        break;
                    case 'Y' :
                        ray[24]--;
                        break;
                    case 'Z' :
                        ray[25]--;
                        break;
                    default:
                        break;
                }
            
            }
        
        for(int j = 0; j < 25; j++)
        {
            if(ray[j] == 0)
                count++;
            else
            {
                return false;
            }
        }
    if(count == 26)
        return true;
        
    return true;
    }


    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input string 'a': ");
        String a = scan.next();
        System.out.println("\n"+"Input string 'b': ");
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



