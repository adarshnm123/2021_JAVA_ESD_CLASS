

class Logicgates{
	int orgate(int in1,int in2){
		int a,b;
		a=in1;
		b=in2;
		int ans;
		int orans;
		orans= a | b;
		return orans;
	}
	int norgate(int in1,int in2){
		int norans;
		int a=in1;
		int b=in2;
		if(a==0 && b==0)
			norans=1;
		else
			norans=0;
		return norans;
	}
	public static void main(String[] args) {
		int inp1=1;
		int inp2=0;
		Logicgates lg =new Logicgates();
		int resultor=lg.orgate(inp1,inp2);
		int resultnor=lg.norgate(inp1,inp2);
		System.out.println("result of orgate "+resultor);
		System.out.println("result of norgate "+resultnor);

	}
}