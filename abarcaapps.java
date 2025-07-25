package abarcaapps;

import java.util.Scanner;

public class Abarcaapps{
    public static void main(String[] args) {
        
        int science, history, math, soc, arts;
        
        Scanner input = new Scanner(System.in);
        System.out.println("+------------------------------------------------------------+");
        System.out.printf("|  Enter Name: ");
        String name = input.nextLine();
        do{
            System.out.printf("|  Enter marks in Science: ");
            science = input.nextInt();
        }while(science>100 || science<50);
        do{
            System.out.printf("|  Enter marks in History: ");
            history = input.nextInt();
        }while(history>100 || history<50);
        do{
            System.out.printf("|  Enter marks in Math: ");
            math = input.nextInt();
        }while(math>100 || math<50);
        do{
            System.out.printf("|  Enter marks in Soc: ");
            soc = input.nextInt();
        }while(soc>100 || soc<50);
        do{
            System.out.printf("|  Enter marks in Arts: ");
            arts = input.nextInt();
        }while(arts>100 || arts<50);
        System.out.println("+------------------------------------------------------------+");
        int total = science+history+math+soc+arts;
        System.out.println("|  Total Marks: "+total);
        System.out.printf("|  Total Percentage: %.2f\n",(double)total/5);
        if(total/5<=70){
            System.out.println("|  Remarks: Fail!");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|  Sorry "+name+", Try Again!");
            System.out.println("+------------------------------------------------------------+");
        }else if(total/5<=75){
            System.out.println("|  Remarks: Poor!");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|  Congrats "+name+", But Try Harder!");
            System.out.println("+------------------------------------------------------------+");
        }else if(total/5<=80){
            System.out.println("|  Remarks: Good!");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|  Congrats "+name+", You Did Well, You Passed!");
            System.out.println("+------------------------------------------------------------+");
        }else if(total/5<=90){
            System.out.println("|  Remarks: Very Good!");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|  Congrats "+name+", Your Above Average, YouPassed!");
            System.out.println("+------------------------------------------------------------+");
        }else if(total/5<100){
            System.out.println("|  Remarks: Excellence!");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("|  Congrats "+name+", Marvelous, You Passed!");
            System.out.println("+------------------------------------------------------------+");
        }