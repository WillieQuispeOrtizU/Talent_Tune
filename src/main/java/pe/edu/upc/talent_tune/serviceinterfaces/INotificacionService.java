package pe.edu.upc.talent_tune.serviceinterfaces;

import pe.edu.upc.talent_tune.entities.Notificacion;

import java.util.List;

public interface INotificacionService {

    public List<Notificacion> list();

    public void insert(Notificacion notificacion);

    public void update(Notificacion notificacion);

    public void delete(int id);
}
