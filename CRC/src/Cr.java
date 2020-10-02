import java.util.Scanner;
class Cr {
	static int dataword[],checksum[];
	static int g[]={1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1};
	static int  i, c,b=0,pos,n;
	static int N=17;
	void xor()
	{
		 if (checksum[0] == 1) {
             for (int j = 0; j < N; j++) {
                 checksum[j] = (checksum[j] ^ g[j]);
             }
         }
	}
	void crc()
	{
	
	for(i=0;i<N;i++) 
		checksum[i]=dataword[i];
	do
	{
	 if(checksum[0]==1) 
		 xor();
	 for(c=0;c<N-1;c++) {
		 checksum[c]=checksum[c+1];
	 
	 }
	 	checksum[c]=dataword[b++];
	 	
	}while(b<=n+N-1);
	}

	
	public static void main(String[] args) {
	checksum=new int[100];
	dataword=new int[100];
		Cr c1=new Cr();
		
		b=N;
		Scanner br=new Scanner(System.in);
		System.out.println("Enter no of bits");
		n=br.nextInt();
		
		System.out.println("\nEnter the data bits : ");
		for(int i=0;i<n;i++)
		dataword[i]=br.nextInt();
		System.out.println("\nThe CRC Divisor is : ");
		for(int i=0;i<N;i++)
		System.out.print(g[i]);
		 for(i=n;i<n+N-1;i++)//16 zeroes
		dataword[i]=0;

		System.out.println("\nModified Data is : ");
		for(i=0;i<n+N-1;i++)
			
		System.out.print(dataword[i]);
		
		c1.crc();
		 System.out.println("\nThe Checksum is : ");
		 for(int i=0;i<N-1;i++)
		System.out.print(checksum[i]);
		 for(i=n;i<n+N-1;i++)
			 dataword[i]=checksum[i-n];
		 System.out.println("\nFinal Codeword is :");
		 for(i=0;i<n+N-1;i++)
		System.out.print(dataword[i]);
		System.out.println("\nTest Error detection 0(yes) 1(no) ? : ");
		 b=br.nextInt();
		 if(b==0)
		{
		System.out.println("Enter position where error is to be inserted : ");
		 c1.pos=br.nextInt();
		 dataword[pos]=(dataword[pos]==0)?1:0;
		 System.out.println("Errorneous data : ");
		
		 for(i=0;i<n+N-1;i++)
		System.out.print(dataword[i]);
		 System.out.println();
		 }
		 b=N;
		 c1.crc();
		 System.out.println("Receiver Checksum is : ");
		 for(int i=0;i<N-1;i++)
		System.out.print(checksum[i]);
		 System.out.println();
		for(i=0;i<N-1;i++)
		{
		if(checksum[i]==1)
		{
		System.out.println("Error in Data");
		System.exit(0);
		}
		}
		System.out.println("No Error in the data");

	}
	
}
