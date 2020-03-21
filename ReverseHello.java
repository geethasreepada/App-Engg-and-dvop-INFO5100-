class ReverseHello extends Thread{
    int counter;
    public ReverseHello(int counter){
        super("Thread"+counter);
        this.counter=counter;
    }
    public void run() {
        counter++;

        if (counter <= 50) {
            ReverseHello thread = new ReverseHello(counter);

            thread.start();


            try {
                thread.join();
                System.out.println("Hello from thread" + counter);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        ReverseHello t=new ReverseHello (0);

            t.start();
    }
}