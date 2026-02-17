
package RouterPkg;
import DevicePkg.NetworkDevice;

public class Router extends  NetworkDevice{
void  displayInfo(){
    Default_Class r = new Default_Class();
    System.out.println(r.age);
    System.out.println("IP Address " + IpAddress); //protected works
    // System.out.println("Device Type " + DeviceType)//; //Default fails
}
}
