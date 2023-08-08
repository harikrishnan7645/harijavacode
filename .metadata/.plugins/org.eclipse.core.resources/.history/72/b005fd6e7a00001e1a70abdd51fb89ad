package multithreading1;

 class A {                                              
	synchronized void add(int n) {
		for(int i=0;i<=5;i++) {
			System.out.println(i*n);
		}
	}
	}
	class B extends Thread{           // synchronization-method
		A t;
		public B(A t){
			this.t=t;
		}
		public void run() {
			t.add(5);
		}
	}
	
	class C extends Thread{
		A t;
		public C(A t) {
			this.t=t;
		}
		public void run() {
			
		t.add(2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		B t1=new B(ob);
		C t2=new C(ob);
		t1.start();
		t2.start();
	}
}
		

	
