package sample;

public class Calculation {
    float a;
    float b;
    String oper;


    public Calculation(float a, float b, String oper) {
        this.a = a;
        this.b = b;
        this.oper = oper;
    }

    String operaton(){
        float rez = 0;
        String rezStr;

        if(b==0 && oper.equals("/")) {
            System.out.println("При делении на ноль получится бесконечность");

        } else if (oper.equals("+")){
            rez = a+b;
        } else if (oper.equals("-")) {
            rez = a-b;
        } else if (oper.equals("/")) {
            rez = a/b;
        } else if (oper.equals("*")) {
            rez = a*b;
        }

        return rezStr = Float.toString(rez);

    }

}

