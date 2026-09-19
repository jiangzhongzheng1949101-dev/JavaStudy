import java.util.Scanner;

public class MathWrite
{
    public static void main(String[] args)
    {
        int op1 = (int)(Math.random() * 10);
        int op2 = (int)(Math.random() * 10);

        int rm = (int)(Math.random() * 4);
        char[] opstr = {'+', '-', '*', '/'};
        char op = opstr[rm];

        double key;
        if(op == '+')
            key = op1 + op2;
        else if(op == '-')
            key = op1 - op2;
        else if(op == '*')
            key = op1 * op2;
        else
            if(op2 != 0)
                key = op1 / op2;
            else
                key = 0;

        Scanner input = new Scanner(System.in);
        double answer = 0;
        for(int i = 0; i < 3; i++)
        {
            System.out.println("请回答" + op1 + op + op2 + "=?");
            System.out.println("请回答第 " + (i+1) + "次回答");
            answer = input.nextDouble();
            if(answer == key)
            {
                System.out.println("正确");
                break;
            }
            if(i < 2)
            {
                if(answer < key)
                    System.out.println("small");
                else
                    System.out.println("big");
            }
        }
        if(answer != key)
            System.out.println("正确答案为" + key);
    }
}
