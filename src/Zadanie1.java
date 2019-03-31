public class Zadanie1 {

    public static String name = "Marcin Podsiadly";


    public static void main(String[] args) {
        System.out.println("Name modulo 2 = " + calculate());
    }

    public static int calculate() {

        char[] letters = new char[26];
        int sumOfLetterValues = 0;

        for (int i = 0; i < 26; i++) {
            letters[i] = (char) (i + 97);
        }
        String[] split = name.split(" ");
        int nameValues[] = new int[name.length() - 1];

        for (int i = 0; i < split[0].length(); i++) {
            for (char c : letters) {
                if (Character.toLowerCase(split[0].charAt(i)) == c) {
                    sumOfLetterValues += (c - 96);
                    System.out.println(c + " = " + (c - 96));
                }
            }
        }

        for (int i = 0; i < split[1].length(); i++) {
            for (char c : letters) {
                if (Character.toLowerCase(split[1].charAt(i)) == c) {
                    sumOfLetterValues += (c - 96);
                    System.out.println(c + " = " + (c - 96));
                }
            }
        }

        return sumOfLetterValues % 2;
    }


    public Zadanie1() {

    }
}














        /*

        char alfabet[] = new char[26];
        for (int i = 0; i < alfabet.length; i++) {
            for (char x = 'a'; x <= 'z'; x++) {
                alfabet[(int) x - (int) 'a'] = x;
            }

        }
        for (int i = 0; i < alfabet.length; i++) {
            System.out.println("tab[" + i + "] = " + alfabet[i]);



            int fullName =(alfabet[12] + alfabet[0] + alfabet[17] + alfabet[2] + alfabet[8] + alfabet[13] +
                    alfabet[15] + alfabet[14] + alfabet[3] + alfabet[18] + alfabet[8] + alfabet[0] + alfabet[3] + alfabet[11] + alfabet[24]);

            System.out.println(fullName);

         int len = alfabet.length;

            public static int findIndex(char alfabet[], int t)

            while (i < len ) {
             if (alfabet[i] == 12) {
                 return i;
             }
         }



           // int suma = 0;
           // for (int j = 0; j < alfabet.length; j++) {


          //  }



           // System.out.println(fullName);
        }

        System.out.println();


        }
    }
}

*/