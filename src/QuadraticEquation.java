public class QuadraticEquation {
    private double valueA;
    private double valueB;
    private double valueC;
    public double getA(){
        return valueA;
    }
    public double getB(){
        return valueB;
    }
    public double getC(){
        return valueC;
    }

    QuadraticEquation(double a,double b,double c){
        this.valueA=a;
        this.valueB=b;
        this.valueC=c;
    }

    public double getDiscriminant(){
        return (this.valueB*this.valueB)-(4*valueA*valueC);
    }
    public double getRoot1(){
        return (-this.valueB + Math.sqrt(this.getDiscriminant()))/2*this.valueA;
    }
    public double getRoot2(){
        return (-this.valueB - Math.sqrt(this.getDiscriminant()))/2*this.valueA;
    }
    public double getDoubleRoot(){
        return (-this.valueB/ 2* this.valueA);
    }

}
