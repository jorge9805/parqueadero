
package parqueadero;
import becker.robots.*;
import static ch.aplu.util.Console.println;
import java.util.Scanner;
import java.util.Random;


public class Parqueadero {
    

    public static void girarderecha(Robot marco){
             for(int i=0;i<3;i++ ){
             marco.turnLeft();
         }
    }

    public static void parquear(Robot marco){
             marco.turnLeft();
             marco.move();
    }
    
    public static void avanzarzona1(Robot marco){
             for(int i=0;i<13;i++ ){
             marco.move();
         }
             girarderecha(marco);
             marco.move();
    }
        public static void avanzarzona2(Robot marco){
             for(int i=0;i<10;i++ ){
             marco.move();
             }
             girarderecha(marco);
             marco.move();
         }

            public static void avanzarzona3(Robot marco){
             for(int i=0;i<7;i++){
             marco.move();
         }
             girarderecha(marco);
             marco.move();
          
    }
             public static void avanzarzonatemporal(Robot marco){
             for(int i=0;i<5;i++ ){
             marco.move();
         }
             girarderecha(marco);
             marco.move();
             marco.move();
             girarderecha(marco);
             marco.move();
    }
             public static void avanzarparqueadero1(Robot marco){
             for(int i=0;i<4;i++ ){
                 marco.move();
         }
                 parquear(marco);
    }             
             public static void avanzarparqueadero2(Robot marco){
             for(int i=0;i<3;i++ ){
                 marco.move();
         }
             parquear(marco);
    } 
             public static void avanzarparqueadero3(Robot marco){
             for(int i=0;i<2;i++ ){
                 marco.move();
         }
             parquear(marco);
    }    
             public static void avanzarparqueadero4(Robot marco){
             for(int i=0;i<1;i++ ){
                 marco.move();
         }
             parquear(marco);
    } 
             public static void avanzarparqueadero5(Robot marco){
             parquear(marco);
    }       
             public static void avanzarparqueaderozonat1(Robot marco){
             for(int i=0;i<3;i++ ){
             marco.move();
         }
             parquear(marco);
    }                
             public static void avanzarparqueaderozonat2(Robot marco){
             for(int i=0;i<2;i++ ){
             marco.move();
         }
             parquear(marco);
    } 
             public static void avanzarparqueaderozonat3(Robot marco){
             for(int i=0;i<1;i++ ){
             marco.move();
         }
             parquear(marco);
    }   
             public static void avanzarparqueaderozonat4(Robot marco){
             parquear(marco);
    }                

