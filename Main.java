class Main {
    public static void main(String[] args) {

        // int a = 6 * (3 + 2);
        // int b = 3 * 2;
        // int x = (int) Math.pow(a, 2) / b;

        // int c = (1 - 5) * (2 - 7);
        // int d = 2;
        // int e = c / d;
        // int y = (int) Math.pow(e, 2);

        // int numerador = x - y;
        // int denominador = 10;
        // int resultado = (int) Math.pow(numerador, 3) / (int) Math.pow(denominador, 3);

        // System.out.println("O resultado é: "resultado);

        double numA = Math.pow(6 * (3 + 2), 2);
        double denA = 3 * 2;
        
        double numB = (1 - 5) * (2 - 7);
        double denB = 2;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow (10, 3);

        double resultado = superior/inferior;

        System.out.println("O resultado é: " + resultado);

    }
}