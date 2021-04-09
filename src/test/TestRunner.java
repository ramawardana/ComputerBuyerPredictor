package test;

import predictor.ComputerBuyerPredictor;

public class TestRunner {
    public static void main(String[] args) {
        ComputerBuyerPredictor predictor = new ComputerBuyerPredictor();
        boolean potensiMenjadiCustomer;
        
        // umur(muda=0/dewasa=1/tua=2), status pelajar(pelajar=0/bukan pelajar=1), tiingkat pelunasan kredit(baik=0/buruk=1)
        //test case 1
        potensiMenjadiCustomer = predictor.predict(0, 0, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 2
        potensiMenjadiCustomer = predictor.predict(0, 0, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 3
        potensiMenjadiCustomer = predictor.predict(0, 1, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 4
        potensiMenjadiCustomer = predictor.predict(0, 1, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 5
        potensiMenjadiCustomer = predictor.predict(1, 0, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 6
        potensiMenjadiCustomer = predictor.predict(1, 0, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 7
        potensiMenjadiCustomer = predictor.predict(1, 1, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 8
        potensiMenjadiCustomer = predictor.predict(1, 1, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 9
        potensiMenjadiCustomer = predictor.predict(2, 0, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 10
        potensiMenjadiCustomer = predictor.predict(2, 0, 1);
        System.out.println(potensiMenjadiCustomer);
        //test case 11
        potensiMenjadiCustomer = predictor.predict(2, 1, 0);
        System.out.println(potensiMenjadiCustomer);
        //test case 12
        potensiMenjadiCustomer = predictor.predict(2, 1, 1);
        System.out.println(potensiMenjadiCustomer);
        
    }
}
