package Tugas4;

import java.util.Calendar;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class PerhitunganHariHelper {

    public static int hitungJumlahHari(int bulan, int tahun) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, tahun);
        cal.set(Calendar.MONTH, bulan);
        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static boolean cekTahunKabisat(int tahun) {
        return (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
    }

    public static long hitungSelisihHari(Date tgl1, Date tgl2) {
        LocalDate d1 = new java.sql.Date(tgl1.getTime()).toLocalDate();
        LocalDate d2 = new java.sql.Date(tgl2.getTime()).toLocalDate();
        return Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
