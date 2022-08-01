package com.Clock.demo;

public class Clock {
    
    public int hours; 
    public int minutes;	
    public int seconds;		
    public Clock()	{	
        
        hours = 12; 	
        minutes = 0; 
        seconds = 0;				
    }		
    public Clock(int hours, int minutes, int seconds)
    {	
        
        this.hours = hours; 
        this.minutes = minutes; 
        this.seconds = seconds;		
    }		
    public Clock(int seconds) 	{		
        
        hours=seconds/3600;
        minutes=((seconds%3600)/60);	
        seconds=((seconds%3600)%60);	
    }		public void setClock(int seconds)	{		
        
        hours=seconds/3600;
        minutes=((seconds%3600)/60);	
        seconds=((seconds%3600)%60);		
    } 	public int getHours() {	
        
        return hours;
    } 
    public void setHours(int hours) {		
        
        this.hours = hours;
    } 	
    public int getMinutes() {		
        
        return minutes;
    } 
    public void setMinutes(int minutes) {	
        
        this.minutes = minutes;
    } 	
    public int getSeconds() {		
        
        return seconds;
    } 	
    public void setSeconds(int seconds) {	
        
        this.seconds = seconds;	
    }		
    public void tick()	{		
        
        seconds +=1;	
        if (seconds>=60)		{		
            
            minutes ++;	
            seconds=0;		
        }				
        if(minutes>=60)		{		
            
            hours++;		
            minutes=0;			
        }				
        if(hours>24)		{		
            
            hours=0;	
        }	}	
    public void addClock(Clock clock) { 
        
        seconds += clock.getSeconds(); 	
        minutes += clock.getMinutes(); 
        minutes+= seconds/60; 	
        seconds = seconds%60;
        hours += getHours(); 	
        hours += minutes/60; 	
        minutes = minutes%60; 
        hours= hours%24; 
    } 		
    public String toString() {	
        
        String result = "(";		String hh = "";	
        String mm = "" + ""; String ss = "" + ")";
        if (hours < 10) { 	hh="0" + String.valueOf(hours) + ":";
            
        } 
        else { 	
            hh = String.valueOf(hours)+":"; 
            
        } 
        if(minutes<10)
            
            { 	
            
            mm ="0" + String.valueOf(minutes) + ":";
        } 
        else { 	
            
            mm = String.valueOf(minutes)+":"; 
        } 
        if(seconds<10) { 	
            
            ss ="0" + String.valueOf(seconds) + ":";
        } 
        else { 
            
            ss = String.valueOf(seconds)+")";	
        } 
        result += (hh+mm+ss); 
        return result;	
    } 	
    public void tickDown()	{		
        
        seconds-=1;	
        if(seconds<0)	
            
            {			seconds+=60;	
            
            minutes-=1;	
        }		
        if(minutes<0)	
            
            {			minutes+=60;		
            
            hours-=1;	
        }		
        if(hours<0)	
            
            {			hours+=24;		
            
        }			} 	
    public Clock subtractClock(Clock clock) 	{	
        
        if(seconds < clock.getSeconds())		{		
            
            --minutes;				 seconds += 60;	
        }		
        if(minutes < clock.getMinutes())	
            
            {			
            --hours;				
            
            minutes += 60;
        } 		
        hours -= clock.getHours(); 	
        minutes -= clock.getMinutes(); 	
        seconds -= clock.getSeconds(); 	
        return this;	
    } 
}
