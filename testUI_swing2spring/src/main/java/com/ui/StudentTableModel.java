package com.ui;

import javax.swing.table.AbstractTableModel;
import com.domain.Student;

public class StudentTableModel extends AbstractTableModel {

    String[] header = {"firstName","lastName"};


    Student[] tableaudetudiants ;

    public StudentTableModel(){
        tableaudetudiants = new Student[]{new Student("Jack","Johnson"),
                            new Student("John", "Melbourne")};

    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }


    @Override
    public int getRowCount() {
        return tableaudetudiants.length;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getValueAt(int rowIndex, int columnIndex) {
        String table[] = {tableaudetudiants[rowIndex].getFirstname(),tableaudetudiants[rowIndex].getLastName()};

        return table[columnIndex];
    }
}
