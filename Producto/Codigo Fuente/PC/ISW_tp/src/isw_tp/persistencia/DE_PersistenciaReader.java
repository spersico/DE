package isw_tp.persistencia;

/**
 *  @version Septiembre de 2017.
 */
import isw_tp.DE_DetallePedido;
import isw_tp.DE_Pedido;
import java.io.*;
import java.util.ArrayList;
public class DE_PersistenciaReader 
{
      private String arch = "persistenciaPedidos";
    
      public DE_PersistenciaReader()
      {
      }
      
      public DE_PersistenciaReader(String nom)
      {
          arch = nom;
      }
      
      public ArrayList<DE_Pedido> read() throws DE_PersistenciaIOException
      {
           ArrayList<DE_Pedido> pedidos = null;
           
           try
           {
                 FileInputStream istream = new FileInputStream(arch);
                 ObjectInputStream p = new ObjectInputStream(istream);
          
                 pedidos = ( ArrayList<DE_Pedido> ) p.readObject();
                 
                 p.close();
                 istream.close();
           }
           catch (Exception e)
           {
             throw new DE_PersistenciaIOException("No se pudo recuperar los pedidos...");
           }
           
           return pedidos;
       }
}