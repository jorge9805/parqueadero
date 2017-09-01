
package parqueadero;

import becker.robots.*;

public class Parqueadero {
    public static void main(String[] args){  
     
     City parking = new City();
     Robot karel = new Robot(parking, 6, 15, Direction.WEST,5);
      
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
   }
}

