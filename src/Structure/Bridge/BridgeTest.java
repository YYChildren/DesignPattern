/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structure.Bridge;

/**
 *
 * @author Administrator
 */
public class BridgeTest {  
      
    public static void main(String[] args) {  
          
        Bridge bridge = new MyBridge();  
          
        /*���õ�һ������*/  
        Sourceable source1 = new SourceSub1();  
        bridge.setSource(source1);  
        bridge.method();  
          
        /*���õڶ�������*/  
        Sourceable source2 = new SourceSub2();  
        bridge.setSource(source2);  
        bridge.method();  
    }  
} 