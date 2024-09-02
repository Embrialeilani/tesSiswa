//Driver Class
import java.util.Scanner;

public class TesSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();
        System.out.println("ID : ");
        int id = in.nextInt();
        System.out.println("IPK : ");
        double ipk = in.nextDouble();

        Siswa Embria = new Siswa(id, nama, ipk);
        //nilai diatas 75 lulus
        if (Embria.getIpk() >= 75) {
            System.out.println(Embria.getNama() + " Lulus");
        } else {
            System.out.println(Embria.getNama() + " Tidak Lulus");
        }
    
        //Nilai Huruf
        if(Embria.getIpk() < 70) {
            System.out.println("E");
        } else if (Embria.getIpk() > 60 && Embria.getIpk() <= 70) {
            System.out.println("D");
        } else if (Embria.getIpk() > 70 && Embria.getIpk() <= 80) {
            System.out.println("C");
        } else if (Embria.getIpk() > 80 && Embria.getIpk() <= 90) {
            System.out.println("B");
        } else if (Embria.getIpk() > 90 && Embria.getIpk() <= 100) {
            System.out.println("A");
        }
        
        if(Embria.getIpk() < 0)
        in.close();
    } 
}
