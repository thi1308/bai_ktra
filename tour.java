import java.util.Scanner;
   

public class Tour {
    private String title;
   private double price;
    protected double name;
    Scanner sc = new Scanner(System.in);
    public double getTax(){
       return 0.5/100 *price;
    }
    // day la bai cua thi
    public void SetTour () {
        System.out.print("dinhbathi2021050617 nhap tên tour du lịch: ");
        title =sc.nextLine();
     System.out.print("nhap gia: ");
     price =sc.nextDouble();
    }
   public void getTour () {
    System.out.println("ten tour du lich: "+ title);
    System.out.println("ten gia: "+ price);
      this.name="dinh ba thi";
   }
    public static void main(String[] args) throws Exception {
        Tour a = new Tour();
        a.SetTour();
        a.getTour();
        System.out.print("thue: day la bai cua thi" +   a.getTax()); 
     }
}
