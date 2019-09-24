package br.edu.ifg.listaSimples;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/09/03
 */
public class Test {
	public static void main(String[] args) {
		List ls1 = new List();
		ls1.insert(5);
		ls1.insert(4);
		ls1.insert(3);
		ls1.insert(2);
		ls1.insert(1);
		ls1.remove(5);
		System.out.println(ls1.toString());

		List ls2 = new List();
		ls2.insertFinal(6);
		ls2.insertFinal(7);
		ls2.insertFinal(8);
		ls2.insertFinal(9);
		ls2.insertFinal(10);
		ls2.remove(10);
		System.out.println(ls2.toString());
	}

}
