import java.util.Scanner;
public class Fakto {
    public static void main(String[] args) {
        int n,r, total1=1,total2=1,total3=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r) Kombinasyonu icin n ve r degerlerini giriniz: n:");
        n=inp.nextInt();
        System.out.println("C(n,r) Kombinasyonu icin n ve r degerlerini giriniz: r:");
        r=inp.nextInt();

        for (int  i=1; i<=n; i++){
            total1=total1*i;
        }
        for (int  i=1; i<=r; i++){
            total2=total2*i;
        }
        for (int  i=1; i<=n-r; i++){
            total3=total3*i;
        }
        System.out.println(total1/((total2)*(total3)));


















    }
}
