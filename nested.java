public class nested {
    public static void main(String[] args) {
        int usia = 25;
        String KTP;
        String KK;
        String BPJS;
        String SIM;
        String paspor;
        String status;
        String hasil;

        if (usia >= 18) {
            KTP = "Sudah punya KTP";

            System.out.println(KTP);

        } else {
            KTP = "Belum punya KTP";
            System.out.println(KTP);
        }
        if (usia >= 20) {
            KK = " Sudah punya KK";

            System.out.println(KK);

        } else {
            KK = "Belum punya KK";

            System.out.println(KK);
        }
        if (usia >= 21) {
            BPJS = "Sudah punya BPJS";
            System.out.println(BPJS);
        } else {
            BPJS = "Belum punya BPJS";
            System.out.println(BPJS);
        }
        if (usia >= 25) {
            SIM = "Sudah punya SIM";
            System.out.println(SIM);
        } else {
            SIM = "Belum punya SIM";
            System.out.println(SIM);
        }
        if (usia >= 25 && KTP.equals("Sudah punya KTP")) {
            paspor = "Sudah punya paspor";
            System.out.println(paspor);
        } else {
            paspor = "Belum punya paspor";
            System.out.println(paspor);
        }
        if (usia >= 18) {
            status = "Dewasa";
            System.out.println(status);
        } else {
            status = "Belum Dewasa";
            System.out.println(status);
        }
        if (usia >= 18) {
            hasil = "Bisa memilih";
            System.out.println(hasil);
        } else {
            hasil = "Belum bisa memilih";
            System.out.println(hasil);
        }

    }

}
