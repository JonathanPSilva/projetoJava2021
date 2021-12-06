package dao;
import entidade.Lugar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

// Conecta banco
public class Conexao { //mudar isso aqui 
    Connection con;
    PreparedStatement st;  
    
    public boolean conectarDB(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava", "root", "odeiococo");
            return true;
            } catch (ClassNotFoundException | SQLException ex) {
                return false;
            }
    }    
    
    
    public boolean inserir (Lugar lugar){
        String query = "insert into lugares values (null, ?, ?, ?, ?, ?, ?, ?)";
        //String query = "INSERT into lugares(nome,endereco,descricao,zona,site,img VALUES(?,?,?,?,?,?)";
        
        try {
            st = con.prepareStatement(query);
            st.setString(1, lugar.getNome());
            st.setString(2, lugar.getEndereco());
            st.setString(3, lugar.getDescricao());
            st.setString(4, lugar.getCategoria());
            st.setString(5, lugar.getZona());
            st.setString(6, lugar.getSite());
            st.setBytes(7, lugar.getImg());
            
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
            
            
        } finally {
            closeConection();
        }
    }
    
        
    public boolean alterar (Lugar lugar) {
        String query = "UPDATE lugares SET nome = ? ,endereco = ?, descricao = ?,categoria = ?, zona = ?,site = ? ,img = ? WHERE idLugar = ?";
            
        try {
            st = con.prepareStatement(query);
            st.setString(1, lugar.getNome());
            st.setString(2, lugar.getEndereco());
            st.setString(3, lugar.getDescricao());
            st.setString(4, lugar.getCategoria());
            st.setString(5, lugar.getZona());
            st.setString(6, lugar.getSite());
            st.setBytes(7, lugar.getImg());
            
            st.setInt(8, lugar.getIdLugar());
            st.executeUpdate();
            return true;
            
        } catch (SQLException ex){
            return false;
        } finally {
            closeConection();
        }
    }
    
    public boolean  excluir (Lugar lugar) {
        String query = "DELETE FROM lugares WHERE idLugar = ?";
        try {
            st = con.prepareStatement (query);
            st.setInt(1, lugar.getIdLugar());
            st.executeUpdate();
            
            return true;
        } catch (SQLException ex){
            return false;
        } finally {
            
            closeConection();
        }
    }

    
    
    public Lugar consultarPorID(int idLugar) {
         
        try {
            String query = "SELECT * FROM lugares WHERE idLugar=?";
        
            st = con.prepareStatement(query);
            st.setInt(1, idLugar);
            ResultSet r = st.executeQuery();
            
            if (r.next()) {
                Lugar lugar = new Lugar();
                lugar.setIdLugar(r.getInt("idLugar"));
                lugar.setNome(r.getString("nome"));
                lugar.setEndereco(r.getString("endereco"));
                lugar.setDescricao(r.getString("descricao"));
                lugar.setCategoria(r.getString("categoria"));
                lugar.setZona(r.getString("zona"));
                lugar.setSite(r.getString("site"));
                lugar.setImg(r.getBytes("img"));
                
                return lugar;
              
            } else {
                return null;
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            
        } finally {
            closeConection();
        }
        return null;
    }
    
    public List<Lugar> listarLugares() {
        List<Lugar> lista = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM lugares ORDER BY idLugar";
        
            st = con.prepareStatement(query);
            ResultSet r = st.executeQuery();
            
            while (r.next()) {
                Lugar lugar = new Lugar();
                lugar.setIdLugar(r.getInt("idLugar"));
                lugar.setNome(r.getString("nome"));
                lugar.setEndereco(r.getString("endereco"));
                lugar.setDescricao(r.getString("descricao"));
                lugar.setCategoria(r.getString("categoria"));
                lugar.setZona(r.getString("zona"));
                lugar.setSite(r.getString("site"));
                lugar.setImg(r.getBytes("img"));
                
            
                lista.add(lugar);
            
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            closeConection();
        }
        
        return lista;
    }
    
     public Lugar BuscarLugarPorID(int id){
         try {
            String query = "SELECT * FROM lugares WHERER idLugar = ? ORDER BY idLugar";
        
            st = con.prepareStatement(query);
            ResultSet r = st.executeQuery();
            
            if(r.next()){
                Lugar lugar = new Lugar();
                lugar.setIdLugar(r.getInt("idLugar"));
                lugar.setNome(r.getString("nome"));
                lugar.setEndereco(r.getString("endereco"));
                lugar.setDescricao(r.getString("descricao"));
                lugar.setCategoria(r.getString("categoria"));
                lugar.setZona(r.getString("zona"));
                lugar.setSite(r.getString("site"));
                lugar.setImg(r.getBytes("img"));
                return lugar;
            }
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
     }
    
    public void closeConection() {
        try {
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Lugar buscaLugar(String zona, String categoria) {
         
        try {
            String query = "SELECT * FROM lugares WHERE zona=? AND categoria=? LIMIT 1";
        
            st = con.prepareStatement(query);
            st.setString(1, zona);
            st.setString(2, categoria);
            ResultSet r = st.executeQuery();
            
            if (r.next()) {
                Lugar lugar = new Lugar();
                lugar.setIdLugar(r.getInt("idLugar"));
                lugar.setNome(r.getString("nome"));
                lugar.setEndereco(r.getString("endereco"));
                lugar.setDescricao(r.getString("descricao"));
                lugar.setCategoria(r.getString("categoria"));
                lugar.setZona(r.getString("zona"));
                lugar.setSite(r.getString("site"));
                lugar.setImg(r.getBytes("img"));
                
                return lugar;
              
            } else {
                return null;
            }
        } catch (SQLException ex){
            ex.printStackTrace();
            
        } finally {
            closeConection();
        }
        return null;
    }
    
}