/*  Nama    : Nabilah Erfariani
    NIM     : 13519181
    Kelas   : K04
    Responsi Minggu 9
*/
public class Main {
	public static void main(String[] args) {
		System.out.println("-----1-----");
		A.stat();
		B.stat();
		C.stat();
		D.stat();
		E.stat();
		System.out.println("-----------");
		System.out.println();
		System.out.println("-----2-----");
		E e = new E();
		C c = new C(10, 5);
		D d = new D(3, 3);
		A.stat();
		B.stat();
		C.stat();
		D.stat();
		E.stat();
		System.out.println("-----------");
		System.out.println();
		System.out.println("-----3-----");
		B e1 = new E(1,2);
		C c1 = new C(1,1);
		A d1 = new D(1,1);
		A a = new A(1,2);
		B b1 = new B(1,1);
		b1.show();
		d1.show();
		e1.show();
		c1.show();
		a.show();
		System.out.println("-----------");
		System.out.println();
		System.out.println("-----4-----");
		C c2 = new C(14,4);
		C c3 = new C(15,8);
		A a1 = new A(11,3);
		B b2 = new B(12,5);
		A a2 = new A(10,1);
		D d2 = new D(16,6);
		D d3 = new D(17,7);
		E e2 = new E(18,9);
		B b3 = new B(13,2);
		E e3 = new E(19,0);
		d2.calc();
		d3.calc();
		a1.calc();
		b2.calc();
		e3.calc();
		b3.calc();
		c2.calc();
		c3.calc();
		e2.calc();
		a2.calc();
		System.out.println("-----------");
		System.out.println();
		A.stat();
		B.stat();
		C.stat();
		D.stat();
		E.stat();
	}
}