/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author enrique
 */
public interface IPersona {
    
    // Método para obtener todos los registros de la tabla
    List<PersonaVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    PersonaVO findByPk(int pk) throws SQLException;
    
    // Método para insertar un registro
    int insertPersona (PersonaVO persona) throws SQLException;
    
    // Método para insertar varios registros
    int insertPersona (List<PersonaVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deletePersona (PersonaVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deletePersona() throws SQLException;
    
    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updatePersona (int pk, PersonaVO nuevosDatos) throws SQLException;
    
}
