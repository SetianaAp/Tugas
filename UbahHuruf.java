public class UbahHuruf {
    public static String ubahHuruf(String kalimat) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (Character.isUpperCase(c)) {
                hasil.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                hasil.append(Character.toUpperCase(c));
            } else {
                hasil.append(c); // jika karakter bukan huruf, biarkan seperti apa adanya
            }
        }
        return hasil.toString();
    }

    public static void main(String[] args) {
        String input = "Kadang kITA TiDAk mAu haL TSB tERjADI, Tapi siapa tau ITU YANG TeRbAiK UntuK kITa";
        String output = ubahHuruf(input);
        System.out.println(output);
    }
}
