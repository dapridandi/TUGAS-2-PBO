package tugas 2;

public class Main {
    public static void main(String[] args) {
        int total;
        
        //Polimorfisme
        Asdos a = new Asdos ("Fairuzikun", 21, 1);
        Dosen d = new Dosen ("Raja OP Damanik", 10);
        Asdos a2 = new Asdos ("Angel-chan", 24, 1 );
        Mahasiswa m = new Mahasiswa("Firman", 25);
        Mahasiswa m2 = new Mahasiswa("Nid to pass this sem", 20);
        Dosen d2 = new Dosen ("Nivotko", 5);

        a.mailCheck();
        d.mailCheck();
        a2.mailCheck();
        m.mailCheck();
        m2.mailCheck();
        d2.mailCheck();

        total = a.jamSibuk+d.getjamSibuk() + a2.jamSibuk + m.jamSibuk + m2.jamSibuk + d2.getjamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah " + total);
   
    }
    
}