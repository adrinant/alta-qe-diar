package Tugas;

public class Palindrome2 {
    private static boolean palindrome(String value){
            // menghapus whitespace (seperti spasi, tab dsb)
            value = value.replaceAll("\\s+", "");

            // Buat string yang sudah dibalik
            String reversed = new StringBuilder(value).reverse().toString();

            // Bandingkan string asli dengan string yang sudah dibalik
            return value.equals(reversed);
        }

        public static void main(String[] args) {
            System.out.println(palindrome("civic"));
            System.out.println(palindrome("katak"));
            System.out.println(palindrome("kasur rusak"));
            System.out.println(palindrome("kupu-kupu"));
            System.out.println(palindrome("lion"));
        }

}
