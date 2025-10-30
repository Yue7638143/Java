import java.util.Scanner; 

public class PassingScore 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score of Chinese: ");
        int chinese = sc.nextInt();
        System.out.println("Enter your score of English: ");
        int English = sc.nextInt();
        System.out.println("Enter your score of Math: ");
        int Math = sc.nextInt();

        if ( chinese < 60 && English < 60 && Math < 60 ) {
            System.out.println("You failed in all subjects.");
        } else if ( chinese < 60 && English < 60 ) {
            System.out.println("You failed in Chinese and English.");
        } else if ( chinese < 60 && Math < 60 ) {
            System.out.println("You failed in Chinese and Math.");
        } else if ( English < 60 && Math < 60 ) {
            System.out.println("You failed in English and Math.");
        } else if ( chinese < 60 ) {
            System.out.println("You failed in Chinese.");
        } else if (English < 60 ) {
            System.out.println("You failed in English.");
        } else if ( Math < 60 ) {
            System.out.println("You failed in Math.");
        } else { 
            System.out.println("You passed all subjects.");
        }
    }
    
    
}
