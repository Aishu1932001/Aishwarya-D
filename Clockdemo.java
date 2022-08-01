package com.Clock.demo;

interface Clockdemo {
    
}public static void main(String[] args)	 {	 	
    
    Clock clock1 = new Clock(1,33,33);	
    for(int i=1;i<=10;i++)	 {	 	
        
        clock1.tick();	 	
        System.out.println(clock1);	
    }	 	 	 
    Clock clock2 = new Clock(1,30,33);		
    for(int i=1;i<=10;i++)	 {	 	
        
        clock2.tickDown();		
        System.out.println(clock2);		
    }		 		 		
    // newSeconds=clock2.getSeconds();		
    clock1.addClock(clock2);	 	
    System.out.println(clock1);				
    Clock clock3 ;	 
    //System.out.println(clock3);			
    clock3 = clock1.subtractClock(clock2);	 	
    System.out.println(clock3);	
} 			 
}	
