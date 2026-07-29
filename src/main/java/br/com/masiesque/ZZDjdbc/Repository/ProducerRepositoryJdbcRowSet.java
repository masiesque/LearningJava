package br.com.masiesque.ZZDjdbc.Repository;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.conn.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepositoryJdbcRowSet {

    public static List<Producer> findByNameJdbcRowSet(String name){
        List<Producer>producers = new ArrayList<>();
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";

        try(JdbcRowSet conRowSet =  ConnectionFactory.getConnectionByRowSet())
        {
            conRowSet.setCommand(sql);
            conRowSet.setString(1,name);
            conRowSet.execute();

            while (conRowSet.next())
            {
                Producer producer = Producer.builder().name(conRowSet.getString("name")).id(conRowSet.getInt("id")).build();
                    producers.add(producer);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return producers;
    }
}
