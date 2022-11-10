import javax.swing.JOptionPane;

public class Challenge1 {
    
    public String type;
    public static void main(String[] args) {
        String tipo;
        String num;

        //This is the first point, generate a number depending of the type that it recieves
        tipo= JOptionPane.showInputDialog(null, "Ingresa el tipo: ");
        num= generateRandom(tipo);
        //System.out.println("El numero aleatorio generado es: "+num );
        JOptionPane.showMessageDialog(null, "El numero aleatorio generado es: " +num);
        //This is the second point, sort an array depending on the type
        tipo= JOptionPane.showInputDialog(null, "Generaremos una lista con numeros aleatorios \nPrimero dinos como quieres que lo mostremos Asc (Ascendente) o Dsc (Descendiente)");
        createArray(tipo);

    }

    //it receives the type and validates two different cases, after validating it adds the first two digits 
    //and automatically fills the rest of the array
    public static String generateRandom(String type){   
        int ale=0;
        int numbers[] = new int[10];
        int result; 
        String returned="";

        if(type.toLowerCase().equals("tipoa")||type.toLowerCase().equals("tipo a")){
            numbers[0]=5;
            numbers[1]=4;
            for(int i=2;i<numbers.length;i++){
                ale = (int) (Math.random()*9);
                numbers[i]=ale;
            }
        }else if(type.toLowerCase().equals("tipob")||type.toLowerCase().equals("tipo b")){
            numbers[0]=0;
            numbers[1]=8;
            for(int i=2;i<numbers.length;i++){
                ale = (int) (Math.random()*9);
                numbers[i]=ale;
            }
        }else{
            System.out.println("Tipo no admitido");
        }

        for(int t=0;t<numbers.length;t++){
            result=numbers[t];
            returned+=result;
        }
        return returned;
    }

public static void createArray(String tipo){
   
    String tam=JOptionPane.showInputDialog(null, "¿Cuantos numeros aleatorios desesa generar?");
    
    int Second[] = new int[Integer.parseInt(tam)];
    
    //Fill the array with the random numbers, calling the generateNumber() method 
    for (int i = 0; i < Second.length; i++) {
        Second[i]= generateNumber();
    }
    
    JOptionPane.showMessageDialog(null,"Lista creada con exito");
    //stringArray is an Method for extract every number into the array en create an String
    JOptionPane.showMessageDialog(null,"La lista original es: "+stringArray(Second));
    if (tipo.equals("Asc")) {
        ordenarAsc(Second);
    }else if (tipo.equals("Dsc")) {
        ordenarDsc(Second);
    }
}
public static void ordenarAsc(int toOrderAsc[]){
    for (int i = 0; i < toOrderAsc.length; i++) 
    {      
        for (int j = i + 1; j < toOrderAsc.length; j++) 
        {  
            int tmp = 0;                            
            if (toOrderAsc[i] > toOrderAsc[j]) 
            {        
                tmp = toOrderAsc[i];               
                toOrderAsc[i] = toOrderAsc[j];            
                toOrderAsc[j] = tmp;
            }
        }
    }
    JOptionPane.showMessageDialog(null,"Ordenado Ascendentemente es: "+ stringArray(toOrderAsc));        
} 

public static void ordenarDsc(int toOrderDsc[]){
    for(int i = 0; i < toOrderDsc.length - 1; i++)
    {
        for(int j = 0; j < toOrderDsc.length - 1; j++)
        {
            if (toOrderDsc[j] < toOrderDsc[j + 1])
            {
                int tmp = toOrderDsc[j+1];
                toOrderDsc[j+1] = toOrderDsc[j];
                toOrderDsc[j] = tmp;
            }
        }
    }
        JOptionPane.showMessageDialog(null,"Ordenado Descendentemente es: "+ stringArray(toOrderDsc));
}
 
public static int generateNumber(){
    int ale;
    ale = (int) (Math.random()*9);
    return ale;
}
public static String stringArray(int vector[]){
    int result;
    String returned="";
    for(int t=0;t<vector.length;t++){
        result=vector[t];
        returned=returned+result+", ";
    }
    return returned;
}
}
