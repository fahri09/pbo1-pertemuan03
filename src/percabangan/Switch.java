package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai = 'D';
        switch (nilai) {
            case 'A':
                System.out.println("Mhs	    : \"Terima Kasih Pak\"");
                System.out.println("Dosen   : \"Selamat Ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs	    : \"Kenapa ulun kada dapa A, pak?\"");
                System.out.println("Dosen   : \"!@##$%^\"");
                break;
            case 'C':
                System.out.println("Mhs	    : \"Ulun turun tarus pak ae,tugas ngumpul jua\"");
                System.out.println("Dosen   : \"Tapi bisalah menjawab ujian atau kuisnya?\"");
                System.out.println("Mhs	    : \"hihiihi...\"");
                break;
            default:
                System.out.println("Mhs	    : \"Ulun turun tarus Pak ae, tugas ngumpul jua\"");
                System.out.println("Dosen   : \"Iya jua kah?\"");
                System.out.println("Dosen   : \"*memeriksa berkas\"");
                System.out.println("Dosen   : \"*melenceng\"");
                System.out.println("Mhs     : \"kaburrrrr..\"");
                break;
        }
    }
}
