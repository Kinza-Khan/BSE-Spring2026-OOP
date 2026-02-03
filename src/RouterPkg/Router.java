
package RouterPkg;
import DevicePkg.NetworkDevice;
public class Router extends  NetworkDevice{
void  displayInfo(){
    System.out.println("IP Address " + IpAddress); //protected works
    // System.out.println("Device Type " + DeviceType)//; //Default fails
}
}
