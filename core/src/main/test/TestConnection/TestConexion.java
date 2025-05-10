package TestConnection;

import com.elias.core.Persistence.PersistenceEntityManager;

public class TestConexion {


    public static void main(String[] args) {
        PersistenceEntityManager manager = PersistenceEntityManager.getInstance();
        manager.getEntityManager().getTransaction().begin();


        System.out.println("TestConexion");

        manager.getEntityManager().getTransaction().commit();
    }

}
