package br.com.masiesque.ZZDjdbc.Repository;

import br.com.masiesque.ZZDjdbc.Domain.Producer;
import br.com.masiesque.ZZDjdbc.conn.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.security.interfaces.EdECKey;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {

    public static void save(Producer producer) {
        String sqlQuery = "INSERT INTO producer (name) VAlUES ('%s')".formatted(producer.getName());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {// o Connection do java extend a classe closeable;
            int rownAffected = stmt.executeUpdate(sqlQuery);
            log.info("Inserted Producer {} into the DataBase. Rowns affected {}", producer.getName(), rownAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert Producer {} into dataBase", producer.getName(), e);
        }
    }


    public static void delete(int id) {
        String sqlQuery = "DELETE FROM anime_store.producer WHERE(id = %d)".formatted(id);
        //precisamos abrir uma conexão com o nosso banco, sempre que abrimos temos que fechar, por isso usaremos
        // o try-with-resources, pois o connection é closeable

        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rownAffected = stmt.executeUpdate(sqlQuery);
            log.info("Deleted producer into the DataBase. Rowns affected {}", rownAffected);

        } catch (SQLException e) {
            log.error("Error while trying to delete Producer into dataBase", e);
        }

    }

    public static void update(Producer producer) {
        String sqlQuery = "UPDATE anime_store.producer SET name = '%s' WHERE(id = %d);"
                .formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rownAffected = stmt.executeUpdate(sqlQuery);
            log.info("Uptade producer{} into the DataBase. Rowns affected {}", producer.getName(), rownAffected);

        } catch (SQLException e) {
            log.error("Error while trying to uptade Producer into dataBase", e);
        }

    }

    public static List<Producer> findAll() {
        log.info("Finding all producers");
        return findByName("");
        //        List<Producer> producerList = new ArrayList<>();
//        String sqlQuery = "SELECT name, id FROM anime_store.producer;";
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sqlQuery)) {
//
//
//            while (rs.next()) {
//                Producer producerbuild = Producer.builder()
//                        .name(rs.getString("name"))
//                        .id(rs.getInt("id"))
//                        .build();
//                producerList.add(producerbuild);
//            }
//
//        } catch (SQLException e) {
//            log.error("Error while trying to find All Producer into dataBase", e);
//        }
//        return producerList;
    }

    public static List<Producer> findByName(String name) {
        String sqlQuery = "SELECT * FROM anime_store.producer WHERE name LIKE '%s';"
                .formatted("%" + name + "%");
        List<Producer> producers = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlQuery)) {

            while (rs.next()) {
                Producer producerL = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
                producers.add(producerL);
            }

            log.info("Find producer into the DataBase");

        } catch (SQLException e) {
            log.error("Error while trying to Find by name Producer into dataBase", e);
        }

        return producers;
    }

    public static void showProducerMetaData() {
        String sqlQuery = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sqlQuery)) {
            rs.next();
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("columns number: {}\n", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("table name: {}", rsMetaData.getTableName(i));
                log.info("Column name: {}", rsMetaData.getColumnName(i));
                log.info("Column name: {}", rsMetaData.getColumnTypeName(i));
                log.info("------------------------");
            }
        } catch (SQLException e) {
            log.error("Error while trying to show MetaDatas of  Producers into dataBase", e);
        }

    }

    public static void driverMetaData() {
        log.info("Showing driver metaData");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");

                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE))
                    log.info("And supports CONCUR_UPDATABLE");
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    log.info("And supports CONCUR_UPDATABLE");
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    log.info("And supports CONCUR_UPDATABLE");
            }


        } catch (SQLException e) {
            log.error("Error while trying to show Driver MetaData of  Producers into dataBase", e);
        }
    }

    public static void showTypeScrollWorlking() {
        String query = "SELECT * FROM anime_store.producer;";

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(query)) {
            log.info(rs.last());
            Producer producer = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
            log.info(producer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        List<Producer> producerList = new ArrayList<>();
        String querySql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%'".formatted(name);
        log.info("Finding producer by that name....");

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(querySql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();

                Producer producer = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
                producerList.add(producer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producerList;
    }

    public static List<Producer> findByNameAndUpdateToLowerCase(String name) {
        List<Producer> producerList = new ArrayList<>();
        String querySql = "SELECT * FROM anime_store.producer WHERE name LIKE '%%%s%%'".formatted(name);
        log.info("Finding producer by that name....");

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(querySql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toLowerCase());
                rs.updateRow();

                Producer producer = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
                producerList.add(producer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producerList;
    }

    public static Producer findByNameAndInsertWhenNotFound(String name) {
        log.info("Procurando producer...");
        String sqlQ = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%'"
                .formatted(name);

        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sqlQ)) {
            if (!rs.next()) {
                log.info("Criando novo obj e entidade ");
                rs.moveToInsertRow();
                rs.updateString("name", name);
                rs.insertRow();
                rs.beforeFirst();
                rs.next();
                Producer producer1 = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
                return producer1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static List<Producer> showAll() {
        String sql = "SELECT * FROM anime_store.producer;";

        List<Producer> producers = new ArrayList<>();
        try (Connection con = ConnectionFactory.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }

    public static List<Producer> findByNamePreparedStatment(String name) {
        List<Producer> producers = new ArrayList<>();
        log.info("Finding by name");
        String sql = "SELECT * FROM anime_store.producer WHERE name LIKE ?;";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = createdPrepatedStatment(con, sql, name)) {
            ResultSet rs = ps.executeQuery();
            log.info("Found producer!");
            while (rs.next()) {
                Producer producer = Producer.builder().name(rs.getString("name")).id(rs.getInt("id")).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producers;
    }


    //utils:
    private static PreparedStatement createdPrepatedStatment(Connection connection, String sql, String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        return preparedStatement;
    }
}


//toda conexão que vc abre vc precisa fechar, por isso que o Connection já apresenta o méto-do .close(). Por sua vez a
// classe Conection herda closeable;