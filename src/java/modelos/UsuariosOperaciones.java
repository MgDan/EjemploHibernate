/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author DanVz
 */
public class UsuariosOperaciones {
    
    public ArrayList<Usuarios> getUsuarios(){
        SessionFactory sesion = HibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction ts = session.beginTransaction();
        //
        ArrayList<Usuarios> arreglo = new ArrayList<Usuarios>();
        Query q = session.createQuery("from Usuarios");
        List<Usuarios> lista = q.list();
        Iterator<Usuarios> items = lista.iterator();
        //
        ts.commit();
        session.close();
        
        //lista la ponemos en un arraylist
        while(items.hasNext()){
            Usuarios temp = items.next();
            arreglo.add(temp);
        }
        
        
        return arreglo;
    }
    
}
