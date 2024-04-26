package CodigoJAVA.PostgreSQL_Conexion.dependencias.codigo;

import java.sql.*;

public class QueryBBDD {

    public void insertExpediente(expediente objexpediente) {
        PostgreSQL postgreSQL = new PostgreSQL();

        try {
            Connection con = postgreSQL.connectDatabase();
            Statement stmnt = con.createStatement();

            // Iterar sobre la lista de denunciantes
            for (denunciante denunciante : objexpediente.getObjDenunciante()) {

                String sql = String.format(
                        "INSERT INTO developer.Denunciantes (Id, PrimerNombre,PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad) VALUES ('%s', '%s', ..., '%s')",
                        denunciante.getID(), denunciante.getPrimerNombre(), denunciante.getPrimerAellido(),
                        denunciante.getSegundoNombre(),
                        denunciante.getSegundoApellido(), denunciante.getGenero(), denunciante.getEdad());

                // Ejecutar la consulta SQL
                stmnt.executeUpdate(sql);
            }
            // Iterar sobre la lista de cada uno de los denunciados
            for (denunciado denunciado : objexpediente.getObjDenunciado()) {

                String sql = String.format(
                        "INSERT INTO developer.Denunciantes (Id, PrimerNombre,PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad) VALUES ('%s', '%s', ..., '%s')",
                        denunciado.getID(), denunciado.getPrimerNombre(), denunciado.getPrimerAellido(),
                        denunciado.getSegundoNombre(),
                        denunciado.getSegundoApellido(), denunciado.getGenero(), denunciado.getEdad());

                // Ejecutar la consulta SQL
                stmnt.executeUpdate(sql);
            }
            // Iterar sobre la lista de cada uno de los ofendidos
            for (ofendido ofendido : objexpediente.getObjOfendido()) {

                String sql = String.format(
                        "INSERT INTO developer.Denunciantes (Id, PrimerNombre,PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad) VALUES ('%s', '%s', ..., '%s')",
                        ofendido.getID(), ofendido.getPrimerNombre(), ofendido.getPrimerAellido(),
                        ofendido.getSegundoNombre(),
                        ofendido.getSegundoApellido(), ofendido.getGenero(), ofendido.getEdad());

                // Ejecutar la consulta SQL
                stmnt.executeUpdate(sql);
            }

            // Cerrar la conexión
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Instruccuin QUERY para seleccionar todos los datos de la tabla demandante
    public void selectdemanntes() {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "SELECT * FROM developer.demandante";

        try (Connection con = postgreSQL.connectDatabase();
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.print("Id: " + rs.getString(1));
                System.out.print(" | ");
                System.out.print("PrimerNombre: " + rs.getString(2));
                System.out.print(" | ");
                System.out.println("PrimerApellido: " + rs.getString(3));
                System.out.print(" | ");
                System.out.print("SegundoApellido " + rs.getString(4));
                System.out.print(" | ");
                System.out.print("Genero" + rs.getString(5));
                System.out.print(" | ");
                System.out.print("Edad " + rs.getString(4));
                System.out.print(" | ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Instruccuin QUERY para seleccionar todos los datos de la tabla demandante
    // pedir el nombre de la tabla para asi tenerla como parametro
    public void selectdemandados() {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "SELECT * FROM developer.demandado";

        try (Connection con = postgreSQL.connectDatabase();
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.print("Id: " + rs.getString(1));
                System.out.print(" | ");
                System.out.print("PrimerNombre: " + rs.getString(2));
                System.out.print(" | ");
                System.out.println("PrimerApellido: " + rs.getString(3));
                System.out.print(" | ");
                System.out.print("SegundoApellido " + rs.getString(4));
                System.out.print(" | ");
                System.out.print("Genero" + rs.getString(5));
                System.out.print(" | ");
                System.out.print("Edad " + rs.getString(4));
                System.out.print(" | ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // Instruccuin QUERY para seleccionar todos los datos de la tabla demandante
    // pedir el nombre de la tabla para asi tenerla como parametro
    public void selectofendido() {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "SELECT * FROM developer.ofendido";

        try (Connection con = postgreSQL.connectDatabase();
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.print("Id: " + rs.getString(1));
                System.out.print(" | ");
                System.out.print("PrimerNombre: " + rs.getString(2));
                System.out.print(" | ");
                System.out.println("PrimerApellido: " + rs.getString(3));
                System.out.print(" | ");
                System.out.print("SegundoApellido " + rs.getString(4));
                System.out.print(" | ");
                System.out.print("Genero" + rs.getString(5));
                System.out.print(" | ");
                System.out.print("Edad " + rs.getString(4));
                System.out.print(" | ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void deletedemandadn(int Id) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "DELETE FROM developer.demandante WHERE Id = " + Id;

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el registro: " + ex.getMessage());
        }

    }

    public void deletedemandando(int Id) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "DELETE FROM developer.demandado WHERE Id = " + Id;

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el registro: " + ex.getMessage());
        }
    }

    public void deleteofendido(int Id) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "DELETE FROM developer.ofendido WHERE Id = " + Id;

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el registro: " + ex.getMessage());
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void updateDemandante(String Id, String PrimerNombre, String PrimerApellido, String SegundoNombre,
            String SegundoApellido, String Genero, int Edad) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = String.format(
                "UPDATE developer.Denunciantes SET PrimerNombre = '%s', PrimerApellido = '%s', SegundoNombre = '%s', SegundoApellido = '%s', Genero = '%s', Edad = %d WHERE Id = '%s'",
                PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad, Id);

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el registro: " + ex.getMessage());
        }
    }

    public void updateDenunciado(String Id, String PrimerNombre, String PrimerApellido, String SegundoNombre,
            String SegundoApellido, String Genero, int Edad) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = String.format(
                "UPDATE developer.Denunciados SET PrimerNombre = '%s', PrimerApellido = '%s', SegundoNombre = '%s', SegundoApellido = '%s', Genero = '%s', Edad = %d WHERE Id = '%s'",
                PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad, Id);

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el registro: " + ex.getMessage());
        }
    }

    public void updateOfendido(String Id, String PrimerNombre, String PrimerApellido, String SegundoNombre,
            String SegundoApellido, String Genero, int Edad) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = String.format(
                "UPDATE developer.Ofendidos SET PrimerNombre = '%s', PrimerApellido = '%s', SegundoNombre = '%s', SegundoApellido = '%s', Genero = '%s', Edad = %d WHERE Id = '%s'",
                PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad, Id);

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el registro: " + ex.getMessage());
        }
    }

    public void updatedenunciado(String Id, String PrimerNombre, String PrimerApellido, String SegundoNombre,
            String SegundoApellido, String Genero, int Edad) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = String.format(
                "UPDATE developer.denunciados SET PrimerNombre = '%s', PrimerApellido = '%s', SegundoNombre = '%s', SegundoApellido = '%s', Genero = '%s', Edad = %d WHERE Id = '%s'",
                PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad, Id);

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el registro: " + ex.getMessage());
        }
    }

    public void updatedenunciante(String Id, String PrimerNombre, String PrimerApellido, String SegundoNombre,
            String SegundoApellido, String Genero, int Edad) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = String.format(
                "UPDATE developer.ofendidos SET PrimerNombre = '%s', PrimerApellido = '%s', SegundoNombre = '%s', SegundoApellido = '%s', Genero = '%s', Edad = %d WHERE Id = '%s'",
                PrimerNombre, PrimerApellido, SegundoNombre, SegundoApellido, Genero, Edad, Id);

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el registro: " + ex.getMessage());
        }
    }
}