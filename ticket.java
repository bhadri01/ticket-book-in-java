import java.util.*;
public class Main
{
    int n=2, m=3,o =5;
    int a[][][]=new int[n][m][o];
    void theater(){
        int seat = 1,c=1,price = 200;
        
        System.out.println("welcome to the HATZ cinemas:");
        for(int i=0;i<n;i++,System.out.println()){
            System.out.println("---class:"+c+"---");
              for(int j=0;j<m;j++,System.out.println()){
                  for(int k=0;k<o;k++){
                      a[i][j][k] = price;
                      if(seat<10){
                        System.out.print("0"+seat+" ");  
                      }
                      else{
                        System.out.print(seat+" ");  
                      }
                      seat ++;
                    }
                    System.out.print("//-> price:"+a[i][j][0]);
                    price -= 30;
                }
                seat = 1;
                c++;
            }
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Main obj = new Main();
        obj.theater();
        System.out.println("Choose the class:");
        int cl = sc.nextInt();
        System.out.println("Choose the seat number:");
        int se = sc.nextInt();
        int rc = 0;
        if(se <= 5){
            rc=  0;
        }
        else if(se <= 10){
             rc= 1 ;
        }
        else{
            rc = 2;
        }
        cl--;
        System.out.println("your seat booked:");
        System.out.println("price:"+obj.a[cl][rc][rc]);
    }
}