        public static int ingresarauto(String placa, int contadorzona1, int contadorzona2, int contadorzona3, City parking ){
            Robot marco=new Robot(parking,6,15,Direction.WEST);
            if (contadorzona1+contadorzona2+contadorzona3<=15){
                if(contadorzona1==contadorzona2&&contadorzona1==contadorzona3){
                int acualzonaingresar = (int) (Math.random() * 3) + 1;
                if (acualzonaingresar ==1){
                    avanzarzona1(marco);
                    if(contadorzona1==0){
                        avanzarparqueadero1(marco);
                        return 1;
                    } 
                    else if ( contadorzona1==1){
                        avanzarparqueadero2(marco);
                        return 1;
                    }
                    else if (contadorzona1==2){
                        avanzarparqueadero3(marco);
                        return 1;
                    }
                    else if (contadorzona1==3){
                        avanzarparqueadero4(marco);
                        return 1;
                    }
                    else if (contadorzona1==4){
                        avanzarparqueadero5(marco);
                        return 1;
                    }
                }else if(acualzonaingresar==2){
                    avanzarzona2(marco);
                    if(contadorzona2==0){
                        avanzarparqueadero1(marco);
                        return 2;
                    } 
                    else if (contadorzona2==1){
                        avanzarparqueadero2(marco);
                        return 2;
                    }
                    else if (contadorzona2==2){
                        avanzarparqueadero3(marco);
                        return 2;
                    }
                    else if (contadorzona2==3){
                        avanzarparqueadero4(marco);
                        return 2;
                    }
                    else if (contadorzona2==4){
                        avanzarparqueadero5(marco);
                        return 2;
                    }                    
                }else{
                    avanzarzona3(marco);
                     if(contadorzona3==0){
                        avanzarparqueadero1(marco);
                        return 3;
                    } 
                    else if (contadorzona3==1){
                        avanzarparqueadero2(marco);
                        return 3;
                    }
                    else if (contadorzona3==2){
                        avanzarparqueadero3(marco);
                        return 3;
                    }
                    else if (contadorzona3==3){
                        avanzarparqueadero4(marco);
                        return 3;
                    }
                    else if (contadorzona3==4){
                        avanzarparqueadero5(marco);
                        return 3;
                    }
                }
            } else if(contadorzona1<contadorzona2){
                if(contadorzona1<contadorzona3){
                    avanzarzona1(marco);
                    if(contadorzona1==0){
                        avanzarparqueadero1(marco);
                        return 1;
                    } 
                    else if ( contadorzona1==1){
                        avanzarparqueadero2(marco);
                        return 1;
                    }
                    else if (contadorzona1==2){
                        avanzarparqueadero3(marco);
                        return 1;
                    }
                    else if (contadorzona1==3){
                        avanzarparqueadero4(marco);
                        return 1;
                    }
                    else if (contadorzona1==4){
                        avanzarparqueadero5(marco);
                        return 1;
                    }
                }else if(contadorzona1==contadorzona3){
                int acualzonaingresar = (int) (Math.random() * 2) + 1;
                if (acualzonaingresar ==1){
                    avanzarzona1(marco);
                    if(contadorzona1==0){
                        avanzarparqueadero1(marco);
                        return 1;
                    } 
                    else if ( contadorzona1==1){
                        avanzarparqueadero2(marco);
                        return 1;
                    }
                    else if (contadorzona1==2){
                        avanzarparqueadero3(marco);
                        return 1;
                    }
                    else if (contadorzona1==3){
                        avanzarparqueadero4(marco);
                        return 1;
                    }
                    else if (contadorzona1==4){
                        avanzarparqueadero5(marco);
                        return 1;
                    }
                }else if(acualzonaingresar==2){
                    avanzarzona3(marco);
                    if(contadorzona3==0){
                        avanzarparqueadero1(marco);
                        return 3;
                    } 
                    else if (contadorzona3==1){
                        avanzarparqueadero2(marco);
                        return 3;
                    }
                    else if (contadorzona3==2){
                        avanzarparqueadero3(marco);
                        return 3;
                    }
                    else if (contadorzona3==3){
                        avanzarparqueadero4(marco);
                        return 3;
                    }
                    else if (contadorzona3==4){
                        avanzarparqueadero5(marco);
                        return 3;
                    }  
                }
                }else{
                    avanzarzona3(marco);
                    if(contadorzona3==0){
                        avanzarparqueadero1(marco);
                        return 3;
                    } 
                    else if (contadorzona3==1){
                        avanzarparqueadero2(marco);
                        return 3;
                    }
                    else if (contadorzona3==2){
                        avanzarparqueadero3(marco);
                        return 3;
                    }
                    else if (contadorzona3==3){
                        avanzarparqueadero4(marco);
                        return 3;
                    }
                    else if (contadorzona3==4){
                        avanzarparqueadero5(marco);
                        return 3;
                    }  
                    
                }
            
        } else if(contadorzona1==contadorzona2){
             int acualzonaingresar = (int) (Math.random() * 2) + 1;
                if (acualzonaingresar ==1){
                    avanzarzona1(marco);
                    if(contadorzona1==0){
                        avanzarparqueadero1(marco);
                        return 1;
                    } 
                    else if ( contadorzona1==1){
                        avanzarparqueadero2(marco);
                        return 1;
                    }
                    else if (contadorzona1==2){
                        avanzarparqueadero3(marco);
                        return 1;
                    }
                    else if (contadorzona1==3){
                        avanzarparqueadero4(marco);
                        return 1;
                    }
                    else if (contadorzona1==4){
                        avanzarparqueadero5(marco);
                        return 1;
                    }
                }else if(acualzonaingresar==2){
                    avanzarzona2(marco);
                    if(contadorzona2==0){
                        avanzarparqueadero1(marco);
                        return 2;
                    } 
                    else if (contadorzona2==1){
                        avanzarparqueadero2(marco);
                        return 2;
                    }
                    else if (contadorzona2==2){
                        avanzarparqueadero3(marco);
                        return 2;
                    }
                    else if (contadorzona2==3){
                        avanzarparqueadero4(marco);
                        return 2;
                    }
                    else if (contadorzona2==4){
                        avanzarparqueadero5(marco);
                        return 2;
                    } 
                }
        }else if(contadorzona2<contadorzona3){
                    avanzarzona2(marco);
                    if(contadorzona2==0){
                        avanzarparqueadero1(marco);
                        return 2;
                    } 
                    else if (contadorzona2==1){
                        avanzarparqueadero2(marco);
                        return 2;
                    }
                    else if (contadorzona2==2){
                        avanzarparqueadero3(marco);
                        return 2;
                    }
                    else if (contadorzona2==3){
                        avanzarparqueadero4(marco);
                        return 2;
                    }
                    else if (contadorzona2==4){
                        avanzarparqueadero5(marco);
                        return 2;
                    }
        }else if(contadorzona2==contadorzona3){
            int acualzonaingresar = (int) (Math.random() * 3) + 2;
        
             if(acualzonaingresar==2){
                    avanzarzona2(marco);
                    if(contadorzona2==0){
                        avanzarparqueadero1(marco);
                        return 2;
                    } 
                    else if (contadorzona2==1){
                        avanzarparqueadero2(marco);
                        return 2;
                    }
                    else if (contadorzona2==2){
                        avanzarparqueadero3(marco);
                        return 2;
                    }
                    else if (contadorzona2==3){
                        avanzarparqueadero4(marco);
                        return 2;
                    }
                    else if (contadorzona2==4){
                        avanzarparqueadero5(marco);
                        return 2;
                    }                    
                }else{
                    avanzarzona3(marco);
                     if(contadorzona3==0){
                        avanzarparqueadero1(marco);
                        return 3;
                    } 
                    else if (contadorzona3==1){
                        avanzarparqueadero2(marco);
                        return 3;
                    }
                    else if (contadorzona3==2){
                        avanzarparqueadero3(marco);
                        return 3;
                    }
                    else if (contadorzona3==3){
                        avanzarparqueadero4(marco);
                        return 3;
                    }
                    else if (contadorzona3==4){
                        avanzarparqueadero5(marco);
                        return 3;
                    }
                }
        }else{
            avanzarzona3(marco);
                     if(contadorzona3==0){
                        avanzarparqueadero1(marco);
                        return 3;
                    } 
                    else if (contadorzona3==1){
                        avanzarparqueadero2(marco);
                        return 3;
                    }
                    else if (contadorzona3==2){
                        avanzarparqueadero3(marco);
                        return 3;
                    }
                    else if (contadorzona3==3){
                        avanzarparqueadero4(marco);
                        return 3;
                    }
                    else if (contadorzona3==4){
                        avanzarparqueadero5(marco);
                        return 3;
                    }
        }
                             
            
        }else{
                println("no hay disponibilidad");  
            }
             return 1;
     }
        
