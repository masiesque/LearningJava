package br.com.masiesque.ZZDjdbc.Repository;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.conn.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer)
    {
        String sqlQuery = "INSERT INTO producer (name) VAlUES ('%s')".formatted(producer.getName());
        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt= connection.createStatement()){// o Connection do java extend a classe closeable;
            int rownAffected = stmt.executeUpdate(sqlQuery);
            log.info("Inserted Producer {} into the DataBase. Rowns affected {}",producer.getName(),rownAffected);
        }catch (SQLException e )
        {
            log.error("Error while trying to insert Producer {} into dataBase", producer.getName(), e);
        }
    }


    public static void delete ( int id)
    {
        String sqlQuery = "DELETE FROM anime_store.producer WHERE(id = %d)".formatted(id);
        //precisamos abrir uma conexão com o nosso banco, sempre que abrimos temos que fechar, por isso usaremos
        // o try-with-resources, pois o connection é closeable

        try(Connection conn= ConnectionFactory.getConnection(); Statement stmt= conn.createStatement())
        {
            int rownAffected = stmt.executeUpdate(sqlQuery);
            log.info("Deleted producer into the DataBase. Rowns affected {}",rownAffected);

        }catch(SQLException e)
        {
            log.error("Error while trying to delete Producer into dataBase",e);
        }

    }
    public static void uptade ( Producer producer)
    {
        String sqlQuery = "UPDATE anime_store.producer SET name = '%s' WHERE(id = %d);"
                .formatted(producer.getName(),producer.getId());
        try(Connection conn= ConnectionFactory.getConnection(); Statement stmt= conn.createStatement())
        {
            int rownAffected = stmt.executeUpdate(sqlQuery);
            log.info("Uptade producer{} into the DataBase. Rowns affected {}",producer.getName(),rownAffected);

        }catch(SQLException e)
        {
            log.error("Error while trying to uptade Producer into dataBase",e);
        }

    }

}


//toda conexão que vc abre vc precisa fechar, por isso que o Connection já apresenta o méto-do .close(). Por sua vez a
// classe Conection herda closeable;