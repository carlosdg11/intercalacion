
import java.util.ArrayList;


public class Burbuja {
    
    public void Burbuja (ArrayList<Integer> arreglo){
        int temp=0;
        for (int i=0; i<arreglo.size(); i++) {
            for (int j=i+1; j<arreglo.size(); j++) {
                if (arreglo.get(i)>arreglo.get(j)){
                    temp=arreglo.get(i);
                    arreglo.set (i,arreglo.get(j));
                    arreglo.set (j,temp);
                }
                
            }
            
        }
    }
    
}
