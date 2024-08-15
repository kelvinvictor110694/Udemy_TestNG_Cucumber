package Utils;

import com.aventstack.extentreports.Status;

public class Logger {

    static StringBuffer stringBuffer = new StringBuffer(" ");
    public static void addMessage(String message){
        stringBuffer.append("\n");
        stringBuffer.append(message);
        if (Listerner.getInstance() != null)
            Listerner.getInstance().log(Status.INFO,message);
        }
}
