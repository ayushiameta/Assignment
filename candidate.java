class candidate{
    int hours,price;
	String skill,domain,location;
	candidate(int p,int hr, String s,String d,String l){
               hours=hr;
			   price=p;
			   skill=s;
			   domain=d;
			   location=l;
	}
 public static void main(String[] args){
     candidate r=new candidate(20,20,"java","finace","remote");
   candidate c[] =new candidate[10];
   c[0] = new candidate(100,20,"java","finace","onsite");
   c[1] = new candidate(200,20,"java","finace","onsite");
   c[2] = new candidate(300,20,"java","finace","onsite");
	c[3] = new candidate(20,20,"java","finace","remote");
	c[4] = new candidate(40,20,"java","finace","remote");
	c[5] = new candidate(30,20,"java","finace","remote");
    c[6] = new candidate(40,20,"java","finace","remote");
	c[7] = new candidate(40,20,"java","finace","remote");
    c[8] = new candidate(40,20,"java","finace","remote");
    c[9] = new candidate(40,20,"java","finace","remote"); 

	for (int i=0; i<10 ;i++ )
	{    
		for (int j=i+1;j<10; j++ )
	{    
		   if(c[i].price>c[j].price){ 
			   r.location=c[i].location;
	            c[i].location=c[j].location;
				c[j].location = r.location; 
				 r.price=c[i].price;
	            c[i].price=c[j].price;
				c[j].price = r.price;
				

		   }
		 
	}
		
	/*	if(c[i].hours ==20 && c[i].location =="remote")
		//cout<<"perfect"<<endl;
	     System.out.println("perfect");
	}*/ 
	}
	int rank =0;
	System.out.println("Rank. Price hours skill Domain Location");
	for (int i=0; i<10 ;i++ ) {
     rank=rank+1;
       System.out.println(rank +".   "+c[i].price+ "   "+c[i].hours+ "   " +c[i].skill+"   "+c[i].domain+"   "+c[i].location);

	}
	
			 

 }


}