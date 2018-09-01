package App.DataBase;

import java.sql.*;


public class Database {

    private Connection conexao;
    private Statement statement;
    public PreparedStatement preStatement;
    private String mensagem;

    //--------------------------------------------------------------------------
    public void open() throws SQLException  {
       
            String driver;
            String url;
            String usuario;
            String senha;

            driver = "com.mysql.fabric.jdbc.FabricMySQLDriver";
            url = "jdbc:mysql://127.0.0.1:3306/bancoappestabelecimentos";
            usuario = "root";
            senha = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            this.conexao = DriverManager.getConnection(url, usuario, senha);
            this.statement = conexao.createStatement();
        
    }

    //--------------------------------------------------------------------------
    public void close() throws SQLException  {
        
            if (this.statement != null) {
                this.statement.close();
            }
            if (this.conexao != null) {
                this.conexao.close();
            }
     
    }

    //--------------------------------------------------------------------------
    public ResultSet query(String sql, int tipo) throws SQLException  {
        ResultSet result;
        result = null;
        
            if (this.conexao == null || this.statement == null) {
                open();
            }
            
            if (tipo == 1) {
                result = this.statement.executeQuery(sql);
            } else {
                statement.executeUpdate(sql);
            }
       
        return result;
    }
    //--------------------------------------------------------------------------

    public PreparedStatement setQuerySql(String sql) throws SQLException {
        
            if (this.conexao == null || this.statement == null) {
                open();
            }

            this.preStatement = this.conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            return preStatement;
      
    }

    //--------------------------------------------------------------------------
    public PreparedStatement setQueryParameter() {

        return this.preStatement;

    }

}
