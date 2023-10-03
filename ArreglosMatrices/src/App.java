import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
         


        char decision;
        char XD;
        int intento =0;
        
        do{
        System.out.println("Estimado Usuario que operacion desea calcular con las matrices dadas");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("a.Verificar si las matrices son iguales o no");
        System.out.println("b.Sumar ambas matrices");
        System.out.println("c.Generar una matriz 0 con las filas y columnas que usted ingreso");
        System.out.println("d.Obtener el inverso aditivo de una matriz con las filas y columnas que usted ingreso");
        System.out.println("e.Restar ambas matrices");
        System.out.println("f.Multiplicar un escalar por una matriz con las filas y columnas que ingreso");
        System.out.println("g.Multiplicar ambas matrices compatibles");
        System.out.println("h.Obtener una matriz identidad de tamaño de filas que ingreso");
        System.out.println("i.Obtener la inversa de una matriz de tamaño de filas que ingreso");
        System.out.println("j.obtener el determinante de una matriz de tamaño de filas que ingreso");
        decision = x.next().charAt(0);

      

        switch (decision) {
            
            case 'a':
           
            System.out.println("Ingrese el numero de filas de la primera matriz");
        int F1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la primera matriz");
        int C1 = x.nextInt();


        System.out.println("Ingrese el numero de filas de la segunda matriz");
        int F2= x.nextInt();

        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        int C2 = x.nextInt();

        int MatrizA[][] = new int[F1][C1];
        int MatrizB[][] = new int[F2][C2];

        if(F1 == F2 && C1 == C2){
        
        System.out.println("Ingrese los valores de la primera matriz");
        for(int i = 0;i<F1;i++){
        for(int j=0;j<C1;j++){
             System.out.println("Matriz 1 ["+ i +"] ["+ j +"]");
             MatrizA[i][j] = x.nextInt();
         }
        }

        System.out.println("Ingrese los valores de la segunda matriz");
        for(int i = 0;i<F2;i++){
        for(int j=0;j<C2;j++){
             System.out.println("Matriz 2 ["+ i +"] ["+ j +"]");
             MatrizB[i][j] = x.nextInt();
         }
        }

        boolean folagor = true;

                for(int i=0;i<MatrizA.length;i++){
                for(int j=0;j<MatrizB.length;j++){
                if(MatrizA[i][j] != MatrizB[i][j]){
                folagor = false;
                 }
                }
                }

                if(folagor){
                System.out.println("Las matrices son iguales");
                }else{
                System.out.println("Las matrices no son iguales");
                }
                
            
         }else{
         System.out.println("La matriz no es igual");        
        }
                
                break;

                case 'b':

                System.out.println("Ingrese el numero de filas de la primera matriz");
        int G1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la primera matriz");
        int H1 = x.nextInt();


        System.out.println("Ingrese el numero de filas de la segunda matriz");
        int G2= x.nextInt();

        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        int H2 = x.nextInt();

        int MatrizC[][] = new int[G1][H1];
        int MatrizD[][] = new int[G2][H2];
        int MatrizResultantesuma[][] = new int[H1][G2];

         if(H1 == G2) {

        System.out.println("Ingrese los valores de la primera matriz");
        for(int i = 0;i<G1;i++){
        for(int j=0;j<H1;j++){
             System.out.println("Matriz 1 ["+ i +"] ["+ j +"]");
             MatrizC[i][j] = x.nextInt();
         }
        }

        System.out.println("Ingrese los valores de la segunda matriz");
        for(int i = 0;i<G2;i++){
        for(int j=0;j<H2;j++){
             System.out.println("Matriz 2 ["+ i +"] ["+ j +"]");
             MatrizD[i][j] = x.nextInt();
         }
        }

        for(int i=0; i<MatrizC.length;i++){
        for(int j=0;j<MatrizD.length;j++){
            MatrizResultantesuma[i][j] = MatrizC[i][j] + MatrizD[i][j];
         }
       }
      
         for(int i=0; i<MatrizC.length;i++){
        
            for(int j=0;j<MatrizC.length;j++){
            System.out.print("[ " + MatrizC[i][j] + " ]");
         }
           
        if(i == 1){
         System.out.print("  +  ");
        }else{
            System.out.print("     ");
            }
     
            for(int j=0;j<MatrizD.length;j++){
            System.out.print("[ " + MatrizD[i][j] + " ]");
         }

        if(i == 1){
         System.out.print("  =  ");
        }else{
            System.out.print("     ");
            }
        
        for(int j=0; j<MatrizResultantesuma.length;j++){
            System.out.print("[ " + MatrizResultantesuma[i][j] + " ]"); 
         }
       System.out.println("");
       }
       }else{
        System.out.println("La matriz no se puede sumar");
        }
                
                break;

                case 'c':

            System.out.println("Ingrese el numero de filas de la matriz");
        int K1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz");
        int K2 = x.nextInt();

        int MatrizG[][] = new int[K1][K2];

         for(int i = 0;i<K1;i++){
        for(int j=0;j<K2;j++){
             if(i == j){
             MatrizG[i][j] = 0;
        }
        }
        }

         System.out.println("Matriz 0");
        for(int i = 0;i<K1;i++){
        for(int j=0;j<K2;j++){
         System.out.print("[ " + MatrizG[i][j] + " ]");
            }
            System.out.println("");
            }
        
                break;

                case 'd':

                 System.out.println("Ingrese el numero de filas de la matriz");
        int R1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz");
        int R2 = x.nextInt();

        int MatrizO[][] = new int[R1][R2]; 

        System.out.println("Ingrese los valores de la matriz");
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < R2; j++) {
                System.out.println("Matriz [" + i + "] [" + j + "]");
                MatrizO[i][j] = x.nextInt();
            }
        }

        System.out.println("Inverso aditivo");
        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < R2; j++) {
                MatrizO[i][j] = MatrizO[i][j] * -1;
                System.out.print("[ " + MatrizO[i][j] + " ]");
            }
            System.out.println("");
        }
    
                
                break;
        
                
                case 'e':
                System.out.println("Ingrese el numero de filas de la primera matriz");
        int I1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la primera matriz");
        int J1 = x.nextInt();


        System.out.println("Ingrese el numero de filas de la segunda matriz");
        int I2= x.nextInt();

        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        int J2 = x.nextInt();

        if(J1 == I2 ){

        int MatrizE[][] = new int[I1][J1];
        int MatrizF[][] = new int[I2][J2];
        int MatrizResultanteresta[][] = new int[J1][I2];


        System.out.println("Ingrese los valores de la primera matriz");
        for(int i = 0;i<I1;i++){
        for(int j=0;j<J1;j++){
             System.out.println("Matriz 1 ["+ i +"] ["+ j +"]");
             MatrizE[i][j] = x.nextInt();
         }
        }

        System.out.println("Ingrese los valores de la segunda matriz");
        for(int i = 0;i<I2;i++){
        for(int j=0;j<J2;j++){
             System.out.println("Matriz 2 ["+ i +"] ["+ j +"]");
             MatrizF[i][j] = x.nextInt();
         }
        }

        for(int i=0; i<MatrizE.length;i++){
        for(int j=0;j<MatrizF.length;j++){
            MatrizResultanteresta[i][j] = MatrizE[i][j] - MatrizF[i][j];
         }
       }
      
         for(int i=0; i<MatrizE.length;i++){
        
            for(int j=0;j<MatrizE.length;j++){
            System.out.print("[ " + MatrizE[i][j] + " ]");
         }
           
        if(i == 1){
         System.out.print("  -  ");
        }else{
            System.out.print("     ");
            }
     
            for(int j=0;j<MatrizF.length;j++){
            System.out.print("[ " + MatrizF[i][j] + " ]");
         }

        if(i == 1){
         System.out.print("  =  ");
        }else{
            System.out.print("     ");
            }
        
        for(int j=0; j<MatrizResultanteresta.length;j++){
            System.out.print("[ " + MatrizResultanteresta[i][j] + " ]"); 
         }
       System.out.println("");
       }     
       }else{
        System.out.println("La matriz no se puede restar");
    } 
                break;
        
                case 'f':

                int num;

                   System.out.println("Ingrese el numero de filas de la primera matriz");
        int L1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la primera matriz");
        int M1 = x.nextInt();

        int MatrizH[][] = new int[L1][M1];
        int MatrizResultante[][] = new int[L1][M1];
        
        System.out.println("Ingrese los valores de la matriz");
        for(int i = 0;i<L1;i++){
        for(int j=0;j<M1;j++){
             System.out.println("Matriz 1 ["+ i +"] ["+ j +"]");
             MatrizH[i][j] = x.nextInt();
         }
        }

        System.out.println("Ingrese el numero por el cual se va a multiplicar la matriz");
        num = x.nextInt();

        for(int i = 0;i<MatrizH.length;i++){
        for(int j=0;j<MatrizH.length;j++){
        MatrizResultante[i][j] = MatrizH[i][j] * num;
        }
        }
            for(int i=0;i<MatrizResultante.length;i++){
            for(int j=0; j<MatrizResultante.length;j++){
            System.out.print("[ " + MatrizResultante[i][j] + " ]"); 
         }
         System.out.println("");
         }
                 
        
                break;
        
                case 'g':

                System.out.println("Ingrese el numero de filas de la primera matriz");
        int N1 = x.nextInt();

        System.out.println("Ingrese el numero de columnas de la primera matriz");
        int Ñ1 = x.nextInt();


        System.out.println("Ingrese el numero de filas de la segunda matriz");
        int N2= x.nextInt();

        System.out.println("Ingrese el numero de columnas de la segunda matriz");
        int Ñ2 = x.nextInt();

        int MatrizI[][] = new int[N1][Ñ1];
        int MatrizJ[][] = new int[N2][Ñ2];
        int MatrizResultanteMult[][] = new int[Ñ1][N2];

        if(Ñ1 == N2){

         System.out.println("Ingrese los valores de la primera matriz");
        for(int i = 0;i<N1;i++){
        for(int j=0;j<Ñ1;j++){
             System.out.println("Matriz 1 ["+ i +"] ["+ j +"]");
             MatrizI[i][j] = x.nextInt();
         }
        }

        System.out.println("Ingrese los valores de la segunda matriz");
        for(int i = 0;i<N2;i++){
        for(int j=0;j<Ñ2;j++){
             System.out.println("Matriz 2 ["+ i +"] ["+ j +"]");
             MatrizJ[i][j] = x.nextInt();
         }
        }

        for(int i=0;i<N1;i++){
         for(int j=0;j<Ñ2;j++){
          for(int k=0;k<Ñ1;k++){
        MatrizResultanteMult[i][j] += MatrizI[i][k] * MatrizJ[k][j];
         } 
        }
        System.out.println("");
        }

         for(int i=0; i<MatrizI.length;i++){
        
            for(int j=0;j<MatrizI.length;j++){
            System.out.print("[ " + MatrizI[i][j] + " ]");
         }
           
        if(i == 1){
         System.out.print("  *  ");
        }else{
            System.out.print("     ");
            }
     
            for(int j=0;j<MatrizJ.length;j++){
            System.out.print("[ " + MatrizJ[i][j] + " ]");
         }

        if(i == 1){
         System.out.print("  =  ");
        }else{
            System.out.print("     ");
            }
        
        for(int j=0; j<MatrizResultanteMult.length;j++){
            System.out.print("[ " + MatrizResultanteMult[i][j] + " ]"); 
         }
       System.out.println("");
       }     
       
       }else{
       System.out.println("La operacion no puede realizarse");
    }
                
                break;
        
                case 'h':


            System.out.println("Ingrese el tamaño la matriz");
        int P1 = x.nextInt();

        if(P1 > 0){

        int MatrizL[][] = new int[P1][P1];

        for(int i = 0;i<P1;i++){
        for(int j=0;j<P1;j++){
             if(i == j){
             MatrizL[i][j] = 1;
         }else{
            MatrizL[i][j] = 0;
        }
        }
        }

        System.out.println("Matriz Identidad");
        for(int i = 0;i<P1;i++){
        for(int j=0;j<P1;j++){
         System.out.print("[ " + MatrizL[i][j] + " ]");
            }
            System.out.println("");
            }
            }else{
            System.out.println("La matriz no es cuadrada");
            }
                    
                break;
        
                case 'i':

                double p,f;

                System.out.println("Ingrese el tamaño de la matriz");
        int Q1 = x.nextInt();

        double[][] MatrizM = new double[Q1][2 * Q1];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < Q1; i++) {
            for (int j = 0; j < Q1; j++) {
                System.out.print("Matriz[" + (i + 1) + "][" + (j + 1) + "]: ");
                MatrizM[i][j] = x.nextDouble();
            }

            for (int j = Q1; j < 2 * Q1; j++) {
                MatrizM[i][j] = (i == j - Q1) ? 1.0 : 0.0;
            }
        }

        for (int i = 0; i < Q1; i++) {
            p = MatrizM[i][i];
            for (int j = 0; j < 2 * Q1; j++) {
                MatrizM[i][j] /= p;
            }

            for (int k = 0; k < Q1; k++) {
                if (k != i) {
                    f = MatrizM[k][i];
                    for (int j = 0; j < 2 * Q1; j++) {
                        MatrizM[k][j] -= f * MatrizM[i][j];
                    }
                }
            }
        }

        double[][] MatrizN = new double[Q1][Q1];
       
        for (int i = 0; i < Q1; i++) {
            for (int j = 0; j < Q1; j++) {
                MatrizN[i][j] = MatrizM[i][j + Q1];
            }
        }

        System.out.println("La matriz inversa es:");
        for (int i = 0; i < Q1; i++) {
            for (int j = 0; j < Q1; j++) {
           System.out.print("[ " + MatrizN[i][j] + " ]");
            }
            System.out.println();
        }

                break;
        
                case 'j':

                double determinante = 1,Matriztemporal;
                double cofactor;

                System.out.println("Ingrese el tamaño de la matriz");
        int O1 = x.nextInt();

        if(O1 >0){

         double MatrizK[][] = new double[O1][O1];

            System.out.println("Ingrese los valores de la matriz");
        for(int i = 0;i<O1;i++){
        for(int j=0;j<O1;j++){
             System.out.println("Matriz 1 ["+ i +"] ["+ j +"]");
             MatrizK[i][j] = x.nextDouble();
         }
    }

    for(int i=0;i<O1;i++){
    for(int j= i+1;j<O1;j++){
    
    if(MatrizK[j][i] != 0){
    cofactor = MatrizK[i][i] / MatrizK[j][i];
    
    for(int k=0;k<O1;k++){
    MatrizK[i][k] = MatrizK[i][k] - cofactor * MatrizK[j][k];
    }
    for(int k=0;k<O1;k++){
    Matriztemporal = MatrizK[i][k];
    MatrizK[i][k] = MatrizK[j][k];
    MatrizK[j][k] = Matriztemporal;
    }
    determinante = -determinante;
     }
    }
    determinante *= MatrizK[i][i];
    }

    System.out.println("El determinante de la matriz es " + determinante);
    }else{
    System.out.println("La matriz no es cuadrada");
    }
    
                break;
        
       
                default:
                System.out.println("Saliendo del programa");
                break;
        }
        
        intento++;
        if(intento >=3){
        System.out.println("Has alcanzado el limite de intentos");
        }

             System.out.println("Estimado usuario desea volver a ejecutar la aplicacion? S/N");
             XD =  x.next().charAt(0);
            
            }while(XD == 'S' || XD == 's'); 
            System.out.println("Saliendo del programa");
x.close();
  }
    }
