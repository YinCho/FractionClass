public class PI {
    public static void findPI() {
        
        Fraction MILU = new Fraction( 355, 113 );
        double approx = Math.PI - MILU.toDouble();
        
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        
        while (Math.abs(approx) >= EPSILON) {
            if(approx <0) MILU.setNum(MILU.getNum()+1);
            else MILU.setDeno(MILU.getDenom()+1);
            approx = MILU.toDouble() - Math.PI;

        }
        System.out.print(MILU.toString());
    }
}