package org.example;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.List;
public class Main {
    public static void main(String[] args) {



        System.out.println("Unositi brojeve: ");
        int num=0,i=0;
        String ulaz;
        Scanner in=new Scanner(System.in);
List<Double> list=new ArrayList< Double>(20);
while(true){
    ulaz=in.next();
    if(ulaz.equals("stop")) break;
    try{
        list.add(Double.parseDouble(ulaz));
        num++;
    }catch(NumberFormatException e){
        System.out.println("Nije tacno, ponoviti unos");

    }

}

        Double m = list.stream().mapToDouble(v-> v).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Max element je: "+m);
        double mm=list.stream().mapToDouble(v ->v ).min().orElseThrow(NoSuchElementException::new);
        System.out.println("Min element je: "+mm);
        Double sum;
        sum = list.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Srednja vrijednost elemenata je: "+sum/num);
        double sd=0.0;
        Double sv=sum/num;
        for(i=0;i<num;i++){
            sd+=Math.pow((list.get(i) -sv),2);
        }
        System.out.println("Standardna devijacija elemenata je: "+sd);
    }
}