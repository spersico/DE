package isw_tp.persistencia;

public class DE_PersistenciaIOException extends Exception
{
       private String message = "Problema al serializar la Tabla";
    
       public DE_PersistenciaIOException()
       {
       }  
    
       public DE_PersistenciaIOException(String msg)
       {
            message = msg;
       }
    
       @Override
       public String getMessage()
       {
         return message;
       }   
}
