package bsu.rfe.java.group10.lab3.Gordienko;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel {

    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;

    public GornerTableModel(Double from, Double to, Double step, Double[]
            coefficients) {
        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }
    public Double getFrom() {
        return from;
    }
    public Double getTo() {
        return to;
    }
    public Double getStep() {
        return step;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    @Override
    public int getRowCount() {
        return 0; //new Double(Math.ceil((to-from)/step)).intValue()+1;
    }
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Значение X";
            default:
                return "Значение многочлена";
        }
    }
        @Override
    public Object getValueAt(int row, int col) {
// Вычислить значение X как НАЧАЛО_ОТРЕЗКА + ШАГ*НОМЕР_СТРОКИ
        double x = from + step*row;
        if (col==0) {
            return x;
        } else {
            Double result;
// Вычисление значения в точке по схеме Горнера.
// Вспомнить 1-ый курс и реализовать
            return 0; //result
        }
    }

}
