import javax.swing.JOptionPane;

public class Challenge1 {
    
    public String type;
    public static void main(String[] args) {
        String tipo;
        String num;
        tipo= JOptionPane.showInputDialog(null, "Ingresa el tipo: ");
        num= generateRandom(tipo);
        System.out.println("El numero aleatorio generado es: "+num );
        //JOptionPane.showMessageDialog(null, "El numero aleatorio generado es: " +num);
    }

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
}
