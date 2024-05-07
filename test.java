public class test {
    public static void main(String[] args) {
        int numero = 42; // Número que deseas representar en bits
        int bytes = 1;   // Número de bytes que deseas representar (por ejemplo, 1 para un byte)

        String cadenaBits = obtenerCadenaBits(numero, bytes);
        System.out.println(cadenaBits); // Imprime la cadena de bits
    }

    public static String obtenerCadenaBits(int numero, int bytes) {
        // Obtener la representación binaria del número como una cadena de bits
        String cadenaBinaria = Integer.toBinaryString(numero);

        // Añadir ceros a la izquierda si es necesario para que la cadena tenga la longitud deseada
        int longitudDeseada = bytes * 8; // 1 byte = 8 bits
        String cadenaConCeros = String.format("%" + longitudDeseada + "s", cadenaBinaria).replace(' ', '0');

        return cadenaConCeros;
    }
}
