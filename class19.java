class CRectangle
{ 
    protected int length; 
    protected int width; 

    public CRectangle(int l,int w) 
    { 
        length=l; 
        width=w; 
    } 
    public String toString() 
    { 
        String str="length="+length+", width="+width; 
        str+=", area="+length*width; 
        return str; 
    }
} 

public class class19
{ 
    public static void main(String args[]) 
    {
        CRectangle rect=new CRectangle(2,6); 
        System.out.println(rect); 
    }
} 
