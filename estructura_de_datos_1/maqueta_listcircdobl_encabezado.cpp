/*
*Guillermo Cala; 01/ april/ 19;
*maqueta de listas circulares simples con operaciones basicas
*/
#include "iostream"
using namespace std;
struct Nodo
{
   int info;
   Nodo *sig;
   Nodo *ant;
};
Nodo *ptr = NULL;
int menu();
Nodo *insertarCabeza(Nodo *ptr, int xinfo);
Nodo *insertarCola(Nodo *ptr, int xinfo);
Nodo *Buscar(Nodo *ptr, int elem);
Nodo *EliminarNodo(Nodo *ptr, int elem);
Nodo *OrdenarDesc(Nodo *ptr);
Nodo *OrdenarAsc(Nodo *ptr);
void Mostrar(Nodo *ptr);
int main(int argc, char const *argv[])
{
   int sw = 1, info;
   do{
      switch(menu())
      {
         case 1:
            system("clear");
            cout << "Ingrese el dato: ";
            cin >> info;
            ptr = insertarCabeza(ptr, info);
            break;
         case 2:
            system("clear");
            cout << "Ingrese el dato: ";
            cin >> info;
            ptr = insertarCola(ptr, info);
            break;
         case 3:
            int llave;
            if(ptr == NULL)
            {
               cout << "lista vacia" << endl;
               cin.ignore();
               cin.get();
            }
            else
            {
               Nodo *q;
               system("clear");
               cout << "Ingrese el elemento a buscar: ";
               cin >> llave;
               q = Buscar(ptr, llave);
               if(q != NULL)
               {
                  cout << "Elemento encontrado" << endl;
                  cin.ignore();
                  cin.get();
               }
               else
               {
                  cout << "Elemento no encontrado" << endl;
                  cin.ignore();
                  cin.get();
               }
            }
            break;
         case 4:
            system("clear");
            int dato;
            if(ptr == NULL)
            {
               cout << "Lista vacia" << endl;
               cin.ignore();
               cin.get();
            }
            else
            {
               cout << "Ingrese el dato a eliminar: ";
               cin >> dato;
               ptr = EliminarNodo(ptr, dato);
            }
            break;
         case 5:
            system("clear");
            /*esta verificacion es para evitar un inifity loop, puede suceder
            cuando se intenta imprimir y la lista esta vacia */
            if(ptr == NULL)
            {
               cout << "lista vacia" << endl;
               cin.ignore();
               cin.get();
            }
            else
            {
               Mostrar(ptr);
               cin.get();
            }
            break;
         case 6:
            Nodo *p;
            p = ptr;
            if(ptr == NULL)
            {
               cout << "la lista esta vacia" << endl;
               cin.get();
            }
            else if(p->sig == ptr)
            {
               cout << "la lista solo tiene un elemento" << endl;
               cin.get();
            }
            else
            {
               int opt;
               system("clear");
               cout << "1- Ordenar Descendente\n2- Ordenar Ascendente" << endl;
               cout << "Ingrese una opcion: ";
               cin >> opt;
               switch(opt)
               {
                  case 1:
                     ptr = OrdenarDesc(ptr);
                     break;
                  case 2:
                     ptr = OrdenarAsc(ptr);
                     break;
                  default:
                     cout << "Valor invalido!" << endl;
                     cin.get();
                     break;
               }
            }
            cin.ignore();
            break;
         case 7:
            system("clear");
            /*UNEXPECTED FUNCTION*/
            break;
         case 8:
            int exit;
            system("clear");
            cout << "\tEsta seguro que desea cerrar el programa?\nPresione 1 para salir, de lo contrario digite cualquier otro numero: ";
            cin >> exit;
            if(exit == 1)
            {
               sw = 0;
            }
            break;
         default:
            cout << "Ha ingresado un valor invalido..." << endl;
            cin.ignore();
            cin.get();
            break;
      }
   }while(sw);
   return 0;
}
int menu()
{
   system("clear");
   printf("\n\t\t\t����������������������������");
	printf("\n\t\t\t�  MENU LISTA CIRC DOBLES  �");
	printf("\n\t\t\t����������������������������");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  1- INSERTAR CABEZA      �");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  2- INSERTAR COLA        �");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  3- BUSCAR LLAVE         �");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  4- ELIMINAR NODO        �");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  5- MOSTRAR LISTA        �");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  6- ORDENAR              �");
	printf("\n\t\t\t�                          �");
	printf("\n\t\t\t�  7- EJERCICIO            �");
	printf("\n\t\t\t�                          �");
   printf("\n\t\t\t�  8- SALIR                �");
   printf("\n\t\t\t�                          �");
	printf("\n\t\t\t����������������������������");
	printf("\n\t\t\t�    ELIJA UNA OPCION      �");
	printf("\n\t\t\t����������������������������");
   int opt;
   cout << "\nIngrese una opcion: ";
   cin >> opt;
   return opt;
}
Nodo *insertarCabeza(Nodo *ptr, int xinfo)
{
   Nodo *p, *r;
   p = (struct Nodo*) malloc (sizeof(Nodo));
   p->info = xinfo;
   if(ptr == NULL)
   {
      r = (struct Nodo*) malloc (sizeof(Nodo));
      ptr = r;
      r->sig = p;
      p->sig = r;
      p->ant = r;
      r->ant = p;
   }
   else
   {
      r = ptr;
      p->sig = r->sig;
      r->sig = p;
      p->ant = r;
      p->sig->ant = p;
   }
   return ptr;
}
Nodo *insertarCola(Nodo *ptr, int xinfo)
{
   Nodo *p = (struct Nodo*) malloc (sizeof(Nodo));
   p->info = xinfo;
   if(ptr == NULL)
   {
      Nodo *r = (struct Nodo*) malloc (sizeof(Nodo));
      ptr = r;
      r->sig = p; /*p->sig = ptr;*/
      p->sig = r;
      r->ant = p;
      p->ant = r;
   }
   else
   {
      Nodo *j = ptr->ant;
      j->sig = p;
      p->sig = ptr;
      ptr->ant = p;
      p->ant = j;
   }
   return ptr;
}
void Mostrar(Nodo *ptr)
{
   Nodo *r = ptr->sig;
   int opc;
   cout << "1-Imprimir la lista en orden de las manecillas del reloj\n2-Imprimir la lista en orden contrario a las manecillas del reloj." << endl;
   cout << "Ingrese la opcion: ";
   cin >> opc;
   switch(opc)
   {
      case 1:
         cout << "PTR -> ";
         while(r != ptr)
         {
            cout << "[" << r->info << "] -> ";
            r = r->sig;
         }
         cout << "NULL ";
         cin.ignore();
         break;
      case 2:
         r = ptr->ant;
         cout << "PTR -> ";
         while(r->ant != ptr->ant)
         {
            cout << "[" << r->info << "] -> ";
            r = r->ant;
         }
         cout << "NULL ";
         cin.ignore();
         break;
      default:
         cout << "Ha ingresado un valor incorrecto..." << endl;
         cin.ignore();
         break;
   }
}
Nodo *Buscar(Nodo *ptr, int elem)
{
   Nodo *r = ptr->sig;
   while(r != ptr)
   {
      if(r->info == elem)
      {
         return r;
      }
      else
      {
         r = r->sig;
      }
   }
   return NULL;
}
Nodo *EliminarNodo(Nodo *ptr, int elem)
{
   Nodo *q = Buscar(ptr, elem);
   if(q == NULL)
   {
      cout << "Elemento no encontrado " << endl;
      cin.ignore();
      cin.get();
   }
   else
   {
      if(ptr->sig == q && q->sig == ptr)
      {
         free(q);
         free(ptr);
         ptr = NULL;
      }
      else
      {
         /*para eliminar; j siempre debe estar antes de q*/
         Nodo *j = q->ant;
         j->sig = q->sig;
         j->sig->ant = j;
         free(q);
      }
      return ptr;
   }
   return ptr;
}
Nodo *OrdenarDesc(Nodo *ptr)
{
   Nodo *p, *q, *aux, *aux2;
   p = ptr->sig;
   while(p != ptr)
   {
      q = ptr->sig;
      while(q != ptr)
      {
         /*para que no se produzca un inifity loop tenemos que dejar a q en
         ptr->ant con q->sig != ptr*/
         if(q->sig != ptr && q->info < q->sig->info)
         {
            aux = q->sig;
            if(q == ptr->sig)
            {
               q->sig = aux->sig;
               q->sig->ant = q;
               aux->sig = q;
               q->ant = aux;
               ptr->sig = aux;
               aux->ant = ptr;
            }
            else
            {
               if(aux->sig != ptr)
               {
                  aux2 = q->ant;
                  q->sig = aux->sig;
                  q->sig->ant = q;
                  aux->sig = q;
                  q->ant = aux;
                  aux2->sig = aux;
                  aux->ant = aux2;
               }
               else
               {
                  aux2 = q->ant;
                  aux2->sig = aux;
                  aux->ant = aux2;
                  q->sig = ptr;
                  ptr->ant = q;
                  aux->sig = q;
                  q->ant = aux;
               }
            }
            /*en el caso de que rotemos un nodo y este tenga referenciado el bucle de recorrido
            principal, debemos regresar este a su posicion anterior para no afectar el funcionamiento de la funcion*/
            if(q == p)
            {
               p = aux;
            }
         }
         else
         {
            q = q->sig;
         }
      }
      p = p->sig;
   }
   cin.get();
   return ptr;
}
Nodo *OrdenarAsc(Nodo *ptr)
{
   Nodo *p, *q, *aux, *aux2;
   p = ptr->sig;
   while(p != ptr)
   {
      q = ptr->sig;
      while(q != ptr)
      {
         /*para que no se produzca un inifity loop tenemos que dejar a q en
         ptr->ant con q->sig != ptr*/
         if(q->sig != ptr && q->info > q->sig->info)
         {
            aux = q->sig;
            if(q == ptr->sig)
            {
               q->sig = aux->sig;
               q->sig->ant = q;
               aux->sig = q;
               q->ant = aux;
               ptr->sig = aux;
               aux->ant = ptr;
            }
            else
            {
               if(aux->sig != ptr)
               {
                  aux2 = q->ant;
                  q->sig = aux->sig;
                  q->sig->ant = q;
                  aux->sig = q;
                  q->ant = aux;
                  aux2->sig = aux;
                  aux->ant = aux2;
               }
               else
               {
                  aux2 = q->ant;
                  aux2->sig = aux;
                  aux->ant = aux2;
                  q->sig = ptr;
                  ptr->ant = q;
                  aux->sig = q;
                  q->ant = aux;
               }
            }
            /*en el caso de que rotemos un nodo y este tenga referenciado el bucle de recorrido
            principal, debemos regresar este a su posicion anterior para no afectar el funcionamiento de la funcion*/
            if(q == p)
            {
               p = aux;
            }
         }
         else
         {
            q = q->sig;
         }
      }
      p = p->sig;
   }
   cin.get();
   return ptr;
}
