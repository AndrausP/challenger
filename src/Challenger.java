public class Challenger {

    public static void main(String[] args) {
        String str = "Exemplo de string";

        // Chama a função recursiva para inverter a string
        String strInvertida = inverterString(str);
        System.out.println(strInvertida);
    }

    public static String inverterString(String str) {
        // Caso base: string vazia
        if (str.isEmpty()) {
            return "";
        }

        // Retorna o último caractere + a string invertida sem o último caractere
        return str.charAt(str.length() - 1) + inverterString(str.substring(0, str.length() - 1));
    }
}
