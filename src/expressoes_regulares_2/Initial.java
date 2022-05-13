package expressoes_regulares_2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Initial {
	
	/*public static boolean isFamilyA(String familyA){
	//a) Casais heterossexuais mais velhos que os filhos com pelo menos duas filhas mulheres,
	//ou pelo menos um filho homem, ou ainda pelo menos dois filhos homens e uma filha mulher.
		Pattern p = Pattern.compile("(HM|MH)((h*mh*mh*)+|(m*hm*)+|(m*hm*hm)+)");
		Matcher m = p.matcher(familyA);
		return m.matches();	
	}*/
	
	/*public static boolean isFamilyB(String familyB){
		//b) Casais heterossexuais mais velhos que os filhos e
		//com uma quantidade ímpar de filhas mulheres.
		Pattern p = Pattern.compile("(HM|MH)h*mh*(h*mh*mh*)*");
		Matcher m = p.matcher(familyB);
		return m.matches();	
	}*/
	
	/*public static boolean isFamilyC(String familyC){
		//c) Casais heterossexuais mais velhos que os filhos,
		//com a filha mais velha mulher e o filho mais novo homem.
		Pattern p = Pattern.compile("(HM|MH)m+(h|m)*h+");
		Matcher m = p.matcher(familyC);
		return m.matches();	
	}*/
	
	/*public static boolean isFamilyD(String familyD){
		//d) Casais homossexuais mais velhos que os filhos, com pelo menos seis filhos,
		//em que os dois primeiros filhos formam um casal e os últimos também.
		Pattern p = Pattern.compile("(HH|MM)(mh|hm)(m|h)+(m|h)+(mh|hm)");
		Matcher m = p.matcher(familyD);
		return m.matches();	
	}*/
	
	/*public static boolean isFamilyE(String familyE){
		//e) Casais homossexuais mais velhos que os filhos,
		//em que o sexo dos filhos é alternado conforme a ordem de nascimento.
		Pattern p = Pattern.compile("(HH|MM)((mh)+|(hm)+)");
		Matcher m = p.matcher(familyE);
		return m.matches();	
	}*/
	
	/*public static boolean isFamilyF(String familyF){
		//f) Casais homossexuais mais velhos que os filhos, com qualquer quantidade de filhos
		//homens e mulheres, mas que não tiveram dois filhos homens consecutivos.
		Pattern p = Pattern.compile("(HH|MM)((m*hm*)(m+hm*)*|m+(hm+)*)");
		Matcher m = p.matcher(familyF);
		return m.matches();	
	}*/
	
	public static boolean isFamilyG(String familyG, String min, String max){
		//g) Arranjo de no mínimo x∈N e no máximo y∈N, com x>0 , y>0 , e x≤y ,
		//de adultos (Hs ou Ms) mais velhos que os filhos,
		//com qualquer quantidade de filhos	homens e mulheres,
		//mas que os três filhos mais novos não foram homens.
		Pattern p = Pattern.compile("(H|M){"+min+","+max+"}((m|h)*(m|mh|mhh)|h|hh)");
		Matcher m = p.matcher(familyG);
		return m.matches();	
	}

	public static void main(String[] args) {
		//sentenças aceitas: HMmm, HMh, MHhhm, MHmmmhmmmh, HMmhhm, MHhmhhmm.
		//cadeias rejeitadas: hmhhmMH, hmhhmHM.		
		/*String listA[] = {"HMmm", "HMh", "MHhhm", "MHmmmhmmmh", "HMmhhm", "MHhmhhmm", "hmhhmMH", "hmhhmHM"};
		for (String string : listA)
			System.out.println(isFamilyA(string));*/
		
		
		//sentenças aceitas: HMm, HMmmm, MHmmmmm, HMmhmhmh.
		//cadeias rejeitadas: HMmm, HMmmmmh.	
		/*String listB[] = {"HMm", "HMmmm", "MHmmmmm", "HMmhmhmh", "HMmm", "HMmmmmh"};		
		for (String string : listB)
			System.out.println(isFamilyB(string));*/
		
		
		//sentenças aceitas: HMmh, HMmmhhmhh, MHmmhh.
		//cadeias rejeitadas: MHhmh, MHmhhmm.	
		/*String listC[] = {"HMmh", "HMmmhhmhh", "MHmmhh", "MHhmh", "MHmhhmm"};		
		for (String string : listC)
			System.out.println(isFamilyC(string));*/
	
		//sentenças aceitas: HHmhmhmh, MMhmhmhm, MMmhmmmhmhm.
		//cadeias rejeitadas: MHmhmhmmm, MMhmmmhhh.	
		/*String listD[] = {"HHmhmhmh", "MMhmhmhm", "MMmhmmmhmhm", "MHmhmhmmm", "MMhmmmhhh"};		
		for (String string : listD)
			System.out.println(isFamilyD(string));*/
	
		//sentenças aceitas: HHmh, MMhm, MMmhmh, MMhmhmhmhm.
		//cadeias rejeitadas: MMhmmmhhh, MHmh.	
		/*String listE[] = {"HHmh", "MMhm", "MMmhmh", "MMhmhmhmhm", "MMhmmmhhh", "MHmh"};		
		for (String string : listE)
			System.out.println(isFamilyE(string));*/
	
		//sentenças aceitas: HHh, MMm, HHhmhm, MMmhmh.
		//cadeias rejeitadas: HHmhh, MMhmmhh.	
		/*String listF[] = {"HHh", "MMm", "HHhmhm", "MMmhmh", "HHmhh", "MMhmmhh"};		
		for (String string : listF)
			System.out.println(isFamilyF(string));*/

		Scanner ler = new Scanner(System.in);
		int n1, n2;

		System.out.printf("Informe um número inteiro maior que zero:\n");
		n1 = ler.nextInt();
		
		System.out.printf("Informe um segundo número inteiro maior que zero e menor ou igual ao primeiro número:\n");
		n2 = ler.nextInt();
		
		if(n1 <= n2 & n1 > 0 & n2 > 0) {
			String str1 = Integer.toString(n1);
			String str2 = Integer.toString(n2);
			//sentença aceita para min = 2 e max = 4: "MHMMmhmmm".
			//sentenças aceitas com relação aos filhos: HHmhmhmmm, MMhmmhh, MMhmmh HHh.
			//cadeias rejeitadas com relação aos filhos: HHhhh, MMhhh.
			String listG[] = {"MHMMmhmmm", "HHmhmhmmm", "MMhmmhh", "MMhmmh", "HHh", "HHhhh", "MHMMhhh"};		
			for (String string : listG)
				System.out.println(isFamilyG(string, str1, str2));
		}else {
			System.out.println("Os valores de entrada devem ser n1 > 0 , n2 > 0 , e n1 ≤ n2");
		}
		
	}
}

