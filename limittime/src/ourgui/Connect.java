package ourgui;

import java.io.DataInputStream;
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;

public class Connect {
	public static void main(String[] args) throws IOException, InterruptedException {
        String exe = "cmd /k start";
        String command = "D:\\get_city.py";
        String[] cmdArr = new String[] {exe, command,"1","2"};
        Process process = Runtime.getRuntime().exec(cmdArr);
        InputStream is = (InputStream) process.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String str = dis.readLine();
        process.waitFor();
        System.out.println(str);
    }
}