    public static void main(String[] args){  
        City parking = new City();
        Robot marco =new Robot(parking, 6, 15, Direction.WEST);
        
  
     //Diseño de parqueadero
     //Zona 1

      for (int i=1; i<6; i++){
          Wall seccion0zona1 = new Wall (parking, i, 1, Direction.WEST);
      }
      for (int i=1; i<3; i++){
          Wall seccion1zona1 = new Wall (parking, 1, i, Direction.NORTH);
      }

      for (int i=1; i<6; i++){
          Wall seccion2zona1 = new Wall (parking, i, 2, Direction.EAST);
      }
      for (int i=1; i<6; i++){
          Wall seccion3zona1 = new Wall (parking, i, 1, Direction.SOUTH);
      }
      
      //Zona 2
      
      for (int i=1; i<6; i++){
          Wall seccion0zona2 = new Wall (parking, i, 4, Direction.WEST);
      }
      for (int i=4; i<6; i++){
          Wall seccion1zona2 = new Wall (parking, 1, i, Direction.NORTH);
      }

      for (int i=1; i<6; i++){
          Wall seccion2zona2 = new Wall (parking, i, 5, Direction.EAST);
      }
      for (int i=1; i<6; i++){
          Wall seccion3zona2 = new Wall (parking, i, 4, Direction.SOUTH);
      }
      
      //zona 3
      
      for (int i=1; i<6; i++){
          Wall seccion0zona3 = new Wall (parking, i, 7, Direction.WEST);
      }
      for (int i=7; i<9; i++){
          Wall seccion1zona3 = new Wall (parking, 1, i, Direction.NORTH);
      }

      for (int i=1; i<6; i++){
          Wall seccion2zona3 = new Wall (parking, i, 8, Direction.EAST);
      }
      for (int i=1; i<6; i++){
          Wall seccion3zona2 = new Wall (parking, i, 7, Direction.SOUTH);
      }
      
      //Zona temporal
      
      for (int i=10; i<15; i++){
          Wall seccion0zonat = new Wall (parking, 4, i, Direction.NORTH);
      }
      for (int i=10; i<15; i++){
          Wall seccion1zonat = new Wall (parking, 5, i, Direction.WEST);
      }
      for (int i=4; i<6; i++){
          Wall seccion2zonat = new Wall (parking, i, 14, Direction.EAST);
      }
      for (int i=11; i<15; i++){
          Wall seccion3zonat = new Wall (parking, 5, i, Direction.SOUTH);
      } 
      Wall seccion3zonat = new Wall (parking, 4, 10, Direction.WEST);
     
      //Limites del parqueadero
      
      for (int i=0; i<16; i++){
          Wall limitenorte = new Wall (parking, 0, i, Direction.NORTH);
      }
      for (int i=0; i<8; i++){
          Wall limiteoeste = new Wall (parking, i, 0, Direction.WEST);
      }
      for (int i=0; i<6; i++){
          Wall limiteeste = new Wall (parking, i, 15, Direction.EAST);
      }
      Wall limiteeste1 = new Wall (parking, 7, 15, Direction.EAST);
      for (int i=0; i<16; i++){
          Wall limitesur = new Wall (parking, 7, i, Direction.SOUTH);
      } 
      int i=0;
      int a=0;
      int b=0;
      Scanner in=new Scanner(System.in);
      println("Bienvenido al parqueadero");
              int continuar = 1, opcion = 0;
        do{
            System.out.println("1. ingresar auto");
            System.out.println("2. sacar auto");
            System.out.println("3.mostrar zona");
            System.out.println("2. ingreso jornada");
            opcion = in.nextInt();
            if(opcion == 1){
                System.out.println("Ingrese la placa");
                String placa = in.next();
                int contadorzona1;
                int contadorzona2;
                int contadorzona3;
                int d =0;
                if (d==0){
                 contadorzona1=0;
                 contadorzona2=0;
                 contadorzona3=0;
                
                 if(d==1){
                    contadorzona1++;
                 
                 if (d==2){
                    contadorzona2++;
                 
                 if (d==3){
                    contadorzona3++;
                }
                 }
                 }
                
                d = ingresarauto( placa, contadorzona1,contadorzona2 ,contadorzona3,parking );
                if(d==1){
                    contadorzona1++;
                }else if (d==2){
                    contadorzona2++;
                }else if (d==3){
                    contadorzona3++;
                }
                }
            }else if(opcion == 2){
                System.out.println("Nombre del Disco");
                //Disco[] discos = tienda.getDiscos();
                //for (int i = 0; i < tienda.getCantidadDiscos(); i++) {
                  //  System.out.println(discos[i].getNombre());
                }
              /*  String nombreDisco = in.next();
                System.out.println("Ingrese los datos de la cancion");
                System.out.println("Nombre");
                String nombreCancion = in.next();
                System.out.println("Precio");
                double precio = in.nextDouble();
                System.out.println("Duracion");
                float duracion = in.nextFloat();
                System.out.println("Tamanio");
                float tamanio = in.nextFloat();
                System.out.println("Calidad");
                float calidad = in.nextFloat();
                boolean  resultado = tienda.agregarCancionDisco(nombreDisco, nombreCancion, precio, duracion, tamanio, calidad);
                if(resultado == true){
                    System.out.println("Se creo la cancion satisfactoriamente");
                }else{
                    System.out.println("La Cancion no puede ser agregado al disco especificado");
                }
            }else if(opcion == 3){
                 System.out.println("Ingrese el nombre del disco");
                 String nombreDisco= in.next();
                 System.out.println("Ingrese el nombre de la cancion");
                 String nombreCancion = in.next();
                 Cancion cancion = tienda.darInformacionCancion(nombreDisco, nombreCancion);
                 if(cancion != null){
                     System.out.println(cancion.getNombre() + " " + cancion.getPrecio());
                 }else{
                     System.out.println("No existe un cancion en el disco especificado.");
                 }
            }else{
                System.out.println("Opcion invalida");
            }*/
        
        }while(continuar == 1);
        
        
   }


}


