#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>


 struct nodoa {
        
        int info;
        nodoa *sig;
     
    
};



nodoa *ptr=NULL, *r,*p,*k,*h, *j;

nodoa* InsertaCabeza(nodoa *p,int xinfo);
nodoa* InsertaCola(nodoa *p,int xinfo);
nodoa* Buscarllave( nodoa *p, int elem);
nodoa* Eliminacion(nodoa *p,int elem);
void Mostrar(nodoa *p);

int menu (void);
 
int main(int argc, char*argv[]){
    system ("CLS");
    int sw=1, i, j;
    long opcion;
    do{
    switch (menu()){
    case 1:
    	 system ("CLS");
    	 printf ("Ingrese La Informacion");
         scanf ("%d", &i);
         ptr=InsertaCabeza(ptr,i);
       break;
    case 2:
       	 system ("CLS");
    	 printf ("Ingrese La Informacion");
         scanf ("%d", &i);	
         ptr=InsertaCola(ptr,i);
       break;
     case 3:
        system ("CLS");
    	 	
		getch();
       break;
     case 4:
     	system("cls");
     	
       break;
	 case 5:
	 	
       break;
       
       case 6:
    
       	break;
       	
       case 0:
       	system ("CLS");
         printf ("Press any key to exit...");
         sw=0;
         break;
     
     default:
         system ("CLS");
         printf("opcion no valida...por favor intente nuevamente\n");
         break;    
    }
    }while(sw);

    
getch();
}
int menu (void){
int opcion;
system("CLS");
system ("color 3A");
   
printf ("\n\n");
printf("\t\t\t����������������������������������\n");
printf("\t\t\t�     ESTRUCTURA DE DATOS        �\n");
printf("\t\t\t����������������������������������\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t� 1  ->  Insertar Nodos cabeza   �\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t� 2  ->  Insertar Nodos Cola     �\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t� 3  ->  Consulta                �\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t� 4  ->  Eliminacion             �\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t� 5  ->  Mostrar Lista           �\n");
printf("\t\t\t�                                �\n"); 
printf("\t\t\t� 6  ->                          �\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t�                                �\n");
printf("\t\t\t� 0  ->  Salir                   �\n");
printf("\t\t\t����������������������������������\n");
printf("\t\t\t�    Elija una opcion...         �\n");
printf("\t\t\t����������������������������������\n");
    
 
int sw=1;
    do {
    opcion=getch();
       if (opcion>=48 && opcion <=57){
       sw=0;
       }else
        printf("\n se debe ingresar un entero entre 1-9\n");
    
    }while(sw);
    opcion=opcion-48;

   return opcion;
   } 
     
nodoa* InsertaCabeza (nodoa *ptr,int xinfo){
   
    p= (struct nodoa *) malloc (sizeof (nodoa));
    p->info = xinfo;
   
}

nodoa* InsertaCola (nodoa *ptr,int xinfo){
  
}


void  Mostrar (nodoa *ptr){
      system ("CLS");
      r=ptr->sig;
      while(r!=ptr){
      	printf("[%d]->", r->info);
      	r=r->sig;
	  }
getch();
}

nodoa* Buscarllave(nodoa *ptr,int elem){

}

nodoa* Eliminacion (nodoa *ptr,int elem){
  
}





