public class App {

    private static final char[] alphabet = generateAlphabet();
    private static final int passwordMaxLength = 2;
    private static int countOfPasswords = 0;

    public static void main(String[] args) {
        for (int i = 0; i < passwordMaxLength; i++) {
            logPasswdDct(new char[i + 1], 0);
        }
        System.out.println("Число паролей: " + countOfPasswords);
    }

    private static void logPasswdDct(char[] password, int level) {
        for (int i = 0; i < alphabet.length; i++) {
            password[level] = alphabet[i];
            if (level < password.length - 1) {
                logPasswdDct(password, level + 1);
            } else {
                System.out.println(String.valueOf(password));
                countOfPasswords++;
            }
        }
    }

    private static char[] generateAlphabet() {
        char[] r = new char[5];
        final int RADIX = 10;
        for (int i = 0; i < r.length; i++) {
            r[i] = Character.forDigit(i, RADIX);
        }
        return r;
    }

}
