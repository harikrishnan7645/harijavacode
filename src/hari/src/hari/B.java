package hari;

 class B extends Thread {
	public void  run() {
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+"is a even number");
			}
		}
			for(int j=0;j<=10;j++) {
				if(j%2!=0) {
					System.out.println(j+" is a odd number");
				}
				
			}
		}

}
