class Runnable2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}
public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
	}

}
