package util;

import entidade.Lugar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
    
    private List<Lugar> lista;
    
    private String[] colunas = {"idLugar","Nome", "Endereço","Descrição","Zona","Site"};
    
    public TableModel(List<Lugar> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    // Populaando Campos da Tabela 
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        Lugar lugar = lista.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                lugar.setIdLugar(Integer.parseInt(aValue.toString()));
            case 1:
                lugar.setEndereco(aValue.toString());
            case 2:
                lugar.setDescricao(aValue.toString());
            case 3:
                lugar.setZona(aValue.toString());
            case 4:
                lugar.setSite(aValue.toString());
            default:
                System.err.println("Indice da Coluna é Invalido !");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Lugar lugarSelectionado = lista.get(rowIndex);
        Object o = null;
         
        switch(columnIndex) {
            case 0:
                o = lugarSelectionado.getIdLugar();
                break;
            case 1:
                o = lugarSelectionado.getEndereco();
                break;
            case 2:
                o = lugarSelectionado.getDescricao();
                break;
            case 3:
                o = lugarSelectionado.getZona();
                break;
            case 4:
                o = lugarSelectionado.getSite();
                break;
                default:
         }
        return o;
    }
    
    // Proibe de editar direto no Jtable
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    // pega o indice da linha selecioado quando clicar
    public Object getSelectionado(int rowIndex){
        return lista.get(rowIndex);
    }
    
    // UPDATE TABLE
    public void refreshJtable(List<Lugar> novosLugares) {
        this.lista = novosLugares;
        fireTableDataChanged();
    }
    
    public void limpar() {
        lista.clear();
        fireTableDataChanged();
    }
    
    public boolean isEmpty() {
        return lista.isEmpty();
    }
}