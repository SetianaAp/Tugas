public class TambahSpasi {
    public static String tambahSpasi(String kalimat) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            hasil.append(c);
            if (c != ' ') { // Jika bukan spasi, tambahkan spasi setelahnya
                hasil.append(' ');
            }
        }
        return hasil.toString();
    }

    public static void main(String[] args) {
        String input = "Algoritma dan Struktur Data";
        String output = tambahSpasi(input);
        System.out.println(output);
    }
}
