package APCSUnit8;
public class APCS8B {
    public static void main(String[] args) {
        CharMatrix g = new CharMatrix(5,5,'s');
        // g.setCharAt(0, 0, ' ');
        g.fillRect(1, 1, 3, 3, 'm');
        g.display();
    }
}

class CharMatrix {
    char[][] q;
    int row;
    int column;
    public CharMatrix(int rows, int cols) {
        char[][] x = new char[rows][cols];
        q = x;
        row = rows;
        column = cols;
        for(int r=0; r<x.length; r++) {
            for(int c=0; c<x[0].length; c++) {
                x[r][c] = ' ';
            }
        }
    }
    public CharMatrix(int rows, int cols, char fill) {
        char[][] x = new char[rows][cols];
        q = x;
        row = rows;
        column = cols;
        for(int r=0; r<x.length; r++) {
            for(int c=0; c<x[0].length; c++) {
                x[r][c] = fill;
            }
        }
    }

    public void display() {
        for(int i=0; i<q.length; i++) {
            for(int a=0; a<q[0].length; a++) {
                System.out.print(q[i][a]);
            }
            System.out.println();
        }
    }

    public int numRows() {
        return row;
    }

    public int numCols() {
        return column;
    }

    public char charAt(int rows, int cols) {
        return q[rows][cols];
    }

    public void setCharAt(int rows, int cols, char ch) {
        q[rows][cols] = ch;
    }

    public boolean isEmpty(int rows, int cols) {
        if(q[rows][cols] == ' ') return true;
        return false;
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for(int r=row0; r<=row1; r++) {
            for(int c=col0; c<=col1; c++) {
                q[r][c] = fill;
            }
        }
    }

    public void clearRect(int row0, int col0, int row1, int col1) {
        for(int r=row0; r<=row1; r++) {
            for(int c=col0; c<=col1; c++) {
                q[r][c] = ' ';
            }
        }
    }
    
    public int countInRow(int rows) {
        int count = 0;
        for(int i=0; i<q[0].length; i++) {
            if(q[rows][i] != ' ') count++;
        }
        return count;
    }

    public int countInCol(int cols) {
        int count = 0;
        for(int i=0; i<q.length; i++) {
            if(q[i][cols] != ' ') count++;
        }
        return count;
    }
}