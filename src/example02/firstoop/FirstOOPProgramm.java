package example02.firstoop;

class AboutJava {
    public void printReleaseData()
    {System.out.println("Java с обьектами");}
}

public class FirstOOPProgramm {
    public static void main(String[] args) {
        AboutJava aboutJava = new AboutJava();
        aboutJava.printReleaseData();
    }
}
