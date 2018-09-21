package isw_tp.persistencia;

/**
 * 
 * @author Alexis Carranza
 */
import isw_tp.DE_DetallePedido;
import isw_tp.DE_Pedido;
import java.io.*;
import java.util.ArrayList;
public class DE_PersistenciaWriter
{
      private String arch = "persistenciaPedidos";
    
      public DE_PersistenciaWriter()
      {
      }
      
      public DE_PersistenciaWriter(String nom)
      {
            arch = nom;
      }
      
      public void write (ArrayList<DE_Pedido> pedidos) throws DE_PersistenciaIOException
      {
           try
           {
             FileOutputStream ostream = new FileOutputStream(arch);
             ObjectOutputStream p = new ObjectOutputStream(ostream);
      
             p.writeObject(pedidos);
      
             p.flush(); 
             ostream.close();
           }
           catch ( Exception e )
           {
             throw new DE_PersistenciaIOException("No se pudo grabar los pedidos...");
           }
      }
}
