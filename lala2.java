package com.ug3.soal1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UGSoal1
package com.ug3.soal1;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Scanner;

public class UGSoal1
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        String nama = inp.nextLine();
        DateFormat format_date = new SimpleDateFormat("dd-MMMM-yy");
        DateFormat format_time = new SimpleDateFormat("h:m a");
        Date process_date = new Date();
        Date process_time = new Date();

        String tanggal = format_date.format(process_date);
        String waktu = format_time.format(process_time);

        UGSoal1 run = new UGSoal1();

        run.absen(nama, tanggal, waktu);
    }

    public void absen(String name, String date, String time) {
        System.out.println("berhasil absensi"+"\n"+
                "Atas nama : "+name+"\n"+
                "Pada tanggal : "+date+"\n"+
                "Pukul : "+time);
    }


}