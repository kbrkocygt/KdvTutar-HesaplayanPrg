import java.util.Scanner;

public class KDVtutarıHesaplama {
    public static void main(String[] args) {
        //KDVm degeri hesaplama
        double tutar,kdvOran=0.18;
        Scanner input=new Scanner(System.in);
        System.out.print("Mal ya da hizmet bedeli:");
        tutar=input.nextInt();
        System.out.println(tutar);
        double kdvTutar=tutar*kdvOran;
        double kdvlitutar=tutar+kdvTutar;

        System.out.println("kdvsiz tutar:"+tutar);
        System.out.println("kdv oran : "+kdvOran);
        System.out.println("kdv tutarı: "+kdvTutar);
        System.out.println("Kdv li tutar:"+kdvlitutar);
        System.out.println(kdvlitutar);
    }
}
