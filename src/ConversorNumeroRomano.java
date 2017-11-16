/**
 * Classe para para conversão de número arábicos para números romanos entre 1 a 3000.
 * @author Jean
 *
 */
public class ConversorNumeroRomano {
	ConversorNumeroRomano() {
		super();
	}
	
	/**
	 * Método de converter números arábicos para números romano.
	 * @param num
	 * @return
	 */
	public String calcular(int num) {
		String result = "";
		if ((num > 0) && (num < 10)) {
			result += this.conversorNumeroUnidade(num);
		}
		else if ((num >= 10) && (num < 100)) {
			result += this.conversorNumeroDezena(num);
		} else if ((num >= 100) && (num < 1000)) {
			result += this.convertNumerosCemAmil(num);
		} else if ((num >= 1000) && (num < 3000)) {
			result += this.convertNumerosMilAtresMil(num);
		} else {
			result += "Número não válido, só é válido números entre 1 e 3000";
		}
		
		return result;
	}
	
	/**
	 * Converte número arábicos para números romanos entre 1 e 10.
	 * @param num
	 * @return
	 */
	public String conversorNumeroUnidade(int num) {
		String result = "";
		if (num == 1)
			result = "I"; 
		else if (num == 2)
			result = "II";
		else if (num == 3)
			result = "III";
		else if (num == 4)
			result = "IV";
		else if (num == 5)
			result = "V";
		else if (num == 6)
			result = "VI";
		else if (num == 7)
			result = "VII";
		else if (num == 8)
			result = "VIII";
		else if (num == 9)
			result = "IX";
		
		return result;
	}
	
	/**
	 * Converte números arábicos para números romanos entre 10 e 100;
	 * @param num
	 * @return
	 */
	public String conversorNumeroDezena(int num) {
		String result = "";
		if ((num >= 10) && (num < 40)) {
			result = this.convertNumeroEntreDezEquarenta(num);
		} else if ((num >= 40) && (num < 50)) {
			result += this.convertNumerosQuarentaAcinquenta(num);
		} else if ((num >= 50) && (num < 90)) {
			result += this.convertNumerosCinquentaAnoventa(num);
		} else if ((num >= 90) && (num < 100)) {
			result += this.convertNumerosNoventaAcem(num);
		}
		return result;
	}
	
	/**
	 * Convert números arábicos para números romano entre 10 e 40.
	 * @param num
	 * @return
	 */
	public String convertNumeroEntreDezEquarenta(int num) {
		String result = "";
		char[] digitos = String.valueOf(num).toCharArray();
		int num1 = Integer.parseInt(digitos[0]+"");
		int num2 = Integer.parseInt(digitos[1]+"");
		
		if (num1 == 1) {
			result = "X" + this.conversorNumeroUnidade(num2);
		} else if (num1 == 2) {
			result = "XX" + this.conversorNumeroUnidade(num2);	
		} else if (num1 == 3) {
			result = "XXX" + this.conversorNumeroUnidade(num2);
		} else {
			result = "";
		}
		
		return result;
	}
	
	/**
	 * Convert números arábicos para números romano entre 40 e 50.
	 * @param num
	 * @return
	 */
	public String convertNumerosQuarentaAcinquenta(int num) {
		char[] digitos = String.valueOf(num).toCharArray();
		int num2 = Integer.parseInt(digitos[1]+"");
		
		return "XL" + this.conversorNumeroUnidade(num2);
	}

	/**
	 * Conver números arábicos para números romanos entre 50 e 90.
	 * @param num
	 * @return
	 */
	public String convertNumerosCinquentaAnoventa(int num) {
		String result = "";
		int divisaoNum = num - 50;
		
		if (num == 50) {
			result = "L";
		} else if (divisaoNum <= 9) {
			result = "L" + this.conversorNumeroUnidade(divisaoNum);
		} else {
			result = "L" + this.convertNumeroEntreDezEquarenta(divisaoNum);
		}
		return result;
	}

	/**
	 * Conver números arábicos para números romanos entre 90 e 100.
	 * @param num
	 * @return
	 */
	public String convertNumerosNoventaAcem(int num) {
		char[] digitos = String.valueOf(num).toCharArray();
		int num2 = Integer.parseInt(digitos[1]+"");
		
		return "XC" + this.conversorNumeroUnidade(num2);
	}
	
	/**
	 * Conver números arábicos para números romanos entre 100 e 1000.
	 * @param num
	 * @return
	 */
	public String convertNumerosCemAmil(int num) {
		String result = "";
		int num1 = Integer.parseInt(String.valueOf(num).substring(0, 1));
		int num2 = Integer.parseInt(String.valueOf(num).substring(1));
		
		if (num1 == 1) {
			result += "C";
		} else if (num1 == 2) {
			result += "CC";
		} else if (num1 == 3) {
			result += "CCC";
		} else if (num1 == 4) {
			result += "CD";
		} else if (num1 == 5) {
			result += "D";
		} else if (num1 == 6) {
			result += "DC";
		} else if (num1 == 7) {
			result += "DCC";
		} else if (num1 == 8) {
			result += "DCCC";
		} else if (num1 == 9) {
			result += "CM";
		}
		
		if (num2 <= 9) {
			result += this.conversorNumeroUnidade(num2);
		} else if (num2 >=10 && num2 <= 39) {
			result += this.convertNumeroEntreDezEquarenta(num2);
		} else if (num2 >= 40 && num2 <= 49) {
			result += this.convertNumerosQuarentaAcinquenta(num2);
		} else if (num2 >= 50 && num2 <= 89) {
			result += this.convertNumerosCinquentaAnoventa(num2);
		} else {
			result += this.convertNumerosNoventaAcem(num2);
		}
		
		return result;
	}
	
	/**
	 * Convert números arábicos para números romanos entre 1000 a 3000.
	 * @param num
	 * @return
	 */
	public String convertNumerosMilAtresMil(int num) {
		String result = "";
		int num1 = Integer.parseInt(String.valueOf(num).substring(0, 1));
		int num2 = Integer.parseInt(String.valueOf(num).substring(1));
		
		if (num1 == 1) {
			result += "M";
		} else if (num1 == 2) {
			result += "MM";
		} else if (num1 == 3) {
			result += "MMM";
		}
		
		result += this.convertNumerosCemAmil(num2);
		
		return result;
	}
}
