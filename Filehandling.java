import java.io.*;
import java.util.Scanner;

class filecrea{
    public static void main(String[] args) {
        try{
            File oh=new File("C:\\Users\\Public\\Pictures\\max.txt");
            if(oh.mkdir())
                System.out.println("file created:"+oh.getName());
            else{
                System.out.println("file created already");
            }
        }
        catch (Exception e){
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }
}
class write{
    public static void main(String[] args) {
        try{
            FileWriter wri=new FileWriter("C:\\Users\\Public\\Pictures\\max.txt");
            wri.write("class write{\n" +
                    "    public static void main(String[] args) {\n" +
                    "        try{\n" +
                    "            FileWriter wri=new FileWriter(\"C:\\\\Users\\\\Public\\\\Pictures\\\\max.txt\");\n" +
                    "            wri.write(\" \");\n" +
                    "            wri.close();\n" +
                    "            System.out.println(\"file created\");\n" +
                    "        }\n" +
                    "        catch (Exception e){\n" +
                    "            System.out.println(e);\n" +
                    "        }\n" +
                    "    }\n" +
                    "} ");
            wri.close();
            System.out.println("file created");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class geel {
    public static void main(String[] args) {
        try {
            File gatf = new File("C:\\Users\\Public\\Pictures\\max.txt");
            Scanner rea = new Scanner(gatf);
            while (rea.hasNextLine()) {
                String dat = rea.nextLine();
                System.out.println(dat);
            }
            rea.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
 class FileReadert {
    public static void main(String args[])throws Exception{
        FileReader nr=new FileReader("C:\\Users\\Public\\Pictures\\max.txt");
        int i;
        while((i=nr.read())!=-1)
            System.out.print((char)i);
        nr.close();
    }
}
class gj{
    public static void main(String[] args)throws Exception {
        FileReader mm=new FileReader("C:\\Users\\Public\\Pictures\\max.txt");
        int k;
        while((k= mm.read())!=-1)
            System.out.print((char)k);
        mm.close();
    }
}


