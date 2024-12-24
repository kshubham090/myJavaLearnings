interface Calculate{
    int operation(int a, int b);
}

public class lamda{
    public static void main(String args[]){
        //lamdba expression
        Calculate add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operation(12, 4));

        Calculate sub = (a, b) -> a - b;
        System.out.println("Subtraction: " + sub.operation(12, 4));

        Calculate mul = (a, b) -> a * b;
        System.out.println("Multiplication: " + mul.operation(12, 4));

        Calculate div = (a, b) -> {
            if(b == 0){
                return 0;
            }
            return a / b;
        };
        System.out.println("Division: " + div.operation(12, 4));
    }
    
}