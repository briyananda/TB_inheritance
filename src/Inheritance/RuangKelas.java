
package Inheritance;

public class RuangKelas {
    public static void main (String[]Bryo){
		
	JKPS SK = new StopKontak();
	JKPS KL = new LCD();
	JKPS L = new Lampu();
	JKPS KA = new KipasAngin();
	JKPS AC = new AC();
	JKPS CCTV = new CCTV();
	
	JKPS sarana [] = {SK, KL, L, KA, AC, CCTV}; 
	
	for(JKPS x : sarana){
		x.Input("");
		x.View("");
		x.Analisis("");
	}
	}
}
