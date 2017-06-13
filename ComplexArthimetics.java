import java.util.Scanner;
import java.lang.Math;
class ComplexArthimetics{
public static void main(String args[]){
double a,b,c,d,x,y,temp,temp1,complex, teta, teta1, teta2,magnitude, k, k1;
String operationtype,temp3;
int i=0;
Scanner in= new Scanner(System.in);
System.out.println("Enter the type of operation to perform on complex numbers");
System.out.println("use lower case for addition, subtraction, multiplication and division";)
operationtype=in.nextLine();
System.out.println("Enter the fist and second complex numbers real and imaginer parts respectively ");
a=in.nextFloat();
b=in.nextFloat();
c=in.nextFloat();
d=in.nextFloat();
//System.out.println("Enter the type of operation to perform on complex numbers");
//operationtype=in.nextLine();
if(operationtype.equals("addition")){i=1;}
if(operationtype.equals("subtraction")){i=2;}
if(operationtype.equals("multiplication")){i=3;}
if(operationtype.equals("division")){i=4;}
switch(i){
case 1:
temp=a+c;
temp1=b+d;
if(Math.signum(temp1)==0){
	k=Math.abs(temp1);
	temp1=k;
	System.out.println("the complex addition results in");
System.out.println(temp+ "- j"+temp1);
}
else{
System.out.println("the complex addition results in");
System.out.println(temp+ "+ j"+temp1);}
break;
case 2:
temp=a-c;
temp1=b-d;
if(Math.signum(temp1)==0){
	temp1=Math.abs(temp1);
System.out.println("the complex subtraction results in");
System.out.println(temp+ "- j"+temp1);}
else{
	System.out.println("the complex subtraction results in");
System.out.println(temp+ "+ j"+temp1);
}
break;
case 3:
temp=(a*c)-(b*d);
temp1=(a*d)+(b*c);
if(Math.signum(temp1)==0){
	temp1=Math.abs(temp1);
System.out.println("the complex multiplication results in");
System.out.println(temp+ "- j"+temp1);}
else{
	System.out.println("the complex multiplication results in");
System.out.println(temp+ "+ j"+temp1);
}
break;
case 4:
x=(Math.pow(a,2))+(Math.pow(b,2));
x=Math.sqrt(x);
teta1=Math.atan2(a,b);
k1=Math.toDegrees(teta1);
teta1=k1;
y=(Math.pow(c,2))+(Math.pow(d,2));
y=Math.sqrt(y);
teta2=Math.atan2(c,d);
k1=Math.toDegrees(teta2);
teta2=k1;
teta=teta1-teta2;
k1=Math.toRadians(teta);
teta=k1;
magnitude=x/y;
temp=magnitude*(Math.cos(teta));
temp1=magnitude*(Math.sin(teta));
if(Math.signum(temp1)==0){
	temp1=Math.abs(temp1);
System.out.println("the complex division results in");
System.out.println(temp+ "- j"+temp1);}
else
{System.out.println("the complex division results in");
System.out.println(temp+ "+ j"+temp1);}
break;
}
}
}