import java.util.Scanner;

public class finalMark{

    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);

        Float examMark, labMark, examPercentage, labPercentage, finalMark;

        System.out.print("Please enter exam marks (out of 100):");
        examMark=input.nextFloat();

        System.out.print("Please enter lab submission marks(out of 100):");
        labMark=input.nextFloat();

        System.out.print("Please enter the percentage given for the exam:");
        examPercentage=input.nextFloat();

        System.out.print("Please enter the percentage given for the lab submission:");
        labPercentage=input.nextFloat();

        finalMark = (examMark * examPercentage / 100) + (labMark * labPercentage / 100);

        System.out.println("Final Exam Mark is:" + finalMark);

    }
}