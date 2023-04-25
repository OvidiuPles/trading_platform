package isp;

import lombok.Getter;
import lombok.Setter;
import yahoofinance.Stock;

import javax.swing.table.AbstractTableModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class Portofolio extends AbstractTableModel {

    @Getter
    @Setter
    private BigDecimal funds;
    @Getter
    @Setter
    private HashMap<Stock, BigDecimal> stocks; //stocks and quantities

    private ArrayList<Stock> items = new ArrayList<>(); //for display
    @Getter
    private String[] columns = {"Symbol", "Name", "Quantity", "Current market value"};
    @Getter
    private String[] stockNames;

    public void refreshStockNames() {
        String[] newStockNames = new String[items.size()];
        int j = 0;
        for (Stock i : items) {
            newStockNames[j] = i.getSymbol();
            j++;
        }
        this.stockNames = newStockNames;
    }

    public ArrayList<Stock> getItems() {
        return items;
    }

    public void refresh() {
        this.fireTableDataChanged();
    }

    public Portofolio(BigDecimal funds) {
        this.stockNames = new String[]{"NO STOCKS"};
        this.stocks = new HashMap<>();
        this.items = new ArrayList<>();
        this.funds = funds;
    }

    @Override
    public int getRowCount() {
        return stocks.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return items.get(rowIndex).getSymbol();
            case 1:
                return items.get(rowIndex).getName();
            case 2:
                return stocks.get(items.get(rowIndex));
            case 3:
                return stocks.get(items.get(rowIndex)).multiply(items.get(rowIndex).getQuote().getPrice());

        }
        return null;
    }

    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
}
